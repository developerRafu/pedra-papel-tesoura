package models;

import java.util.Arrays;

public enum Jogos {
    PEDRA(0, "pedra", 2),
    PAPEL(1, "papel", 0),
    TESOURA(2, "tesoura", 1),;

    private int id;
    private String description;
    private int vantagemSobre;

    Jogos(int id, String description, int vantagemSobre) {
        this.id = id;
        this.description = description;
        this.vantagemSobre = vantagemSobre;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getVantagemSobre() {
        return vantagemSobre;
    }

    public static Jogos of(int id) {
        return Arrays.stream(Jogos.values())
                .filter(j -> j.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Valor inválido"));
    }
}
