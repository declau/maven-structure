package produto.produto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProdutoTest {
	
	@Test
	public void verificaPrecoComImposto() {
	Produto bala = new Produto("Chita", 0.10);
	assertEquals(0.11, bala.getPrecoComImposto(), 0.000001);	
		
	}

}
