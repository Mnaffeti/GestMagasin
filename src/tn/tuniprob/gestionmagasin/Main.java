package tn.tuniprob.gestionmagasin;




import static tn.tuniprob.gestionmagasin.Magasin.getTotale;
import static tn.tuniprob.gestionmagasin.Produit.comparer;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*Prosit 1 */
        Produit p= new Produit() ;
        Produit p1=new Produit(1021,"lait","delice",1.070) ;
        Produit p2= new Produit(2510,"yaourt","vitalait",0.500) ;
        Produit p3=  new Produit(2511,"yaourt","vitalait",1.200) ;
        p3.Afficher();
        p1.Afficher();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        Magasin mg = new Magasin(1,"cite Ibn khaldoun") ;
        mg.setM_pProduits(p1) ;
        mg.setM_pProduits(p2);
        mg.setM_pProduits(p3);
        mg.Afficher();
        boolean b1=p1.compare(p2) ;
        System.out.println(b1);
        comparer(p1,p2) ;
        boolean b2= comparer(p1,p2) ;
        Magasin mg1 = new Magasin(2,"cite oun") ;
        mg1.setM_pProduits(p);
        mg1.setM_pProduits(p1) ;
        mg1.setM_pProduits(p2);
        mg1.setM_pProduits(p3);
        System.out.println(mg1.RetourIndexProduit(p3));
        System.out.println(mg1.SuppProduitMg(p2));
        System.out.println(Magasin.Comparer(mg,mg1)); ;
        System.out.println(getTotale());
    /////prosit 4
        Magasin mg2= new Magasin(1," Carrefour centre ville") ;
        Magasin mg3= new Magasin(2," Monprix m6") ;
        Caissier c1=new Caissier(1,"zied",1,3) ;
        Caissier c2=new Caissier(2,"hedi",2,4) ;
        Vendeur v1=new Vendeur(1,"Asma",1,20) ;
        Responsable r1= new Responsable(1,"Aziz",1,250) ;
        Vendeur v2=new Vendeur(2,"doua",2,70) ;
        mg2.setM_pEmployes(c1);
        mg2.setM_pEmployes(c2);
        mg2.setM_pEmployes(v1);
        mg2.setM_pEmployes(r1);
        Vendeur v3=new Vendeur(4,"sameh",2,70) ;
        Vendeur v4=new Vendeur(6,"roua",4,40) ;
        Vendeur v5=new Vendeur(7,"sabrine",4,20) ;
        System.out.println(c1);
        System.out.println(v3.CalculSalaire());
        System.out.println(c1.CalculSalaire());
        System.out.println(r1.CalculSalaire());
        System.out.println(mg2);
        mg2.printSalaire();
        System.out.println(v5.equals(v4));






    }
}