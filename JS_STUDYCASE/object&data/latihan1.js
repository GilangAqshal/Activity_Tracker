let buku = {
    judul: "Pemrograman JavaScript",
    penulis: "John Doe",
    tahunTerbit: 2023,
    penerbit: "Gramedia"
};
buku.tahunTerbit = 2024;
document.writeln(`<h2>Buku ${buku.judul} ditulis oleh ${buku.penulis}</h2>`);
