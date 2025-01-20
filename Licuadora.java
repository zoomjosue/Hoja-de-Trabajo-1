/**
/ UNIVERSIDAD DEL VALLE DE GUATEMALA
/ DEPARTAMENTO DE CIENCIA DE LA COMPUTACIÓN
/ CC2008 
/ AUTOR: Josué Antonio Isaac García Barrera - 24918, Jose Alberto Abril Suchite 24585, José Manuel Sanchez Hernandez - 24092
/ FECHA: 28/01/2025   
*/

public class Licuadora {
    private int speed;
    private boolean content;

    public Licuadora(){
        this.speed = 0;
        this.content = false;
    }

    /**
     * Este metodo se encarga de subir la velocidad uno por uno hasta el nievel 10.
     */
    public void SpeedUp(){
        if(speed < 10){
            speed++;
        } 
    }

    /**
     * Este metodo se encarga de bajar la velocidad uno por uno hatsa el nivel 0.
     */
    public void SpeedDown(){
        if(speed > 0){
            speed--;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    
}