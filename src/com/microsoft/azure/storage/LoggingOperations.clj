(ns com.microsoft.azure.storage.LoggingOperations
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage LoggingOperations]))

(def READ
  "Enum Constant.

  Log Read Operations.

  type: com.microsoft.azure.storage.LoggingOperations"
  LoggingOperations/READ)

(def WRITE
  "Enum Constant.

  Log Write Operations.

  type: com.microsoft.azure.storage.LoggingOperations"
  LoggingOperations/WRITE)

(def DELETE
  "Enum Constant.

  Log Delete Operations.

  type: com.microsoft.azure.storage.LoggingOperations"
  LoggingOperations/DELETE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (LoggingOperations c : LoggingOperations.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.LoggingOperations[]`"
  ([]
    (LoggingOperations/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.LoggingOperations`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.LoggingOperations [^java.lang.String name]
    (LoggingOperations/valueOf name)))

