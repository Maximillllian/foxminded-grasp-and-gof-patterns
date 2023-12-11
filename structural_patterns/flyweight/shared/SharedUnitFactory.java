package structural_patterns.flyweight.shared;

import lombok.SneakyThrows;
import structural_patterns.flyweight.SharedUnit;
import structural_patterns.flyweight.UnitType;
import structural_patterns.flyweight.sound.CavalrySound;
import structural_patterns.flyweight.sound.InfantrySound;
import structural_patterns.flyweight.sound.TankSound;
import structural_patterns.flyweight.texture.CavalryTexture;
import structural_patterns.flyweight.texture.InfantryTexture;
import structural_patterns.flyweight.texture.TankTexture;

import java.util.Map;

public class SharedUnitFactory {
    private static Map<UnitType, SharedUnit> sharedUnitMap = Map.of(
        UnitType.CAVALRY, new SharedUnit(new CavalryTexture(), new CavalrySound()),
        UnitType.TANK, new SharedUnit(new TankTexture(), new TankSound()),
        UnitType.INFANTRY, new SharedUnit(new InfantryTexture(), new InfantrySound())
    );

    public static SharedUnit getSharedUnit(UnitType type) {
        var sharedUnit = sharedUnitMap.get(type);

        if (sharedUnit == null) {
            System.out.println("Херня какая-то, такого SharedUnit нет");
            return null;
        }

        return sharedUnit;
    }
}
