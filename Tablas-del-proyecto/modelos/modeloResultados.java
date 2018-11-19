package modelos;

import include.resultados;
import java.sql.PreparedStatement;

public class modeloResultados extends conexion {
    public boolean insertResultados(resultados resul) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta = "INSERT INTO resultados (id_resultados, respuestas_incorrectas, respuestas_correctas) VALUES (?,?,?)";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, resul.getId_resultados());
            pst.setInt(2, resul.getRespuestas_correctas());
            pst.setInt(3, resul.getRespuestas_incorrectas());

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
}
