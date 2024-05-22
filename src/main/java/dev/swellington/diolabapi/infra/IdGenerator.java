package dev.swellington.diolabapi.infra;

import jakarta.annotation.Nullable;
import lombok.Getter;

import java.util.Random;

public class IdGenerator {

    private static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";

    public String generateRandomId(@Nullable String pattern) {

        if (pattern == null) {
            pattern = "LLLLAAAA-NNN";
        }

        Random random = new Random();
        StringBuilder randomId = new StringBuilder();

        for (char ch : pattern.toCharArray()) {
            switch (ch) {
                case 'L':
                    randomId.append(UPPERCASE_LETTERS.charAt(random.nextInt(UPPERCASE_LETTERS.length())));
                    break;
                case 'A':
                    randomId.append(LOWERCASE_LETTERS.charAt(random.nextInt(LOWERCASE_LETTERS.length())));
                    break;
                case 'N':
                    randomId.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
                    break;
                default:
                    randomId.append(ch);
                    break;
            }
        }

        return randomId.toString();
    }

    @Getter
    private static IdGenerator instance = new IdGenerator();

    private IdGenerator() {}

}
