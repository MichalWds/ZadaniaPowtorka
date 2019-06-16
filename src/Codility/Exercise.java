package Codility;

public class Exercise implements NumberInt {

    @Override
    public long number() {
        return 20;
    }

    public static void main(String[] args) {
        Exercise exercise = new Exercise();
        System.out.println(exercise.number());
    }
}
