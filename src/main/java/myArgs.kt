import com.xenomachina.argparser.ArgParser

class MyArgs(parser: ArgParser) {
    val fighterPath by parser.storing("-f", "--fighter", help = "Path to the fighter file")
}