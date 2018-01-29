public class Hand extends BodyPart {

    public Hand(int WeightKG, String name){
        super(WeightKG,name);
        for(int i = 0; i<5; i++){
            this.PartsOfThisBodyPart.add(new Finger(1,"Finger "+i)); // adds finger number onto the name.
        }
    }
}
