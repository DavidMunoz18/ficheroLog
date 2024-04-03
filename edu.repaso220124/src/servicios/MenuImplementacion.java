package servicios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.ClienteDto;

public class MenuImplementacion implements MenuInterfaz {

	Scanner sc = new Scanner(System.in);
	List<ClienteDto> listaClientes = new ArrayList<ClienteDto>();
	@Override
	public int mostrarMenuPrincipalYSeleccion(String ruta) {
		
		int opcion = 0;
		try {
			FileWriter fileWriter = new FileWriter(ruta, true);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			String mensaje = "Entra en el menu principal";
			
			printWriter.println(mensaje);
			fileWriter.close();
	        System.out.println("0. Cerrar aplicación");
	        System.out.println("1. Versión empleado");
	        System.out.println("2. Versión cliente");
	        System.out.println("Escriba la opción deseada: ");
	        opcion = sc.nextInt();
	        
		} catch (IOException e) {
			// TODO Auto-generated catch block
		
			e.printStackTrace();
		}
		
        return opcion;
	}

	@Override
	public void accederVersionEmpleado(String ruta) {

		EmpleadoInterfaz ei = new EmpleadoImplementacion();

        int opcionEmpleado;
        opcionEmpleado = mostrarMenuEmpleadoYSeleccion(ruta);

        switch (opcionEmpleado)
        {
            case 0:
                break;
            case 1:
                ei.validarCliente(listaClientes);
                break;
            case 2:
                ei.borrarCliente(listaClientes); 
                break;
            case 3:
                ei.mostrarClientes(listaClientes); 
                break;
            default:
                System.out.println("No ha seleccionado una opción aceptable vuelve al menú inicial.");
                break;
        }
		
	}
	
    private int mostrarMenuEmpleadoYSeleccion(String ruta) {
    	
    	
    	int opcion = 0;
		try {
			FileWriter escritor = new FileWriter(ruta , true);
			PrintWriter print = new PrintWriter(escritor);
	    	
	    	print.println("Entra en el menu empleado");
	    	
	    	escritor.close();
		    System.out.println("0. Volver");
		    System.out.println("1. Validar cliente");
		    System.out.println("2. Borrar cliente");
		    System.out.println("3. Mostrar clientes");
		    System.out.println("Escriba la opción deseada: ");
		    opcion = sc.nextInt();
		    
		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return opcion;
    	
	    
	  
	    
    }

	@Override
	public void accederVersionCliente(String ruta) {
		
		ClienteInterfaz ci = new ClienteImplementacion();

        int opcionCliente;
        opcionCliente = mostrarMenuClienteYSeleccion(ruta);

        switch (opcionCliente)
        {
            case 0:
                break;
            case 1:
                ci.registroNuevoCliente(listaClientes);
                break;
            case 2:
                ci.accesoCliente(listaClientes); 
                break;
            default:
                System.out.println("No ha seleccionado una opción aceptable vuelve al menú inicial.");
                break;
        }

	}
	
    private int mostrarMenuClienteYSeleccion(String ruta)
    {
    	
    	int opcion = 0;
		try {
			FileWriter fileWriter = new FileWriter(ruta , true);
			PrintWriter printWriter = new PrintWriter(fileWriter);
	    	
			String mensaje = "Entra en el menu cliente";
	        printWriter.println(mensaje);
			fileWriter.close();
	        System.out.println("0. Volver");
	        System.out.println("1. Registro cliente");
	        System.out.println("2. Acceso cliente (login)");
	        System.out.println("Escriba la opción deseada: ");
	        opcion = sc.nextInt();
	        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        return opcion;
    
    }

}
