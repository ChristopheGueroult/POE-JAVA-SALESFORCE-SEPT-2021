const etudiants = [
    {
        id: 1,
        nom: 'Lisangola',
        prenom: 'Christian',
        pays: 'Russie',
        genre: 'M',
    },
    { id: 2, nom: 'Histane', prenom: 'Salma', pays: 'Russie', genre: 'F' },
    { id: 3, nom: 'Bossard', prenom: 'Benjamin', pays: 'France', genre: 'M' },
]

const russes = []

for (let i = 0; i < etudiants.length; i++) {
    if (etudiants[i].pays === 'Russie') {
        russes.push(etudiants[i])
    }
}
