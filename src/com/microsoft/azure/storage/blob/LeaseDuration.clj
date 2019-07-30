(ns com.microsoft.azure.storage.blob.LeaseDuration
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob LeaseDuration]))

(def UNSPECIFIED
  "Enum Constant.

  The lease duration is not specified.

  type: com.microsoft.azure.storage.blob.LeaseDuration"
  LeaseDuration/UNSPECIFIED)

(def FIXED
  "Enum Constant.

  The lease duration is finite.

  type: com.microsoft.azure.storage.blob.LeaseDuration"
  LeaseDuration/FIXED)

(def INFINITE
  "Enum Constant.

  The lease duration is infinite.

  type: com.microsoft.azure.storage.blob.LeaseDuration"
  LeaseDuration/INFINITE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (LeaseDuration c : LeaseDuration.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.blob.LeaseDuration[]`"
  ([]
    (LeaseDuration/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.blob.LeaseDuration`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.blob.LeaseDuration [^java.lang.String name]
    (LeaseDuration/valueOf name)))

