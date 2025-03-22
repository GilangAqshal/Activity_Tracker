
document.addEventListener('DOMContentLoaded', function() {
    const textInput = document.getElementById('text-input');
    const checkBtn = document.getElementById('check-btn');
    const resultDiv = document.getElementById('result');

    checkBtn.addEventListener('click', function() {
        const inputValue = textInput.value;

        if (!inputValue) {
            alert('Please input a value');
            return;
        }

        const cleanedInput = inputValue.toLowerCase().replace(/[^a-z0-9]/g, '');
        const reversedInput = cleanedInput.split('').reverse().join('');

        const isPalindrome = cleanedInput === reversedInput;

        resultDiv.textContent = `${inputValue} ${isPalindrome ? 'is a palindrome.' : 'is not a palindrome.'}`;
    });
});
