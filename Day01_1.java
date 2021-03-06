import java.util.List;

/**
 * Part one of
 * https://adventofcode.com/2020/day/1
 *
 * @author Nerijus
 */
public class Day01_1 {
    public static void main(String[] args) {
        System.out.println("Multiplied: " + new Day01_1().getResult());
    }

    private int getResult() {
        List<Integer> entries = Inputs.readInts("Day01");
        for (Integer first : entries) {
            for (Integer second : entries) {
                if (first + second == 2020) {
                    System.out.printf("%d + %d = 2020\n", first, second);
                    return first * second;
                }
            }
        }
        throw new IllegalStateException("Did not found entries that if added together results in 2020");
    }
}
