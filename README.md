# Importações Utilizadas

ResponseEntity: Usado para construir a resposta HTTP com um status e um corpo.
Controller: Marca a classe como um controlador Spring, responsável por lidar com requisições HTTP.
GetMapping e PostMapping: Anotações usadas para mapear requisições HTTP para métodos específicos.
RequestParam: Indica que um parâmetro da requisição HTTP deve ser vinculado a um parâmetro de método.

# Classes

@Controller
public class SomaController{}

Declara a classe SomaController e a anota com @Controller, o que indica ao Spring que essa classe é um controlador que vai lidar com requisições web.

# Método Somar

@PostMapping("/soma")
public ResponseEntity<String> somar(@RequestParam int num1, 
                                    @RequestParam int num2) {
    int resultado = num1 + num2;
    return ResponseEntity.ok("Resultado: " + resultado);
}

Mapeia requisições HTTP POST para o caminho /soma.
@PostMapping("/soma"): Indica que esse método será chamado quando uma requisição POST for feita para http://localhost:8080/soma.
public ResponseEntity<String> somar(...): Define o método que será executado quando o mapeamento for acessado.

@RequestParam int num1, @RequestParam int num2: Esses parâmetros indicam que os valores dos parâmetros num1 e num2 da requisição serão passados para o método. O Spring os extrairá da requisição HTTP e os passará como argumentos.

int resultado = num1 + num2;: Realiza a soma dos dois números recebidos.

return ResponseEntity.ok("Resultado: " + resultado);: Retorna uma resposta HTTP com o status 200 OK e uma mensagem de corpo contendo o resultado da soma.

# Aplicação

@SpringBootApplication   -   Anota a classe como a aplicação principal do Spring Boot, ativando auto-configuração e escaneamento de componentes
public class SomaApplication {  - Declaração da classe principal da aplicação

    public static void main(String[] args) {  -  Método main, o ponto de entrada para a execução da aplicação Java
        SpringApplication.run(SomaApplication.class, args);  -  Executa a aplicação Spring Boot, inicializando o contexto de aplicação
    }
}