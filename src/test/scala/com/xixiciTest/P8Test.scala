package com.xixiciTest

import com.xixici.P8
import org.scalatest.FunSuite

/**
  * Created by xixici
  * Date: 2019/3/11 
  * Project Name: sword-offer-scala-sbt
  * Project URL: https://github.com/xixici/sword-offer-scala
  **/
class P8Test extends FunSuite {
  test("P8Test") {
    val predict = 5
    val real = P8.Jump(4)
    assert(predict===real)
  }
}
