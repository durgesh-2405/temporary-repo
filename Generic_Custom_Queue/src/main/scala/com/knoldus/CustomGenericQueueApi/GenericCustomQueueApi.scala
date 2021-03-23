//Generic Custom Queue Author - Durgesh Gupta
package com.knoldus.CustomGenericQueueApi

/* Here we have created generic class of a custom Queue of A type
* in which we have defined different methods of queue like enqueue and dequeue in order of FIFO
* ,sie of the queue, isEmpty, peek, displayQueue*/
class GenericCustomQueueApi[A] {

  /* Here we are defining the isEmpty method in order to check the
  * queue is empty or not.
  * If the queue is empty then it will return a string Empty Queue...
  * If the queue is not empty it will return a string Queue is not Empty..
  * */

  def isEmpty(queue:List[A]): String = {
    queue match {
      case Nil => "Empty Queue..."
      case _ => "Queue is not empty..."
    }
  }

  /* Here we are defining the enqueue method which will add the item to the
  * queue at the rear position in FIFO order and return a list containing
  * the updated queue.
  * */
  def enQueue(queue : List[A], item : A): List[A] ={
    val updatedQueue = queue ::: List(item)
    updatedQueue
  }

  /* Here we defining the dequeue method which will remove the item from the queue
  * from the front position of the queue and return a list containing
  * the updated queue.
  * */

  def deQueue(queue : List[A]): List[A] = {
    queue match {
      case Nil => throw new NoSuchElementException()
      case _ => val updatedQueue = queue.tail
      updatedQueue
    }
  }

  /* Here we are defining the method sizeOfQueue which will return an Integer value
  * containing the size of the queue.
  * */

  def sizeOfQueue(queue: List[A]): Int = {
    val size = queue.length
    size
  }

  /* Here we are defining the displayOfQueue method which will return a string
  * containing the items of the queue.
  * */

  def displayOfQueue(queue: List[A]): String = {
    queue match {
      case Nil => "Empty Queue..."
      case _ =>val itemsOfQueue = for (item <-queue) yield item
        itemsOfQueue.toString()
    }
  }

  /* Here we are defining the peek method which will return the front element of the queue
  * */

  def topElementOfQueue(queue: List[A]): List[A] = {
    queue match {
      case Nil => List()
      case _ => queue.take(1)


    }
  }




}
