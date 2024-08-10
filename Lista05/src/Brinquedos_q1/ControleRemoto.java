/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Brinquedos_q1;


public class ControleRemoto {
    
    
    private Brinquedo brinquedo;

    public ControleRemoto(Brinquedo brinquedo) {
        this.brinquedo = brinquedo;
    }
    
    public void mover() {
        this.brinquedo.mover();
    }
    
}
