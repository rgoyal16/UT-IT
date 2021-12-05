package com.knoldus.validator

import org.scalatest.flatspec.AnyFlatSpec

class passwoesvalidatorTest extends AnyFlatSpec {
  val pass = "Password"

  val passwoesvalidator = new passwoesvalidator()

  "a password " should "not contains any spaces" in {
    val res = passwoesvalidator.isPasswordisValid(pass)
    assert(res)
  }


}
