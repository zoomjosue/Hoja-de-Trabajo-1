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
            System.out.println("Le has subido la velocidad");
        } 
        else{
            System.out.println("La velocidad esta a nivel maximo");
        }
    }

    /**
     * Este metodo se encarga de bajar la velocidad uno por uno hatsa el nivel 0.
     */
    public void SpeedDown(){
        if(speed > 0){
            speed--;
            System.out.println("Le has bajado velocidad");
        }
        else{
            System.out.println("La velocidad esta en su minimo");
        }
    }
}