package fighter

import damage.Damage
import damage.DamageModifier
import archetype.Archetype
import Weapon
import kotlin.random.Random

class Fighter(val name: String, val description: String, archetype: Archetype) {

    private var state: FighterState
    private var health: Float
    private var armor: Float
    private val weapon: Weapon
    private val criticalChance: Int

    init {
        state = FighterState.Alive
        health = archetype.health
        armor = archetype.armor
        weapon = archetype.weapon
        criticalChance = archetype.criticalChance
    }

    val isAlive: Boolean
        get() = state == FighterState.Alive

    fun loseHealth(damage: Damage): Float {
        val totalDamage = damage.damageAmount - armor

        if (state == FighterState.Alive) {

            if (totalDamage > 0) {
                health -= totalDamage

                if (health <= 0) {
                    die()
                }
            }
        }

        return totalDamage
    }

    fun attack(): Damage {
        val crit: Int = Random.nextInt(100)
        val randomDamage: Float = weapon.range.first + Random.nextFloat() * (weapon.range.second - weapon.range.first)

        return if (crit <= criticalChance) {
            val criticalDamage = randomDamage * 2
            Damage(criticalDamage, weapon.damageType, DamageModifier.Critical)
        } else {
            Damage(randomDamage, weapon.damageType, DamageModifier.Normal)
        }
    }

    private fun die() {
        state = FighterState.Dead
    }
}