public class ProduitA extends Produit {
    
    public ProduitA() {}

    @Override 
    public void methodeProduit() {
        System.out.println("Je suis le produit de type A");
        System.out.println("produitA.methodeProduit() a été appelée");
    }

}
