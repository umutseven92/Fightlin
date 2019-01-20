package web

class Auth {

    fun checkIfUserExists(email: String): Boolean {
        return getUserByEmail(email) != null
    }

    fun createUser(email: String, displayName: String, password: String): String {

    }

    fun getUserByEmail(email: String): User {
    }

    fun login() {
    }
}