package org.trancemountain

/**
	* @author michaelcoddington
	*/
trait IEventConsumer[EventType <: IEvent] {
	def consume(e: EventType)
}
