(ns com.microsoft.azure.storage.queue.QueuePermissions
  "Represents the permissions for a container."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.queue QueuePermissions]))

(defn ->queue-permissions
  "Constructor."
  (^QueuePermissions []
    (new QueuePermissions )))

