package archetype

import Weapon
import damage.DamageType

class Warrior : Archetype("Warrior", Weapon("Mace", DamageType.Blunt, Pair(3f, 6f)), 20f, 5f, DamageType.Magic, 5)