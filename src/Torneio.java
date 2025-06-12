import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Torneio {
    private String esporteDoTorneio;
    private Partida partida;
    private List<Partida> partidasJogadas = new ArrayList();
    private List<Time> timesParticipantes;


    public Torneio(){
        this.timesParticipantes = new ArrayList<>();
        this.partidasJogadas = new ArrayList<>();
    }

    public String getEsporteDoTorneio() {

        return esporteDoTorneio;
    }

    public void setEsporteDoTorneio(String esporteDoTorneio) {

        this.esporteDoTorneio = esporteDoTorneio;
    }

    public void registrarPartida(Partida partida) {
        partida.verResultado();
        this.partidasJogadas.add(partida);
    }
    public void adicionarTime(Time time) {
        this.timesParticipantes.add(time);
        this.partidasJogadas.add(partida);
    }
    public void exibirClassificao() {
        System.out.println("----- Tabela de Classificação -----");
        this.timesParticipantes.sort(Comparator.comparingInt(Time::getPontosDotime).reversed());
        for (Time time : timesParticipantes) {
            System.out.println("Nome do time: " + time.getNome() + " (" + time.getPontosDotime() +" pontos)");
        }
    }
}


