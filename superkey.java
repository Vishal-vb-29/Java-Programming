public class superkey {
    public static void main(String args[]){
        superkey sk=new superkey();
        Horse h=sk.new Horse();
        System.out.println(h.color);
    }
    class Animal{
        String color;
        Animal(){
            System.out.println("Animal Constructor is called");
        }
    }
    class Horse extends Animal{
        Horse(){
            super(); //bydefault rhta h 
            super.color="brown";
            System.out.println("Horse Constructor is called");
        }
    }
    
}
