let produtos = [];

function adicionarItem() {
    const descricao = document.getElementById('descricao').value;
    const valor = parseFloat(document.getElementById('valor').value);
    const quantidade = parseInt(document.getElementById('quantidade').value);

    if (descricao && !isNaN(valor) && !isNaN(quantidade)) {
        const subtotal = valor * quantidade;
        const item = { descricao, valor, quantidade, subtotal };

        produtos.push(item);
        exibirItens();
        calcularTotal();
        limparCampos();
    } else {
        alert('Preencha todos os campos corretamente.');
    }
}

function exibirItens() {
    const tabela = document.getElementById('tabela');
    tabela.innerHTML = `<tr>
                            <th>Descrição</th>
                            <th>Valor Unitário</th>
                            <th>Quantidade</th>
                            <th>Subtotal</th>
                            <th>Ações</th>
                        </tr>`;
    produtos.forEach((item, index) => {
        tabela.innerHTML += `<tr>
                            <td>${item.descricao}</td>
                            <td>R$ ${item.valor.toFixed(2)}</td>
                            <td>${item.quantidade}</td>
                            <td>R$ ${item.subtotal.toFixed(2)}</td>
                            <td><button id="botao-editar" onclick="editarItem(${index}">Editar</button><button id="botao-remover" onclick="removerItem(${index})">Remover</button></td>
                        </tr>`;
    });
}

function editarItem(index) {
    const item = produtos[index];
    document.getElementById('descricao').value = item.descricao;
    document.getElementById('valor').value = item.valor;
    document.getElementById('quantidade').value = item.quantidade;
    produtos.splice(index, 1);
    exibirItens();
    calcularTotal();
}

function removerItem(index) {
    produtos.splice(index, 1);
    exibirItens();
    calcularTotal();
}

function calcularTotal() {
    const total = produtos.reduce((acc, item) => acc + item.subtotal, 0);
    document.getElementById('total').textContent = `Total: R$ ${total.toFixed(2)}`;
}

function limparCampos() {
    document.getElementById('descricao').value = '';
    document.getElementById('valor').value = '';
    document.getElementById('quantidade').value = '';
}
