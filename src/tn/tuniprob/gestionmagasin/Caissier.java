package tn.tuniprob.gestionmagasin;

public class Caissier extends Employe {
    private int m_iNumeroCaisse  ;
    Caissier(){
        super();
    }
    Caissier(int id,String nom , int numh,int numcaisse){

        super(id,nom,numh) ;
        this.m_iNumeroCaisse=numcaisse ;
    }

    @Override
    public String toString() {
        return super.toString()+"Caissier{" +
                "m_iNumeroCaisse=" + m_iNumeroCaisse +
                '}';
    }
    public double CalculSalaire()
    {
        double sum=0;

        sum+=10*this.m_iNbHeures+(m_iNbHeures-180)*10.75 ;

        return sum ;
    }
}
