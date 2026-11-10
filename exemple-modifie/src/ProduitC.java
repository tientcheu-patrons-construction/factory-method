public class ProduitC extends Produit {
    
    public ProduitC() {}

    @Override 
    public void methodeProduit() {
        System.out.println("Je suis le produit de type C");
        System.out.println("produitC.methodeProduit() a été appelée");
    }

}
