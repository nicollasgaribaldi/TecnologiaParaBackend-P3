# TecnologiaParaBackend-P3
Repositório da Disciplina Tecnologia para Backend do Professor Kelson Victor
Curso Sistemas para Internet - Uniesp Centro Universitário

# Aluno-Online  

**Descrição do Projeto**  
Este é um projeto de API RESTful desenvolvido para a disciplina de Tecnologias para Back-End. Ele possibilita a gestão de alunos, professores, disciplinas e matrículas. Inclui funcionalidades para adicionar, atualizar, visualizar e remover registros, além de realizar cálculos, como médias de notas.  

**Como configurar as dependências:**  
Acesse o site [Spring Initializr](https://start.spring.io) e selecione as dependências necessárias: Spring Web, Spring Data JPA, PostgresSQL Driver e Lombok. Após o download, importe a pasta do projeto para a sua IDE favorita e configure-a conforme necessário.  

## Ferramentas e Tecnologias Utilizadas  
- **Linguagem:** Java 17 com Spring Framework.  
- **Gerenciador de dependências:** Maven.  
- **Banco de dados:** PostgreSQL.  
- **Ferramentas de apoio:** Insomnia para testes, DBeaver para gerenciamento do banco de dados.  
- **IDE:** IntelliJ IDEA ou outra de sua escolha.  

## Estrutura do Projeto  

O sistema é dividido em seis camadas principais:  
1. **Controller:** Recebe as solicitações HTTP, como criação de um aluno.  
2. **Model:** Estrutura os atributos das entidades do projeto.  
3. **Repository:** Faz a integração entre a aplicação e o banco de dados.  
4. **Service:** Implementa as regras de negócio.  
5. **DTOs:** Transfere informações entre diferentes camadas do sistema.  
6. **Enums:** Define constantes para facilitar o controle de status ou tipos.  

## Explicação das Anotações  

### Controller  
- **@RestController:** Declara a classe como um controlador RESTful.  
- **@RequestMapping("/alunos"):** Define o caminho principal para os métodos da classe.  
- **@PostMapping:** Lida com requisições do tipo POST.  
- **@ResponseStatus(HttpStatus.CREATED):** Define o código de status HTTP retornado ao executar o método com sucesso.  
- **@RequestBody:** Converte o JSON da requisição em um objeto Java.  
- **@Autowired:** Faz a injeção automática de dependências pelo Spring.  
- **@GetMapping:** Configura o método para aceitar requisições GET.  
- **@DeleteMapping:** Configura o método para aceitar requisições DELETE.  
- **@PutMapping:** Mapeia o método para lidar com requisições PUT.  
- **@PathVariable:** Obtém valores diretamente da URL.  
- **@PatchMapping:** Mapeia requisições do tipo PATCH.  

### Model  
- **@Entity:** Indica que a classe representa uma tabela no banco de dados.  
- **@Id:** Define o campo como chave primária da tabela.  
- **@GeneratedValue(strategy = GenerationType.IDENTITY):** Configura a geração automática dos valores da chave primária.  
- **@NoArgsConstructor:** Cria um construtor vazio.  
- **@AllArgsConstructor:** Cria um construtor com todos os atributos.  
- **@Data:** Gera automaticamente métodos como getters e setters.  
- **@ManyToOne:** Configura um relacionamento muitos-para-um.  
- **@JoinColumn:** Define a coluna que conecta entidades relacionadas.  
- **@Enumerated:** Converte valores de enum para o banco de dados.  

### Repository  
- **@Repository:** Marca a interface como um repositório que facilita operações no banco de dados.  

### Service  
- **@Service:** Define a classe como um serviço do Spring.  
- **@Autowired:** Realiza injeção de dependências automática.  

## Funcionalidades  

### Aluno  
- Criar novo aluno.  
- Listar todos os alunos cadastrados.  
- Consultar informações de um aluno pelo ID.  
- Atualizar dados de um aluno existente.  
- Excluir um aluno do sistema.  

### Professor  
- Adicionar professores.  
- Relacionar disciplinas com professores.  

### Matrícula  
- Matricular alunos em disciplinas.  
- Alterar notas de alunos em disciplinas.  
- Calcular média de notas e definir status de aprovação ou reprovação.  
- Trancar uma matrícula.  

### Disciplina  
- Criar novas disciplinas.  
- Listar disciplinas atribuídas a um professor.  

## Principais Endpoints  

### Aluno  
- **POST /alunos:** Adiciona um novo aluno.  
- **GET /alunos:** Lista todos os alunos.  
- **GET /alunos/{id}:** Retorna informações de um aluno específico.  
- **DELETE /alunos/{id}:** Exclui um aluno pelo ID.  
- **PUT /alunos/{id}:** Atualiza dados de um aluno existente.  

### Professor  
- **POST /professores:** Cadastra um professor.  
- **GET /disciplinas/{professorId}:** Exibe as disciplinas de um professor.  

### Disciplina  
- **POST /disciplinas:** Adiciona uma nova disciplina.  

### Matrícula  
- **POST /matriculas-alunos:** Matricula um aluno.  
- **PATCH /matriculas-alunos/trancar/{id}:** Tranca uma matrícula.  
- **PATCH /matriculas-alunos/atualiza-notas/{id}:** Atualiza as notas de um aluno.  

## Documentação com Swagger  
O Swagger gera automaticamente uma interface gráfica acessível em `/swagger-ui.html`, permitindo testar e explorar os endpoints da API.  

**DTO (Data Transfer Object)**  
O DTO é um padrão utilizado para transportar dados entre diferentes partes da aplicação, reduzindo a exposição direta de entidades.  
