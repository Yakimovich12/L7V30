package test.scala
class LeetTest extends org.scalatest.FunSuite
{
  test("test0")
  {
    val str:String="467rrTYrYu-"
    val result=main.scala.Leet.ConvertString(str)
    assert(result.equals("467LeetLeetLeetLeetLeetLeetLeet-"))
  }
  test("test1")
  {
    val str:String="53-8"
    val result=main.scala.Leet.ConvertString(str)
    assert(result.equals("53-8"))
  }
  test("test2")
  {
    val str:String="пре2нг5ш"
    val result=main.scala.Leet.ConvertString(str)
    assert(result.equals("пре2нг5ш"))
  }
  test("test3")
  {
    val str:String="пн4iQЫR2w"
    val result=main.scala.Leet.ConvertString(str)
    assert(result.equals("пн4LeetLeetЫLeet2Leet"))
  }

}
