(ns com.microsoft.azure.storage.file.SharedAccessFilePermissions
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.file SharedAccessFilePermissions]))

(def READ
  "Enum Constant.

  Specifies Read access granted.

  type: com.microsoft.azure.storage.file.SharedAccessFilePermissions"
  SharedAccessFilePermissions/READ)

(def CREATE
  "Enum Constant.

  Specifies Create access granted.

  type: com.microsoft.azure.storage.file.SharedAccessFilePermissions"
  SharedAccessFilePermissions/CREATE)

(def WRITE
  "Enum Constant.

  Specifies Write access granted.

  type: com.microsoft.azure.storage.file.SharedAccessFilePermissions"
  SharedAccessFilePermissions/WRITE)

(def DELETE
  "Enum Constant.

  Specifies Delete access granted.

  type: com.microsoft.azure.storage.file.SharedAccessFilePermissions"
  SharedAccessFilePermissions/DELETE)

(def LIST
  "Enum Constant.

  Specifies List access granted.

  type: com.microsoft.azure.storage.file.SharedAccessFilePermissions"
  SharedAccessFilePermissions/LIST)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (SharedAccessFilePermissions c : SharedAccessFilePermissions.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.file.SharedAccessFilePermissions[]`"
  ([]
    (SharedAccessFilePermissions/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.file.SharedAccessFilePermissions`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.file.SharedAccessFilePermissions [^java.lang.String name]
    (SharedAccessFilePermissions/valueOf name)))

