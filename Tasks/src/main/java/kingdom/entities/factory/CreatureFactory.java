package kingdom.entities.factory;

import kingdom.entities.elementals.Elemental;
import kingdom.entities.imps.Imp;

public interface CreatureFactory {
    Imp createImp();
    Elemental createElemental();
}
