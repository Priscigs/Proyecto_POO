package Cuentos;

import java.util.Scanner;

/**
 * menuCuentos
 */
public class menuCuentos {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Cuentos cuento = new Cuentos();
        int opc1=0;
        while (opc1==0) {
            cuento.menuCuentosString();
            int opc;
            String opc2;
            opc=scan.nextInt();
            switch (opc) {
                case 1:
                    cuento.cuento1();
                    System.out.println("Desea salir al menu");
                    opc2=scan.nextLine();
                    opc2=opc2.toLowerCase();
                    if (opc2.equals("si")) {
                        break;
                    }
                case 2:
                    cuento.cuento2();
                    System.out.println("Desea salir al menu");
                    opc2=scan.nextLine();
                    opc2=opc2.toLowerCase();
                    if (opc2.equals("si")) {
                        break;
                    }
                case 3:
                    cuento.cuento3();
                    System.out.println("Desea salir al menu");
                    opc2=scan.nextLine();
                    opc2=opc2.toLowerCase();
                    if (opc2.equals("si")) {
                        break;
                    }
                case 4:
                    opc1=1;
                    break;
            
                default:
                    break;
            }
        }
        
    }
}