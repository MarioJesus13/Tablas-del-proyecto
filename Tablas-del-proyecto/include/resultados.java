package include;

public class resultados {
    private int id_resultados;
    private int respuestas_correctas;
    private int respuestas_incorrectas;

    public resultados(int id_resultados,int respuestas_correctas,int respuestas_incorrectas) {
        this.id_resultados = id_resultados;
        this.respuestas_correctas = id_resultados;
        this.respuestas_incorrectas = id_resultados;

    }

    public int getId_resultados() {
        return id_resultados;
    }
    public void setId_resultados(int id_resultados){
        this.id_resultados = id_resultados;
    }

    public int getRespuestas_correctas(){
        return respuestas_correctas;

    }
    public void setRespuestas_correctas(int respuestas_correctas){
        this.respuestas_correctas = respuestas_correctas;

    }
    public int getRespuestas_incorrectas(){
        return respuestas_incorrectas;
    }

    public void setRespuestas_incorrectas(int respuestas_incorrectas){
        this.respuestas_incorrectas = respuestas_incorrectas;
    }

}
