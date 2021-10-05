const todoForm = document.querySelector('#todo-form')
const todoInput = document.querySelector('#todo-input')
const todoList = document.querySelector('#todo-list')
const todoError = document.querySelector('#err-todo')

todoForm.addEventListener('submit', function (event) {
    event.preventDefault()
    if (todoInput.value.length < 2) {
        todoError.innerText = 'Ce champs doit avoir au moin 2 caractères'
        todoError.classList.add('text-red')
    } else {
        const todo = document.createElement('li')
        const deleteTodoButton = document.createElement('button')
        deleteTodoButton.innerText = 'X'

        // Ajout de l'event de suppression sur le bouton
        deleteTodoButton.addEventListener('click', function () {
            deleteTodoButton.parentElement.parentElement.removeChild(
                deleteTodoButton.parentElement
            )
        })

        todo.innerText = todoInput.value
        todo.appendChild(deleteTodoButton)

        todoList.appendChild(todo)
        todoInput.value = ''
        todoError.innerText = ''
        todoError.classList.remove('text-red')
    }
})

/**
 * 
  <ul>
   <li>A <button>x</button></li>
   <li>B <button>x</button></li>
  </ul>

 */
