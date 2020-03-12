package ExercicioFigurasGeometricas;

public class CorPreenchimentoPreto extends CorDePreenchimentoDecorator {

	public CorPreenchimentoPreto(FigurasGeometricas figurasGeometricas) {
		super(figurasGeometricas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		String cor = "Cor de preenchimento Preto";
		return cor;
	}
}
