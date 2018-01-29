public class Head extends BodyPart {

    public Head(int WeightKG, String name){
        super(WeightKG,name);

        for (int i=0; i<2; i++){
            //what do we need to have 2 of?
            this.PartsOfThisBodyPart.add(new BodyPart(1,"Eye"+i));
            this.PartsOfThisBodyPart.add(new BodyPart(1,"Ear"+i));
        }

        this.PartsOfThisBodyPart.add(new BodyPart(1,"Mouth"));
        this.PartsOfThisBodyPart.add(new BodyPart(1,"Nose"));
        this.PartsOfThisBodyPart.add(new BodyPart(1,"Hair"));
    }
}
