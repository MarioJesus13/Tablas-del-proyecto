package controller;

import include.ejercicios;
import modelos.modeloEjercicios;

import java.util.ArrayList;

public class controladorEjercicios {
    public boolean agregarEjercicio(ejercicios ejerci){
        modeloEjercicios ejer = new modeloEjercicios();
        return ejer.insertEjercicio(ejerci);
    }

    public ArrayList<ejercicios>obtenerejercicios(){
        modeloEjercicios ejercicio = new modeloEjercicios();
        return ejercicio.obtenerEjercicios();
    }

    public static void main(String[] args) {
        modeloEjercicios ce = new modeloEjercicios();
        //System.out.println(ce.insertEjercicio(new ejercicios(2, "ejercicio1", 10)))
        ArrayList<ejercicios> ejercici = new ArrayList<ejercicios>();
        ejercici = ce.obtenerEjercicios();
        for (int i = 0; i < ejercici.size(); i++) {
            System.out.println(ejercici.get(i).getNombre_ejercicio());
        }

    }

}

