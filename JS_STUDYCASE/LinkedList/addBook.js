// Array untuk menyimpan data peminjaman
let daftarPeminjaman = [];
let filteredPeminjaman = [];
let isFiltering = false;

// Fungsi untuk menampilkan pesan jika tabel kosong
function updateEmptyMessage() {
  const emptyMessage = document.getElementById("emptyMessage");
  const dataToCheck = isFiltering ? filteredPeminjaman : daftarPeminjaman;
  
  if (dataToCheck.length === 0) {
    emptyMessage.classList.remove("hidden");
    if (isFiltering) {
      emptyMessage.innerHTML = '<i class="fas fa-info-circle"></i> Tidak ada data peminjaman yang sesuai dengan pencarian.';
    } else {
      emptyMessage.innerHTML = '<i class="fas fa-info-circle"></i> Belum ada data peminjaman.';
    }
  } else {
    emptyMessage.classList.add("hidden");
  }
}

// Fungsi untuk menambahkan data ke array dan urutkan berdasarkan tanggal
function tambahPeminjaman(event) {
  event.preventDefault();

  const namaPeminjam = document.getElementById("namaPeminjam").value.trim();
  const namaBuku = document.getElementById("namaBuku").value.trim();
  const pengarang = document.getElementById("pengarang").value.trim();
  const tanggalPengembalian = document.getElementById("tanggalPengembalian").value;

  // Validasi form
  if (!namaPeminjam || !namaBuku || !pengarang || !tanggalPengembalian) {
    showNotification("Mohon isi semua kolom form", "warning");
    return;
  }

  const dataBaru = {
    id: generateID(),
    namaPeminjam,
    namaBuku,
    pengarang,
    tanggalPengembalian,
    tanggalPinjam: new Date().toISOString().split('T')[0]
  };

  daftarPeminjaman.push(dataBaru);

  // Urutkan berdasarkan tanggal pengembalian terdekat
  daftarPeminjaman.sort((a, b) => new Date(a.tanggalPengembalian) - new Date(b.tanggalPengembalian));

  // Simpan ke local storage
  simpanKeStorage();
  
  tampilkanPeminjaman();
  document.getElementById("formPeminjaman").reset();
  
  showNotification("Data peminjaman berhasil ditambahkan", "success");
}

// Fungsi untuk membuat ID unik
function generateID() {
  return Date.now().toString(36) + Math.random().toString(36).substr(2);
}

// Fungsi untuk menampilkan semua data peminjaman
function tampilkanPeminjaman() {
  const tabel = document.getElementById("tabelPeminjaman");
  tabel.innerHTML = "";

  const dataToDisplay = isFiltering ? filteredPeminjaman : daftarPeminjaman;
  
  dataToDisplay.forEach((data, index) => {
    const baris = document.createElement("tr");
    
    // Hitung sisa hari
    const sisaHari = hitungSisaHari(data.tanggalPengembalian);
    let statusClass = '';
    
    if (sisaHari < 0) {
      statusClass = 'text-danger';
    } else if (sisaHari <= 3) {
      statusClass = 'text-warning';
    }

    baris.innerHTML = `
      <td>${data.namaPeminjam}</td>
      <td>${data.namaBuku}</td>
      <td>${data.pengarang}</td>
      <td class="${statusClass}">
        ${formatTanggal(data.tanggalPengembalian)}
        ${sisaHari < 0 ? 
          `<span class="badge badge-danger">Terlambat ${Math.abs(sisaHari)} hari</span>` : 
          sisaHari <= 3 ? 
          `<span class="badge badge-warning">Sisa ${sisaHari} hari</span>` : ''}
      </td>
      <td>
        <button class="action-btn btn-danger" onclick="hapusPeminjaman('${data.id}')">
          <i class="fas fa-trash"></i> Hapus
        </button>
      </td>
    `;

    tabel.appendChild(baris);
  });
  
  updateEmptyMessage();
}

// Fungsi untuk menghitung sisa hari
function hitungSisaHari(tanggalPengembalian) {
  const hariIni = new Date();
  hariIni.setHours(0, 0, 0, 0);
  
  const tanggalKembali = new Date(tanggalPengembalian);
  tanggalKembali.setHours(0, 0, 0, 0);
  
  const selisih = tanggalKembali - hariIni;
  return Math.ceil(selisih / (1000 * 60 * 60 * 24));
}

