// const reverseSeq = n => {

//  const result = [];
//   for(let i = n; i >= 1; i--){
//     result.push(i);
//   }
//     return result;
// };

// const reverseSeq = n => [...Array(n)].map((el, i) = > n - 1)
const reverseSeq = n => [...Array(n)].map((el, i) => n - 1)

 console.log(reverseSeq(5));