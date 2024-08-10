package Loja_q3;

public class Loja {
    private String nome;
    private String ramo;
    private int anoFundacao;
    private Vendedor vendedor;

    public Loja(String nome, String ramo, int anoFundacao){
        this.setNome(nome);
        this.setRamo(ramo);
        this.setAnoFundacao(anoFundacao);
    }


    public void admitirVendedor(Vendedor vendedor){
        this.vendedor=vendedor;

        System.out.println(vendedor.getNome()+" Foi contratado na loja "+this.nome);
    }
    public void demitirVendedor(Vendedor vendedor){
        if(this.vendedor!=null){

            System.out.println(vendedor.getNome()+" foi demitido da loja "+this.nome);
            this.setVendedor(null);
        }
        else{
            System.out.println("Não pode demitir um vendedor que não existe!");
        }


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
}
