package AnotherExercises.Enum;

public enum Size {

    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private Size(String abbreviation) {
        this.abbreviatiion = abbreviation;
    }

    public String getAbbreviatiion() {
        return abbreviatiion;
    }

    private String abbreviatiion;
}
