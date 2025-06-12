public class Partida  {
    private String resultadoDaPartida;
    private Time time1Dapartida;
    private Time time2DaPartida;
    private int golTime1;
    private int golTime2;

    public int getGolTime1() {
        return golTime1;
    }

    public void setGolTime1(int golTime1) {
        this.golTime1 = golTime1;
    }

    public int getGolTime2() {
        return golTime2;
    }

    public void setGolTime2(int golTime2) {
        this.golTime2 = golTime2;
    }

    public String getResultadoDaPartida() {
        return resultadoDaPartida;
    }

    public void setResultadoDaPartida(String resultadoDaPartida) {
        this.resultadoDaPartida = resultadoDaPartida;
    }

    public Time getTime1Dapartida() {
        return time1Dapartida;
    }

    public void setTime1Dapartida(Time time1Dapartida) {
        this.time1Dapartida = time1Dapartida;
    }

    public Time getTime2DaPartida() {
        return time2DaPartida;
    }

    public void setTime2DaPartida(Time time2DaPartida) {
        this.time2DaPartida = time2DaPartida;
    }
    public void verResultado() {
        int pontosGanhoTime1;
        int pontosGanhoTime2;

        if (this.golTime1 > this.golTime2){
            pontosGanhoTime1 = 3;
            pontosGanhoTime2 = 0;
        }else if (this.golTime2 > this.golTime1){
            pontosGanhoTime1 = 0;
            pontosGanhoTime2 = 3;
        }else {
            pontosGanhoTime1 = 1;
            pontosGanhoTime2 = 1;
        }

        if (this.time1Dapartida != null){
            int pontosAtuaisDoTime1 = this.time1Dapartida.getPontosDotime();
            this.time1Dapartida.setPontosDotime(pontosAtuaisDoTime1 += pontosGanhoTime1);
        }
        if (this.time2DaPartida != null) {
            int pontosAtuaisDoTime2 = this.time2DaPartida.getPontosDotime();
            this.time2DaPartida.setPontosDotime(pontosAtuaisDoTime2 += pontosGanhoTime2);
        }

    }
}
