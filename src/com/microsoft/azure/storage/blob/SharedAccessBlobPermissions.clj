(ns com.microsoft.azure.storage.blob.SharedAccessBlobPermissions
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob SharedAccessBlobPermissions]))

(def READ
  "Enum Constant.

  Specifies Read access granted.

  type: com.microsoft.azure.storage.blob.SharedAccessBlobPermissions"
  SharedAccessBlobPermissions/READ)

(def ADD
  "Enum Constant.

  Specifies Add access granted.

  type: com.microsoft.azure.storage.blob.SharedAccessBlobPermissions"
  SharedAccessBlobPermissions/ADD)

(def CREATE
  "Enum Constant.

  Specifies Create access granted.

  type: com.microsoft.azure.storage.blob.SharedAccessBlobPermissions"
  SharedAccessBlobPermissions/CREATE)

(def WRITE
  "Enum Constant.

  Specifies Write access granted.

  type: com.microsoft.azure.storage.blob.SharedAccessBlobPermissions"
  SharedAccessBlobPermissions/WRITE)

(def DELETE
  "Enum Constant.

  Specifies Delete access granted.

  type: com.microsoft.azure.storage.blob.SharedAccessBlobPermissions"
  SharedAccessBlobPermissions/DELETE)

(def LIST
  "Enum Constant.

  Specifies List access granted.

  type: com.microsoft.azure.storage.blob.SharedAccessBlobPermissions"
  SharedAccessBlobPermissions/LIST)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (SharedAccessBlobPermissions c : SharedAccessBlobPermissions.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.blob.SharedAccessBlobPermissions[]`"
  ([]
    (SharedAccessBlobPermissions/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.blob.SharedAccessBlobPermissions`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.blob.SharedAccessBlobPermissions [^java.lang.String name]
    (SharedAccessBlobPermissions/valueOf name)))

