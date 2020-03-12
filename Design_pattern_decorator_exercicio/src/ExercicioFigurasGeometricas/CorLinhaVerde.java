package ExercicioFigurasGeometricas;

public class CorLinhaVerde extends CorDaLinhaDecorator {

	public CorLinhaVerde(FigurasGeometricas figurasGeometricas) {
		super(figurasGeometricas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		String cor = "Cor de linha Verde";
		return cor;
	}

}
