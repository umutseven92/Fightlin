package archetype

import Weapon
import damage.DamageType

abstract class Archetype(val name: String, val weapon: Weapon, val health: Float, val armor: Float, val weakness: DamageType, val criticalChance: Int)