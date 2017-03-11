package com.afjcjsbx.eshop.entity.checkout;

/**
 * Created by mastro on 11/11/16.
 */
public class metodoconsegna {
    // Siamo sicuri che sia una Stringa? Come faccio a validarla?
    private String tipo;
    private Double speseDiConsegna;

    public metodoconsegna(String tipo, Double speseDiConsegna) {
        this.tipo = tipo;
        if (speseDiConsegna < 0) {
            throw new RuntimeException("Il prezzo non è valido"); // TODO: da sistemare una volta fatte le eccezioni
        }

        this.speseDiConsegna = speseDiConsegna;
    }

    // TODO e se le spese dipendessero dall'indirizzo di consegna?
    public Double calcolaSpeseDiConsegna() {
        return speseDiConsegna;
    }
}
