package Skills;

import Persons.AbsPerson;
import Things.ContainerIsEmpty;
import Things.Cookable;
import Things.IFood;

public class ExtractSkill implements Skill {
    private final Cookable stove;
    public ExtractSkill(Cookable stove) {
        this.stove = stove;
    }
    @Override
    public void exec(AbsPerson person) {
        try {
            IFood food = stove.extract();
            System.out.printf("%s изъял %s из %s\n", person.name, food.getName(), stove.getName());
            person.items.add(food);
        }
        catch (ContainerIsEmpty e) {
            System.out.printf("В %s пусто\n", stove.getName());
        }
    };
}
