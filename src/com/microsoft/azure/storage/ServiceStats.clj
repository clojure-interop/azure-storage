(ns com.microsoft.azure.storage.ServiceStats
  "Class representing a set of statistics pertaining to a cloud storage service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage ServiceStats]))

(defn get-geo-replication
  "Gets the GeoReplicationStats for a cloud storage service.

  returns: The GeoReplicationStats for the cloud storage service. - `com.microsoft.azure.storage.GeoReplicationStats`"
  (^com.microsoft.azure.storage.GeoReplicationStats [^ServiceStats this]
    (-> this (.getGeoReplication))))

