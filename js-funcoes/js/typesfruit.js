const frutaInput = document.getElementById('fruta');
const visualizacaoSelect = document.getElementById('visualizacao');
const resultadoDiv = document.getElementById('resultado');
const frutas = [];

function adicionarFruta() {
    const fruta = frutaInput.value.trim();
    if (fruta) {
        frutas.push(fruta);
        frutaInput.value = '';
        atualizarVisualizacao();
    }
}

function atualizarVisualizacao() {
    const visualizacao = visualizacaoSelect.value;
    resultadoDiv.innerHTML = '';

    // Remover classe "selecionado" de todas as opções
    const opcoes = visualizacaoSelect.getElementsByTagName('option');
    for (let i = 0; i < opcoes.length; i++) {
        opcoes[i].classList.remove('selecionado');
    }

    if (visualizacao === 'paragrafo') {
        resultadoDiv.innerHTML = `<p>${frutas.join(', ')}</p>`;
        opcoes[0].classList.add('selecionado'); // Adicionar classe à opção Parágrafo
    } else if (visualizacao === 'lista') {
        const lista = document.createElement('ul');
        frutas.forEach((fruta) => {
            const item = document.createElement('li');
            item.textContent = fruta;
            lista.appendChild(item);
        });
        resultadoDiv.appendChild(lista);
        opcoes[1].classList.add('selecionado'); // Adicionar classe à opção Lista
    } else if (visualizacao === 'tabela') {
        const tabela = document.createElement('table');
        const cabecalho = tabela.createTHead();
        const linhaCabecalho = cabecalho.insertRow(0);
        const cabecalhoCelula = linhaCabecalho.insertCell(0);
        cabecalhoCelula.textContent = 'Tipos de Frutas';

        const corpoTabela = tabela.createTBody();
        frutas.forEach((fruta) => {
            const linha = corpoTabela.insertRow(-1);
            const celula = linha.insertCell(0);
            celula.textContent = fruta;
        });

        resultadoDiv.appendChild(tabela);
        opcoes[2].classList.add('selecionado'); // Adicionar classe à opção Tabela
    }
}

atualizarVisualizacao();
