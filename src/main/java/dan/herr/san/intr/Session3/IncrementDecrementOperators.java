package dan.herr.san.intr.Session3;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        /*
        Operadores de asignación:

        +=: a += b es equivalente a a = a + b.
        -=: a -= b es equivalente a a = a - b.
        *=: a *= b es equivalente a a = a * b.
        /=: a /= b es equivalente a a = a / b.
        %=: a %= b es equivalente a a = a % b.
        Operadores de incremento:

        ++: i++ es equivalente a i = i + 1.
        --: i-- es equivalente a i = i - 1.
        Podemos usar estos operadores de forma prefija (++i) o
        postfija (i++). La diferencia está en qué operación se ejecuta primero:
         */
        int lives = 5;
        lives  = lives - 1;

        System.out.println(lives);

        lives--;
        System.out.println(lives);

        lives++;
        System.out.println(lives);

        //prefija
        //Gana u  regalo pro vida
        int gift = 100 + lives++;
        System.out.println(gift);

    }
}