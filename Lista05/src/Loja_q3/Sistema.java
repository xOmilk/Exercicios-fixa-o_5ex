package Loja_q3;

public class Sistema {

    public static void main(String[] args) {
        Vendedor v1= new Vendedor("Lucas",23);

        Vendedor v2= new Vendedor("Gabriel",20);



        Loja loja1= new Loja("Redragon","Eletronicos",2003);



        loja1.admitirVendedor(v1);
        v1.vender();
        System.out.println();


        loja1.demitirVendedor(v1);
        loja1.admitirVendedor(v2);
        v2.vender();

    }
}
