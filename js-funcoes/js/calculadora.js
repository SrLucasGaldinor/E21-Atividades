let resultado = document.getElementById('resultado');

function adicionarAoResultado(valor) {
    if (resultado.textContent === '0' && valor !== '.') {
        resultado.textContent = '';
    }
    resultado.textContent += valor;
}

function limparSaida() {
    resultado.textContent = '0';
}

function calcular() {
    try {
        resultado.textContent = eval(resultado.textContent);
    } catch (error) {
        resultado.textContent = 'Erro';
    }
}
