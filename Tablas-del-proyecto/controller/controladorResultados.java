package controller;

import include.resultados;
import modelos.modeloResultados;

public class controladorResultados {
    public boolean agregarResultados(resultados resu){
        modeloResultados resul = new modeloResultados();
        return resul.insertResultados(resu);

    }

    public static void main (String[] args){
        modeloResultados ce = new modeloResultados();
        System.out.println(ce.insertResultados(new resultados(1,2,3)));
    }


}
