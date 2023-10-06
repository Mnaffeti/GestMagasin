package tn.tuniprob.gestionmagasin;

public class Responsable extends Employe{
    int m_iPrime ;
    Responsable() {}
    Responsable(int id,String nom , int numh,int prime){

        super(id,nom,numh) ;
        this.m_iPrime=prime ;
    }

    @Override
    public String toString() {
        return super.toString()+"Responsable{" +
                "m_iPrime=" + m_iPrime +
                '}';
    }
    public double CalculSalaire( )
    {
        double sum=this.m_iPrime ;

            sum+=10*this.m_iNbHeures+(m_iNbHeures-160)*12 ;

    return sum ;
    }
    public void afficheprime()
    {
        System.out.println(this.m_iPrime);
    }
}
