bil = 4
total = 0
while(bil<=40){
    bil%4==0;
    document.writeln(`<p>Kelipatan 4 adalah ${bil}</p>`)
    bil+=4;
    total += bil;
}
document.writeln(`Total Penjumlahan adalah ${total}`)
// while (kondisi) {
//     blockPerulangan;
// }