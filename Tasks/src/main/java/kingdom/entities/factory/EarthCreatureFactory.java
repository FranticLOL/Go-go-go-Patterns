package kingdom.entities.factory;

import kingdom.entities.elementals.EarthElemental;
import kingdom.entities.elementals.Elemental;
import kingdom.entities.imps.EarthImp;
import kingdom.entities.imps.Imp;

public class EarthCreatureFactory implements CreatureFactory {

    @Override
    public Imp createImp() {
        return new EarthImp();
    }

    @Override
    public Elemental createElemental() {
        return new EarthElemental();
    }
}
