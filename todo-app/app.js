// Recupération des élements du DOM
const todoForm = document.querySelector('#todo-form')
const todoInput = document.querySelector('#todo-input')
const todoList = document.querySelector('#todo-list')
const todoError = document.querySelector('#err-todo')

// Soumission du formulaire
todoForm.addEventListener('submit', function (event) {
    // Eviter la tentative de soumission du formulaire
    event.preventDefault()

    // Validation du champs :
    // If la taille(nombre de caractères) du text est inférieure à 2
    //On ajouter un message d'erreur à l'element todoError
    // Et on lui applique une classe "text-red" définie dans le css
    if (todoInput.value.length < 2) {
        todoError.innerText = 'Ce champs doit avoir au moin 2 caractères'
        todoError.classList.add('text-red')
    } else {
        // Sinon, on va créer un li
        const todo = document.createElement('li')

        // Créer un bouton de suppression
        const deleteTodoButton = document.createElement('button')

        // Ajouter le text "X" au bouton de suppression, mais on peut mettre autre chose
        deleteTodoButton.innerText = 'X'

        // Ajout de l'event de suppression sur le bouton
        deleteTodoButton.addEventListener('click', function () {
            deleteTodoButton.parentElement.parentElement.removeChild(
                deleteTodoButton.parentElement
            )
        })

        //On ajout comme contenu(text) du li, la valeur(text) se trouvant dans le input
        todo.innerText = todoInput.value

        // On ajoute le bouton à l'element li
        todo.appendChild(deleteTodoButton)

        //On ajoute l'element LI au parent OL
        todoList.appendChild(todo)

        // On vide le champ input
        todoInput.value = ''

        // On vide le text d'erreur
        todoError.innerText = ''

        // On remove la classe CSS d'erreur
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
