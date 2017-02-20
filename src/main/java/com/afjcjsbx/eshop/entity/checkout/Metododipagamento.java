package com.afjcjsbx.eshop.entity.checkout;

/**
 * Created by mastro on 11/11/16.
 */
public class Metododipagamento {
    // Siamo sicuri che sia una Stringa? Come faccio a validarla?
    private String tipo;
    private Double oneriAggiuntivi;

    public Metododipagamento(String tipo, Double oneriAggiuntivi) {
        this.tipo = tipo;
        if (oneriAggiuntivi < 0) {
            throw new RuntimeException("Il prezzo non è valido"); // TODO: da sistemare una volta fatte le eccezioni
        }
        this.oneriAggiuntivi = oneriAggiuntivi;
    }

    public Double calcolaPrezzoOneri() {
        return oneriAggiuntivi;
    }
}
