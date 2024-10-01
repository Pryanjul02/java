import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<student> queue = new PriorityQueue<>(new Comparator<student>() {
            @Override
            public int compare(student student , student t1) {

                return student.getGrade()-t1.getGrade();
            }
        });
        queue.offer(new student ("kushi",'B'));
        queue.offer(new student ("Simran",'C'));
        queue.offer(new student ("sneha",'A'));
        queue.offer(new student ("chandrika",'D'));
        queue.offer(new student("Harsh",'A'));
        System.out.println(queue);

        System.out.printf("Queue is: %s\n", queue);
        System.out.printf("got %s \n",queue.poll());
        System.out.printf("got %s \n",queue.poll());
        System.out.printf("got %s \n",queue.poll());
        System.out.printf("got %s \n",queue.poll());
        System.out.printf("got %s \n",queue.poll());
    }




    private static class student{
        private final String name;
        private final char grade ;
        public student(String name ,char grade) {
            this.name = name;
            this.grade =grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name+ ":"+grade;
        }
    }




}
