#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    int lower = 1, upper = 100;
    int number, guess, attempts = 0;

    // Initialize random number generator
    srand(time(0));
    number = (rand() % (upper - lower + 1)) + lower;

    printf("Welcome to the Guess the Number game!\n");
    printf("I'm thinking of a number between %d and %d.\n", lower, upper);

    do {
        printf("Enter your guess: ");
        scanf("%d", &guess);
        attempts++;

        if (guess == number) {
            printf("Congratulations! You guessed the correct number (%d) in %d attempts.\n", number, attempts);
            break;
        } else if (guess < number) {
            printf("Try a higher number.\n");
        } else {
            printf("Try a lower number.\n");
        }
    } while (1);

    return 0;
}
