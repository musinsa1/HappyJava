package Abstract;

public class Bus extends Car {
    public Bus(){
        super();
        System.out.println("Bus 기본생성자");
    }

    public Bus(String name){
        // 부모의 기본 생성자가 없으면 super에 값을 넣어줘야함.
        super(name); // 부모의 기본 생성자를 호출하는 코드가 자동으로 삽입
        System.out.println("Bus 생성자");
    }

    //부모가 가진 추상메소드는 자식이 반드시 구현
    @Override
    public void run() {
        System.out.println("후륜구동으로 동작");
    }
}
