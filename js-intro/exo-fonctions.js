// TP 19

function calculerSommeDiagonal(matrice) {
    let sommeDiagonal1 = 0
    let sommeDiagonal2 = 0
    for (let i = 0; i < matrice.length; i++) {
        sommeDiagonal1 += matrice[i][i]
        sommeDiagonal2 += matrice[i][matrice.length - i - 1]
    }
    return sommeDiagonal1 + sommeDiagonal2
}

// TP 20
function rotateArray(arr, numberOfRotations, direction) {
    const arrayToRotate = [...arr]
    for (let i = 1; i <= numberOfRotations; i++) {
        if (direction === 'right') {
            const popedValue = arrayToRotate.pop()
            arrayToRotate.unshift(popedValue)
        } else {
            const popedValue = arrayToRotate.shift()
            arrayToRotate.push(popedValue)
        }
    }
    return arrayToRotate
}
