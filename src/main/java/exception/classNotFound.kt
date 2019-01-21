package exception

import java.lang.Exception

class ClassNotFoundException(className: String) : Exception("$className is not a valid fighter class.")