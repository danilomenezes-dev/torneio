Sistema de Gerenciamento de Torneios
Um projeto simples em Java para simular partidas de um torneio, calcular os pontos de cada time e exibir uma tabela de classificação em tempo real.

Estrutura e Tecnologias
Este projeto foi desenvolvido inteiramente em Java. A sua estrutura é organizada da seguinte forma:
Main.java: O ponto de entrada do programa. É aqui que o torneio é criado, os times são adicionados e as partidas são simuladas para demonstrar o funcionamento do sistema.
Torneio.java: A classe principal que orquestra todo o campeonato. É responsável por adicionar times, registar os resultados das partidas e exibir a tabela de classificação final.
Partida.java: Modela um único jogo entre dois times. A sua principal responsabilidade é calcular os pontos ganhos por cada time com base no resultado (vitória, derrota ou empate).
Time.java: Representa uma equipa que participa no torneio, armazenando informações essenciais como o nome e a pontuação acumulada.
Jogador.java: Representa um jogador. No escopo atual, esta classe foi criada para a logística de organização dos times, embora ainda não tenha uma funcionalidade ativa no sistema de pontuação ou partidas.

Guia de Execução

Pré-requisitos:
É necessário ter o Java Development Kit (JDK) instalado no computador.

Passos para Execução:
Faça o clone ou o download deste repositório para a sua máquina local.
Abra o projeto na sua IDE de preferência.
Localize o ficheiro Main.java e execute o método main().

Resultado Esperado
Ao executar o programa, o terminal irá exibir a "Tabela de Classificação" com os times ordenados da maior para a menor pontuação, com base nos resultados das partidas que foram simuladas no código.

Próximos Passos
Este projeto tem potencial para evoluir. Algumas funcionalidades futuras incluem:
[ ] Integrar a classe Jogador: Adicionar jogadores aos times e registar estatísticas individuais.
[ ] Melhorar as Estatísticas do Time: Incluir vitórias, derrotas, empates, golos marcados e sofridos.
[ ] Criar uma Interface de Utilizador (UI): Desenvolver uma interface interativa no terminal (CLI).
[ ] Persistência de Dados: Implementar uma forma de guardar e carregar os dados do torneio a partir de um ficheiro.
