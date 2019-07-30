(ns com.microsoft.azure.storage.file.ShareStats
  "Class representing a set of statistics pertaining to a cloud file share."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.file ShareStats]))

(defn ->share-stats
  "Constructor."
  (^ShareStats []
    (new ShareStats )))

(defn get-usage
  "Gets the approximate size of the data stored on the share, in GB.

  returns: the share usage - `int`"
  (^Integer [^ShareStats this]
    (-> this (.getUsage))))

