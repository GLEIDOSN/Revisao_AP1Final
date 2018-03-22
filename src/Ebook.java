
public class Ebook extends Livro{
	
	@Override
	public boolean aplicaDesconto(double porcentagem) {
		if (porcentagem > 0.1) {
			return false;
		}
		return super.aplicaDesconto(porcentagem);
		//double desconto = this.getPreco() * porcentagem;
		//this.setPreco(this.getPreco() - desconto);
		//return true;
	}
	
	public Ebook(Autor autor) {
		super(autor);
	}
	
	private String waterMark;

	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
}
