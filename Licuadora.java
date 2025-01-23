/**
 *  @author José Manuel Sanchez Hernández - 24092, Josué Antonio Isaac García Barrera - 24918 y Jose Alberto Abril Suchite 24585
 *  @version 1.0
 *  Descripción: Esta clase representa una licuadora con sus respectivos atributos y métodos.
 *  Fecha de creación: 17/01/2025
 *  Fecha de última modificación: 23/01/2025
 */

public class Licuadora implements IBlender{
    private int speed;
    private boolean content;

    public Licuadora(){
        this.speed = 0;
        this.content = false;
    }

    /**
     * Este método se encarga de subir la velocidad uno por uno hasta el nivel 10, solo si la licuadora no está vacía.
     */
    public void SpeedUp(){
        if (content == true){
            if(speed < 10){
                speed++;
            } 
        }

    }

    /**
     * Este método se encarga de bajar la velocidad uno por uno hasta el nivel 0, solo si la licuadora no está vacía.
     */
    public void SpeedDown(){
        if (content == true){
            if(speed > 0){
                speed--;
            }
        }

    }

    /**
     * Este método se encarga de obtener la velocidad actual de la licuadora.
     * @return int - la velocidad actual de la licuadora.
     */
    public int GetSpeed() {
        return speed;
    }

    /**
     * Este método se encarga de establecer la velocidad de la licuadora.
     * @param speed - la velocidad a establecer.
     */
    public void SetSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Este método se encarga de llenar la licuadora.
     */
    public void Fill(){
        content = true;
    }

    /**
     * Este método se encarga de vaciar la licuadora.
     */
    public void Empty(){
        content = false;
    }

    /**
     * Este método se encarga de verificar si la licuadora esta llena.
     * @return boolean - true si esta llena, false si no.
     */
    public boolean IsFull(){
        return content;
    }
}