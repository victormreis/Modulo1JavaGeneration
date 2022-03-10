package Collections;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto("Arroz", 1010, 15.50);
		Produto p9 = new Produto("Arroz", 1010, 19.99);
		Produto p2 = new Produto("Feijao", 2020, 10.20);
		Produto p3 = new Produto("Macarrao", 3030, 7.89);
		Produto p4 = new Produto("Carne", 4040, 49.99);
		
		ArrayList<Produto> produto = new ArrayList<>();		
		
		
		//Adicionando produtos ao ArrayList
		produto.add(p1);
		produto.add(p2);
		produto.add(p3);
		produto.add(p4);		
		
		System.out.println(produto); // consultando produtos da lista
		
		produto.remove(2); // removendo o item indice 2 da lista 
		
		produto.set(0, p9);
		
		System.out.println(produto); // consultando produtos da lista
		
		
		
		
		



	}

}
