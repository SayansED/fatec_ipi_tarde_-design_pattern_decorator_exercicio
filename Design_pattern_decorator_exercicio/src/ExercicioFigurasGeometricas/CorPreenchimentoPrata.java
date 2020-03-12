package ExercicioFigurasGeometricas;

public class CorPreenchimentoPrata extends CorDePreenchimentoDecorator {

	public CorPreenchimentoPrata(FigurasGeometricas figurasGeometricas) {
		super(figurasGeometricas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		String cor = "Cor de preenchimento Prata";
		return cor;
	}
}
