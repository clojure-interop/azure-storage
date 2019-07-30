(ns com.microsoft.azure.storage.queue.SharedAccessQueuePermissions
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.queue SharedAccessQueuePermissions]))

(def NONE
  "Enum Constant.

  No shared access granted.

  type: com.microsoft.azure.storage.queue.SharedAccessQueuePermissions"
  SharedAccessQueuePermissions/NONE)

(def READ
  "Enum Constant.

  Permission to peek messages and get queue metadata granted.

  type: com.microsoft.azure.storage.queue.SharedAccessQueuePermissions"
  SharedAccessQueuePermissions/READ)

(def ADD
  "Enum Constant.

  Permission to add messages granted.

  type: com.microsoft.azure.storage.queue.SharedAccessQueuePermissions"
  SharedAccessQueuePermissions/ADD)

(def UPDATE
  "Enum Constant.

  Permissions to update messages granted.

  type: com.microsoft.azure.storage.queue.SharedAccessQueuePermissions"
  SharedAccessQueuePermissions/UPDATE)

(def PROCESSMESSAGES
  "Enum Constant.

  Permission to get and delete messages granted.

  type: com.microsoft.azure.storage.queue.SharedAccessQueuePermissions"
  SharedAccessQueuePermissions/PROCESSMESSAGES)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (SharedAccessQueuePermissions c : SharedAccessQueuePermissions.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.queue.SharedAccessQueuePermissions[]`"
  ([]
    (SharedAccessQueuePermissions/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.queue.SharedAccessQueuePermissions`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.queue.SharedAccessQueuePermissions [^java.lang.String name]
    (SharedAccessQueuePermissions/valueOf name)))

