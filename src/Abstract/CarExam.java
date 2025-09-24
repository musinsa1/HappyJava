package Abstract;

public class CarExam {
    public static void main(String[] args) {
        Bus b =  new Bus("Bus!!");
        b.run();

        Bus b1 = new Bus();
        b1.run();

        SportsCar s = new SportsCar("SportsCar!!");
        s.run();

        SportsCar s1 = new SportsCar();
        s1.run();
    }
}
