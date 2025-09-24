package Abstract;

public abstract class Car {
    public Car() {
        System.out.println("Car() 기본 생성자 출력");
    }

    public Car(String name) {
        super(); // 자동으로 들어감
        System.out.println("Car() 생성자 출력");
    }

    // 추상메소드, run()이라는 메소드 필요, 자동차마다 다르게 구현
    public abstract void run();
}
