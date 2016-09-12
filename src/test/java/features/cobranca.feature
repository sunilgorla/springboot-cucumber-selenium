#language:pt
Funcionalidade: Sistema de Cobrança de Titulos
	Adicionar, Remover, Listar e Remover os titulos de cobrança 


Cenário: Adicionar um novo título
Dado que estou na página de adicionar título
Quando preencher o formulário
	E mandar salvar
Então  mensagem de sucesso deve ser exibida
