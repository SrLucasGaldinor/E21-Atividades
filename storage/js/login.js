function cadastrar() {
    let users = []

    if (localStorage.getItem('users')) {
        users = JSON.parse(localStorage.getItem('users'))
    }

    let inputUser = document.getElementsByTagName('input')[0]
    let inputPass = document.getElementsByTagName('input')[1]

    let obj = {
        username: inputUser.value,
        password: inputPass.value
    }

    users.push(obj)

    localStorage.setItem('users', JSON.stringify(users))

    inputPass.value = ''
    inputUser.value = ''

}

function logar() {

    let inputUser = document.getElementsByTagName('input')[0]
    let inputPass = document.getElementsByTagName('input')[1]

    let obj = {
        username: inputUser.value,
        password: inputPass.value
    }

    if (localStorage.getItem('users')) {
        let users = JSON.parse(localStorage.getItem('users'))
        for (let i = 0; i < users.length; i++) {
            if (inputUser.value == users[i].username &&
                inputPass.value == users[i].password) {
                localStorage.setItem('userLogado', JSON.stringify(users[i]))
                return
            }
        }
        alert('Usuário ou senha inválida.')
    }
    else {
        alert('Tabela de usuários não encontrada.')
    }
}
