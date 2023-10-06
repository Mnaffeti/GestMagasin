package tn.tuniprob.gestionmagasin;

public class Vendeur extends Employe {
    int m_itauxDeVente ;
    Vendeur(){} ;
    Vendeur(int id,String nom , int numh,int tauxv){

        super(id,nom,numh) ;
        this.m_itauxDeVente=tauxv ;
    }

    @Override
    public String toString() {
        return super.toString()+ "Vendeur{" +
                "m_itauxDeVente=" + m_itauxDeVente +
                '}';
    }
    public double CalculSalaire()
    {
        double sum=450 ;

        sum*=this.m_itauxDeVente/10 ;
        return sum ;
    }
}
