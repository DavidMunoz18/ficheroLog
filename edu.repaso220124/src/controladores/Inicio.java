package controladores;

import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

public class Inicio {

	public static void main(String[] args) {
		MenuInterfaz mi = new MenuImplementacion();

        int opcionPrincipal;
        boolean cerrarPrincipal = false;
        
        String ruta = "C:\\Users\\csi23-dmunnco\\Desktop\\edu.repaso220124\\nuevo.txt";
        
        do
        {	
        	
            System.out.println("MENÚ INICIAL");
           
            opcionPrincipal = mi.mostrarMenuPrincipalYSeleccion(ruta);
            switch (opcionPrincipal){

                case 0:
                    System.out.println("Se cierra la aplicación");
                    cerrarPrincipal = true;
                    break;
                case 1:
                    System.out.println("VERSIÓN EMPLEADO");
                    mi.accederVersionEmpleado(ruta);
                    
                    break;
                case 2:
                    System.out.println("VERSIÓN CLIENTE");
                    mi.accederVersionCliente(ruta);                        
                    break;
                default:
                    System.out.println("No se ha elegido una opción aceptable");
                    break;
                    
                    
            }

        } while (!cerrarPrincipal);

	}

}
