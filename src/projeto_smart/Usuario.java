package projeto_smart;

public class Usuario {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		//ligando a tv
		smartTv.ligar();
		
		//desligando tv
		smartTv.desligada();
		
			//aumentando volume
			smartTv.aumentarVolume();
			
			//diminuindo volume
			smartTv.diminuirVolume();
			
			//trocando canal
			smartTv.mudarCanal(30);
			
			//aumentando canal
			smartTv.aumentarCanal();
			
			//diminuindo canal
			smartTv.diminuirCanal();
			
		
	}

}
