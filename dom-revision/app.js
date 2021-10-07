const html5 = document.querySelector('#html5')
const liste = document.querySelector('#liste')
const titre = document.querySelector('#main_title')
const titreMern = document.querySelector('#mernStack')
const listeMern = document.querySelector('#listeMern')
html5.innerHTML = '<strong>HTML X</strong>'

liste.innerHTML += '<li>HTML7</li>'
// liste.innerHTML = liste.innerHTML + "<li>HTML7</li>";
// console.log(liste);
html5.addEventListener('click', function () {
    this.style.color = 'red'
    titre.style.color = 'blue'
})

titreMern.addEventListener('click', function () {
    // listeMern.classList.add("text-bold", "text-italic");
    listeMern.classList.add('text-bold')
    listeMern.classList.add('text-italic')
    listeMern.classList.add('content-border')
    listeMern.innerHTML = listeMern.innerHTML + '<li>MS Word</li>'
})
