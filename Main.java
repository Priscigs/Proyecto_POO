import java.util.Scanner;

public class Main{

	public static void main (String args[]){

		Scanner scanString = new Scanner (System.in);
		Scanner scanInt = new Scanner (System.in);
		Scanner scanDouble = new Scanner (System.in);

		MenuPrincipal menu = new MenuPrincipal();
                Menujuegos menuj = new Menujuegos();

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

		System.out.print("\n|||||BIENVENIDO A PEQUEGAMES||||| "); 
		System.out.print("\n\n1. Crear Cuenta \n2. Iniciar Sesion \n3. Descripcion \n4. Salir"); 
		opc = scanInt.nextInt();

		switch(opc){
			case 1:
				System.out.print("\nUsuario del encargado: "); user = scanString.next();
				System.out.print("\nCorreo electronico: "); correo = scanString.next();
				System.out.print("\nNombre del ninio: "); nombreN = scanString.next();
				System.out.print("\nEdad del ninio: "); edadN = scanString.nextInt();
				System.out.print("\nContrasenia: "); password = scanString.next();
				System.out.print(menu.crearCuenta());
				break;
			case 2:
				System.out.print("\nUsuario del encargado: "); user = scanString.next();
				System.out.print("\nContrasenia: "); password = scanString.next();
				System.out.print(menu.inicioSesion());
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
			case 3:
				System.out.print(menu.descripcion());
				System.out.print("\nDesea regresar al menu principal?"); 
				System.out.print("\n1. Si \n2. Salir"); opc2 = scanInt.nextInt();
				
				do{
					System.out.print("|||||BIENVENIDO A PEQUEGAMES||||| "); 
					System.out.print("\n\n1. Crear Cuenta \n2. Iniciar Sesion \n3. Descripcion \n4. Salir"); 
					opc = scanInt.nextInt();

					switch(opc){
						case 1:
							System.out.print("\nUsuario del encargado: "); user = scanString.next();
							System.out.print("\nCorreo electronico: "); correo = scanString.next();
							System.out.print("\nNombre del ninio: "); nombreN = scanString.next();
							System.out.print("\nEdad del ninio: "); edadN = scanString.nextInt();
							System.out.print("\nContrasenia: "); password = scanString.next();
							System.out.print(menu.crearCuenta());
							break;
						case 2:
							System.out.print("\nUsuario del encargado: "); user = scanString.next();
							System.out.print("\nContrasenia: "); password = scanString.next();
							System.out.print(menu.inicioSesion());
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
						case 3:
							System.out.print(menu.descripcion());
							System.out.print("\n\nDesea regresar al menu principal?"); 
							System.out.print("\n1. Si \n2. Salir"); opc2 = scanInt.nextInt();
							break;
						case 4:
								System.exit(0);
								break;
							}
				}
				while(opc2 != 2);
				break;
			case 4:
					System.exit(0);
					break;
		}
	}
}