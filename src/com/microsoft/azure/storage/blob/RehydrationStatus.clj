(ns com.microsoft.azure.storage.blob.RehydrationStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob RehydrationStatus]))

(def UNKNOWN
  "Enum Constant.

  The rehydration status is not recognized by this version of the library.

  type: com.microsoft.azure.storage.blob.RehydrationStatus"
  RehydrationStatus/UNKNOWN)

(def PENDING_TO_HOT
  "Enum Constant.

  The blob is being rehydrated to hot storage.

  type: com.microsoft.azure.storage.blob.RehydrationStatus"
  RehydrationStatus/PENDING_TO_HOT)

(def PENDING_TO_COOL
  "Enum Constant.

  The blob is being rehydrated to cool storage.

  type: com.microsoft.azure.storage.blob.RehydrationStatus"
  RehydrationStatus/PENDING_TO_COOL)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (RehydrationStatus c : RehydrationStatus.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.blob.RehydrationStatus[]`"
  ([]
    (RehydrationStatus/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.blob.RehydrationStatus`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.blob.RehydrationStatus [^java.lang.String name]
    (RehydrationStatus/valueOf name)))

