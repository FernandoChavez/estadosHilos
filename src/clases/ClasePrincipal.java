package clases;

public class ClasePrincipal {
	public static void main(String[] args) {
		Hilo_Proceso hilo1 = new Hilo_Proceso();
		Hilo_Proceso hilo2 = new Hilo_Proceso();
		
		hilo1.start();
		
		//sleep trabaja en milisegundos. Es necesario la sentencia try/catch
		//Con sleep en hilo1, primero se ejecute el hilo 1, se duemre X segundos y despues se ejecuta el hilo2
		try {
			hilo1.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println("Error en el hilo1 "+ e);
		}
		
		hilo2.start();
		hilo2.stop();
		
		try {
			hilo1.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println("Error en el hilo2 "+ e);
		}
		
		
	}
}
