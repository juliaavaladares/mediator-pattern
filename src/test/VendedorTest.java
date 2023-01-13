package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import main.*;

public class VendedorTest {

    @Test
    public void consumidorDeveBuscarTodosOsProdutos(){
        MagazineLuizaMediator mediator;
        
        ArrayList<Produto> produtos1 =new ArrayList<Produto>();
        ArrayList<Produto> produtos2 = new ArrayList<Produto>();
        
        Produto geladeira = new Produto("01", "geladeira", 2999);
        Produto fogao = new Produto("02", "fogao", 2999);
        Produto camiseta = new Produto("03", "camiseta", 2999);
        Produto bermuda = new Produto("04", "bermuda", 2999);

        produtos1.add(geladeira);
        produtos1.add(fogao);

        produtos2.add(bermuda);
        produtos2.add(camiseta);
        
        mediator = new MagazineLuizaMediator();

        Vendedor vendedor1 = new Vendedor(produtos1);
        Vendedor vendedor2 = new Vendedor(produtos2);

        mediator.adicionaVendedor(vendedor1);
        mediator.adicionaVendedor(vendedor2);
        
        Consumidor consumidor = new Consumidor(mediator);

        assertNotNull(consumidor.verProdutos());

    }
    
    @Test
    public void consumidorDeveComprarProoduto(){
        MagazineLuizaMediator mediator;
        
        ArrayList<Produto> produtos1 =new ArrayList<Produto>();
        ArrayList<Produto> produtos2 = new ArrayList<Produto>();
        
        Produto geladeira = new Produto("01", "geladeira", 2999);
        Produto fogao = new Produto("02", "fogao", 2999);
        Produto camiseta = new Produto("03", "camiseta", 2999);
        Produto bermuda = new Produto("04", "bermuda", 2999);

        produtos1.add(geladeira);
        produtos1.add(fogao);

        produtos2.add(bermuda);
        produtos2.add(camiseta);
        
        mediator = new MagazineLuizaMediator();

        Vendedor vendedor1 = new Vendedor(produtos1);
        Vendedor vendedor2 = new Vendedor(produtos2);

        mediator.adicionaVendedor(vendedor1);
        mediator.adicionaVendedor(vendedor2);

        Consumidor consumidor = new Consumidor(mediator);

        String produtoComprado = consumidor.comprarProduto(bermuda);
        assertNotNull(produtoComprado);
        assertEquals("Produto "+bermuda.getNome()+" comprado com sucesso", produtoComprado);

    }
}
