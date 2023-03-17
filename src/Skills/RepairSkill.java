package Skills;

import Persons.AbsPerson;
import Things.Brokenable;
import Things.IFood;

public class RepairSkill implements Skill {
    private final Brokenable thing;
    public RepairSkill(Brokenable thing) {
        this.thing = thing;
    }
    @Override
    public void exec(AbsPerson person) {
        int res = thing.getStrength();
        if (res > 0) {
            System.out.printf("%s ремонтирует %s\n", person.name, thing.getName());
            thing.repair(person);
        } else if (res < 0) {
            System.out.printf("У %s нет инструментов для ремонта %s\n", person.name, thing.getName());
        } else {
            System.out.printf("Предмет \"%s\" исправен\n", person.name, thing.getName());
        }
    }
}
