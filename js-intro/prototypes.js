//Mauvaise approche,car on duplique la methode pour chaque objet
function Person1(fname, lname) {
    this.fname = fname
    this.lname = lname
    this.fullName = function () {
        return `${this.fname} ${this.lname}`
    }
}

// Bonne pratique
function Person(fname, lname) {
    this.fname = fname
    this.lname = lname
}

Person.prototype.getFullName = function () {
    return `${this.fname} ${this.lname}`
}

Person.prototype.setFirstName = function (valeur) {
    this.fname = valeur
}

Person.prototype.setLastName = function (valeur) {
    this.lname = valeur
}
