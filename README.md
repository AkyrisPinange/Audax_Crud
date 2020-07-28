# Audax_Crud

Sistemas de cadastrar filmes em um locadora


## Tecnologias Ultilizadas
* Spring mvc
* ProstgresSQl
* Maven

## Pacotes FrontEnd Ultilizados
* BootStraap
* GoogleIcon
* Vendor Css
## Estrutura do Sistema
1. Na Package *br.com.locadora.controller* Está os *Controllers*, que contem toda logica de interação do usuário com o sitemas e do sistema com o banco.

2. Na Package *br.com.locadora.model* Está as as classes *Models* Responsalvel por *"Escrever"* os SQLcommands no banco de dados. E Tambem tem a classe conexao responsalvel por abrir e fechar a conexão com o banco

3. Na pasta *WebContent* contem todo o FronEnd as Views Folhas de estilos etc.


![estrutura](https://user-images.githubusercontent.com/48262372/88609155-cbea0600-d059-11ea-8c32-921e11589e4d.PNG)


# O Sistema inicia com uma tela de login
![Login](https://user-images.githubusercontent.com/48262372/88609157-cd1b3300-d059-11ea-864d-22bb18f8a129.PNG)

# O Usuário entra com *Email* e *Senha* e é direcionado para tela do **CRUD**

![image](https://user-images.githubusercontent.com/48262372/88610889-32712300-d05e-11ea-9600-11a175e8bddc.png)

# Nessa Tela o usuário terá a opção de *Editar*, *Excluir*, * Detalhar* e Adicionar um novo filme.







