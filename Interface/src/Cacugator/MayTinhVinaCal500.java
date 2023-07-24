package Cacugator;

public class MayTinhVinaCal500 implements MayTinhBoTui{
    @Override
    public double cong(double a, double b) {
        return a + b;
    }

    @Override
    public double tru(double a, double b) {
        return a - b;
    }

    @Override
    public double nhan(double a, double b) {
        return a * b;
    }

    @Override
    public double chia(double a, double b) {

        double ketQua = 0;

        try {
            ketQua = a/b;
        }catch (ArithmeticException e) {
            System.out.println("Loi :" + e.getMessage());
        }
        return ketQua;
    }
}
