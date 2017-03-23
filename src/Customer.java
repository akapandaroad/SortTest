import java.util.LinkedList;

/**
 * Created by akapandaroad on 2017/2/3.
 */
public class Customer implements Comparable<Customer>{

    @Override
    public int compareTo(Customer o) {
        if(this.age<o.age)
            return  1;
        if(this.age>o.age)
            return -1;
        else
            return 0;
    }

    private enum DrinkType{water,beer}

    private String name;
    public int age;
    private DrinkType drink;


    public Customer(String name,int age) {


        this.name=name;
        this.age=age;
        adAge();

    }



    public String adAge( ){
        if(this.age<18){
            this.drink=DrinkType.water;
            return "water";}
        else {
            this.drink=DrinkType.beer;
            return "beer";
                }


    }

    public Customer() {


    }

    @Override
    public String toString() {

        return this.name+" "+this.age+" "+this.drink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
