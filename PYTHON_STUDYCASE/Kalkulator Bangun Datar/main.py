class Node:
    def __init__(self, name):
        self.name = name  # Menyimpan nama mahasiswa
        self.next = None  # Menyimpan referensi ke node berikutnya

class AttendanceList:
    def __init__(self):
        self.head = None  # Inisialisasi head sebagai None

    def add_student(self, name):
        """Menambahkan mahasiswa ke dalam daftar absensi."""
        new_node = Node(name)
        if not self.head:  # Jika daftar kosong
            self.head = new_node
            return
        last_node = self.head
        while last_node.next:  # Mencari node terakhir
            last_node = last_node.next
        last_node.next = new_node  # Menambahkan node baru di akhir

    def delete_student(self, name):
        """Menghapus mahasiswa berdasarkan nama."""
        current_node = self.head

        # Jika head adalah mahasiswa yang ingin dihapus
        if current_node and current_node.name == name:
            self.head = current_node.next  # Memindahkan head ke node berikutnya
            current_node = None  # Menghapus referensi
            return

        # Mencari mahasiswa yang ingin dihapus
        prev_node = None
        while current_node and current_node.name != name:
            prev_node = current_node
            current_node = current_node.next

        # Jika nama tidak ditemukan
        if not current_node:
            print(f"Mahasiswa dengan nama {name} tidak ditemukan.")
            return

        # Menghapus node
        prev_node.next = current_node.next
        current_node = None  # Menghapus referensi

    def print_attendance(self):
        """Mencetak daftar absensi Mahasiswa."""
        current_node = self.head
        if not current_node:
            print("Daftar absensi kosong.")
            return
        while current_node:
            print(current_node.name, end=" -> ")
            current_node = current_node.next
        print("None")

# Contoh penggunaan AttendanceList
if __name__ == "__main__":
    attendance_list = AttendanceList()
    
    while True:
        action = input("Pilih aksi (tambah/hapus/tampilkan/keluar): ").lower()
        if action == 'tambah':
            name = input("Masukkan nama mahasiswa: ")
            attendance_list.add_student(name)
        elif action == 'hapus':
            name = input("Masukkan nama mahasiswa yang ingin dihapus: ")
            attendance_list.delete_student(name)
        elif action == 'tampilkan':
            print("Daftar Absensi Mahasiswa:")
            attendance_list.print_attendance()
        elif action == 'keluar':
            print("Keluar dari program.")
            break
        else:
            print("Aksi tidak valid! Silakan coba lagi.")