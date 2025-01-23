/**
 *  @author José Manuel Sanchez Hernández - 24092, Josué Antonio Isaac García Barrera - 24918 y Jose Alberto Abril Suchite 24585
 *  @version 1.0
 *  Descripción: Interfaz que contiene los métodos que se deben implementar en la clase Blender.
 *  Fecha de creación: 17/01/2025
 *  Fecha de última modificación: 23/01/2025
 */

public interface IBlender{
    public void SpeedUp();
    public boolean IsFull();
    public void Fill();
    public void Empty();
    public void SpeedDown();
    public int GetSpeed();
    
}