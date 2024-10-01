import java.util.Scanner;
    class circle {

        double radius;

        circle(double radius){
            this.radius = radius;

        }

        double circumference(){
            return 2*radius*Math.PI;
        }

        double area(){
            return Math.PI * Math.pow(radius, 2);
        }

        @Override
        public String toString() {

            return " circle : Radius = "+radius+" , circumference of circle = "+circumference()+" , Area of circle = "+area()+" ";
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the radius: ");
            double radius = input.nextDouble();
            circle Circle = new circle(radius);

            System.out.println(Circle);

        }
    }

