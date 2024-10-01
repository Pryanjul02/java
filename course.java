class course {
    static int maxcapacity=100;
    String coursename;
    int enrollments;



    String[] enrolledstudents;

    course(String coursenamme){
        this.coursename = coursename;
        this.enrollments=0;
        this.enrolledstudents=new String[maxcapacity];


    }

    static void setmaxcapacity( int maxcapcity){
        course.maxcapacity =maxcapacity;
    }

    void enrolledstudents(String studentname){
        enrolledstudents[enrollments]=studentname;
        enrollments++;
    }

    void unenrolledstudents(String studentname){
        System.out.println("student removed");
        enrollments--;
    }







}
