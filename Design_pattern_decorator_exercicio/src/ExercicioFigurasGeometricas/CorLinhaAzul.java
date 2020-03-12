package ExercicioFigurasGeometricas;

public class CorLinhaAzul extends CorDaLinhaDecorator {
	
	public CorLinhaAzul (FigurasGeometricas pFigGeo) {
		super (pFigGeo);
	}

	@Override
	public String getDescription() {
		String cor = "Cor de linha Azul";
		return cor;
	}

}
