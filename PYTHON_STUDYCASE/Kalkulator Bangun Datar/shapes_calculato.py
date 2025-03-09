while True:
    print("\n\t\t\t\t Calculator Bangun Datar")
    print("-" * 100)

    # Header tabel
    header = ["Kode", "Bangun Datar", "Luas", "Keliling"]
    print(f"{header[0]:<6} {header[1]:<20} {header[2]:<40} {header[3]}")
    print("-" * 100)

    # Daftar bangun datar
    bangun_datar = [
        ["A", "Segitiga", "1/2 x Alas x Tinggi", "Sisi A + Sisi B + Sisi C"],
        ["B", "Persegi", "Sisi x Sisi", "4 x Sisi"],
        ["C", "Persegi Panjang", "Panjang x Lebar", "2 x (Panjang + Lebar)"],
        ["D", "Lingkaran", "π x r²", "2 x π x r"],
        ["E", "Jajargenjang", "Alas x Tinggi", "2 x (Alas + Sisi Miring)"],
        ["F", "Trapesium", "1/2 x (Sisi Atas + Sisi Bawah) x Tinggi", "A + B + C + D"],
        ["G", "Layang-layang", "1/2 x Diagonal1 x Diagonal2", "2 x (Sisi Pendek + Sisi Panjang)"],
        ["H", "Belah Ketupat", "1/2 x Diagonal1 x Diagonal2", "4 x Sisi"]
    ]

    # Menampilkan daftar bangun datar
    for i in bangun_datar:
        kode, nama, luas, keliling = i
        print(f"{kode:<6} {nama:<20} {luas:<40} {keliling}")

    print("-" * 100)
    Rumus_Luas = {
        'A': ("Rumus Segitiga", "1/2 x Alas x Tinggi"),
        'B': ("Rumus Persegi", "Sisi x Sisi"),
        'C': ("Rumus Persegi Panjang", "Panjang x Lebar"),
        'D': ("Rumus Lingkaran", "π(22/7) x r²"),
        'E': ("Rumus Jajargenjang", "Alas x Tinggi"),
        'F': ("Rumus Trapesium", "1/2 x (Sisi Atas + Sisi Bawah) x Tinggi"),
        'G': ("Rumus Layang-layang", "1/2 x Diagonal1 x Diagonal2"),
        'H': ("Rumus Belah Ketupat", "1/2 x Diagonal1 x Diagonal2")
    }

    Rumus_Keliling = {
        'A': ("Keliling Segitiga", "Sisi A + Sisi B + Sisi C"),
        'B': ("Keliling Persegi", "4 x Sisi"),
        'C': ("Keliling Persegi Panjang", "2 x (Panjang + Lebar)"),
        'D': ("Keliling Lingkaran", "2 x π(22/7) x r"),
        'E': ("Keliling Jajargenjang", "2 x (Alas + Sisi Miring)"),
        'F': ("Keliling Trapesium", "Sisi A + Sisi B + Sisi C + Sisi D"),
        'G': ("Keliling Layang-layang", "2 x (Sisi Pendek + Sisi Panjang)"),
        'H': ("Keliling Belah Ketupat", "4 x Sisi")
    }

    # Input kode bangun datar
    KodeBD = input("Kode Bangun Datar: ").upper()
    while KodeBD not in Rumus_Luas:
        print("Kode tidak valid. Masukkan kode yang benar (A-H).")
        KodeBD = input("Kode Bangun Datar: ").upper()

    # Pilihan Luas atau Keliling
    print("\nPilih jenis perhitungan:")
    print("1. Luas")
    print("2. Keliling")
    pilihan = input("Masukkan pilihan (1/2): ")

    # Logika perhitungan Luas
    if pilihan == "1": # program luas akan running kalo user pilih 1
        print(f"\n{Rumus_Luas[KodeBD][0]}")
        print(f"Rumus: {Rumus_Luas[KodeBD][1]}")

        if KodeBD == 'A':  # Segitiga
            alas = float(input("Masukkan Alas Segitiga: "))
            tinggi = float(input("Masukkan Tinggi Segitiga: "))
            luas = 0.5 * alas * tinggi
            print(f"Luas Segitiga: {luas} cm²")
        elif KodeBD == 'B':  # Persegi
            sisi = float(input("Masukkan Sisi Persegi: "))
            luas = sisi * sisi
            print(f"Luas Persegi: {luas} cm²")
        elif KodeBD == 'C':  # Persegi Panjang
            panjang = float(input("Masukkan Panjang: "))
            lebar = float(input("Masukkan Lebar: "))
            luas = panjang * lebar
            print(f"Luas Persegi Panjang: {luas} cm²")
        elif KodeBD == 'D':  # Lingkaran
            r = float(input("Masukkan jari-jari Lingkaran: "))
            luas = (22/7) * r * r
            print(f"Luas Lingkaran: {luas} cm²")
        elif KodeBD == 'E':  # Jajargenjang
            alas = float(input("Masukkan Alas: "))
            tinggi = float(input("Masukkan Tinggi: "))
            luas = alas * tinggi
            print(f"Luas Jajargenjang: {luas} cm²")
        elif KodeBD == 'F':  # Trapesium
            a = float(input("Masukkan Panjang Sisi Atas: "))
            b = float(input("Masukkan Panjang Sisi Bawah: "))
            tinggi = float(input("Masukkan Tinggi: "))
            luas = 0.5 * (a + b) * tinggi
            print(f"Luas Trapesium: {luas} cm²")
        elif KodeBD == 'G':  # Layang-layang
            d1 = float(input("Masukkan Diagonal 1 Layang-layang: "))
            d2 = float(input("Masukkan Diagonal 2 Layang-layang: "))
            luas = 0.5 * d1 * d2
            print(f"Luas Layang-layang: {luas} cm²")
        elif KodeBD == 'H': # Belah Ketupat
            d1 = float(input("Masukkan Diagonal 1 Belah Ketupat: "))
            d2 = float(input("Masukkan Diagonal 2 Belah Ketupat: "))
            luas = 0.5 * d1 * d2
            print(f"Luas Belah Ketupat: {luas} cm²")

    elif pilihan == "2":# program luas akan running kalo user pilih 2
        print(f"\n{Rumus_Keliling[KodeBD][0]}")
        print(f"Rumus: {Rumus_Keliling[KodeBD][1]}")
        if KodeBD == 'A':  # Segitiga
            sisiA = float(input("Masukkan Sisi A Segitiga: "))
            sisiB = float(input("Masukkan Sisi B Segitiga: "))
            sisiC = float(input("Masukkan Sisi C Segitiga: "))
            keliling = sisiA + sisiB + sisiC
            print(f"Keliling Segitiga: {keliling} cm")
        elif KodeBD == 'B':  # Persegi
            sisi = float(input("Masukkan Sisi Persegi: "))
            keliling = 4 * sisi
            print(f"Keliling Persegi: {keliling} cm")
        elif KodeBD == 'C':  # Persegi Panjang
            panjang = float(input("Masukkan Panjang: "))
            lebar = float(input("Masukkan Lebar: "))
            keliling = 2 * (panjang + lebar)
            print(f"Keliling Persegi Panjang: {keliling} cm²")
        elif KodeBD == 'D':  # Lingkaran
            jari_jari = float(input("Masukan r (jari-jari) Lingkaran: "))
            π = 22/7
            keliling = 2 * π * jari_jari
            print(f"Keliling Lingkaran: {keliling} cm²")
        elif KodeBD == 'E':  # Jajargenjang
            a = float(input("Masukkan sisi a: "))
            b = float(input("Masukkan sisi b: "))
            keliling = 2 * (a + b)
            print(f"Keliling Jajargenjang: {keliling} cm²")
        elif KodeBD == 'F':  # Trapesium
            a = float(input("Masukkan sisi a: "))
            b = float(input("Masukkan sisi b: "))
            c = float(input("Masukkan sisi c: "))
            d = float(input("Masukkan sisi d: "))
            keliling = a + b + c + d
            print(f"Keliling Trapesium: {keliling} cm²")
        elif KodeBD == 'G':  # Layang-layang
            d1 = float(input("Masukkan Diagonal 1 Layang-layang: "))
            d2 = float(input("Masukkan Diagonal 2 Layang-layang: "))
            keliling = 2 * (d1 + d2)
            print(f"Keliling Layang-layang: {keliling} cm²")
        elif KodeBD == 'H': # Belah Ketupat
            s = float(input("Masukan panjang sisi: "))
            keliling = 4 * s
            print(f"Keliling Belah Ketupat: {keliling} cm²")
    else:
        print("Pilihan tidak valid cok!")

    print("-" * 100)
    ulangi = input("Apakah Anda ingin menghitung bangun datar lain? [yes/no]: ").lower()
    if ulangi != 'yes':
        print("\nTerima kasih telah menggunakan program ini!")
        break
