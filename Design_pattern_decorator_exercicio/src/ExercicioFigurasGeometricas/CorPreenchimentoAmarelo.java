package ExercicioFigurasGeometricas;

public class CorPreenchimentoAmarelo extends CorDePreenchimentoDecorator {

	public CorPreenchimentoAmarelo(FigurasGeometricas figurasGeometricas) {
		super(figurasGeometricas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		String cor = "Cor de preenchimento Amarelo";
		return cor;
	}

}
