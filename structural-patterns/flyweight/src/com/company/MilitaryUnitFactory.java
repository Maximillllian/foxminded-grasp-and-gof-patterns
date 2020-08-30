package com.company;

import com.company.sound.CavalrySound;
import com.company.sound.InfantrySound;
import com.company.sound.TankSound;
import com.company.texture.CavalryTexture;
import com.company.texture.InfantryTexture;
import com.company.texture.TankTexture;
import com.company.units.InfantryUnit;

import java.util.List;

public class MilitaryUnitFactory {
    private static List<MilitaryUnitType> militaryUnitTypes = List.of();

    public static MilitaryUnitType getMilitatyUnitType(UnitType unitType) {
        var stream = militaryUnitTypes.stream();
        if (unitType == UnitType.Cavalry) {
            var militaryUnitTypeOpt = stream
                    .filter(x -> x.getSound() instanceof CavalrySound && x.getTexture() instanceof CavalryTexture)
                    .findFirst();
            if (militaryUnitTypeOpt.isPresent()) {
                return militaryUnitTypeOpt.get();
            } else {
                var militaryUnitType = new MilitaryUnitType(new CavalryTexture(), new CavalrySound());
                militaryUnitTypes.add(militaryUnitType);
                return militaryUnitType;
            }
        } else if (unitType == UnitType.Infantry) {
            var militaryUnitTypeOpt = stream
                    .filter(x -> x.getSound() instanceof InfantrySound && x.getTexture() instanceof InfantryTexture)
                    .findFirst();
            if (militaryUnitTypeOpt.isPresent()) {
                return militaryUnitTypeOpt.get();
            } else {
                var militaryUnitType = new MilitaryUnitType(new InfantryTexture(), new InfantrySound());
                militaryUnitTypes.add(militaryUnitType);
                return militaryUnitType;
            }
        } else if (unitType == UnitType.Tank) {
            var militaryUnitTypeOpt = stream
                    .filter(x -> x.getSound() instanceof TankSound && x.getTexture() instanceof TankTexture)
                    .findFirst();
            if (militaryUnitTypeOpt.isPresent()) {
                return militaryUnitTypeOpt.get();
            } else {
                var militaryUnitType = new MilitaryUnitType(new TankTexture(), new TankSound());
                militaryUnitTypes.add(militaryUnitType);
                return militaryUnitType;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
