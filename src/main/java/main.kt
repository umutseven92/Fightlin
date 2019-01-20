import fighter.Fighter
import archetype.Mage
import archetype.Warrior
import com.google.firebase.auth.UserRecord
import web.Web
import web.Auth

fun main() {
    val web = Web()
    web.init()

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

    handleAuth()

    /*
    val mage = Fighter("Merlin", Mage())
    val warrior = Fighter("Grognak the Barbarian", Warrior())

    val arena = Arena(Pair(mage, warrior))

    arena.introduceFighters()
    arena.startFight()
    */
}

fun askUserAllCredentials(): Triple<String, String, String> {
    println("Email: ")
    val email: String = readLine()!!

    println("Display name: ")
    val displayName:String = readLine()!!

    println("Password: ")
    val password:String = readLine()!!

    return Triple(email, displayName, password)
}

fun askUserLoginCredentials(): Pair<String, String> {
    println("Email: ")
    val email: String = readLine()!!

    println("Password: ")
    val password:String = readLine()!!

    return Pair(email, password)
}

fun handleAuth() {

    val auth = Auth()

    println("Register (r) or login (l) ?")

    val line: String? = readLine()

    if (line == "r" || line == "R") {

        val (email, displayName, password) = askUserAllCredentials()

        if (auth.checkIfUserExists(email)) {
            println("User with that email already exists.")
        }else {
            auth.createUser(email, displayName, password)
        }


    } else if (line == "l" || line == "L") {
        val (email, password) = askUserLoginCredentials()

    }
}