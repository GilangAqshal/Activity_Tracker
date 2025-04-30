// script.js

// Membuat node LinkedList untuk setiap data peminjaman
class SimpulPeminjaman {
    constructor(namaPeminjam, namaBuku, pengarang, tanggalPengembalian) {
      this.namaPeminjam = namaPeminjam;
      this.namaBuku = namaBuku;
      this.pengarang = pengarang;
      this.tanggalPengembalian = new Date(tanggalPengembalian);
      this.berikutnya = null; // Pointer ke simpul berikutnya
    }
  }
  
  // Membuat LinkedList untuk daftar peminjaman
  class DaftarPeminjaman {
    constructor() {
      this.kepala = null; // Simpul pertama
    }
  
    // Fungsi untuk menyisipkan data peminjaman baru berdasarkan tanggal pengembalian
    sisipkanPeminjaman(namaPeminjam, namaBuku, pengarang, tanggalPengembalian) {
      const peminjamanBaru = new SimpulPeminjaman(namaPeminjam, namaBuku, pengarang, tanggalPengembalian);
  
      // Jika daftar kosong atau tanggal pengembalian lebih awal
      if (!this.kepala || peminjamanBaru.tanggalPengembalian < this.kepala.tanggalPengembalian) {
        peminjamanBaru.berikutnya = this.kepala;
        this.kepala = peminjamanBaru;
        return;
      }
  
      let sekarang = this.kepala;
      // Cari posisi yang tepat berdasarkan tanggal
      while (sekarang.berikutnya && sekarang.berikutnya.tanggalPengembalian <= peminjamanBaru.tanggalPengembalian) {
        sekarang = sekarang.berikutnya;
      }
  
      peminjamanBaru.berikutnya = sekarang.berikutnya;
      sekarang.berikutnya = peminjamanBaru;
    }
  
    // Fungsi untuk menghapus data peminjaman berdasarkan Nama Peminjam dan Nama Buku
    hapusPeminjaman(namaPeminjam, namaBuku) {
      if (!this.kepala) return;
  
      // Jika data yang akan dihapus ada di kepala
      if (this.kepala.namaPeminjam === namaPeminjam && this.kepala.namaBuku === namaBuku) {
        this.kepala = this.kepala.berikutnya;
        return;
      }
  
      let sekarang = this.kepala;
      while (sekarang.berikutnya) {
        if (sekarang.berikutnya.namaPeminjam === namaPeminjam && sekarang.berikutnya.namaBuku === namaBuku) {
          sekarang.berikutnya = sekarang.berikutnya.berikutnya;
          return;
        }
        sekarang = sekarang.berikutnya;
      }
    }
  
    // Fungsi untuk mengubah LinkedList menjadi array supaya mudah ditampilkan
    lihatPeminjaman() {
      const data = [];
      let sekarang = this.kepala;
      while (sekarang) {
        data.push(sekarang);
        sekarang = sekarang.berikutnya;
      }
      return data;
    }
  }
  
  // Inisialisasi daftar peminjaman
  const daftarPeminjaman = new DaftarPeminjaman();
  
  // Ambil elemen-elemen dari HTML
  const formulirPeminjaman = document.getElementById('formulirPeminjaman');
  const tubuhTabel = document.getElementById('tubuhTabel');
  
  // Event ketika formulir disubmit
  formulirPeminjaman.addEventListener('submit', function(event) {
    event.preventDefault(); // Mencegah reload halaman
  
    // Ambil nilai input
    const namaPeminjam = document.getElementById('namaPeminjam').value;
    const namaBuku = document.getElementById('namaBuku').value;
    const pengarang = document.getElementById('pengarang').value;
    const tanggalPengembalian = document.getElementById('tanggalPengembalian').value;
  
    // Sisipkan data ke dalam LinkedList
    daftarPeminjaman.sisipkanPeminjaman(namaPeminjam, namaBuku, pengarang, tanggalPengembalian);
  
    // Render ulang tabel
    tampilkanDaftar();
  
    // Reset formulir
    formulirPeminjaman.reset();
  });
  
  // Fungsi untuk menampilkan daftar peminjaman di tabel
  function tampilkanDaftar() {
    tubuhTabel.innerHTML = '';
  
    const dataPeminjaman = daftarPeminjaman.lihatPeminjaman();
    dataPeminjaman.forEach(peminjaman => {
      const baris = document.createElement('tr');
  
      baris.innerHTML = `
        <td>${peminjaman.namaPeminjam}</td>
        <td>${peminjaman.namaBuku}</td>
        <td>${peminjaman.pengarang}</td>
        <td>${peminjaman.tanggalPengembalian.toLocaleDateString('id-ID')}</td>
        <td><button class="btn-danger" onclick="hapusData('${peminjaman.namaPeminjam}', '${peminjaman.namaBuku}')">Hapus</button></td>
      `;
  
      tubuhTabel.appendChild(baris);
    });
  }
  
  // Fungsi untuk menghapus data peminjaman
  function hapusData(namaPeminjam, namaBuku) {
    daftarPeminjaman.hapusPeminjaman(namaPeminjam, namaBuku);
    tampilkanDaftar();
  }
  