document.write("<footer class='rodape'>");
document.write("<div class='rodape-conteudo'>");
document.write("<span class='rodape-copy'>Desenvolvido &copy; 2023 - Lucas Galdino</span><br>");
document.write("<div class='roda-icons'>")
document.write("<a href='https://github.com/SrLucasGaldinor' target='_blank' class='rodape-icons'><i class='fab fa-github'></i></a>");
document.write("<a href='https://contate.me/lucas-galdino-rosa' target='_blank' class='rodape-icons'><i class='fab fa-whatsapp'></i></a><br>");
document.write("</div>")
document.write("<span class='rodape-conteudo-escrito'>Receba Atualizações !</span><input type='email' id='emailConteudo' placeholder='Seu E-mail'>");
document.write("<button id='inscreverBotao' class='botao-email'>Inscrever</button>");
document.write("</div>");
document.write("<script>");
document.write("document.getElementById('inscreverBotao').addEventListener('click', function () {");
document.write("    var emailConteudo = document.getElementById('emailConteudo');");
document.write("    var userEmail = emailConteudo.value;");
document.write("    var re = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;");
document.write("    if (re.test(userEmail)) {");
document.write("        alert('Obrigado por se Inscrever!');");
document.write("    } else {");
document.write("        alert('Por favor, insira um endereço de E-mail válido.');");
document.write("    }");
document.write("});");
document.write("</script>");
document.write("</footer>");
