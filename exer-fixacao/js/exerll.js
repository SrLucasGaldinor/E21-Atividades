let arrNumbers = [];
let originalNumbers = [];

function adicionarNumber() {
    const inputNumber = document.getElementById('number');
    const varAux = parseFloat(inputNumber.value);
    if (!isNaN(varAux)) {
        arrNumbers.push(varAux);
        originalNumbers.push(varAux);
        inputNumber.value = '';
        exibirNumbers();
    } else {
        alert('Insira um número válido.');
    }
}

function encontrarPosicao() {
    const buscarNumber = parseFloat(document.getElementById('buscarNumber').value);
    const posicao = arrNumbers.indexOf(buscarNumber);
    if (posicao !== -1) {
        alert(`O número ${buscarNumber} está na posição ${posicao + 1} da lista.`);
    } else {
        alert(`O número ${buscarNumber} não está na lista.`);
    }
}

function ordenarNumber() {
    const orderLista = document.getElementById('orderLista');
    const selecionarOption = orderLista.value;

    if (selecionarOption === 'crescente') {
        arrNumbers.sort((a, b) => a - b);
    } else if (selecionarOption === 'decrescente') {
        arrNumbers.sort((a, b) => b - a);
    } else if (selecionarOption === 'inserida') {
        arrNumbers = originalNumbers.slice();
    }
    exibirNumbers();
}

function removerNumero() {
    const removeNumber = parseFloat(document.getElementById('removeNumber').value);
    const index = arrNumbers.indexOf(removeNumber);
    if (index !== -1) {
        arrNumbers.splice(index, 1);
        alert(`O número ${removeNumber} foi removido da lista.`);
        exibirNumbers();
    } else {
        alert(`O número ${removeNumber} não está na lista.`);
    }
}

function substituirNumero() {
    const replaceNumber = parseFloat(document.getElementById('replaceNumber').value);
    const newNumber = parseFloat(document.getElementById('newNumber').value);

    const index = arrNumbers.indexOf(replaceNumber);
    if (index !== -1) {
        arrNumbers[index] = newNumber;
        alert(`O número ${replaceNumber} foi substituído por ${newNumber} na lista.`);
        exibirNumbers();
    } else {
        alert(`O número ${replaceNumber} não está na lista.`);
    }
}

function exibirNumbers() {
    const exibirCampo = document.getElementById('campo');
    exibirCampo.textContent = 'Números: ' + arrNumbers.join(', ');
}
