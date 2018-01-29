import java.util.ArrayList;

public  class BodyPart {

    public String NameOfBodyPart;
    public int WeightOfBodyPartKG;


    public ArrayList<BodyPart> PartsOfThisBodyPart = new ArrayList<>();


    public BodyPart(int WeightOfBodyPartKG, String NameOfBodyPart){
        // add up the weight of this body part PLUS all the body parts this body part contains (upper body contains arms, arms contains hands etc...)
        this.WeightOfBodyPartKG = WeightOfBodyPartKG + getWeightsOfPartsOfThisBodyPart();
        this.NameOfBodyPart = NameOfBodyPart;
    }

    // this is a helper method which goes through the list of objects the body part contains, gets their individual weights and adds them all up.
    public int getWeightsOfPartsOfThisBodyPart(){

        int totalWeight = 0;
        for(BodyPart b : PartsOfThisBodyPart){
            totalWeight += b.WeightOfBodyPartKG;
        }
        return totalWeight;
    }

    public int getWeight(){
        return this.WeightOfBodyPartKG;
    }
}
