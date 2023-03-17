package Things;

import Persons.AbsPerson;

public interface Sitable {
    boolean isFree();
    void SitDown(AbsPerson person);
    void SitUp(AbsPerson person);
    String getName();
}
