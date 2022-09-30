<h1 align="center"> CRAVO&CANELA - Squad 4DEVS (FourDevs) </h1>

<p align="center">
<img src="/readme/logocravo.png" width=225 alt="Logo Cravo&Canela"/>
</p>

> Status do Projeto: Concluido :heavy_check_mark:

<h2 align="center" > Quem Somos </h2>
<p align="justify">Somos uma consultoria (gratuita) que visa conectar alunos com empresas que oferecem e querem divulgar seus cursos na área de tecnologia.</p>

<h3>Missão: </h3>
<p align="justify">Conectar alunos que buscam oportunidades de realizar cursos e impulsionar sua carreira, com empresas que estão dispostas a ajudá-los nesse processo,  através dos seus cursos e metodologias. </p>

<h3>Visão: </h3>
<p align="justify">Ser uma empresa de referência em qualidade e eficiência nos serviços prestados no ramo de consultorias que transformam vidas de pessoas que buscam agregar conhecimento e impulsionar sua carreira na área de tecnologia.</p>

<h3>Valores: </h3>
<p align="justify">Ética; Transparência (clareza nas relações); Inovação; Respeito.</p>

<h2 align="center" > Documentação do Projeto </h2>

<h4> Tecnologias, Metodologias e Soluções Utilizadas </h4>

* Metodologia Ágil
    - Scrum;
    - Kanban;
    - Trello.

* Backend
    - Java 11;
    - Maven;
    - Spring Boot;
    - JPA;
    - IDEs (Intellij e Eclipse);
    - Postman.

* Banco de Dados
    - MySQL.

* Frontend
    - HTML;
    - CSS;
    - TypeScript;
    - Angular.

* Infraestrutura 
    - AWS
        - Redis;
        - Beanstalk;
        - Lambda;
        - EC2;
        - Bucket S3.

* Versionamento de código
    - Git e Github.

* Documentação
    - Swagger.

<h2 align="center" > Consumindo a API </h2>

* Pré-Requisitos:
    - Clonar repositório;
    - Instalar dependências;
    - Fazer o build do projeto;
    - Configurar conexão com banco de dados;
    - Configurar endpoints no postman.

<h4 align="center">Alunos</h4>

- Listar Alunos 
  <p> Rota:http://localhost:8080/alunos/todos </p>
  <p> Método: GET </p>
  <p align="center"><img src="/readme/listarAlunos.JPG"/></p>

<p> </p>

- Cadastrar Alunos 
  <p> Rota:http://localhost:8080/alunos </p>
  <p> Método: POST </p>
  <p align="center"><img src="/readme/cadastrarAlunos.JPG"/></p>

<p> </p>

- Atualizar Alunos 
  <p> Rota:http://localhost:8080/alunos/{id} </p>
  <p> Método: PUT </p>
  <p align="center"><img src="/readme/atualizarAlunos.JPG"/></p>

  <p> </p>

- Deletar Alunos 
  <p> Rota:http://localhost:8080/alunos/{id} </p>
  <p> Método: DELETE </p>
 
  <p> </p>

- Buscar Alunos por CPF
  <p> Rota:http://localhost:8080/alunos</p>
  <p> Método: GET </p>
  <p align="center"><img src="/readme/buscarAlunosPorCPF.JPG"/></p>

  - Buscar Alunos por ID
  <p> Rota:http://localhost:8080/alunos/{id}</p>
  <p> Método: GET </p>
  <p align="center"><img src="/readme/bucarAlunosPorID.JPG"/></p>

 <p> </p>

<h4 align="center">Empresas</h4>

- Listar Empresas
 <p> Rota:http://localhost:8080/empresas/todos </p>
 <p> Método: GET </p>
 <p align="center"><img src="/readme/listarEmpresas.JPG"/></p>

  <p> </p>

 - Cadastrar Empresas
 <p> Rota:http://localhost:8080/empresas </p>
 <p> Método: POST </p>
 <p align="center"><img src="/readme/cadastrarEmpresas.JPG"/></p>

  <p> </p>

 - Atualizar Empresas
 <p> Rota:http://localhost:8080/empresas/{id} </p>
 <p> Método: PUT </p>
 <p align="center"><img src="/readme/atualizarEmpresas.JPG"/></p>

  <p> </p>

 - Deletar Empresas
 <p> Rota:http://localhost:8080/empresas/{id} </p>
 <p> Método: DELETE </p>
 <p align="center"><img src="/readme/deletarEmpresa.JPG"/></p>

 <p> </p>

- Buscar Empresas por ID
 <p> Rota:http://localhost:8080/empresas/{id} </p>
 <p> Método: GET </p>
 <p align="center"><img src="/readme/buscarEmpresasPorID.JPG"/></p>


<h4 align="center">Cursos</h4>

- Listar Cursos 
  <p> Rota:http://localhost:8080/cursos/todos </p>
  <p> Método: GET </p>
  <p align="center"><img src="/readme/listarCursos.JPG"/></p>
  
<p> </p>

- Cadastrar Cursos 
  <p> Rota:http://localhost:8080/cursos </p>
  <p> Método: POST </p>
  <p align="center"><img src="/readme/cadastrarCurso.JPG"/></p>

<p> </p>

- Atualizar Cursos 
  <p> Rota:http://localhost:8080/cursos/{id} </p>
  <p> Método: PUT </p>
  <p align="center"><img src="/readme/atualizarCursos.JPG"/></p>
 
  <p> </p>

- Deletar Cursos 
  <p> Rota:http://localhost:8080/cursos/{id} </p>
  <p> Método: DELETE </p>
  <p align="center"><img src="/readme/deletarCursos.JPG"/></p>
 
  <p> </p>

  - Buscar Cursos por ID
  <p> Rota:http://localhost:8080/cursos/{id}</p>
  <p> Método: GET </p>
   <p align="center"><img src="/readme/buscarCursosPorID.JPG"/></p>

 <p> </p>

 <h4 align="center">Inscrições</h4>

 - Listar Inscrições 
  <p> Rota:http://localhost:8080/inscricoes/todos </p>
  <p> Método: GET </p>
  
<p> </p>

- Cadastrar Inscrições 
  <p> Rota:http://localhost:8080/inscricoes </p>
  <p> Método: POST </p>

<p> </p>

- Atualizar Inscrições 
  <p> Rota:http://localhost:8080/inscricoes/{id} </p>
  <p> Método: PUT </p>
 
  <p> </p>

- Deletar Inscrições 
  <p> Rota:http://localhost:8080/inscricoes/{id} </p>
  <p> Método: DELETE </p>

  <p> </p>

  - Buscar Inscricoes por ID
  <p> Rota:http://localhost:8080/inscricoes/{id}</p>
  <p> Método: GET </p>

 <p> </p>

<h2 align="center"> Desenvolvedoras </h2>
<p align="justify">Aryane Maria Valentim Teixeira;</p>
<p align="justify">Caroline Tavares;</p>
<p align="justify">Deborah Yohana B. da Silva;</p>
<p align="justify">Patricia Ruiz;<p>
<p align="justify">Raphaela Cristina O. Britto. </p>





