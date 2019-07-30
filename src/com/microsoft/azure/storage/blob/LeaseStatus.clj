(ns com.microsoft.azure.storage.blob.LeaseStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob LeaseStatus]))

(def UNSPECIFIED
  "Enum Constant.

  Specifies the lease status is not specified.

  type: com.microsoft.azure.storage.blob.LeaseStatus"
  LeaseStatus/UNSPECIFIED)

(def LOCKED
  "Enum Constant.

  Specifies the blob is locked for exclusive-write access.

  type: com.microsoft.azure.storage.blob.LeaseStatus"
  LeaseStatus/LOCKED)

(def UNLOCKED
  "Enum Constant.

  Specifies the blob is available to be locked for exclusive-write access.

  type: com.microsoft.azure.storage.blob.LeaseStatus"
  LeaseStatus/UNLOCKED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (LeaseStatus c : LeaseStatus.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.blob.LeaseStatus[]`"
  ([]
    (LeaseStatus/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.blob.LeaseStatus`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.blob.LeaseStatus [^java.lang.String name]
    (LeaseStatus/valueOf name)))

