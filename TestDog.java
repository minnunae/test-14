package dog.com.it;

public class TestDog{
    public static void main(String[]args){
        Dog Dog1= new Dog();

        Dog1.breed = "Bulldog";
        Dog1.size = "larg";
        Dog1.color = "light gray";
        Dog1.age = 5;

        Dog2.breed = "beayle";
        Dog2.size = "large";
        Dog2.color = "orange";
        Dog2.age = 6;

        Dog3.breed = "German Shepherd";
        Dog3.size = "larg";
        Dog3.color = "White and orange";
        Dog3.age = 6;

        System.out.println("Dog Object 1:\n Breed: " + Dog1.breed +"\n Size: " + Dog1.size + "\n Color: " + Dog1.color + "\n Age: " + Dog1.age);
        //System.out.println("Dog Object 1:\n Size: " + Dog1.size);
        //System.out.println("Dog Object 1:\n color: " + Dog1.color);
        //System.out.println("Dog Object 1:\n age: " + Dog1.age);

        System.out.println("Dog Object 1:\n Breed: " + Dog2.breed +"\n Size: " + Dog2.size + "\n Color: " + Dog2.color + "\n Age: " + Dog2.age);
        //System.out.println("Dog Object 1:\n Size: " + Dog2.size);
        //System.out.println("Dog Object 1:\n color: " + Dog2.color);
        //System.out.println("Dog Object 1:\n age: " + Dog2.age);

        System.out.println("Dog Object 1:\n Breed: " + Dog3.breed +"\n Size: " + Dog3.size + "\n Color: " + Dog3.color + "\n Age: " + Dog3.age);
        //System.out.println("Dog Object 1:\n Size: " + Dog3.size);
        //System.out.println("Dog Object 1:\n color: " + Dog3.color);
        //System.out.println("Dog Object 1:\n age: " + Dog3.age);
    }
}