(ns com.microsoft.azure.storage.StorageEvent
  "Abstract class that represents a generic event listener."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage StorageEvent]))

(defn ->storage-event
  "Constructor."
  (^StorageEvent []
    (new StorageEvent )))

(defn event-occurred
  "Represents an event that occurred.

  event-arg - The event object. - `T`"
  ([^StorageEvent this event-arg]
    (-> this (.eventOccurred event-arg))))

