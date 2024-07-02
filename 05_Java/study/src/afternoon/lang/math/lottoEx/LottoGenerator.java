package afternoon.lang.math.lottoEx;

import java.util.Random;

public class LottoGenerator {
    private static final int LOTTO_SIZE = 6;
    private static final int MAX_NUMBER = 45;

    private int[] lottoNumbers;

    public LottoGenerator() {
        lottoNumbers = new int[LOTTO_SIZE];
    }

    public void generate() {
        Random random = new Random();
        int count = 0;

        while (count < LOTTO_SIZE) {
            int randomNumber = random.nextInt(MAX_NUMBER) + 1;

            if (!contains(randomNumber)) {
                lottoNumbers[count] = randomNumber;
                count++;
            }
        }
    }

    private boolean contains(int number) {
        for (int i = 0; i < LOTTO_SIZE; i++) {
            if (lottoNumbers[i] == number) {
                return true;
            }
        }
        return false;
    }

    public void printLottoNumbers() {
        System.out.print("로또 번호: ");
        for (int i = 0; i < LOTTO_SIZE; i++) {
            System.out.print(lottoNumbers[i]);
            if (i < LOTTO_SIZE - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}