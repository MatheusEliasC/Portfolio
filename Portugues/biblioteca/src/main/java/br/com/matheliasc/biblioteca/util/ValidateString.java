package br.com.matheliasc.biblioteca.util;

import javax.validation.Payload;

public @interface ValidateString {

    String[] acceptedValues();

    String message() default "O valor inserido não é válido";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}