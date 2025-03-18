let number = prompt("Masukan Angka Untuk Menentukan Ganjil/Genap:")
if (number % 2 == 0) {
    document.writeln(`Angka ${number} adalah bilangan genap.`);
} else {
    document.writeln(`Angka ${number} adalah bilangan ganjil.`);
}