//Generic Custom Queue Author - Durgesh Gupta
package com.knoldus.CustomGenericQueueTest

import com.knoldus.CustomGenericQueueApi.GenericCustomQueueApi
import org.scalatest.flatspec.AnyFlatSpec

class GenericCustomQueueTest extends AnyFlatSpec{
  /* Here are writing the unit test cases to test the different methods of generic custom Integer
  * type queue*/
  val customIntQueueTest = new GenericCustomQueueApi[Int]

  "isEmpty method of Int queue " should "be valid for empty queue." in {
    val result =
  }

}
