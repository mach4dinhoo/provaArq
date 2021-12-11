package sistema;


public class Principal {
	public static void main(String[] args) {
		Producao fM = new Producao();
		Pedido[] mI = new Pedido[6];
		MeuItem  mIr = new MeuItem(mI);
		Menu menuFacade = new Menu(mI, fM, mIr);
		
		menuFacade.pratileira();
		
		
		
		}
}
