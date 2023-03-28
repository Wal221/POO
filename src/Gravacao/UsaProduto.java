package Gravacao;

public class UsaProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProdutoPersiste produto = new ProdutoPersiste();
		produto.setCodigo(2);
		produto.setDescricao("Sabonete");
		System.out.println(produto.gravar());
		Produto p = new Produto();
		try {
			p = ProdutoPersiste.ler(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(p.getCodigo());
		System.out.println(" - "+p.getDescricao());
		
		produto.setCodigo(3);
		produto.setDescricao("Escova de Dentes");
		System.out.println(produto.gravar());
		try {
			p = ProdutoPersiste.ler(3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(p.getCodigo());
		System.out.println(" - "+p.getDescricao());
	}

}
