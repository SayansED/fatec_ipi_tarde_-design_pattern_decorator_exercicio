package ExercicioFigurasGeometricas;

import java.util.Random;

import javax.swing.JOptionPane;

public class Sorteios {

	FigurasGeometricas figGeo = null;
	
	public void menuFiguras() {
		String menuFigurasGeometricas = "Sorteiu das figuras ;)"
				+ "\n" 
				+ "1-Quadrado"
				+ "\n"
				+ "2-Circulo"
				+ "\n"
				+ "3-Retangulo"
				+ "\n";
		JOptionPane.showMessageDialog(null, menuFigurasGeometricas);
	}
	
	public void menuCorLinha() {
		String menuCorDaLinha = "Sorteiu das cores de linhas"
				+ "\n"
				+ "1-Verde"
				+ "\n"
				+ "2-Vermelho"
				+ "\n"
				+ "3-Azul"
				+ "\n"
				+ "4-Roxo"
				+ "\n";
		JOptionPane.showMessageDialog(null, menuCorDaLinha);
	}

	public void menuCorPreenchimento() {
		String menuCorDePreenchimento = "Sorteiu das cores de preenchimento"
				+ "\n"
				+ "1-Azul"
				+ "\n"
				+ "2-Prata"
				+ "\n"
				+ "3-Preto"
				+ "\n"
				+ "4-Amarelo"
				+ "\n";
		JOptionPane.showMessageDialog(null, menuCorDePreenchimento);
	}

	

	public void sorteioFigura() {
		menuFiguras();
		Random sorteioFigura = new Random();
		int opcSorteiuFigura =  1 + sorteioFigura.nextInt(3);

		switch (opcSorteiuFigura) {
		case 1:
			figGeo = new Quadrado();
			System.out.println(figGeo.getDescription());
			break;
		case 2:
			figGeo = new Circulo();
			System.out.println(figGeo.getDescription());
			break;
		case 3:
			figGeo = new Retangulo();
			System.out.println(figGeo.getDescription());
		}
	}

	public void sorteioCorLinha() {
		menuCorLinha();
		Random sorteioCorLinha = new Random();
		int opcSorteioCorLinha = 1 + sorteioCorLinha.nextInt(4);

		switch(opcSorteioCorLinha) {
		case 1:
			figGeo = new CorLinhaVerde(figGeo);
			System.out.println(figGeo.getDescription());
			break;
		case 2:
			figGeo = new CorLinhaVermelho(figGeo);
			System.out.println(figGeo.getDescription());
			break;
		case 3:
			figGeo = new CorLinhaAzul(figGeo);
			System.out.println(figGeo.getDescription());
			break;
		case 4:
			figGeo = new CorLinhaRoxo(figGeo);
			System.out.println(figGeo.getDescription());
			break;
		}
	}
	
	public void sorteioCorPreenchimento() {
		menuCorPreenchimento();
		Random sorteioCorPreenchimento = new Random();
		int opcSorteioCorPreenchimento = 1 + sorteioCorPreenchimento.nextInt(4);
		
		switch(opcSorteioCorPreenchimento) {
		case 1:
			figGeo = new CorPreenchimentoAzul(figGeo);
			System.out.println(figGeo.getDescription());
			break;
		case 2:
			figGeo = new CorPreenchimentoPrata(figGeo);
			System.out.println(figGeo.getDescription());
			break;
		case 3:
			figGeo = new CorPreenchimentoPreto(figGeo);
			System.out.println(figGeo.getDescription());
			break;
		case 4:
			figGeo = new CorPreenchimentoAmarelo(figGeo);
			System.out.println(figGeo.getDescription());
			break;
		}
	}
	
	public void sorteioDecorador(int opcDecorador) {
		sorteioFigura();
		if(opcDecorador == 1) {
			JOptionPane.showMessageDialog(null, "Foi sorteado Decorador de linha");
			sorteioCorLinha();
		}
		else {
			JOptionPane.showMessageDialog(null, "Foi sorteado Decorador de preenchimento");
			sorteioCorPreenchimento();
		}	
	}
}
