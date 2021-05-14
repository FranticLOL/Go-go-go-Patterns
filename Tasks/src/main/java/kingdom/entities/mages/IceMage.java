package kingdom.entities.mages;

import kingdom.entities.elementals.Elemental;
import kingdom.entities.factory.CreatureFactory;
import kingdom.entities.factory.IceCreatureFactory;
import kingdom.entities.imps.Imp;

public class IceMage implements Mage {
    CreatureFactory creatureFactory;

    public IceMage() {
        this.creatureFactory = new IceCreatureFactory();
    }


    @Override
    public Imp getImp() {
        return creatureFactory.createImp();
    }

    @Override
    public Elemental getElemental() {
        return creatureFactory.createElemental();
    }
}
