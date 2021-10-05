const btnApplyCSS = document.querySelector('#apply-css')
const btnRemoveCSS = document.querySelector('#remove-css')
const html = document.querySelector('#html')
const technos = document.querySelector('#technos')

// Add/Remove
let clicsForAdding = 0
let clicsForRemoving = 0

const add = document.querySelector('#add')
const remove = document.querySelector('#remove')

add.innerText = clicsForAdding
remove.innerText = clicsForRemoving
//==============================================

html.addEventListener('mouseover', function (event) {
    console.log('event.target', event.target)
    console.log('HTML : ', this)
    this.style.color = 'red'
})

btnApplyCSS.addEventListener('click', function () {
    console.log('Avant classes : ', this)
    technos.classList.add('text-red', 'text-italic')
    console.log('Après classes : ', this)
    clicsForAdding = clicsForAdding + 1
    add.innerText = clicsForAdding
})

btnRemoveCSS.addEventListener('click', removeCSS)

function removeCSS() {
    technos.classList.remove('text-red', 'text-italic')
    clicsForRemoving = clicsForRemoving + 1
    remove.innerText = clicsForRemoving
}
