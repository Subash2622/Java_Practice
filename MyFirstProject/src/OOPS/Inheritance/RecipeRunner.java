package OOPS.Inheritance;

public class RecipeRunner {
    public static void main(String[] args) {
        Recipe1 recipe = new Recipe1();
        recipe.execute();

        RecipeWithMicrowave recipeWithMicrowave = new RecipeWithMicrowave();
        recipeWithMicrowave.execute();
    }
}
