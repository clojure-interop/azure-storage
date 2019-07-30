(ns com.microsoft.azure.storage.StorageLocation
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage StorageLocation]))

(def PRIMARY
  "Enum Constant.

  Primary storage service location.

  type: com.microsoft.azure.storage.StorageLocation"
  StorageLocation/PRIMARY)

(def SECONDARY
  "Enum Constant.

  Secondary storage service location.

  type: com.microsoft.azure.storage.StorageLocation"
  StorageLocation/SECONDARY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (StorageLocation c : StorageLocation.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.StorageLocation[]`"
  ([]
    (StorageLocation/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.StorageLocation`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.StorageLocation [^java.lang.String name]
    (StorageLocation/valueOf name)))

