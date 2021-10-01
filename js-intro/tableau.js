const fruits = new Array()

//Tableau vide
const eleves = []

//Creation et initialisation
const cours = ['Chimie', 'Physique', 'Grammaire']

console.log(cours[0]) //chimie
console.log(cours[2]) //Physique
cours[2] = 'Math'
console.log(cours[2]) //Math

const monTableau = ['jean', false, 45]

const tb = [2, 3, 4, 45, 6, 7, 8, 9, 0, 11, 23]

for (let c = 0; c < tb.length; c++) {
    console.log(tb[c])
}


//Remplissage des arrays
const quantiteFruits = parseInt(prompt('Combien est-ce que vous en voulez?'))

const fruits = []
for (let i = 0; i < quantiteFruits; i++) {
    //     fruits[i]=prompt("Nom du fruit : ");
    fruits.push(prompt('Nom du fruit : '))
}

for (let b = 0; b < fruits.length; b++) {
    console.log(fruits[b])
}


