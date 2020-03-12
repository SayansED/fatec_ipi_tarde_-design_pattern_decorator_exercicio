package ExercicioFigurasGeometricas;

public abstract class CorDePreenchimentoDecorator extends FigurasGeometricas{
	
	private FigurasGeometricas figurasGeometricas;
	
	public CorDePreenchimentoDecorator(FigurasGeometricas figurasGeometricas) {
		this.figurasGeometricas = figurasGeometricas;
	}
	
	public FigurasGeometricas getFigurasGeometricas() {
		return figurasGeometricas;
	}
	
	public void setFigurasGeometricas(FigurasGeometricas figurasGeometricas) {
		this.figurasGeometricas = figurasGeometricas;
	}
	

	@Override
	public String getDescription() {
		return figurasGeometricas == null ? super.getDescription() : super.getDescription() + ", " + figurasGeometricas.getDescription();		
	}
}
