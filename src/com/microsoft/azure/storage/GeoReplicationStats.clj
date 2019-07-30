(ns com.microsoft.azure.storage.GeoReplicationStats
  "Class representing the geo-replication statistics."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage GeoReplicationStats]))

(defn get-last-sync-time
  "Gets the last synchronization time. All primary writes preceding this value are guaranteed to be available
   for read operations. Primary writes following this point in time may or may not be available for reads.

  returns: A java.util.Date object which represents the last synchronization time. - `java.util.Date`"
  (^java.util.Date [^GeoReplicationStats this]
    (-> this (.getLastSyncTime))))

(defn get-status
  "Gets the GeoReplicationStatus status.

  returns: The GeoReplicationStatus status. - `com.microsoft.azure.storage.GeoReplicationStatus`"
  (^com.microsoft.azure.storage.GeoReplicationStatus [^GeoReplicationStats this]
    (-> this (.getStatus))))

