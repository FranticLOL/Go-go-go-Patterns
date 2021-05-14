package kingdom.entities.mages;

import kingdom.entities.elementals.Elemental;
import kingdom.entities.factory.CreatureFactory;
import kingdom.entities.factory.EarthCreatureFactory;
import kingdom.entities.imps.Imp;

public class EarthMage implements Mage {
    CreatureFactory creatureFactory;

    public EarthMage() {
        this.creatureFactory = new EarthCreatureFactory();
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
