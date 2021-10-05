//Accéder à une collection
const para = document.querySelectorAll('p')

console.log(para[0])

para[0].innerText = 'Raphael Henon est un dev'

const liste = document.querySelectorAll('li')
liste[3].innerText = 'Java'

para[2].innerText = 'NOUBISSI'

for (let i = 0; i < para.length; i++) {
    para[i].innerText = "Ce qu'on veut écrire"
    para[i].style.color = 'red'
    para[i].style.fontWeight = 'bold'
    para[i].style.fontStyle = 'italic'
    para[i].style.border = 'solid black 2px'
}

//Mettre en rouge tous les élements impairs de la liste des technos

for (let i = 0; i < liste.length; i = i + 2) {
    liste[i].style.color = 'red'
    // liste[i].style.
}

//Accéder à une occurence

const p = document.querySelector('p')
p.innerText = 'Je suis dans une joie immence'

// Ajouter des elements
const technos = document.querySelector('#technos')

technos.innerHTML += '<li>Papapapa</li>'
// console.log(technos.innerHTML);

// Ajouter Kubernetes
const devops = document.querySelector('#devops')
devops.innerHTML = '<li>Kubernetes</li>' + devops.innerHTML

//Création d'un noeud dans le DOM
const typescript = document.createElement('li')
typescript.innerText = 'Typescript'

const dart = document.createElement('li')
dart.innerText = 'Dart'

//Ajouter un enfant
technos.appendChild(typescript)
technos.appendChild(dart)

//Ajouter plusieurs enfants
const tests = document.createElement('li')
tests.innerText = 'Test Driven Development'

const aws = document.createElement('li')
aws.innerText = 'Amazon Web Services'

devops.append(tests, aws)
