function atualizarGatos() {
    const gatosDiv = document.getElementById("container");

    fetch("https://api.thecatapi.com/v1/images/search?limit=10")
        .then(response => response.json())
        .then(data => {
            gatosDiv.innerHTML = ''
            data.forEach(cat => {
                const catImage = document.createElement("img");
                catImage.src = cat.url;
                catImage.alt = "Gatinho";
                gatosDiv.appendChild(catImage);
            });
        })
        .catch(error => {
            console.error("Ocorreu um erro ao buscar as imagens de gatos:", error);
            gatosDiv.innerHTML = "Ocorreu um erro ao buscar as imagens de gatos.";
        });
};