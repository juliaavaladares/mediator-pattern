package main;

import java.util.ArrayList;

import org.omg.CORBA.OBJECT_NOT_EXIST;

public class Vendedor{
    private ArrayList<Produto> produtos;
    private MagazineLuizaMediator mediator;

    public Vendedor(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public MagazineLuizaMediator getMediator() {
        return mediator;
    }

    public void setMediator(MagazineLuizaMediator mediator) {
        this.mediator = mediator;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public void adicionaProduto(Produto produto) {
        this.produtos.add(produto);
    }
    
    public void venderProduto(Produto produto) {
        if(this.produtos.contains(produto)){
            this.produtos.remove(produto);
        }else{
            throw new  OBJECT_NOT_EXIST("Produto não encontrado!");
        }
    }
}