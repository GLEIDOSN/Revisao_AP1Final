
public class PrimeiroPrograma {
	public static void main(String[] args) {
		double V1 = 20.90;
		double V2 = 20.90;
		int Soma = (int) V1 + (int) V2;
		System.out.println("A Soma dos Valores é: " + Soma);
		if (Soma > 10) {
			System.out.println("O Valor esta OK");
		}else {
			System.out.println("O Valor esta Baixo!");
		}
		int contador = 0;
		while (contador < 10 ) {
			System.out.println("Valor: "+contador +"\n");
			contador++;
		}
		for (contador = 0;contador<10;contador++) {
			System.out.println("Valor: "+contador +"\n");
		}
		Autor autor1 = new Autor();
		autor1.setNome("Gleidson");
		autor1.setEmail("fc_gleidson@hotmail.com");
		autor1.setCpf("03745882369");
		
		Autor autor2 = new Autor();
		Ebook ebook = new Ebook(autor2);
		ebook.setTitulo("Engenharia de Software");
		ebook.setPreco(80.00);
		ebook.exibirDetalhes();
		
		Livro livro1 = new Livro(autor1);
		livro1.setTitulo("JAVA POO");
		livro1.setResumo("Orientação a Objetos em JAVA");
		livro1.setPreco(120.00);
		livro1.exibirDetalhes();
		
		
		if (!livro1.aplicaDesconto(0.2)) {
			System.out.println("Desconto no Livro não pode ser maior do que 20%");
		}else {
			System.out.println("Valor do Ebook com Desconto: " + livro1.getPreco());
		}
		
		if (!ebook.aplicaDesconto(0.1)) {
			System.out.println("Desconto no Ebook não pode ser maior do que 10%");
		}else {
			System.out.println("Valor do Livro com Desconto: " + ebook.getPreco());
		}
	}
}
