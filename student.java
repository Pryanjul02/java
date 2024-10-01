public class student {
    String name ;
    String house;
    int age;
    int rollnumber;


    public student(String name, int age, int rollnumber, String house) {
        this.name =name;
        this.age=age;
        this.rollnumber=rollnumber;
        this.house=house;

    }

    public String toString(){
        return "Student Details: {Student name ="+name+", age = "+age+" , roll number = "+rollnumber+" , house = "+house+"}";

    }

    public static void main(String[] args) {
        student stu = new student("pryanjul " , 24 , 29 , " yellow ");
        System.out.println(stu);
    }


}
