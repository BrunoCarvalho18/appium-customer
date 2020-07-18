#language:pt
#encoding UTF-8

@geral
Funcionalidade: Inserir um cliente

       @inserircliente
       Esquema do Cenario: Inserir um cliente no app
          Dado clico no menu adicionar
          Quando preencho os dados "<name>" e "<phone>" e "<email>" e "<cpf>" e "<description>" e "<comments>" 
          Entao o cliente e inserido com sucesso e o "<name>" esta correto
      
       Exemplos:
       | name             | phone         | email             | cpf               |description |comments|
       | Bruno            | 11952179032   | teste@gmail.com   | 123456            | teste      |teste   |
            

