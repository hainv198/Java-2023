
public class Main {
    public static void main(String[] args) {
        /*
        * Mutable : khi thực hiện một phép toán thì nó thay đổi trực tiếp giá trị ô nhớ đó luôn
        *
        * Immutable : Tạo ra một giá trị ô nhớ mới
        *
        * So sánh == là so sánh địa chỉ ô nhớ
        *
        * equals : so sánh giá trị
        *
        */

        // thay đổi địa chỉ ô nhớ trong ram
        // immutable : không thay đổi giá trị ô nhớ trong bộ nhớ :
        String a = "Java";
        System.out.println("Gia tri ban dau" +  " "  + a);
        a.concat("Rule");
        System.out.println("Sau khi gan "+ " " + a);
        // thay đổi địa chỉ ô nhứ bằng cách gán a = ....
        a = a.concat(" Gia tri gan");

        System.out.println(a);

        // String thì so sanh equals



        /*
        * Mutable thay đổi trực tiếp ô nhớ
        * StringBuilder
        *
        *
        */

        StringBuilder x = new StringBuilder("abc");
        x.append(" def");
        System.out.println(x);

        x.delete(2,4);
        System.out.println(x);

        x.deleteCharAt(1);
        System.out.println(x);

        x.insert(3,"d");
        System.out.println(x);

        x.replace(2,4, "ghi");
        System.out.println(x);

        x.reverse();
        System.out.println(x);


        String c = "hainv hihi";

        if (c.contains("hihi")) {
            System.out.println("True");
        }else  {
            System.out.println("False");
        }
    }
}