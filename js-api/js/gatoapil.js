function atulizarGato() {
    var gatinho = window.document.getElementById('gato')

    fetch('https://api.thecatapi.com/v1/images/search')
        .then(response => response.json())
        .then(data => {
            var imagemURL = data[0].url
            gatinho.src = imagemURL
        })
        .catch(error => {
            console.error('Ocorreu um errro')
        })

}