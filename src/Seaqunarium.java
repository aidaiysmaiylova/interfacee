public class Seaqunarium implements Swimable  {

    Shark[]sharks;
    Turtle[]turtles;
    Duck[]ducks;

    public Shark[] getSharks() {
        return sharks;
    }

    public void setSharks(Shark[] sharks) {
        this.sharks = sharks;
    }

    public Turtle[] getTurtles() {
        return turtles;
    }

    public void setTurtles(Turtle[] turtles) {
        this.turtles = turtles;
    }

    public Duck[] getDucks() {
        return ducks;
    }

    public void setDucks(Duck[] ducks) {
        this.ducks = ducks;
    }

    public Seaqunarium(Shark[] sharks, Turtle[] turtles, Duck[] ducks) {
        this.sharks = sharks;
        this.turtles = turtles;
        this.ducks = ducks;

    }

    @Override
    public void swim() {

    }
}

