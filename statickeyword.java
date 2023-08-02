public class statickeyword {
    public static void main(String args[]){
        statickeyword sk=new statickeyword();
        Student s1=sk.new Student();
        s1.setname("Vishal Birla");
        s1.Schoolname="Eminent Public School Dhar";
        System.out.println(s1.Schoolname);
        Student s2=sk.new Student();
        System.out.println(s2.Schoolname);
        s2.Schoolname="JVM";
        Student s3=sk.new Student();
        System.out.println(s3.Schoolname);
        //School name ek baar initialize hua to sbk liye fir same rhega jb tk koi variable chng nhi krta mtlb garbage value nhi rhegi aur referenc ed hota rhtga h hr object k liye ek hi varible rhta h. 
        System.out.println(s1.Schoolname);
    }
    class Student{
        static String Schoolname;
        String name;
        int roll;
        void setname(String name){
            this.name=name;
        }
        String getname(){
            return this.name;
        }
    }
    
}
