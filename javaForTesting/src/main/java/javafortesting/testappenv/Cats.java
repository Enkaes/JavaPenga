package javafortesting.testappenv;


public class Cats {                        // kinda redundant, ->ExercisesTernaryIfElseSwitch.catOrCats;

    private Integer numberOfCats;

    public Cats(Integer cats){

       this.numberOfCats = cats;
    }

    public Integer getNumberOfCats() {
        return numberOfCats;
    }

    public void setNumberOfCats(Integer cats){
        this.numberOfCats = cats;
    }
}
