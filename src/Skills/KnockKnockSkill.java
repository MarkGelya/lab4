package Skills;

import Persons.AbsPerson;

public class KnockKnockSkill implements Skill {
        public KnockKnockSkill() {

        }
        @Override
        public void exec(AbsPerson person) {
            System.out.printf("%s постучался\n", person.getName());
        }
    }
