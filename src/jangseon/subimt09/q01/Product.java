package jangseon.subimt09.q01;

public class Product {

        String name;
        int price;

        Product(String name , int price ){
            this.name = name;
            this.price = price;


        }

    @Override
    public String toString() {
        return "Product [name=" + name  + ", price=" + price + "]" ;
    }
    //    public  void  printState(){
//        System.out.println("이름: " + name);
//        System.out.println("나이: " + age);
//        System.out.println("레벨: " + level);
//        System.out.println("경험치: " + exp);


}
