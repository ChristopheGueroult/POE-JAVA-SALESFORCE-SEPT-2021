const contacts = JSON.parse(localStorage.getItem('contacts'))

const listeDeContacts = document.querySelector('#corps')

for (let i = 0; i < contacts.length; i++) {
    const tr = document.createElement('tr')
    const tdID = document.createElement('td')
    tdID.innerText = contacts[i].id

    const tdNom = document.createElement('td')
    tdNom.innerText = contacts[i].nom

    const tdPrenom = document.createElement('td')
    tdPrenom.innerText = contacts[i].prenom

    const tdAge = document.createElement('td')
    tdAge.innerText = contacts[i].age

    const tdDelete = document.createElement('td')
    const deleteButton = document.createElement('button')
    deleteButton.innerText = 'Supprimer'
    tdDelete.appendChild(deleteButton)

    deleteButton.addEventListener('click', function () {
        const index = contacts.findIndex(function (contact) {
            return contact.id === contacts[i].id
        })

        contacts.splice(index, 1)
        localStorage.setItem('contacts', JSON.stringify(contacts))
        window.location = './page2.html'

        deleteButton.parentElement.parentElement.parentElement.removeChild(
            deleteButton.parentElement.parentElement
        )
    })

    tr.append(tdID, tdNom, tdPrenom, tdAge, tdDelete)
    listeDeContacts.appendChild(tr)
}
