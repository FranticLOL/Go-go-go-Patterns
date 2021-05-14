import kingdom.entities.elementals.Elemental;
import kingdom.entities.imps.Imp;
import kingdom.entities.mages.EarthMage;
import kingdom.entities.mages.FireMage;
import kingdom.entities.mages.IceMage;
import kingdom.entities.mages.Mage;
import org.junit.jupiter.api.Test;

public class TestMageCreatures {

    @Test
    void testCanAssembleAsserothDefenceForce() {
        Mage fireMage = new FireMage();
        Mage iceMage = new IceMage();
        Mage earthMage = new EarthMage();

        Imp fireImp = fireMage.getImp();
        Imp iceImp = iceMage.getImp();
        Imp earthImp = earthMage.getImp();

        Elemental fireElemental = fireMage.getElemental();
        Elemental iceElemental = iceMage.getElemental();
        Elemental earthElemental = earthMage.getElemental();
    }
}
