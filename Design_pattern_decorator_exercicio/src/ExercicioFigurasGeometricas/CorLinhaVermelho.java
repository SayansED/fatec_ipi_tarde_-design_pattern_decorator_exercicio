package ExercicioFigurasGeometricas;

public class CorLinhaVermelho extends CorDaLinhaDecorator {

	public CorLinhaVermelho(FigurasGeometricas figurasGeometricas) {
		super(figurasGeometricas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		String cor = "Cor de linha Vermelho";
		return cor;
	}
}
