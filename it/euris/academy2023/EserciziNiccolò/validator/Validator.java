package it.euris.academy2023.EserciziNiccolĂ˛.validator;

public interface Validator {
    String getErrorMessage();

    boolean validate(Persona p);
}
