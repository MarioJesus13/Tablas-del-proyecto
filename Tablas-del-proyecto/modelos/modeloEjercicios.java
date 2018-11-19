package modelos;

import include.ejercicios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class modeloEjercicios extends conexion {
    public boolean insertEjercicio(ejercicios ejer) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta = "INSERT INTO ejercicios (id_ejercicio, nombre_ejercicio, puntaje) VALUES (?,?,?)";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, ejer.getId_ejercicio());
            pst.setString(2, ejer.getNombre_ejercicio());
            pst.setInt(3, ejer.getPuntaje());

            if (pst.executeUpdate() == 1) {
                flag = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (getConection() != null) {
                    getConection().close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return flag;
    }
    public ArrayList<ejercicios> obtenerEjercicios(){
        ArrayList<ejercicios> ejer = new ArrayList<ejercicios>();
        PreparedStatement   pst = null;
        ResultSet rs = null;
        try{
            String consulta = "SELECT id_ejercicio,nombre_ejercicio,puntaje FROM ejercicios";
            pst = getConection().prepareCall(consulta);
            rs = pst.executeQuery();
            while  (rs.next()){
                ejer.add(new ejercicios(rs.getInt("id_ejercicio"),
                        rs.getString("nombre_ejercicio"),
                        rs.getInt("puntaje")));

            }
        }catch (Exception e) {
        }finally {
            try{
                if(getConection()!= null)getConection().close();
                if(pst != null)pst.close();
                if(rs != null)rs.close();
            }catch (Exception e){
            }
        }
        return ejer;
    }


}