// Fungsi untuk menghapus data peminjaman berdasarkan ID
function hapusPeminjaman(id) {
  if (confirm("Apakah Anda yakin ingin menghapus data peminjaman ini?")) {
    const indeks = daftarPeminjaman.findIndex(item => item.id === id);
    if (indeks !== -1) {
      daftarPeminjaman.splice(indeks, 1);
      simpanKeStorage();
      
      if (isFiltering) {
        cariPeminjaman();
      } else {
        tampilkanPeminjaman();
      }
      
      showNotification("Dataaa peminjaman berhasil dihapus", "success");
    }
  }
}

// Fungsi untuk memformat tanggal menjadi DD-MM-YYYY
function formatTanggal(tanggal) {
  const date = new Date(tanggal);
  const dd = String(date.getDate()).padStart(2, '0');
  const mm = String(date.getMonth() + 1).padStart(2, '0');
  const yyyy = date.getFullYear();
  return `${dd}-${mm}-${yyyy}`;
}

// Fungsi untuk menambahkan notifikasi
function showNotification(message, type) {
  // Cek apakah sudah ada notifikasi
  let notification = document.querySelector('.notification');
  
  // Jika belum ada, buat elemen baru
  if (!notification) {
    notification = document.createElement('div');
    notification.className = 'notification';
    document.body.appendChild(notification);
  }
  
  // Set pesan dan kelas berdasarkan tipe
  notification.textContent = message;
  notification.className = `notification notification-${type} show`;
  
  // Hapus notifikasi setelah 3 detik
  setTimeout(() => {
    notification.className = notification.className.replace('show', '');
    setTimeout(() => {
      if (document.body.contains(notification)) {
        document.body.removeChild(notification);
      }
    }, 300);
  }, 3000);
}

// Fungsi untuk mencari data peminjaman
function cariPeminjaman() {
  const keyword = document.getElementById("searchInput").value.toLowerCase();
  
  if (keyword.trim() === '') {
    isFiltering = false;
    tampilkanPeminjaman();
    return;
  }
  
  isFiltering = true;
  filteredPeminjaman = daftarPeminjaman.filter(data => {
    return (
      data.namaPeminjam.toLowerCase().includes(keyword) ||
      data.namaBuku.toLowerCase().includes(keyword) ||
      data.pengarang.toLowerCase().includes(keyword)
    );
  });
  
  tampilkanPeminjaman();
}

// Fungsi untuk menyimpan data ke local storage
function simpanKeStorage() {
  localStorage.setItem('daftarPeminjaman', JSON.stringify(daftarPeminjaman));
}

// Fungsi untuk memuat data dari local storage
function muatDariStorage() {
  const dataStorage = localStorage.getItem('daftarPeminjaman');
  if (dataStorage) {
    daftarPeminjaman = JSON.parse(dataStorage);
    tampilkanPeminjaman();
  }
}

// Tambahkan CSS untuk notifikasiuu
const notificationStyle = document.createElement('style');
notificationStyle.textContent = `
  .notification {
    position: fixed;
    top: 20px;
    right: 20px;
    padding: 15px 20px;
    border-radius: 4px;
    color: white;
    max-width: 300px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
    transform: translateX(110%);
    transition: transform 0.3s ease;
    z-index: 1000;
  }
  
  .notification.show {
    transform: translateX(0);
  }
  
  .notification-success {
    background-color: #4caf50;
  }
  
  .notification-warning {
    background-color: #ff9800;
  }
  
  .notification-error {
    background-color: #f44336;
  }
  
  .badge {
    display: inline-block;
    padding: 2px 6px;
    font-size: 12px;
    font-weight: bold;
    border-radius: 3px;
    margin-left: 5px;
  }
  
  .badge-danger {
    background-color: #f44336;
    color: white;
  }
  
  .badge-warning {
    background-color: #ff9800;
    color: white;
  }
  
  .text-danger {
    color: #f44336;
  }
  
  .text-warning {
    color: #ff9800;
  }
`;
document.head.appendChild(notificationStyle);

// Event listeners
document.getElementById("formPeminjaman").addEventListener("submit", tambahPeminjaman);
document.getElementById("searchBtn").addEventListener("click", cariPeminjaman);
document.getElementById("searchInput").addEventListener("keyup", function(event) {
  if (event.key === "Enter") {
    cariPeminjaman();
  } else if (this.value.trim() === "") {
    isFiltering = false;
    tampilkanPeminjaman();
  }
});

// Panggil fungsi untuk memuat data saat halaman dimuat
document.addEventListener('DOMContentLoaded', function() {
  muatDariStorage();
  updateEmptyMessage();
});