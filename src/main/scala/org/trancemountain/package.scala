package org

/**
	* Classes, traits, etc. that are available to all Trance Mountain components.
	*
	* @author michaelcoddington
	*/
package object trancemountain {

	implicit class OptionalUnpacker[T >: Null <: Any](option: Option[T]) {
		def ! : T = option match {
			case s: Some[T] => s.get
			case None => null
		}
	}

}
