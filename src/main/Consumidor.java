package main;

import java.util.ArrayList;

public class Consumidor {
    private MagazineLuizaMediator mediator;

    public Consumidor(MagazineLuizaMediator mediator) {
        this.mediator = mediator;
    }

    public ArrayList<String> verProdutos(){
        return this.mediator.buscarTodosOsProdutos();
    }

    public String comprarProduto(Produto produto){
        return this.mediator.comprarProduto(produto);
        
    }
}
