public class Foot extends BodyPart {

    public Foot(int WeightKG, String name){
        super(WeightKG,name);
        for(int i = 0; i<5; i++){
            this.PartsOfThisBodyPart.add(new Toe(1,"Toe "+i)); // adds finger number onto the name.
        }
    }
}
