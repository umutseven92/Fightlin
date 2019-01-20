package archetype

import Weapon
import damage.DamageType

class Rogue: Archetype("Rogue", Weapon("Dagger", DamageType.Piercing, Pair(4f, 8f)), 12f, 3f, DamageType.Blunt, 30)