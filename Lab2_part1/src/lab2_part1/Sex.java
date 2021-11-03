
package lab2_part1;

public enum Sex {
    M("He", "His"), 
    F("She", "Her");
    
    private final String pronoun;
    private final String pronounRP;

    private Sex(String pronoun, String pronounRP) {
        this.pronoun = pronoun;
        this.pronounRP = pronounRP;
    }

    public String getPronoun() {
        return pronoun;
    }

    public String getPronounRP() {
        return pronounRP;
    }
    
    
}
