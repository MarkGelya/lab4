package Things;

import Persons.AbsPerson;

public interface Brokenable extends IThing{
    void broke(int damage);
    int getStrength();
    void repair(AbsPerson person);
}
