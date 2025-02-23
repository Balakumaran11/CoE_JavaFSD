document.getElementById('contact-form').addEventListener('submit', (e) => {
    const email = document.getElementById('email').value;
    if (!email.includes('@')) {
        e.preventDefault();
        alert('Please enter a valid email address.');
    }
});