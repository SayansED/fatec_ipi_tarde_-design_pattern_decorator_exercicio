package ExercicioFigurasGeometricas;

public abstract class CorDaLinhaDecorator extends FigurasGeometricas{

	private FigurasGeometricas figurasGeometricas;
	
	public CorDaLinhaDecorator(FigurasGeometricas figurasGeometricas) {
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
