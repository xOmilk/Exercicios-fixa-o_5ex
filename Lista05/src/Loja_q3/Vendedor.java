package Loja_q3;

public class Vendedor {
    private String nome;
    private int idade;

    public Vendedor(String nome, int idade){
        this.setNome(nome);
        this.setIdade(idade);
    }



    public void vender(){
        System.out.println("Vendedor "+this.getNome()+" vendendo");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
