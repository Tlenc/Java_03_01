package Uzdaviniai;


public class LyginisNelyginis {
    private int _a;

    public int get_a() {
        return _a;
    }

    public void set_a(int value) {
        _a = value;

    }

    public void skaiciuok() {

        if (_a % 2 == 0) {
            System.out.println("Skaičius yra lyginis");
        } else {
            System.out.println("Skaičius yra nelyginis");
        }

    }
}
