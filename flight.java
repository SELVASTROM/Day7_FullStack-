import java.util.*;
class Myflight{
    String name;
    String from;
    String to;
    int distance;
    int fare ;
    Myflight(String name,String from,String to,int distance){
        this.name=name;
        this.from=from;
        this.to=to;
        this.distance=distance;
        this.fare=distance*5+100;
    }
    void display(){
        
        System.out.println("your name is "+name+"\n your travel from "+from+"\n you travel ends in 0"+to+"\n the total distance from "+from+" to you destination "+to+" is the total distance covered is"+distance+"\n so your ticket fare is "+fare);
    }
}
class flight {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=s.nextLine();
        System.out.println("your journey starts from");
        String from=s.nextLine();
        System.out.println("Your journey is endes with");
        String to=s.nextLine();
        System.out.println("Enter the total distance are you travel");
        int distance=s.nextInt();
        Myflight f=new Myflight(name,from,to,distance);
        f.display();
        s.close();
    }
    
}
