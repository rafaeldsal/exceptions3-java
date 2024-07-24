# Projeto: Tratamento de Exceções em Java

## Descrição

Neste pequeno projeto, queremos entender como tratar exceções em nossos códigos Java. O intuito é ter três abordagens diferentes que mostram a necessidade de tratar exceções e o quanto elas podem ser benéficas. Portanto, teremos uma abordagem em que não tratamos as exceções diretamente. Usamos condicionais para validar as situações e, a cada commit, vamos melhorando essa implementação.

## Estrutura do Projeto

O projeto está dividido em três etapas principais:

1. **Abordagem Inicial - Sem Tratamento de Exceções**:
    - Nesta etapa, não utilizamos blocos `try-catch` para tratar exceções.
    - Usamos condicionais para validar as situações e evitar erros.
    - Exemplos de código sem tratamento adequado de exceções.

2. **Abordagem Intermediária - Tratamento Básico de Exceções**:
    - Continuamos com o uso de validações por meio de condicionais, porém delegando a lógica de validação para a classe responsável

3. **Abordagem Avançada - Tratamento Eficiente de Exceções**:
    - Melhoramos a implementação do tratamento de exceções.
    - Usamos exceções personalizadas e boas práticas de tratamento.
    - Exemplos de código com tratamento avançado e eficiente de exceções.

## Objetivos

- **Entender a importância do tratamento de exceções**: Demonstrar como exceções não tratadas podem causar falhas no programa.
- **Implementar tratamento básico de exceções**: Aprender a usar blocos `try-catch` para capturar e tratar exceções comuns.
- **Melhorar a robustez do código**: Aprender boas práticas de tratamento de exceções para criar códigos mais seguros e eficientes.

## Como Executar o Projeto

1. **Clone o repositório**:
    ```bash
    git clone <https://github.com/rafaeldsal/exceptions3-java.git>
    cd tratamento-excecoes-java
    ```

2. **Compile o projeto**:
    ```bash
    javac -d bin src/*.java
    ```

3. **Execute o projeto**:
    ```bash
    java -cp bin Program
    ```

## Contribuição

Se você deseja contribuir para este projeto, siga estas etapas:

1. **Fork o repositório**.
2. **Crie uma branch para sua feature**:
    ```bash
    git checkout -b feature/nome-da-feature
    ```
3. **Faça commit das suas mudanças**:
    ```bash
    git commit -m 'Adiciona nova feature'
    ```
4. **Push para a branch**:
    ```bash
    git push origin feature/nome-da-feature
    ```
5. **Abra um Pull Request**.

## Contato

Se você tiver alguma dúvida ou sugestão, sinta-se à vontade para entrar em contato:

- **Email**: rafaelsnt123@gmail.com
- **GitHub**: [rafaeldsal](https://github.com/rafaeldsal)

---

**Observação**: Este projeto está em desenvolvimento contínuo. A cada commit, melhorias serão adicionadas para refinar o tratamento de exceções e melhorar a qualidade do código.

---

**Licença**: Este projeto está licenciado sob a Licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.