package it.euris.academy2023.EserciziNiccolĂ˛.shapes;

import it.euris.academy2023.EserciziNiccolĂ˛.dynamic.OggettoOrdinabile;

public interface IShape extends OggettoOrdinabile {

    default String getDescrizione() {
        return "Sono una figura di tipo " + getNome() + ", con perimetro: " + calcolaPerimetro();
    }

    float calcolaPerimetro();


    String getNome();

}
