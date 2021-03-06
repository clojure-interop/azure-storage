(ns com.microsoft.azure.storage.GeoReplicationStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage GeoReplicationStatus]))

(def UNAVAILABLE
  "Enum Constant.

  Status of geo-replication is unavailable.

  type: com.microsoft.azure.storage.GeoReplicationStatus"
  GeoReplicationStatus/UNAVAILABLE)

(def LIVE
  "Enum Constant.

  Geo-replication is live.

  type: com.microsoft.azure.storage.GeoReplicationStatus"
  GeoReplicationStatus/LIVE)

(def BOOTSTRAP
  "Enum Constant.

  Data is being bootstrapped from primary to secondary.

  type: com.microsoft.azure.storage.GeoReplicationStatus"
  GeoReplicationStatus/BOOTSTRAP)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (GeoReplicationStatus c : GeoReplicationStatus.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.GeoReplicationStatus[]`"
  ([]
    (GeoReplicationStatus/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.GeoReplicationStatus`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.GeoReplicationStatus [^java.lang.String name]
    (GeoReplicationStatus/valueOf name)))

