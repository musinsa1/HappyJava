package Abstract;

public class SportsCar extends Car {
    public SportsCar(){
        super();
        System.out.println("SportsCar 기본생성자");
    }

    public SportsCar(String name) {
        super(name);
        System.out.println("SportsCar 생성자");
    }

    //부모가 가진 추상메소드는 자식이 반드시 구현
    @Override
    public void run() {
        System.out.println("사륜구동으로 동작");
    }
}
