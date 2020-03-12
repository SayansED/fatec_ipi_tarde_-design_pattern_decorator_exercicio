package ExercicioFigurasGeometricas;

import java.util.Random;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		Random sorteioOpcAleat = new Random();
		int opcSorteioAleat = sorteioOpcAleat.nextInt(4);
		
		Sorteios gerarSorteio = new Sorteios();
		
		String menuAleatorio = "Sorteado 0, desenha a figura sem decorar. "
				+ "\nSorteado 1, sorteia aleatoriamente qual decorador utilizar. "
				+ "\nSorteado 2, decore o objeto com" + 
				"os dois decoradores.";
		
		JOptionPane.showMessageDialog(null, menuAleatorio);
		
		switch (opcSorteioAleat) {
		case 0:
			JOptionPane.showMessageDialog(null, "Foi sorteado 0");
			gerarSorteio.sorteioFigura();
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Foi sorteado 1");
			Random sorteioOpcDecorador = new Random();
			int opcSorteioDecorador = 1 + sorteioOpcDecorador.nextInt(2);
			gerarSorteio.sorteioDecorador(opcSorteioDecorador);
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Foi sorteado 2");
			gerarSorteio.sorteioFigura();
			gerarSorteio.sorteioCorLinha();
			gerarSorteio.sorteioCorPreenchimento();
			break;
		default:
			break;
		}

	}

}
