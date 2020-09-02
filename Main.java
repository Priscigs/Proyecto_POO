import java.util.Scanner;

public class Main{

	public static void main (String args[]){

		Scanner scanString = new Scanner (System.in);
		Scanner scanInt = new Scanner (System.in);
		Scanner scanDouble = new Scanner (System.in);

		MenuPrincipal menu = new MenuPrincipal();
                Menujuegos menuj = new Menujuegos();
				Cuentos cuentos = new Cuentos();

		int opc = 0;
		int opc2 = 0;
		String user = "";
		String password = "";
		String nombreR = "";
		String correo = "";
		String nombreN = "";
		int edadN = 0;
                int opc3 = 0;
                int opc4 = 0;
				int opc5 = 0;
				int opc6 = 0;

		System.out.print("\n|||||BIENVENIDO A PEQUEGAMES||||| "); 
		System.out.print("\n\n1. Crear Cuenta \n2. Iniciar Sesion \n3. Descripcion \n4. Salir"); 
		System.out.print("\n Seleccione la opcion que desea"); opc = scanInt.nextInt();

		switch(opc){
			case 1:
				System.out.print("\nUsuario del encargado: "); user = scanString.next();
				System.out.print("\nCorreo electronico: "); correo = scanString.next();
				System.out.print("\nNombre del ninio: "); nombreN = scanString.next();
				System.out.print("\nEdad del ninio: "); edadN = scanInt.nextInt();
				System.out.print("\nContrasenia: "); password = scanString.next();
				System.out.print(menu.crearCuenta());
				break;
			case 2:
				System.out.print("\nUsuario del encargado: "); user = scanString.next();
				System.out.print("\nContrasenia: "); password = scanString.next();
				System.out.print(menu.inicioSesion());
				System.out.println("\n 1. Juegos");
				System.out.println("2. Cuentos");
				System.out.println("3. Salir");
				System.out.print("Seleccione la opcion que desea"); opc5 = scanInt.nextInt();
				if (opc5 == 1){
                                System.out.print(menuj.menuJuegos());
                                                        System.out.print("\n Seleccion: "); opc3 = scanInt.nextInt();
                                                        if(opc3 == 1){
                                                            System.out.println(menuj.menujuegos2());
                                                            opc4 = scanInt.nextInt();
                                                            if(opc4==1){
                                                                System.out.println("Juego aun no disponible en esta version");
                                                            }
                                                            else if (opc4 == 2){
                                                                System.out.println(menuj.infoRompecabezas());
                                                            }
                                                            else if (opc4 ==3){
                                                                break;
                                                            }
                                                            else
                                                                System.out.println("Ingrese una opcion valida");
                                                        }
                                                        else if(opc3==2){
                                                            System.out.println(menuj.menujuegos2());
                                                            opc4 = scanInt.nextInt();
                                                            if(opc4==1){
                                                                System.out.println("Juego aun no disponible en esta version");
                                                            }
                                                            else if (opc4 == 2){
                                                                System.out.println(menuj.infoLaberinto());
                                                            }
                                                            else if (opc4 ==3){
                                                                break;
                                                            }
                                                            else
                                                                System.out.println("Ingrese una opcion valida");
                                                        }
                                                        else if(opc3==3){
                                                               System.out.println(menuj.menujuegos2());
                                                            opc4 = scanInt.nextInt();
                                                            if(opc4==1){
                                                                System.out.println("Juego aun no disponible en esta version");
                                                            }
                                                            else if (opc4 == 2){
                                                                System.out.println(menuj.infoCyF());
                                                            }
                                                            else if (opc4 ==3){
                                                                break;
                                                            }
                                                            else
                                                                System.out.println("Ingrese una opcion valida");
                                                        }
                                                        else if(opc3==4){
                                                            System.out.println(menuj.menujuegos2());
                                                            opc4 = scanInt.nextInt();
                                                            if(opc4==1){
                                                                System.out.println("Juego aun no disponible en esta version");
                                                            }
                                                            else if (opc4 == 2){
                                                                System.out.println(menuj.infoMemoria());
                                                            }
                                                            else if (opc4 ==3){
                                                                break;
                                                            }
                                                            else
                                                                System.out.println("Ingrese una opcion valida");
                                                        }
                                                        else break;
							break;
				}
				else if (opc5 == 2){
					System.out.println(cuentos.menuCuentosString());
					System.out.print("Seleccione la opcion que desea: "); opc6 = scanInt.nextInt();
					if(opc6 == 1){
						System.out.println(cuentos.cuento1());
					}
					else if(opc6==2){
						System.out.println(cuentos.cuento2());
					}
					else if(opc6==3){
						System.out.println(cuentos.cuento3());
					}
					else if(opc6==4){
						break;
					}
					else System.out.println("seleccione una opción valida");
				}
			case 3:
				System.out.print(menu.descripcion());
				System.out.print("\nDesea regresar al menu principal?"); 
				System.out.print("\n1. Si \n2. Salir"); opc2 = scanInt.nextInt();
				if (opc2==1){
					break;
				}
				else if (opc2==2){
					break;
				}
				else System.out.println("Seleccione una opcion valida");
			case 4:
					System.exit(0);
					break;
		}
	}
}