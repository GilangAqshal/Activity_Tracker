function hitungFaktorial(n ) {
    let faktorial = 1;
    let perhitungan = "";

    if (n < 0) {
        return "Faktorial tidak terdefinisi untuk bilangan negatif";
    } else if (n === 0) {
        return `Karena ${n}! = 1 = 1`;
    } else {
        for (let i = n; i >= 1; i--) {
            faktorial *= i;
            if (i === n) {
                perhitungan += `${i}`;
            } else {
                perhitungan += ` x ${i}`;
            }
        }
        return `Karena ${n}! = ${perhitungan} = ${faktorial}`;
    }
}

let n = prompt("Masukan Bilangannya:");
n = parseInt(n);   

let hasil = hitungFaktorial(n);
document.writeln(hasil);