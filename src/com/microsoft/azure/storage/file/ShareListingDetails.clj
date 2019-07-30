(ns com.microsoft.azure.storage.file.ShareListingDetails
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.file ShareListingDetails]))

(def NONE
  "Enum Constant.

  Specifies including no additional details.

  type: com.microsoft.azure.storage.file.ShareListingDetails"
  ShareListingDetails/NONE)

(def METADATA
  "Enum Constant.

  Specifies including share metadata.

  type: com.microsoft.azure.storage.file.ShareListingDetails"
  ShareListingDetails/METADATA)

(def SNAPSHOTS
  "Enum Constant.

  Specifies listing share snapshots.

  type: com.microsoft.azure.storage.file.ShareListingDetails"
  ShareListingDetails/SNAPSHOTS)

(defn value
  "Instance Field.

  Returns the value of this enum.

  type: int"
  (^Integer [^ShareListingDetails this]
    (-> this .-value)))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ShareListingDetails c : ShareListingDetails.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.file.ShareListingDetails[]`"
  ([]
    (ShareListingDetails/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.file.ShareListingDetails`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.file.ShareListingDetails [^java.lang.String name]
    (ShareListingDetails/valueOf name)))

