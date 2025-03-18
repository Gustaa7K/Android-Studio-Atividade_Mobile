# Projeto Mobile - Exercícios Android

Este repositório contém uma série de exercícios desenvolvidos para a prática de conceitos de desenvolvimento Android utilizando Java. O projeto tem como objetivo a criação de diversas funcionalidades, com foco na interação do usuário com a interface e a manipulação de dados, como preferências e exibição de conteúdos dinâmicos.

## Funcionalidades

- **Exercício 1**: Exibição de texto simples.
- **Exercício 2**: Interação com o botão e resposta a eventos de clique.
- **Exercício 3**: Manipulação de imagens e layouts.
- **Exercício 4**: Criação dinâmica de checkboxes a partir do nome fornecido.
- **Exercício 5**: Tela de preferências do usuário, permitindo a escolha de notificações, modo escuro e login.
- **Exercício 6**: Navegação entre atividades, com botões que direcionam para cada exercício.

## Como Rodar o Projeto

1. **Pré-requisitos**
   - Android Studio instalado.
   - JDK (Java Development Kit) 8 ou superior instalado.
   - Dispositivo Android físico ou emulador configurado.

2. **Passos para rodar o projeto**:
   
   1. Clone o repositório para o seu ambiente local:
      ```bash
      git clone https://github.com/Gustaa7K/Android-Studio-Atividade_Mobile.git
      ```

   2. Abra o Android Studio.
   
   3. No Android Studio, clique em **File > Open** e selecione a pasta onde o repositório foi clonado.
   
   4. Aguarde o Android Studio configurar o projeto e baixar as dependências necessárias.
   
   5. Clique em **Run** ou **Shift + F10** para compilar e rodar o aplicativo no emulador ou dispositivo físico.

## Estrutura do Projeto

Aqui estão os arquivos essenciais do projeto e onde você pode encontrá-los:

- **MainActivity.java**: 
  - Localização: `app/src/main/java/com/example/projetomobile/MainActivity.java`
  - Descrição: Tela inicial com navegação entre as atividades dos exercícios.
  
- **Exercicio1Activity.java a Exercicio5Activity.java**:
  - Localização: `app/src/main/java/com/example/projetomobile/`
  - Descrição: Cada uma dessas atividades contém um exercício específico, conforme a descrição dos exercícios no projeto.
  - Arquivos: 
    - `Exercicio1Activity.java`
    - `Exercicio2Activity.java`
    - `Exercicio3Activity.java`
    - `Exercicio4Activity.java`
    - `Exercicio5Activity.java`

- **activity_main.xml**: 
  - Localização: `app/src/main/res/layout/activity_main.xml`
  - Descrição: Layout da tela inicial com os botões de navegação.
  
- **activity_exercicioX.xml**: 
  - Localização: `app/src/main/res/layout/`
  - Descrição: Layouts das telas dos exercícios. Cada exercício possui um arquivo XML específico para definir a interface.
  - Arquivos:
    - `activity_exercicio1.xml`
    - `activity_exercicio2.xml`
    - `activity_exercicio3.xml`
    - `activity_exercicio4.xml`
    - `activity_exercicio5.xml`

- **AndroidManifest.xml**: 
  - Localização: `app/src/main/AndroidManifest.xml`
  - Descrição: Arquivo de configuração das atividades e permissões necessárias para o funcionamento do aplicativo.

## Contribuição

Sinta-se à vontade para fazer contribuições para o projeto. Caso deseje, abra uma **issue** ou envie um **pull request** para melhorar o código ou adicionar novas funcionalidades.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
