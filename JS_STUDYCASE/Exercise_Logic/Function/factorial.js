// <!-- *(Karena 5! = 5 × 4 × 3 × 2 × 1 = 120)* -->

    let n = prompt(`Masukan Bilangannya:`);
    n = parseInt(n);
    let faktorial = 1;
    let perhitungan = " ";
    // isNana(n)
    if(n < 0){
        document.writeln(`Faktorial tidak terdefinisi  untuk bilangan negatif`);
    }else if(n===0){
        faktorial = 1;
    }else{
        for(let i=n; i>=1 ; i--){
           faktorial *= i;

           if(i === n){
            perhitungan += `${i}`;
           }else{
            perhitungan += `x ${i} `;
           }
        }
    }
    document.writeln(`Karena ${n}! = ${perhitungan} = ${faktorial} `);

