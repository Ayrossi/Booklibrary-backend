package com.ayrossi.booklibrary.entities;

public enum Language {

    FR("Français"),
    NL("Néerlandais"),
    EN("Anglais");

    private String language;

    private Language(String language) {
        this.language = language;
    }

    public String getLanguage(){
        return this.language;
    }
}
