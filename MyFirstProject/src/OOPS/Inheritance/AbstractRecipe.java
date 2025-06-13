package OOPS.Inheritance;

public abstract class AbstractRecipe {
    public void execute(){
        getReady();
        doTheDish();
        cleanup();
    }
    abstract void getReady();
    abstract void doTheDish();
    abstract void cleanup();
    //Prepare
    //Recipe
    //Cleanup
}
