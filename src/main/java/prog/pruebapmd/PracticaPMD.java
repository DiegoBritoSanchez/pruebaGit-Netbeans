/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package prog.pruebapmd;

public class PracticaPMD {

    public static void main(String[] args) {

        int altura = 89;
        if (altura > 89) {
            System.out.println("Eres muy alto");
            System.out.println("Prueba de que GIT funciona.");
        }
        PracticaPMD ejemPMD = new PracticaPMD();
        ejemPMD.metodoDobleReturn();
    }

    public boolean metodoDobleReturn() {
        int iValor = 10;
        return iValor != 5;
    }

}
