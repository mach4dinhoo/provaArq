package sistema;


public class MeuItem extends Cliente {
	Pedido[] itens;
	int posicao = 0;
	
	public MeuItem(Pedido[] itens) {
		this.itens = itens;
	}

	public Object next() {
		Pedido menuItem = itens[posicao];
		posicao++;
		return menuItem;
	}

	public boolean hasNext() {
		if (posicao >= itens.length || itens[posicao] == null) {
			return false;
		} else {
			return true;
		}
	}
}
