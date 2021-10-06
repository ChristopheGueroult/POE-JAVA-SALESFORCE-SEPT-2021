function Contact(nom, prenom, age) {
    this.id = uuid.v4()
    this.nom = nom
    this.prenom = prenom
    this.age = age
}

const nom = document.querySelector('#nom')
const prenom = document.querySelector('#prenom')
const age = document.querySelector('#age')

const form = document.querySelector('#form')

form.addEventListener('submit', function (e) {
    e.preventDefault()
    const newContact = new Contact(nom.value, prenom.value, age.value)

    let contacts = localStorage.getItem('contacts')

    if (contacts === null) {
        const contactsList = []
        contactsList.push(newContact)
        localStorage.setItem('contacts', JSON.stringify(contactsList))
    } else {
        contacts = JSON.parse(contacts)
        contacts.push(newContact)
        localStorage.setItem('contacts', JSON.stringify(contacts))
    }

    window.location = './page2.html'
})
