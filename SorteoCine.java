package Unidad3.ejercicios;
import java.util.*;
import java.time.*;

public class SorteoCine {
	
	static Scanner teclado = new Scanner(System.in); 
	static Random r = new Random();
	
    public static void main(String[] args) {

        System.out.println("🎬 Bienvenido al sorteo de entradas de cine 🎬");

        String nombre = introducirNombre();
        int edad = introducirEdad();
        teclado.nextLine(); // limpiar buffer

        if (edad < 18) {
            System.out.println("Lo siento " + nombre + ", debes ser mayor de edad para participar.");
        } else {
            System.out.println("¡Perfecto! " + nombre + ", estás dentro del sorteo.");
        }

        int numeroParticipante = participante();
        LocalDate fechaSorteo = fechas();
        String pelicula = peliculaFavorita();

        int numeroGanador = ganador();

        System.out.println("----------------------------------------------------");
        System.out.println("Tu número: " + numeroParticipante);
        System.out.println("Número ganador: " + numeroGanador);
        System.out.println("Fecha del sorteo: " + fechaSorteo);
        System.out.println("----------------------------------------------------");

        if (numeroParticipante == numeroGanador) {
            System.out.println("🎉 ¡ENHORABUENA " + nombre.toUpperCase() + "! Has ganado una entrada para " + pelicula + " 🎉");
        } else {
            System.out.println("😢 Lo siento " + nombre.split(" ")[0] + ", esta vez no ha habido suerte.");
        }

        System.out.println("Gracias por participar en el sorteo de Cine Navalmoral.");
        System.out.println("Vuelve pronto a probar suerte. ¡Hasta la próxima!");
    }
    
    
	private static LocalDate fechas() {
		LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActual);
        LocalDate fechaSorteo = fechaActual.plusDays(3);
        System.out.println("El sorteo se realizará el día: " + fechaSorteo);
        
        return fechaSorteo;
	}
	private static int participante() {
		int numeroParticipante = r.nextInt(9000) + 1000; // número aleatorio de 4 cifras
        System.out.println("Tu número de participante es: " + numeroParticipante);
        
        return numeroParticipante;
	}
	private static int ganador() {
		int numeroGanador = r.nextInt(9000) + 1000;
		
		return numeroGanador;
	}
	private static String peliculaFavorita() {
		System.out.print("¿Cuál es tu película favorita? ");
        String pelicula = teclado.nextLine();
        
        String mayus = pelicula.toUpperCase();
        System.out.println("¡Buena elección! " + mayus + " suena genial en pantalla grande.");
        
        return pelicula;
	}
	private static int introducirEdad() {
		System.out.print("Introduce tu edad: ");
        int edad = teclado.nextInt();
        
        return edad;
	}
	private static String introducirNombre() {
		System.out.print("Introduce tu nombre completo: ");
        String nombre = teclado.nextLine();
        
        return nombre;
	}
}