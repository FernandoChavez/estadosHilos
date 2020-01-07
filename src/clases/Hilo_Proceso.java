package clases;

public class Hilo_Proceso extends Thread {
	
	public void run() {
		for(int i = 0; i<=5; i++) {
			System.out.println(i + " " +getName());
			
			
			try {
			Hilo_Proceso.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("Error dentro de la clase");
			}
		}
		System.out.println("");
	}
}
