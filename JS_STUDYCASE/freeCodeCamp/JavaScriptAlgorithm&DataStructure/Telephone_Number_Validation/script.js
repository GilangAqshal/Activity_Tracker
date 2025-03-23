
document.addEventListener('DOMContentLoaded', function() {
    const userInput = document.getElementById('user-input');
    const checkBtn = document.getElementById('check-btn');
    const clearBtn = document.getElementById('clear-btn');
    const resultsDiv = document.getElementById('results-div');

    function telephoneCheck(str) {
        const rules = /^(1\s?)?(\(\d{3}\)|\d{3})[\s\-]?\d{3}[\s\-]?\d{4}$/;
        return rules.test(str);
    }

    checkBtn.addEventListener('click', function() {
        const inputValue = userInput.value.trim();
        if (!inputValue) {
            alert('Please provide a phone number');
            return;
        }

        const isValid = telephoneCheck(inputValue);
        if (isValid) {
            resultsDiv.textContent = `Nomor US Valid: ${inputValue}`;
        } else {
            resultsDiv.textContent = `Nomor US tidak Valid: ${inputValue}`;
        }
    });

    clearBtn.addEventListener('click', function() {
        resultsDiv.textContent = '';
    });
});
