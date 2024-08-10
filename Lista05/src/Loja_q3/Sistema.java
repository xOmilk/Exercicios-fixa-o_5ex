package Loja_q3;

public class Sistema {

    public static void main(String[] args) {
        Vendedor v1= new Vendedor("Lucas",23);

        Vendedor v2= new Vendedor("Gabriel",20);



        Loja l1= new Loja("Redragon","Eletronicos",2003);



        l1.admitirVendedor(v1);
        v1.vender();
        System.out.println();


        l1.demitirVendedor(v1);
        l1.admitirVendedor(v2);
        v2.vender();

    }
}
