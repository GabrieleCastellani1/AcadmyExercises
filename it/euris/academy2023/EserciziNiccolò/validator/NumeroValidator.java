package it.euris.academy2023.EserciziNiccolĂ˛.validator;

public class NumeroValidator {

    public String getErrorMessage() {
        return "Formato numero errato";
    }
    public boolean validate(Persona persona) {
        return persona.getNumero() != null && persona.getNumero().length() == 10;
    }
}
