public class UpperBody extends BodyPart {

    public UpperBody(int WeightOfBodyPartKG,String NameOfBodyPart){
        super(WeightOfBodyPartKG,NameOfBodyPart);

        //main organs
        PartsOfThisBodyPart.add(new BodyPart(8,"Heart"));
        PartsOfThisBodyPart.add(new BodyPart(4,"Kidney"));
        PartsOfThisBodyPart.add(new BodyPart(3,"Lungs"));
        PartsOfThisBodyPart.add(new BodyPart(5,"Liver"));

        //limbs

        PartsOfThisBodyPart.add(new Arm(15,"Left Arm"));
        //an arm needs a hand, so we get this arm and trigger its method for adding a body part and tell it to add a new hand.
        PartsOfThisBodyPart.get(4).PartsOfThisBodyPart.add(new Hand(3,"Left Hand"));

        PartsOfThisBodyPart.add(new Arm(15,"Right Arm"));
        PartsOfThisBodyPart.get(4).PartsOfThisBodyPart.add(new Hand(3,"Right Hand"));
    }
}
