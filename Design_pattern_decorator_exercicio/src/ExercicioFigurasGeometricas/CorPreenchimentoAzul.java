package ExercicioFigurasGeometricas;

public class CorPreenchimentoAzul extends CorDePreenchimentoDecorator {

	public CorPreenchimentoAzul(FigurasGeometricas figurasGeometricas) {
		super(figurasGeometricas);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String getDescription() {
		String cor = "Cor de preenchimento azul";
		return cor;
	}
}
