package b;

class Hamster {
    String name;
    double weight;
    int age;
    String color;
    boolean isFluffy;
    boolean isWinner;

    public Hamster(
            String hamsterName,
            double hamsterWeight,
            int hamsterAge,
            String hamsterColor,
            boolean isFluffyHamster,
            boolean isWinnerHamster
    ) {
        name = hamsterName;
        weight = hamsterWeight;
        age = hamsterAge;
        color = hamsterColor;
        isFluffy = isFluffyHamster;
        isWinner = isWinnerHamster;
    }
}