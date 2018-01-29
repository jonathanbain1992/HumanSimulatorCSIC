public class LowerBody extends BodyPart {

    public LowerBody(int WeightOfBodyPartKG,String NameOfBodyPart){
        super(WeightOfBodyPartKG,NameOfBodyPart);

        //limbs
        PartsOfThisBodyPart.add(new Leg(20,"Left Leg"));
        //an arm needs a hand, so we get this arm and trigger its method for adding a body part and tell it to add a new hand.
        PartsOfThisBodyPart.get(0).PartsOfThisBodyPart.add(new Foot(3,"Left Foot"));

        PartsOfThisBodyPart.add(new Arm(20,"Right Leg"));
        PartsOfThisBodyPart.get(1).PartsOfThisBodyPart.add(new Foot(3,"Right Foot"));
    }
}
