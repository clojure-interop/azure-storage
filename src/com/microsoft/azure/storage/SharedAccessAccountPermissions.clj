(ns com.microsoft.azure.storage.SharedAccessAccountPermissions
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage SharedAccessAccountPermissions]))

(def READ
  "Enum Constant.

  Permission to read resources and list queues and tables granted.

  type: com.microsoft.azure.storage.SharedAccessAccountPermissions"
  SharedAccessAccountPermissions/READ)

(def ADD
  "Enum Constant.

  Permission to add messages, table entities, and append to blobs granted.

  type: com.microsoft.azure.storage.SharedAccessAccountPermissions"
  SharedAccessAccountPermissions/ADD)

(def CREATE
  "Enum Constant.

  Permission to create blobs and files granted.

  type: com.microsoft.azure.storage.SharedAccessAccountPermissions"
  SharedAccessAccountPermissions/CREATE)

(def WRITE
  "Enum Constant.

  Permission to write resources granted.

  type: com.microsoft.azure.storage.SharedAccessAccountPermissions"
  SharedAccessAccountPermissions/WRITE)

(def DELETE
  "Enum Constant.

  Permission to delete resources granted.

  type: com.microsoft.azure.storage.SharedAccessAccountPermissions"
  SharedAccessAccountPermissions/DELETE)

(def LIST
  "Enum Constant.

  Permission to list blob containers, blobs, shares, directories, and files granted.

  type: com.microsoft.azure.storage.SharedAccessAccountPermissions"
  SharedAccessAccountPermissions/LIST)

(def UPDATE
  "Enum Constant.

  Permissions to update messages and table entities granted.

  type: com.microsoft.azure.storage.SharedAccessAccountPermissions"
  SharedAccessAccountPermissions/UPDATE)

(def PROCESS_MESSAGES
  "Enum Constant.

  Permission to get and delete messages granted.

  type: com.microsoft.azure.storage.SharedAccessAccountPermissions"
  SharedAccessAccountPermissions/PROCESS_MESSAGES)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (SharedAccessAccountPermissions c : SharedAccessAccountPermissions.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.SharedAccessAccountPermissions[]`"
  ([]
    (SharedAccessAccountPermissions/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.SharedAccessAccountPermissions`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.SharedAccessAccountPermissions [^java.lang.String name]
    (SharedAccessAccountPermissions/valueOf name)))

