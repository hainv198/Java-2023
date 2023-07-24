public class Dog extends Animal{
    public Dog(String name) {
        super("Dog");
    }

    @Override
    public void eat() {
        System.out.println("ghi de o lop con");
    }

    @Override
    public void makeSound() {
        System.out.println("Am thanh ghi de lop con");
    }
}
