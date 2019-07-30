(ns com.microsoft.azure.storage.SharedAccessAccountResourceType
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage SharedAccessAccountResourceType]))

(def SERVICE
  "Enum Constant.

  Permission to access service level APIs granted.

  type: com.microsoft.azure.storage.SharedAccessAccountResourceType"
  SharedAccessAccountResourceType/SERVICE)

(def CONTAINER
  "Enum Constant.

  Permission to access container level APIs (Blob Containers, Tables, Queues, File Shares) granted.

  type: com.microsoft.azure.storage.SharedAccessAccountResourceType"
  SharedAccessAccountResourceType/CONTAINER)

(def OBJECT
  "Enum Constant.

  Permission to access object level APIs (Blobs, Table Entities, Queue Messages, Files) granted.

  type: com.microsoft.azure.storage.SharedAccessAccountResourceType"
  SharedAccessAccountResourceType/OBJECT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (SharedAccessAccountResourceType c : SharedAccessAccountResourceType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.SharedAccessAccountResourceType[]`"
  ([]
    (SharedAccessAccountResourceType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.SharedAccessAccountResourceType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.SharedAccessAccountResourceType [^java.lang.String name]
    (SharedAccessAccountResourceType/valueOf name)))

