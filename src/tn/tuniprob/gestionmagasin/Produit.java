package tn.tuniprob.gestionmagasin;

import java.util.Date;

public class Produit {

    private int m_iId ;
    private String m_slibelle;
    private String m_sMarque ;
    private Double m_dPrix ;
    private Date   m_Dateexp =new Date();
    Produit(){}
    Produit(int l_id ,String l_sLibelle,String l_sMarque,Double l_dPrix){
        m_iId=l_id ;
        m_slibelle=l_sLibelle ;
        m_sMarque=l_sMarque ;
        if (l_dPrix< 0) {
            try {
                throw new PrixnegatifException("le prix est negatif");
            } catch (PrixnegatifException c) {
                throw new RuntimeException(c);
            }


        }
        m_dPrix=l_dPrix ;
    }
    Produit(int l_id ,String l_sLibelle,String l_sMarque){
        m_iId=l_id ;
        m_slibelle=l_sLibelle ;
        m_sMarque=l_sMarque ;
    }
    public int getM_iId(){
            return  m_iId ;
    }
    public String  getM_slibelle(){
        return m_slibelle;
    }
    public String  getM_sMarque(){
        return m_sMarque;
    }
    public double getM_dPrix(){
        return  m_dPrix ;
    }
    public void Afficher(){
        System.out.println("le produit "+m_slibelle+"de marque "+this.m_sMarque+"avec  l'id " +this.m_iId+"sont prix est "+this.m_dPrix) ;
    }

    @Override
    public String toString(){

        return "le produit "+m_slibelle+"de marque "+m_sMarque+"avec  l'id " +m_iId+"sont prix est "+m_dPrix+"date :"+ m_Dateexp.toString() ;
    }
    public  static boolean comparer(Produit p1,Produit p2){

        return p1.m_iId==p2.m_iId ;

    }
    public   boolean compare(Produit p1){

        return  p1.m_iId==this.m_iId ;
    }
}
