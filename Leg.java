public class Leg extends BodyPart {

    public Leg(int WeightKG, String Name){
        super(WeightKG,Name);

        this.PartsOfThisBodyPart.add(new BodyPart(8,"Muscle"));
    }
}
