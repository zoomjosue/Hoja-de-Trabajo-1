/**
/ UNIVERSIDAD DEL VALLE DE GUATEMALA
/ DEPARTAMENTO DE CIENCIA DE LA COMPUTACIÓN
/ CC2008 
/ AUTOR: Josué Antonio Isaac García Barrera - 24918, Jose Alberto Abril Suchite 24585, José Manuel Sanchez Hernandez - 24092
/ FECHA: 23/01/2025   
*/

public class Licuadora {
    private int speed;
    private boolean content;

    public Licuadora(){
        this.speed = 0;
        this.content = false;
    }

    /**
     * Este método se encarga de subir la velocidad uno por uno hasta el nievel 10.
     */
    public void SpeedUp(){
        if(speed < 10){
            speed++;
        } 
    }

    /**
     * Este método se encarga de bajar la velocidad uno por uno hatsa el nivel 0.
     */
    public void SpeedDown(){
        if(speed > 0){
            speed--;
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