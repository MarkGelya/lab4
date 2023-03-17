package Skills;

import Persons.AbsPerson;
import Things.Cookable;
import Things.IFood;

public class BlowSkill implements Skill{
    private final IFood food;
    public BlowSkill(IFood food) {
        this.food = food;
    }
    @Override
    public void exec(AbsPerson person) {
        System.out.printf("%s дует на %s\n", person.name, food.getName());
        food.changeTemperature(-5);
    }
}
