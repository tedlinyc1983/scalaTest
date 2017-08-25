// import breeze.linalg.DenseVector

import java.io._

object Hello {

  def test1(arg: Int) = {
    
  }

  def gcd(m: Int, n: Int): Int = {
    if(n == 0) 
      return m 
    else 
      return gcd(n, m % n)
  }

  def main(args: Array[String]) {
    try {
      println("gcd(526,78): " + gcd(526,78))

      try {
        // val reader = new FileReader(args(0))
        val bufferedSource = scala.io.Source.fromFile(args(0))
        try {
          // 作一些處理
          // for (line <- bufferedSource.getLines) {
          //   println("line.toUpperCase: " + line.toUpperCase)
          // }
        }catch {
          case ex: IOException => println("發生 IO 錯誤")
        }finally {
          // reader.close()
          bufferedSource.close
        }
      }catch {
        case ex: ArrayIndexOutOfBoundsException => println("必須提供引數")
        case ex: FileNotFoundException => println("找不到檔案：" + args(0))
      }


      // val elems = args map Integer.parseInt
      // println("The sum of my arguments is: " + elems.foldRight(0)(_ + _))
      //     val sum: Int = 1 + 2
      //     val sum2 = 1 + 2
      //     val text: String = "Hello"
      //     val text2 = "Hello"
      //     val scores: Array[Int] = Array(80, 90, 100)
      //     val scores2 = Array(80, 90, 100)

      // println("sum: " + sum)
      // println("sum2: " + sum2)
      // println("text: " + text)
      // println("text2: " + text2)
      // println("scores: " + scores)
      // println("scores2: " + scores2)
      // // println("sum2: " + sum2)
      // // var randGau = Rand.gaussian(0, 1)
      // // var line = linspace(1.0,20.0,20)
      // // val q = DenseVector.rand[Double](5)

      // val x = List(1, 2)
      // println(0 :: x)

      // Console.print("輸入整數：")
      // val y = Console.readInt
      // Console.println("整數：" + y)

      // var filename = "default.properties"
      // if(!args.isEmpty) {
      //   filename = args(0)
      // }
      // println("filename: " + filename)

      // for(arg <- args) {
      //   println("arg:" + arg)
      // }
      // for(j <- 1 to 9) { 
      //   for(i <- 2 to 9) { 
      //     printf("%d*%d=%2d ",i, j,  i * j)
      //   } 
      //   println()
      // }

      // print("請輸入分數：")
      // val level = readInt / 10
      // level match {
      //   case 10 | 9 => println("等級 A")
      //   case 8 => println("等級 B")
      //   case 7 => println("等級 C")
      //   case 6 => println("等級 D")
      //   case _ => println("等級 E")
      // }

    } catch {
      case e: NumberFormatException => 
        println("Usage: scala sum <n1> <n2> ... ")
    }
  }
}

// object newsum {
//   def main(args: Array[String]) {
//     try {
//       val elems = args map Integer.parseInt
//       println("The sum of my arguments is: " + elems.foldRight(0)(_ + _))
//     } catch {
//       case e: NumberFormatException => 
//         println("Usage: scala sum <n1> <n2> ... ")
//     }
//   }
// }