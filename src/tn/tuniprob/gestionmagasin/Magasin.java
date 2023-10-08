package tn.tuniprob.gestionmagasin;
import java.util.Arrays;

 /*import static tn.tuniprob.gestionmagasin.Produit.comparer; */
public class Magasin {
     int m_Iid;
     String m_Sadr;
     final int m_ciCapacite = 50;
     Produit[] m_pProduits = new Produit[m_ciCapacite];
     Employe[] m_pEmployes=new Employe[20] ;
     int m_iNbProduit;
     int m_iNbEmploye ;
     private static int m_iTotaleProduit;
     private static  int m_iTotaleEmployes ;

     Magasin(int l_iId, String l_sAdr) {
         m_iNbProduit = 0;
         m_Iid = l_iId;
         m_Sadr = l_sAdr;

     }

    /* public void setM_pProduits(Produit p) {
         if ((m_iNbProduit <= m_ciCapacite) && (!this.Recherche(p))) {
             m_pProduits[m_iNbProduit] = p;
             m_iNbProduit++;
         } else {
             System.out.println("produit mijoud");
         }
         m_iTotaleProduit++;
     } */
     public  void setM_pProduits(Produit p ) throws MagasinPleinException {

         if (m_iNbProduit >= m_ciCapacite) {
             try {
                 throw new MagasinPleinException("Magasin est plein a khouya");
             } catch (MagasinPleinException e) {
                 throw new RuntimeException(e);
             }
         }

         m_pProduits[m_iNbProduit] = p;
         m_iNbProduit++;
         m_iTotaleProduit++;
     }

     public static int getTotale() {
         return m_iTotaleProduit;
     }

     public void Afficher() {
         System.out.println("mg avec l'id : " + m_Iid + " dans : " + m_Sadr + "  a pour capacité : " + m_ciCapacite + "  avec le nombre des produits égale : " + m_iNbProduit);
     }

     public boolean Recherche(Produit p) {

         for (int i = 0; i < this.m_iNbProduit; i++) {
             if (Produit.comparer(m_pProduits[i], p) == true) {
                 return true;

             }


         }
         return false;

     }

     @Override
     public String toString() {
         return "Magasin{" +
                 "m_Iid=" + m_Iid +
                 ", m_Sadr='" + m_Sadr + '\'' +
                 ", m_ciCapacite=" + m_ciCapacite +
                 ", m_pProduits=" + Arrays.toString(m_pProduits) +
                 ", m_iNbProduit=" + m_iNbProduit +
                 '}'+Arrays.toString(m_pEmployes);

     }

     public int RetourIndexProduit(Produit p) {
         int k = -1;
         for (int i = 0; i < m_iNbProduit && (!Produit.comparer(p, m_pProduits[i])); i++) {
             k++;
         }
         return k + 1;
     }

     public boolean SuppProduitMg(Produit p) {

         int indice = RetourIndexProduit(p);
         if (indice == -1)
             return false;
         else
              for (int i = indice; i < this.m_iNbProduit; i++) {
                 m_pProduits[i] = m_pProduits[i + 1];
             }
         this.m_iNbProduit--;
         return true ;
     }

public static Magasin Comparer(Magasin m1,Magasin m2){
    return (m1.m_iNbProduit> m2.m_iNbProduit)? m1:m2 ;

}
     public void setM_pEmployes(Employe e) {
         if (m_iNbEmploye <= 20)  {
             m_pEmployes[m_iNbEmploye] = e;
             m_iNbEmploye++;
         } else {
             System.out.println("enough khadema");
         }
         m_iTotaleEmployes++;
     }
     public void printSalaire(){
         for(int i=0;i<m_iNbEmploye;i++)
         {
             System.out.println(m_pEmployes[i].CalculSalaire());
         }
     }
     public void AffichePrime(){
         for(int i=0;i<m_iNbEmploye;i++)
         {
             if(m_pEmployes[i] instanceof Responsable)
             {
                 System.out.println(((Responsable) m_pEmployes[i]).m_iPrime);
             }


         }




     }
     public void affichenb(){
         int nbcaissier=0 ;
         int nbrespo=0 ;
         int nbvendreur=0 ;
         for(int i=0;i<m_iNbEmploye;i++)
         {
             if(m_pEmployes[i] instanceof Responsable)
             {
                 nbrespo++ ;
             } else if (m_pEmployes[i] instanceof Caissier) {
                 nbcaissier++ ;
             }
             else nbvendreur++ ;


         }
         System.out.println("le nombre des caissiers est :"+nbcaissier+"le nombre des respo est"+nbrespo+ "le nombre des vendeurs est:"+nbvendreur);
     }



 }






