// let i = 0

// i = i+1
// i +=1
for (let i = 1; i <= 100; i++) {
    console.log(i)
}

//Post incrementation

let a = 1
let b = 1

//a = b
//b +=1
a = b++

//Preincrementation
//b +=1
//a=b
a = ++b

//Boucle sur des chaines
const noms = 'Christian Lisangola'
for (let i = 0; i < noms.length; i++) {
    console.log(noms[i])
}

//while{...}

let votreMotDepasse = 'abcdefghijklm'

while (votreMotDepasse.length < 8) {
    votreMotDepasse = prompt('Veuillez saisir votre mot de passe : ')
    if (votreMotDepasse.length < 8) {
        alert('Le mot de passe doit contenir au moins 8 caractères')
    } else {
        alert('Le mot de passe respecte les requirements')
    }
}

//do{...}while()
do {
    votreMotDepasse = prompt('Veuillez saisir votre mot de passe : ')
    if (votreMotDepasse.length < 8) {
        alert('Le mot de passe doit contenir au moins 8 caractères')
    } else {
        alert('Le mot de passe respecte les requirements')
    }
} while (votreMotDepasse.length < 8)

//Interrompre une boucle
// Break
for (let i = 1; i <= 100; i++) {
    if (i == 50) {
        break
    }
    console.log(i)
}

//continue
for (let i = 1; i <= 100; i++) {
    if (i % 2 === 0) {
        continue
    }
    console.log(i)
}
