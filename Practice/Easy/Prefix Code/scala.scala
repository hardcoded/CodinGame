import math._
import scala.util._
import scala.collection.mutable
import scala.io.StdIn._

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
object Solution extends App {
    val n = readLine.toInt

    val code: mutable.Map[String, Int] = mutable.Map[String, Int]()
    for(i <- 0 until n) {
        val Array(b, _c) = readLine split " "
        val c = _c.toInt
        Console.err.println((b,c))
        code += (b -> c)
    }

    val s = readLine
    
    // Write an answer using println
    // To debug: Console.err.println("Debug messages...")

    Console.err.println(s"code : $code")
    Console.err.println(s"s : $s")

    def parseString(string: String, table: mutable.Map[String, Int]): String = {
        val tableKeys = table.keySet
        def parseStringRec(string: String, result: String = "", index: Int = 0): String = {
            if (string.size == 0) result
            else {
                tableKeys.find(k => string.startsWith(k)) match {
                    case None =>
                        s"DECODE FAIL AT INDEX ${s.size - string.size}"
                    case Some(key) =>
                        val decoded = table(key)
                        parseStringRec(string.stripPrefix(key), result + decoded.toChar, index + 1)
                }
                
                
            }
        }
        parseStringRec(string)
    }

    val decodedString = parseString(s, code)

    println(decodedString)
}