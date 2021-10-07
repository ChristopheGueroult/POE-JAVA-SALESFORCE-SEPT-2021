const TodoList = document.querySelector('#todo-list')

const Todos = JSON.parse(localStorage.getItem('ToDos'))

for (let i = 0; i < Todos.length; i++) {
    // Création de la ligne d'une todo
    const Tr = document.createElement('tr')

    // Création des column pour afficher les informations sur la todo
    const IdColum = document.createElement('td')
    const NameColum = document.createElement('td')
    const DescriptionColumn = document.createElement('td')
    const ActionColumn = document.createElement('td')

    // Bouton de suppression
    const DeleteTodoButton = document.createElement('button')

    // Ajouter du contenu dans les colonnes
    IdColum.innerText = Todos[i].ID
    NameColum.innerText = Todos[i].Name
    DescriptionColumn.innerText = Todos[i].Description

    //Ajouter du text(label) sur le bouton
    DeleteTodoButton.innerText = 'Supprimer'

    //Ajout des elements chez leurs parents
    ActionColumn.appendChild(DeleteTodoButton)
    Tr.append(IdColum, NameColum, DescriptionColumn)

    Tr.appendChild(ActionColumn)
    TodoList.append(Tr)

    DeleteTodoButton.addEventListener('click', function () {
        this.parentElement.parentElement.remove()

        //Récupere l'index de l'element que l'on veut supprimer
        const position = i
        Todos.splice(position, 1)
        localStorage.setItem('ToDos', JSON.stringify(Todos))
    })
}
