package br.com.etechoracio.feriados.enums;

public enum MeuFeriadoEnum {
    FEDERAL("Federal"),
    MUNICIPAL("Municipal"),
    ESTADUAL("Estadual");
	

    private String label;

    private MeuFeriadoEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }

    public static MeuFeriadoEnum getBy(int ordinal) {
        return MeuFeriadoEnum.values()[ordinal];
    }
}
