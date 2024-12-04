 class shape
 {
     fun area(length : Int , breadth: Int , height : Int=20)

     {
         println("length is \"$length ")
         println("breadth is \"$breadth ")
         println("height is \"$height ")
     }
 }

 fun main() {
     var t = shape()
     t.area(
         length =20,
         breadth = 30,
         height = 20
     )
 }