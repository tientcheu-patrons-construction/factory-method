public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Produit produit = null;

        produit = FabriqueProduit.creerProduit(FabriqueProduit.TYPE_A);
        produit.methodeProduit();

        produit = FabriqueProduit.creerProduit(FabriqueProduit.TYPE_B);
        produit.methodeProduit();

        produit = FabriqueProduit.creerProduit(FabriqueProduit.TYPE_C);
        produit.methodeProduit();

        produit = FabriqueProduit.creerProduit(FabriqueProduit.TYPE_D);
        produit.methodeProduit();
    }
}
