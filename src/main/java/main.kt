import fighter.Fighter
import archetype.Warrior
import com.beust.klaxon.Klaxon
import com.xenomachina.argparser.ArgParser
import fighter.FighterDTO
import fighter.FighterHelper
import java.io.File

fun main(args: Array<String>) {

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


    val arguments = ArgParser(args).parseInto(::MyArgs)

    val jsonPath = arguments.fighterPath

    val fighterJson = File(jsonPath).readText()

    val userDTO = Klaxon().parse<FighterDTO>(fighterJson)

    val mage = FighterHelper().convertDtoToFighter(userDTO!!)
    val warrior = Fighter("Grognak the Barbarian", "A fierce warrior.", Warrior())

    val arena = Arena(Pair(mage, warrior))

    arena.introduceFighters()
    arena.startFight()
}

