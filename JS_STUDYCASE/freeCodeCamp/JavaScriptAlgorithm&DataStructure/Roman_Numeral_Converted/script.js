
function convertToRoman(num, from = "") {
    if (num === 0) return from;
    const romanBaseSymbol = {
      M: 1000,
      CM: 900,
      D: 500,
      CD: 400,
      C: 100,
      XC: 90,
      L: 50,
      XL: 40,
      X: 10,
      IX: 9,
      V: 5,
      IV: 4,
      I: 1,
    };
    for (const key in romanBaseSymbol) {
      if (num >= romanBaseSymbol[key]) {
        return convertToRoman(num - romanBaseSymbol[key], from + key);
      }
    }
  }
  
  document.addEventListener('DOMContentLoaded', function() {
      const numberInput = document.getElementById('number');
      const convertBtn = document.getElementById('convert-btn');
      const outputDiv = document.getElementById('output');
  
      convertBtn.addEventListener('click', function() {
          const inputValue = numberInput.value;
          const num = parseInt(inputValue);
  
          if (inputValue === "" || isNaN(num)) {
              outputDiv.textContent = "Please enter a valid number";
              return;
          }
  
          if (num < 1) {
              outputDiv.textContent = "Please enter a number greater than or equal to 1";
              return;
          }
  
          if (num > 3999) {
              outputDiv.textContent = "Please enter a number less than or equal to 3999";
              return;
          }
  
          const romanNumeral = convertToRoman(num);
          outputDiv.textContent = romanNumeral;
      });
  });
  