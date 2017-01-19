package org.trancemountain

import scala.collection.mutable.ArrayBuffer

/**
	* @author michaelcoddington
	*/
trait IEventProducer[EventType <: IEvent] {
	private val consumers = ArrayBuffer.empty[IEventConsumer[EventType]]

	def addConsumer(c: IEventConsumer[EventType]) = consumers += c
	def removeConsume(c: IEventConsumer[EventType]) = consumers -= c

	def notifyConsumers(e: EventType): Unit = {
		for (c <- consumers) c.consume(e)
	}
}
