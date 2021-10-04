const TVA = 0.2

const article = {
    designation: 'T-shirt',
    reference: 'xyz00pp2',
    prixHT: 15,
    calculerPrixTTC() {
        return this.prixHT + this.prixHT * TVA
    },
}

console.log('===Sans Destructuration===')
console.log(`Designation : ${article.designation}`)
console.log(`Ref : ${article.reference}`)
console.log(`Prix HT : ${article.prixHT}€`)
console.log(`Prix TTC : ${article.calculerPrixTTC()}€`)

// Destructuration
console.log('===Destructuration===')
const { designation, reference, prixHT } = article
console.log(`Designation : ${designation}`)
console.log(`Ref : ${reference}`)
console.log(`Prix HT : ${prixHT}€`)
