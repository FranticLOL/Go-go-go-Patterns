package kingdom.entities.factory;

import kingdom.entities.elementals.Elemental;
import kingdom.entities.elementals.IceElemental;
import kingdom.entities.imps.IceImp;
import kingdom.entities.imps.Imp;

public class IceCreatureFactory implements CreatureFactory {
    @Override
    public Imp createImp() {
        return new IceImp();
    }

    @Override
    public Elemental createElemental() {
        return new IceElemental();
    }
}
