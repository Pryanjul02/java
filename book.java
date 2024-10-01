public class  book {
    private static int totalnoofbooks;
    String author;//instance variable
    String title ;//instance variable
    String isbn;//instance variable
    boolean isborrowed;


    static{
        totalnoofbooks = 0;//static variable

    }{
        totalnoofbooks++;
    }

    book(String author , String title , String isbn){
        this.isbn=isbn;
        this.author=author;
        this.title = title;

    }
    book(String isbn){
        this.isbn=isbn;
    }
    static  int gettotalnoofbooks(){
        return totalnoofbooks;


    }

    void borrowbook(){//instance method
        if(isborrowed){
            System.out.println("Sorry!! your book is borrowed.");
        }
        else{
            this. isborrowed=true;
            System.out.println("Enjoy your book.");
        }



    }


    void returnbook(){//instance methhod
        if ( isborrowed){
            this.isborrowed =false;
            System.out.println(" Hope you enjoy the book . ");

        }
        else{
            System.out.println(" This book is in library ");
        }
    }

    public static void main(String[] args) {
        book designofthings = new book("Shakespear" ,"design of things", "1");
        book MyLove=new book("2");
        System.out.println(book.gettotalnoofbooks());
        designofthings.borrowbook();
        MyLove.borrowbook();
        designofthings.returnbook();
        MyLove.borrowbook();
        designofthings.returnbook();


    }


}
