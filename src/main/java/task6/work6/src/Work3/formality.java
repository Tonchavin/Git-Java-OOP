package task6.work6.src.Work3;

public interface formality {
    public default String greet() {
        return switch (this.greet()) {
            case "formal" -> "Good evening, sir.";
            case "casual" -> "Sup bro?";
            case "intimate" -> "Hello Darling!";
            default -> "Hello.";
        };
    }
}
