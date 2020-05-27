package bsuir.vmsis.kpp

object Leet {
  def main(arg:Array[String])
  {
    println("Введите строку для обработки:");
    val str=readLine()
    val result=ConvertString(str)
    println("Преобразованная строка: "+ result)
  }
  def ConvertString(str:String):String=
  {
    val strForCompare="qwertyuiopasdfghjklzxcvbnm"
    var result=""
    for(i<- 0 to str.length()-1)
    {
      val symbol=str.charAt(i)
      val fcounter=strForCompare.indexOf(symbol)
      val scounter=strForCompare.toUpperCase.indexOf(symbol)
      val rcounter=fcounter+scounter
      rcounter match
      {
        case -2 => result+=symbol
        case _  => result+="Leet"
      }
      
    }
    result
  }
}