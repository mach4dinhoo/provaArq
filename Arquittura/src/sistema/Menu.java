package sistema;



public class Menu {
	private Pedido[] meuPedido;
	private Producao producao;
	private MeuItem meuitem;
	
	
	
	public Menu(Pedido[] meupedido, Producao producao, MeuItem meuitem) {
		this.meuPedido = meuPedido;
		this.producao = producao;
		this.meuitem = meuitem;
	}


	public void pratileira() {
		meuPedido[0] = (Pedido) producao.getItem("ARROZ");
		meuPedido[1] = (Pedido) producao.getItem("MACARRÃO");
		meuPedido[2] = (Pedido) producao.getItem("SALADINHOS");
		meuPedido[3] = (Pedido) producao.getItem("FEIJÂO");
		meuPedido[4] = (Pedido) producao.getItem("ENLATADOS");
		meuPedido[5] = (Pedido) producao.getItem("SAL");
		
		
		while (meuitem.hasNext()) {
			Pedido menuItem = (Pedido)meuitem.next();
			System.out.println(meuPedido.length);
		}
	}
	
		

}

