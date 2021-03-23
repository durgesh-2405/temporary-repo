//Generic Custom Queue Author - Durgesh Gupta
package com.knoldus.CustomGenericQueueImpl

import com.knoldus.CustomGenericQueueApi.GenericCustomQueueApi

/* Here we have created an object class GenericCustomQueueImplementation containing the main method extended from App class.
* In this class we have created an object of GenericCustomQueueApi class named customCharQueue.
* Through this object we have called the different methods of the Custom queue class in order to implement these methods.
* */

object GenericCustomQueueImplementation extends App {

  /*Creating an object of GenericCustomQueueApi Class.
  * */
  val customCharQueue = new GenericCustomQueueApi[Char]

  /* Calling the isEmpty method on a empty queue */
  print(customCharQueue.isEmpty(List()) + "\n")

  /* Calling the enqueue method to enqueue a item to an empty queue.*/
  val charQueueOne = customCharQueue.enQueue(List(),'D')
  print(charQueueOne + "\n")
  val charQueueTwo = customCharQueue.enQueue(charQueueOne,'u')
  val charQueueThree = customCharQueue.enQueue(charQueueTwo,'r')
  /* Calling the topElementOfQueue method which will return the element at the front position of the queue. */
  print("Front element of the queue is: " + customCharQueue.topElementOfQueue(charQueueThree) + "\n")
  print(customCharQueue.isEmpty(charQueueThree) + "\n")

  /* Calling the sizeOfQueue method which will return the size of the queue. */
  print("Size of queue is: " + customCharQueue.sizeOfQueue(charQueueThree) + "\n")

  /* Calling the displayOfQueue method which is returning a string containing the elements of the queue.*/
  customCharQueue.displayOfQueue(charQueueThree).foreach(print)

  val charQueueFour = customCharQueue.enQueue(charQueueThree,'g')
  val charQueueFive = customCharQueue.enQueue(charQueueFour,'e')
  print("\n" + "Size of the queue is: " + customCharQueue.sizeOfQueue(charQueueFive) + "\n")

  /* Calling the dequeue method which will return a updated queue after removing the front element of the queue.*/
  val dequeueOperation = customCharQueue.deQueue(charQueueFive)
  print(dequeueOperation + "\n")
  print("Front element of the queue is: " + customCharQueue.topElementOfQueue(dequeueOperation) + "\n")
  print("Size of the queue is: " + customCharQueue.sizeOfQueue(dequeueOperation) + "\n")




}
