(ns com.microsoft.azure.storage.table.SharedAccessTablePermissions
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.table SharedAccessTablePermissions]))

(def NONE
  "Enum Constant.

  No shared access granted.

  type: com.microsoft.azure.storage.table.SharedAccessTablePermissions"
  SharedAccessTablePermissions/NONE)

(def QUERY
  "Enum Constant.

  Permission to query entities granted.

  type: com.microsoft.azure.storage.table.SharedAccessTablePermissions"
  SharedAccessTablePermissions/QUERY)

(def ADD
  "Enum Constant.

  Permission to add entities granted.

  type: com.microsoft.azure.storage.table.SharedAccessTablePermissions"
  SharedAccessTablePermissions/ADD)

(def UPDATE
  "Enum Constant.

  Permission to modify entities granted.

  type: com.microsoft.azure.storage.table.SharedAccessTablePermissions"
  SharedAccessTablePermissions/UPDATE)

(def DELETE
  "Enum Constant.

  Permission to delete entities granted.

  type: com.microsoft.azure.storage.table.SharedAccessTablePermissions"
  SharedAccessTablePermissions/DELETE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (SharedAccessTablePermissions c : SharedAccessTablePermissions.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.table.SharedAccessTablePermissions[]`"
  ([]
    (SharedAccessTablePermissions/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.table.SharedAccessTablePermissions`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.table.SharedAccessTablePermissions [^java.lang.String name]
    (SharedAccessTablePermissions/valueOf name)))

