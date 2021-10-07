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

//Créer un dvent du type submit sur l'elemet formulaire

ToDoForm.addEventListener('submit', function (e) {
    e.preventDefault()

    // Générer l'id unique
    const Id = uuid.v4()

    // Création d'une instance(object) de Todo
    const NewTodo = new Todo(Id, ToDoName.value, ToDoDescription.value)
    // Réiniyaliser les champs du formulaire

    let ToDos = localStorage.getItem('ToDos')
    let ToDoList = []
    if (ToDos === null) {
        ToDoList.push(NewTodo)
        console.log(ToDoList)
        localStorage.setItem('ToDos', JSON.stringify(ToDoList))
    } else {
        ToDoList = JSON.parse(ToDos)
        ToDoList.push(NewTodo)
        localStorage.setItem('ToDos', JSON.stringify(ToDoList))
    }

    ToDoName.value = ''
    ToDoDescription.value = ''
    window.location = './index.html'
})
