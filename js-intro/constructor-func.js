function Article(designation, reference, prixHT, qteStock) {
    this.designation = designation
    this.reference = reference
    this.prixHT = prixHT
    this.qteStock = qteStock
}

//1 - Avant arrivage
const articles = []

//2 - Arrivage des articles
const qteArticle = parseInt(prompt("Combien d'articles sont arrivés : "))

for (let i = 1; i <= qteArticle; i++) {
    const designation = prompt('Designation : ')
    const reference = prompt('Ref : ')
    const prixHT = parseFloat(prompt('PrixHT : '))
    const qteStock = parseInt(prompt('Quantite : '))
    const article = new Article(designation, reference, prixHT, qteStock)
    articles.push(article)
}

// 3 - Affichage dans le site internet

for (let i = 0; i < articles.length; i++) {
    console.log(articles[i])
}
