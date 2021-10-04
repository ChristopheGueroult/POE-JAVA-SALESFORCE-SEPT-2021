// Fonctions
function addition(nombre1, nombre2) {
    const somme = nombre1 + nombre2
    return somme
}

function addition2(nombre1, nombre2) {
    return nombre1 + nombre2
}

function calculerVitesse(distanceParcourue, temps) {
    const vitesse = distanceParcourue / temps
    // console.log(vitesse)
    return vitesse
}

//Urilisation des fonctions
const nombre1 = parseInt(prompt('Saisir le premier nombre : '))
const nombre2 = parseInt(prompt('Saisir le deuxième nombre : '))

const somme = addition(nombre1, nombre2)

//Calcul de la vitesse
const distance = parseInt(prompt('Distance parcourue : '))
const temps = parseInt(prompt('Temps : '))

const vitesse = calculerVitesse(distance, temps)

console.log(calculerVitesse(70, 4))
