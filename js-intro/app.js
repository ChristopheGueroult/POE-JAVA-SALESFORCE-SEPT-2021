// one line comment

/*
mutline comment
*/

//Déclaration de variables
let firstName = 'Jean'
console.log(firstName)
firstName = 'Jonathan'
console.log(firstName)
firstName = 'Lydie'
console.log(firstName)

//Typage dynamique
let age = 67
age = '89'

//Constantes : Ces valeurs ne peuvent pas être modifiées
const accelerationPesanteur = 9.8
const pays = 'France'

//Type de données
//String
const lastName = 'Jonathan'
const firstname = 'Jean'
const fullName = lastName + ' ' + firstname
const fullName2 = `${lastName} ${firstName}`

//Number
const age2 = 67
const ageDeMonPere = 12
const ageDeMaMere = 9
const sommeDesAges = ageDeMonPere + ageDeMaMere

let nombre = 45
let nombre2 = 26
let somme = nombre + nombre2

//Boolean
const isMarried = true

// Prompter l'utilisateur
const prenom = prompt('Quel est votre prénom ?')
const nomDeFamille = prompt('Quel est votre nom de famille ?')
const monAge = prompt('Quel est votre age ?')

//Vous êtes Jean Blabla, et vous avez 45 ans
alert(
    'Vous etes ' +
        prenom +
        ' ' +
        nomDeFamille +
        ', et vous  avez ' +
        monAge +
        ' ans'
)
