package archetype

import Weapon
import damage.DamageType

class Mage : Archetype("Mage", Weapon("Staff", DamageType.Magic, Pair(5f, 10f)), 10f, 2f, DamageType.Piercing, 10)