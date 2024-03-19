show1 = () => {
    alert('Button 1 Clicked');
}

show2 = () => {
    alert('Button 2 Clicked');
}

document.getElementById('mybtn').onclick = show1();
document.getElementById('mybtn').onclick = show2();