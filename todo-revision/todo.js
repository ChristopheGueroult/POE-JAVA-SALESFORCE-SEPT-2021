// Moule à fabrication des todos
function Todo(ID, Name, ToDoDescription) {
    this.ID = ID
    this.Name = Name
    this.Description = ToDoDescription
}
//Recuperation  du formulaire

const ToDoForm = document.querySelector('#todo-form')
const ToDoName = document.querySelector('#todo-name')
const ToDoDescription = document.querySelector('#todo-description')
const TodoList = document.querySelector('#todo-list')

//Créer un dvent du type submit sur l'elemet formulaire

ToDoForm.addEventListener('submit', function (e) {
    e.preventDefault()

    // Générer l'id unique
    const Id = uuid.v4()

    // Création d'une instance(object) de Todo
    const NewTodo = new Todo(Id, ToDoName.value, ToDoDescription.value)

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
    IdColum.innerText = NewTodo.ID
    NameColum.innerText = NewTodo.Name
    DescriptionColumn.innerText = NewTodo.Description

    //Ajouter du text(label) sur le bouton
    DeleteTodoButton.innerText = 'Supprimer'

    //Ajou des elements chez leurs parents
    ActionColumn.appendChild(DeleteTodoButton)
    Tr.append(IdColum, NameColum, DescriptionColumn)
    // tr.appendChild(tdId)
    // tr.appendChild(tdName)
    // tr.appendChild(description)
    Tr.appendChild(ActionColumn)
    TodoList.append(Tr)

    // Réiniyaliser les champs du formulaire
    ToDoName.value = ''
    ToDoDescription.value = ''

    //Ajouter l'event de suppression sur le bouton
    DeleteTodoButton.addEventListener('click', function () {
        this.parentElement.parentElement.remove()
    })
})

/**
 *
 * tr
 *    td
 *        button
 */
