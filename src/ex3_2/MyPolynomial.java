package ex3_2;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs){
        this.coeffs=coeffs;
    }
    public int getDegree(){
        return coeffs.length - 1;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] == 0) continue;

            if (sb.length() > 0) {
                sb.append(coeffs[i] > 0 ? " + " : " - ");
            } else if (coeffs[i] < 0) {
                sb.append("-");
            }

            double absCoeff = Math.abs(coeffs[i]);

            if (i == 0 || absCoeff != 1) {
                sb.append(absCoeff);
            }
            if (i > 0) {
                sb.append("x");
            }
            if (i > 1) {
                sb.append("^").append(i);
            }
        }
        return sb.toString();
    }
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }
    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] sumCoeffs = new double[maxDegree + 1];

        for (int i = 0; i <= maxDegree; i++) {
            double a = (i <= this.getDegree()) ? this.coeffs[i] : 0;
            double b = (i <= right.getDegree()) ? right.coeffs[i] : 0;
            sumCoeffs[i] = a + b;
        }

        return new MyPolynomial(sumCoeffs);
    }
    public MyPolynomial multiply(MyPolynomial right) {
        double[] prodCoeffs = new double[this.getDegree() + right.getDegree() + 1];

        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                prodCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }

        return new MyPolynomial(prodCoeffs);
    }
}
