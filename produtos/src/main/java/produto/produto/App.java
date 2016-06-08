package produto.produto;

/**
 * Hello world!
 *
 */	
public class App {
	public static void main(String[] args) {
		Produto produto = new Produto("Bala Chita", 0.15);
		System.out.println("A Bala é: " + produto.getNome() + "Preço é: " + produto.getPreco());
	}
}
	