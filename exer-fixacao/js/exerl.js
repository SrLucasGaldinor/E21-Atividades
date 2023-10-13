let arrNumbers = []

function adicionarNumber() {
    const inputNumber = document.getElementById('number')
    const varAux = parseFloat(inputNumber.value)
    if (!isNaN(varAux)) {
        arrNumbers.push(varAux)
        inputNumber.value = ''
    }
    else {
        alert('Insira um número válido.')
    }
}

function ordenarNumber() {
    let ordenarArr = 0
    for (let i = 0; i < arrNumbers.length; i++) {
        for (let j = 0; j < arrNumbers.length - 1; j++) {
            if (arrNumbers[j] > arrNumbers[j + 1]) {
                ordenarArr = arrNumbers[j]
                arrNumbers[j] = arrNumbers[j + 1]
                arrNumbers[j + 1] = ordenarArr
            }
        }
    }
    exibirNumbers()
}

function exibirNumbers() {
    const exibirCampo = document.getElementById('campo')
    exibirCampo.textContent = 'Números em ordem crescente: ' + arrNumbers.join(', ')
}