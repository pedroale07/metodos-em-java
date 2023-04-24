package projeto_smart;

public class SmartTv {

	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	
		public void ligar() {
			ligada = true;
			System.out.println("ligada");
		}
	
		public void desligada() {
			ligada = false;
			System.out.println("desligada");
		}
	
		public void aumentarVolume() {
			volume++;
			System.out.println("aumentando volume para:"+volume);
		}
	
		public void diminuirVolume() {
			volume--;
			System.out.println("diminuindo volume para:"+volume);
		}
	
		public void aumentarCanal() {
			canal++;
			System.out.println("aumentando canal para:"+canal);
		}
	
		public void diminuirCanal() {
			canal--;
			System.out.println("diminuindo canal para:"+canal);
		}
	
		public void mudarCanal(int novoCanal) {
			canal = novoCanal;
			System.out.println("mudando canal para:"+novoCanal);
		}
	
	
}
