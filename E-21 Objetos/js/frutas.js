const listaFrutas = [];

function adicionarFruta() {
    const inputFruta = document.getElementById('fruta');
    const nomeFruta = inputFruta.value;

    if (!listaFrutas.includes(nomeFruta)) {
        listaFrutas.push(nomeFruta);
        inputFruta.value = '';
        atualizarLista();
    } else {
        alert('Essa fruta já está em sua Lista');
    }
}

function atualizarLista() {
    const listaFrutasElement = document.getElementById('lista-frutas');
    listaFrutasElement.innerHTML = '';

    for (const fruta of listaFrutas) {
        const li = document.createElement('li');
        li.textContent = fruta;
        listaFrutasElement.appendChild(li);
    }
}
