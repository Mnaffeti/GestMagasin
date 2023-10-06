package tn.tuniprob.gestionmagasin;

import java.util.Arrays;
import java.util.Objects;

public abstract class Employe {
    int m_iId;
    String m_sAdresse;
    int m_iNbHeures;

    public Employe() {
    }

    public Employe(int m_iId, String m_sAdresse, int m_iNbHeures) {
        this.m_iId = m_iId;
        this.m_sAdresse = m_sAdresse;
        this.m_iNbHeures = m_iNbHeures;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "m_iId=" + m_iId +
                ", m_sAdresse='" + m_sAdresse + '\'' +
                ", m_iNbHeures=" + m_iNbHeures +
                '}';
    }

    public abstract double CalculSalaire();

    public boolean equals(Object o) {
        if (o instanceof Employe e) {
            return this.m_iId == e.m_iId;
        }
        return false;
    }
}

