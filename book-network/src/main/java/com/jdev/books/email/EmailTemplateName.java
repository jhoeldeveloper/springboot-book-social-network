package com.jdev.books.email;

import lombok.Getter;

@Getter

public enum EmailTemplateName {
    ACTIVATE_ACCOUNT("activate_account");

    private final String value;

    EmailTemplateName(String value){
        this.value = value;
    }

}
