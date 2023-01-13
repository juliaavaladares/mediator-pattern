package main;

public class Produto {
    private String id;
    private String nome;
    private float preco;
    
    public Produto(String id, String nome, float preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
}
