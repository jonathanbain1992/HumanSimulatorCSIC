import java.util.ArrayList;

public class Human {

    public ArrayList<BodyPart> bodyParts = new ArrayList<>();

    public String Name;
    public int Age, Height;

    public Human(String Name, int Age, int Height){
        this.Name = Name;
        this.Age = Age;
        this.Height = Height;
        this.bodyParts.add(new Head(20,"Head"));
        this.bodyParts.add(new UpperBody(10,"Upper Body"));
        this.bodyParts.add(new LowerBody(8,"Lower Body"));
    }

    public int getWeight(){
        //get each body part, add it's weight to the total.
        int total = 0;
        for(BodyPart b : bodyParts){
            total += b.getWeightsOfPartsOfThisBodyPart();
        }
        return total;
    }
}
