// Online Java Compiler
// Use this editor to write, compile and run your Java code online


class Book {
    String title;
    String author;
    int age;
    
    
    public Book(){
        this.title="book1";
        this.author="jeni";
    }
    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    public void introduce()  {
         System.out.println(title +author);
}

    
    public static void main(String[] args) {
        Book person1=new Book("b","a");
        person1.introduce();
       
    }
}
