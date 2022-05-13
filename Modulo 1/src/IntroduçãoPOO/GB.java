package IntroduçãoPOO;

public class GB {
	
	public static void main(String[] args) {
		
		Atv1Modelo pe = new Atv1Modelo();
		Atv1Professor pr = new Atv1Professor();
		Atv1Aluno al = new Atv1Aluno();
		
		pr.nome = "Jefersson";
		pr.idade = 35;
		pr.salario = 1500.0;
		pr.modulo = "2 Semestre";
		pr.aumento(250.0);
		
		al.nome = "Beatriz";
		al.matricula = 2568;
		al.idade = 18;
		al.curso = "Direito";
		al.aniversario();
		
		
	}

}
