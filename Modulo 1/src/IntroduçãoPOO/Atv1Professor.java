package IntroduçãoPOO;

public class Atv1Professor extends Atv1Modelo {
	
	public String modulo;
	public double salario;
	
	public void aumento(double n) {
		this.salario = salario + n;
	}

}
