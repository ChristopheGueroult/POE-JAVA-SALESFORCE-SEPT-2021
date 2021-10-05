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

// 3 - Affichage dans le site internet : simple

for (let i = 0; i < articles.length; i++) {
    console.log(articles[i])
}

// Afffichage détaillé
document.write('<h1>Articles</h1>')
document.write(
    '<table border="1"><thead><tr><th>Reference</th><th>Désignation</th><th>PrixHT</th><th>Quantité en stock</th></tr></thead><tbody>'
)
for (let i = 0; i < articles.length; i++) {
    document.write(
        `<tr><td>${articles[i].reference}</td><td>${articles[i].designation}</td><td>${articles[i].prixHT}</td><td>${articles[i].qteStock}</td></tr>`
    )
}
document('</tbody></table>')
