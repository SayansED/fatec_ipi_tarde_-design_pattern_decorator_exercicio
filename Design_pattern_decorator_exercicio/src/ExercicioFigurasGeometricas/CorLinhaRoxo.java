package ExercicioFigurasGeometricas;

public class CorLinhaRoxo extends CorDaLinhaDecorator {

	public CorLinhaRoxo(FigurasGeometricas figurasGeometricas) {
		super(figurasGeometricas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		String cor = "Cor de linha Roxo";
		return cor;
	}

}
