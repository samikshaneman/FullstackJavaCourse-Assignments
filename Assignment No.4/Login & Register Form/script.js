document.addEventListener('DOMContentLoaded', function() {
    const togglePassword = document.getElementById('toggle-password');
    const passwordInput = document.getElementById('password');

    togglePassword.addEventListener('click', function() {
        const type = passwordInput.getAttribute('type') === 'password' ? 'text' : 'password';
        passwordInput.setAttribute('type', type);
        this.textContent = type === 'password' ? 'Showpassword' : 'Hidepassword'
    });
});

var username = document.getElementById("username").value;
var password = document.getElementById("password").value;

 type="text/javascript" 
function submit_form(){  
alert("Welcome to Rmcet"); 
}




 
    
