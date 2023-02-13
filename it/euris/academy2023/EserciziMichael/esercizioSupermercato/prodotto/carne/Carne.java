package it.euris.academy2023.EserciziMichael.esercizioSupermercato.prodotto.carne;

import it.euris.academy2023.EserciziMichael.esercizioSupermercato.prodotto.Prodotto;
import it.euris.academy2023.EserciziMichael.esercizioSupermercato.prodotto.TipologiaProdottoEnum;

public abstract class Carne implements Prodotto {
    protected String nome;
    protected TipologiaProdottoEnum tipo;

    @Override
    public String getNome(){
        return nome;
    }

    @Override
    public TipologiaProdottoEnum getTipo(){
        return tipo;
    }
}
