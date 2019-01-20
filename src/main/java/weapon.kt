import damage.DamageType

data class Weapon(val name:String, val damageType: DamageType, val range: Pair<Float, Float>)