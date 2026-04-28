package poo.student;

public class Student {

    private final String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int newScore) {
        score += newScore;
    }

    public void printResult() {
        if (score >= 60) {
            System.out.printf("Final score: %d%n%s has been approved!", getScore(), getName());
        }
        else {
            System.out.printf("Final score: %d%n%s failed!", getScore(), getName());
        }

    }

}
