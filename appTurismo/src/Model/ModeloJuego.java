package Model;

public class ModeloJuego {
	
	  public String jugar() {
	        // Lógica simple: 50% ganar o perder
	        return Math.random() < 0.5 ? "¡Efectivamente debes tomarte tu cafe!!" : "Estas super puedes esparar otro rato sin cafe!";
	    }

}
