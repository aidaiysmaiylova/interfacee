public class Main {
    public static void main(String[] args) {
//        Shark shark1=new Shark();
//        Shark shark2=new Shark();
//        Shark shark3=new Shark();
//        Shark shark4=new Shark();
//        Shark shark5=new Shark();
//        Shark[]sharks={shark1,shark2,shark3,shark4,shark5};
//
//        Duck duck1=new Duck();
//        Duck duck2=new Duck();
//        Duck duck3=new Duck();
//        Duck duck4=new Duck();
//        Duck duck5=new Duck();
//        Duck[]ducks={duck1,duck2,duck3,duck4,duck5};
//
//        Turtle turtle1=new Turtle();
//        Turtle turtle2=new Turtle();
//        Turtle turtle3=new Turtle();
//        Turtle turtle4=new Turtle();
//        Turtle turtle5=new Turtle();
//        Turtle[]turtles={turtle1,turtle2,turtle3,turtle4,turtle5};
//        Seaqunarium seaqunarium=new Seaqunarium(sharks,turtles,ducks);
//        for(Shark shark :sharks){
//            shark.swim();
//        }
//        System.out.println();
//        for(Turtle turtle:turtles){
//            turtle.swim();
//        }
//        System.out.println();
//        for(Duck duck:ducks){
//            duck.swim();
//        }
        Bakeable[] buns = {
                new Cookie(),
                new Bread(),
                new Cake()
        };
        for(Bakeable bakeable:buns){
            bakeable.bake();
        }
    }
}