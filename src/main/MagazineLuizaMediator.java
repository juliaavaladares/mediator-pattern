package main;

import java.util.ArrayList;

public class MagazineLuizaMediator {
    private ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();

    public MagazineLuizaMediator() {
    }

    public void adicionaVendedor(Vendedor vendedor){
        this.vendedores.add(vendedor);
    }

    public String comprarProduto(Produto produto){

        for (Vendedor vendedor : vendedores) {
            try {
                vendedor.venderProduto(produto);
                return "Produto "+produto.getNome()+" comprado com sucesso";
            } catch (Exception e) {
                continue;
            }
        }
        return null;
    }

    public ArrayList<String> buscarTodosOsProdutos(){
        ArrayList<String> produtos = new ArrayList<String>();
        for (Vendedor vendedor : vendedores) {
            produtos.add(vendedor.getProdutos().toString());
        }

        return produtos;
    }
}
