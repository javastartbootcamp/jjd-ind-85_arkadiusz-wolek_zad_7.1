package pl.javastart.task;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class PalindromeServiceTest {

    private PalindromeService palindromeService = new PalindromeService();

    @Test
    public void shouldNotCrashForNull() {
        assertDoesNotThrow(() -> palindromeService.isPalindrome(null));
    }

    @Test
    public void shouldNotCrashForEmpty() {
        assertDoesNotThrow(() -> palindromeService.isPalindrome(new int[]{}));
    }

    @Test
    public void shouldWorkFor3Items() {
        // when
        boolean result = palindromeService.isPalindrome(new int[]{1, 2, 3});

        // then
        assertThat(result).isEqualTo(false);
    }

    @Test
    public void shouldWorkFor5Items() {
        // when
        boolean result = palindromeService.isPalindrome(new int[]{1, 2, 3, 2, 1});

        // then
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void shouldWorkFor4Items() {
        // when
        boolean result = palindromeService.isPalindrome(new int[]{1, 2, 2, 1});

        // then
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void shouldWorkFor4ItemsAsNotPalindrome() {
        // when
        boolean result = palindromeService.isPalindrome(new int[]{1, 2, 3, 1});

        // then
        assertThat(result).isEqualTo(false);
    }

    @Test
    public void shouldWorkFor5ItemsAsNotPalindrome() {
        // when
        boolean result = palindromeService.isPalindrome(new int[]{5, 2, 3, 2, 1});

        // then
        assertThat(result).isEqualTo(false);
    }

}
