import java.util.*;
class Mybook{
    String title;
    String author;
    int prize;
    Mybook(){
     title="The saturn";
     author="Selvamurugan K";
     prize=678;
    }
     Mybook(String title,String author,int prize){
        this.title=title;
        this.author=author;
        this.prize=prize;
     }
     void display(){
        System.out.println("The book name is "+title+"\n The writter author name is "+author+"\n The book prize is "+prize);
     }

}
class Book{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Mybook b1=new Mybook();
        b1.display();
        System.out.println("Enter title ");
        String title=s.nextLine();
        System.out.println("Enter aythor name");
        String author=s.nextLine();
        System.out.println("Enter the prize");
        int prize=s.nextInt();
        Mybook b2=new Mybook(title,author,prize);
        b2.display();
        s.close();
    }
}