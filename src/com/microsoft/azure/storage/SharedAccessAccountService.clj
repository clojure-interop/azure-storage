(ns com.microsoft.azure.storage.SharedAccessAccountService
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage SharedAccessAccountService]))

(def BLOB
  "Enum Constant.

  Permission to access blob resources granted.

  type: com.microsoft.azure.storage.SharedAccessAccountService"
  SharedAccessAccountService/BLOB)

(def FILE
  "Enum Constant.

  Permission to access file resources granted.

  type: com.microsoft.azure.storage.SharedAccessAccountService"
  SharedAccessAccountService/FILE)

(def QUEUE
  "Enum Constant.

  Permission to access queue resources granted.

  type: com.microsoft.azure.storage.SharedAccessAccountService"
  SharedAccessAccountService/QUEUE)

(def TABLE
  "Enum Constant.

  Permission to access table resources granted.

  type: com.microsoft.azure.storage.SharedAccessAccountService"
  SharedAccessAccountService/TABLE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (SharedAccessAccountService c : SharedAccessAccountService.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.SharedAccessAccountService[]`"
  ([]
    (SharedAccessAccountService/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.SharedAccessAccountService`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.SharedAccessAccountService [^java.lang.String name]
    (SharedAccessAccountService/valueOf name)))

