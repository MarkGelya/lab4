package Skills;

import Persons.AbsPerson;
import Things.IFood;
import Things.Cookable;


public class CookSkill implements Skill {
    private final IFood food;
    private final Cookable stove;
    public CookSkill(Cookable stove, IFood food) {
        this.food = food;
        this.stove = stove;
    }
    @Override
    public void exec(AbsPerson person) {
        System.out.printf("%s готовит %s используя %s\n", person.name, food.getName(), stove.getName());
        stove.cook(food);
    };
}
