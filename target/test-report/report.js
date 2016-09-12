$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/cobranca.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
    }
  ],
  "line": 2,
  "name": "Sistema de Cobrança de Titulos",
  "description": "Adicionar, Remover, Listar e Remover os titulos de cobrança",
  "id": "sistema-de-cobrança-de-titulos",
  "keyword": "Funcionalidade"
});
formatter.before({
  "duration": 3643995502,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Adicionar um novo título",
  "description": "",
  "id": "sistema-de-cobrança-de-titulos;adicionar-um-novo-título",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 7,
  "name": "que estou na página de adicionar título",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "preencher o formulário",
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "mandar salvar",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "mensagem de sucesso deve ser exibida",
  "keyword": "Então "
});
formatter.match({
  "location": "CobrancaBDD.paginaAddTitulo()"
});
formatter.result({
  "duration": 803838446,
  "status": "passed"
});
formatter.match({
  "location": "CobrancaBDD.preencherFormularioCadastro()"
});
formatter.result({
  "duration": 410162251,
  "status": "passed"
});
formatter.match({
  "location": "CobrancaBDD.mandar_salvar()"
});
formatter.result({
  "duration": 535200265,
  "status": "passed"
});
formatter.match({
  "location": "CobrancaBDD.mensagem_de_sucesso_deve_ser_exibida()"
});
formatter.result({
  "duration": 33071386,
  "status": "passed"
});
formatter.after({
  "duration": 61870005,
  "status": "passed"
});
});