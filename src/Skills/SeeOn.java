package Skills;

import Persons.AbsPerson;
import Persons.Status;

public class SeeOn implements Skill {
    private final AbsPerson person;
    public SeeOn(AbsPerson person) {
        this.person = person;
    }
    @Override
    public void exec(AbsPerson person) {
        if (this.person.hasStatus(Status.DIRTY_FACE)) {
            person.useSkill(new LaughSkill());
        }
    }
}
