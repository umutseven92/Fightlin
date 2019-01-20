import fighter.Fighter
import archetype.Mage
import archetype.Warrior

fun main() {

    println("\n" +
            "\n" +
            "  █████▒██▓  ▄████  ██░ ██ ▄▄▄█████▓ ██▓     ██▓ ███▄    █ \n" +
            "▓██   ▒▓██▒ ██▒ ▀█▒▓██░ ██▒▓  ██▒ ▓▒▓██▒    ▓██▒ ██ ▀█   █ \n" +
            "▒████ ░▒██▒▒██░▄▄▄░▒██▀▀██░▒ ▓██░ ▒░▒██░    ▒██▒▓██  ▀█ ██▒\n" +
            "░▓█▒  ░░██░░▓█  ██▓░▓█ ░██ ░ ▓██▓ ░ ▒██░    ░██░▓██▒  ▐▌██▒\n" +
            "░▒█░   ░██░░▒▓███▀▒░▓█▒░██▓  ▒██▒ ░ ░██████▒░██░▒██░   ▓██░\n" +
            " ▒ ░   ░▓   ░▒   ▒  ▒ ░░▒░▒  ▒ ░░   ░ ▒░▓  ░░▓  ░ ▒░   ▒ ▒ \n" +
            " ░      ▒ ░  ░   ░  ▒ ░▒░ ░    ░    ░ ░ ▒  ░ ▒ ░░ ░░   ░ ▒░\n" +
            " ░ ░    ▒ ░░ ░   ░  ░  ░░ ░  ░        ░ ░    ▒ ░   ░   ░ ░ \n" +
            "        ░        ░  ░  ░  ░             ░  ░ ░           ░ \n" +
            "                                                           \n" +
            "\n")

    val mage = Fighter("Merlin", Mage())
    val warrior = Fighter("Grognak the Barbarian", Warrior())

    val arena = Arena(Pair(mage, warrior))

    arena.introduceFighters()
    arena.startFight()
}

