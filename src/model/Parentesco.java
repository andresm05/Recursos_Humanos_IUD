
package model;

/**
 *
 * @author HOME
 */
public class Parentesco {

    private int id;
    private String nombre;

    public Parentesco(){
        
    }
    
    public Parentesco(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

}
