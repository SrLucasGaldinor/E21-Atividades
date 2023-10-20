function gravarStorage() {
    let obj = {
        nome: 'Maria das Dores',
        email: 'maria@gmail.com'
    }
    localStorage.setItem('nome', JSON.stringify(obj))
}

function letStorage() {
    let dados = localStorage.getItem('nome')
    document.getElementsByTagName('p')[0].innerHTML = dados

    let obj = JSON.parse(dados)
    console.log(obj.nome)
    console.log(obj.email)
}

function removerStorage() {
    localStorage.removeItem('nome')
}