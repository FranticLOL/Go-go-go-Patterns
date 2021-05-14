package kingdom.entities.factory;

import kingdom.entities.elementals.Elemental;
import kingdom.entities.elementals.FireElemental;
import kingdom.entities.imps.FireImp;
import kingdom.entities.imps.Imp;

public class FireCreatureFactory implements CreatureFactory {
    @Override
    public Imp createImp() {
        return new FireImp();
    }

    @Override
    public Elemental createElemental() {
        return new FireElemental();
    }
}
