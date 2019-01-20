import fighter.Fighter
import damage.DamageModifier

class Arena(var fighters: Pair<Fighter, Fighter>) {

    fun introduceFighters() {
        println("Welcome spectators, to the Arena!")

        println("On one corner, we have the mighty ${fighters.first.name}!")
        println("On the other corner, we have the blood-thirsty ${fighters.second.name}!")
        println("You came to watch a fight! And a fight. You. Shall. Have!")

        printDivider()
    }

    private fun printDivider() {
        println("===========================================================")
    }

    fun startFight() {
        val firstFighter = fighters.first
        val secondFighter = fighters.second

        var attacking: Fighter = firstFighter
        var defending: Fighter = secondFighter

        while(firstFighter.isAlive && secondFighter.isAlive) {
            val damage = attacking.attack()

            if(damage.damageModifier == DamageModifier.Critical) {
                println("CRITICAL HIT! ${attacking.name} attacks for ${damage.damageAmount}!")
            } else {
                println("${attacking.name} attacks for ${damage.damageAmount}!")
            }

            val damageTaken = defending.loseHealth(damage)

            println("${defending.name} loses $damageTaken health!")

            if(attacking == firstFighter) {
                attacking = secondFighter
                defending = firstFighter
            } else {
                attacking = firstFighter
                defending = secondFighter
            }
        }

        val deadFighter = fighters.toList().find{f-> !f.isAlive}
        val aliveFighter = fighters.toList().find{f-> f.isAlive}

        println("Game is over! ${deadFighter!!.name} is dead! All hail ${aliveFighter!!.name}!")
    }
}