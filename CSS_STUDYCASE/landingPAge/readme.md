Kalau kamu ingin meng-update repo dengan perubahan terbaru, urutan perintah Git yang biasanya digunakan adalah:  

### **1. Cek status perubahan**  
```sh
git status
```
Ini akan menampilkan file mana yang telah berubah atau belum ditracking.

### **2. Tambahkan file yang diubah ke staging area**  
- Untuk menambahkan semua file yang berubah:  
  ```sh
  git add .
  ```
- Kalau hanya ingin menambahkan file tertentu:  
  ```sh
  git add nama_file
  ```

### **3. Commit perubahan dengan pesan deskriptif**  
```sh
git commit -m "Pesan perubahan yang jelas"
```

### **4. Push perubahan ke GitHub**  
```sh
git push origin main
```
(Asumsi branch utama kamu bernama `main`, kalau `master`, ganti `main` jadi `master`.)

### **(Opsional) Jika ada perubahan di GitHub, tarik dulu perubahan sebelum push**  
Kalau kamu bekerja di repo yang juga diubah orang lain atau kamu sendiri mengeditnya langsung di GitHub, lebih baik tarik perubahan dulu sebelum push:  
```sh
git pull origin main
```
Setelah itu baru lakukan `git push` seperti biasa.

---

Kalau repo-mu masih fresh tanpa remote, pastikan sudah dikaitkan ke GitHub dengan:  
```sh
git remote add origin https://github.com/username/nama-repo.git
git branch -M main
git push -u origin main
```

Sekarang, setiap ada perubahan tinggal ulangi **git add → git commit → git push**. 🚀