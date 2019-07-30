(ns com.microsoft.azure.storage.blob.StandardBlobTier
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob StandardBlobTier]))

(def UNKNOWN
  "Enum Constant.

  The tier is not recognized by this version of the library.

  type: com.microsoft.azure.storage.blob.StandardBlobTier"
  StandardBlobTier/UNKNOWN)

(def HOT
  "Enum Constant.

  The tier is hot storage.

  type: com.microsoft.azure.storage.blob.StandardBlobTier"
  StandardBlobTier/HOT)

(def COOL
  "Enum Constant.

  The tier is cool storage.

  type: com.microsoft.azure.storage.blob.StandardBlobTier"
  StandardBlobTier/COOL)

(def ARCHIVE
  "Enum Constant.

  The tier is archive storage.

  type: com.microsoft.azure.storage.blob.StandardBlobTier"
  StandardBlobTier/ARCHIVE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (StandardBlobTier c : StandardBlobTier.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.blob.StandardBlobTier[]`"
  ([]
    (StandardBlobTier/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.blob.StandardBlobTier`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.blob.StandardBlobTier [^java.lang.String name]
    (StandardBlobTier/valueOf name)))

