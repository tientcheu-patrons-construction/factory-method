public class ProduitB extends Produit {
    
    public ProduitB() {}
    
    @Override 
    public void methodeProduit() {
        System.out.println("Je suis le produit de type B");
        System.out.println("produitB.methodeProduit() a été appelée");
    }
}
