package kingdom.entities.mages;

import kingdom.entities.elementals.Elemental;
import kingdom.entities.imps.Imp;

public interface Mage {
    Imp getImp();
    Elemental getElemental();
}
