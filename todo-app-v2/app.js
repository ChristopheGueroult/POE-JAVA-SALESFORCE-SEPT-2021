const todoForm = document.querySelector('#todo-form')
const todoInput = document.querySelector('#todo-input')
const todoList = document.querySelector('#todo-list')
const todoError = document.querySelector('#err-todo')
const todoDatabase = []

function Todo(name) {
    this.name = name
}

todoForm.addEventListener('submit', function (event) {
    event.preventDefault()
    if (todoInput.value.length < 2) {
        todoError.innerText = 'Ce champs doit avoir au moins 2 caractères'
        todoError.classList.add('text-red')
    } else {
        const todo = document.createElement('li')
        const deleteTodoButton = document.createElement('button')
        deleteTodoButton.innerText = 'Supprimer'

        // Ajout de l'event de suppression sur le bouton
        deleteTodoButton.addEventListener('click', function () {
            const liParent = deleteTodoButton.parentElement
            liParent.parentElement.removeChild(liParent)
        })

        todo.innerText = todoInput.value
        todo.appendChild(deleteTodoButton)

        const newTodo = new Todo(todoInput.value)
        todoDatabase.push(newTodo)
        console.log(todoDatabase)

        todoList.appendChild(todo)
        todoInput.value = ''
        todoError.innerText = ''
        todoError.classList.remove('text-red')
    }
})

/**
 * 
  <ol>
   <li>A <button>x</button></li>
   <li>B <button>x</button></li>
  </ol>

 */

//deleteButton : <button>Supprimer</button>
//deleteButton.parentElement : <li>A <button>x</button></li>
//deleteButton.parentElement.parentElement : <ol>...</ol>
