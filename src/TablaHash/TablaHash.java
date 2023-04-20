package TablaHash;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Daniel
 */
public class TablaHash {
    
    public static void main(String[] args) {
        Map<String, Alumno> mapa =new HashMap<>();
        
        Alumno alumno = new Alumno("Sergio", "1", "Riveros", "cucuta");
        
        mapa.put(alumno.getCodigo(), alumno);
        
        System.out.println(mapa.get(alumno.getCodigo().toString()));
        
    }
    
}
