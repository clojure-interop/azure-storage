(ns com.microsoft.azure.storage.StorageEventMultiCaster
  "Represents a generic event multi-caster that allows event listeners to be dynamically added and removed."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage StorageEventMultiCaster]))

(defn ->storage-event-multi-caster
  "Constructor."
  (^StorageEventMultiCaster []
    (new StorageEventMultiCaster )))

(defn add-listener
  "Adds a listener to the event chain.

  listener - An EventListenerType object that represents the listener to add. - `EVENT_LISTENER_TYPE`"
  ([^StorageEventMultiCaster this listener]
    (-> this (.addListener listener))))

(defn fire-event
  "Fires the event to all subscribed event listeners.

  event - An EVENTTYPEobject that represents the event being multi-casted. - `EVENT_TYPE`"
  ([^StorageEventMultiCaster this event]
    (-> this (.fireEvent event))))

(defn has-listeners?
  "Returns a value that indicates whether any event listeners are registered for events.

  returns: true if any event listeners are registered; otherwise, false. - `boolean`"
  (^Boolean [^StorageEventMultiCaster this]
    (-> this (.hasListeners))))

(defn remove-listener
  "Removes an event listener from the event chain.

  listener - An EventListenerType object that represents the listener to remove. - `EVENT_LISTENER_TYPE`"
  ([^StorageEventMultiCaster this listener]
    (-> this (.removeListener listener))))

