//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Torneio campeonatoCarioca = new Torneio();
        campeonatoCarioca.setEsporteDoTorneio("Futebol");

        Time time1 = new Time();
        Time time2 = new Time();
        Time time3 = new Time();
        Time time4 = new Time();
        time1.setNome("Fluminense");
        time2.setNome("Flamengo");
        time3.setNome("Botafogo");
        time4.setNome("Corinthias");

        campeonatoCarioca.adicionarTime(time1);
        campeonatoCarioca.adicionarTime(time2);
        campeonatoCarioca.adicionarTime(time3);
        campeonatoCarioca.adicionarTime(time4);

        Partida partida1 = new Partida();
        partida1.setTime1Dapartida(time1);
        partida1.setTime2DaPartida(time2);
        partida1.setGolTime1(2);
        partida1.setGolTime2(1);
        campeonatoCarioca.registrarPartida(partida1);

        Partida partida2 = new Partida();
        partida2.setTime1Dapartida(time3);
        partida2.setTime2DaPartida(time4);
        partida2.setGolTime1(0);
        partida2.setGolTime2(3);
        campeonatoCarioca.registrarPartida(partida2);

        Partida partida3 = new Partida();
        partida3.setTime1Dapartida(time1);
        partida3.setTime2DaPartida(time4);
        partida3.setGolTime1(2);
        partida3.setGolTime2(4);
        campeonatoCarioca.registrarPartida(partida3);


        Partida partida4 = new Partida();
        partida4.setTime1Dapartida(time2);
        partida4.setTime2DaPartida(time3);
        partida4.setGolTime1(1);
        partida4.setGolTime2(1);
        campeonatoCarioca.registrarPartida(partida4);

        campeonatoCarioca.exibirClassificao();




    }

}