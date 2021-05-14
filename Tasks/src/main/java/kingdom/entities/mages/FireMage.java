package kingdom.entities.mages;

import kingdom.entities.elementals.Elemental;
import kingdom.entities.factory.CreatureFactory;
import kingdom.entities.factory.FireCreatureFactory;
import kingdom.entities.imps.Imp;

public class FireMage implements Mage {

    CreatureFactory creatureFactory;

    public FireMage() {
        this.creatureFactory = new FireCreatureFactory();
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
