(ns com.microsoft.azure.storage.ResultContinuationType
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage ResultContinuationType]))

(def NONE
  "Enum Constant.

  Specifies no continuation.

  type: com.microsoft.azure.storage.ResultContinuationType"
  ResultContinuationType/NONE)

(def BLOB
  "Enum Constant.

  Specifies the token is a blob listing continuation token.

  type: com.microsoft.azure.storage.ResultContinuationType"
  ResultContinuationType/BLOB)

(def CONTAINER
  "Enum Constant.

  Specifies the token is a container listing continuation token.

  type: com.microsoft.azure.storage.ResultContinuationType"
  ResultContinuationType/CONTAINER)

(def FILE
  "Enum Constant.

  Specifies the token is a file listing continuation token.

  type: com.microsoft.azure.storage.ResultContinuationType"
  ResultContinuationType/FILE)

(def QUEUE
  "Enum Constant.

  Specifies the token is a queue listing continuation token (reserved for future use).

  type: com.microsoft.azure.storage.ResultContinuationType"
  ResultContinuationType/QUEUE)

(def TABLE
  "Enum Constant.

  Specifies the token is a table query continuation token (reserved for future use).

  type: com.microsoft.azure.storage.ResultContinuationType"
  ResultContinuationType/TABLE)

(def SHARE
  "Enum Constant.

  Specifies the token is a share listing continuation token.

  type: com.microsoft.azure.storage.ResultContinuationType"
  ResultContinuationType/SHARE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ResultContinuationType c : ResultContinuationType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.ResultContinuationType[]`"
  ([]
    (ResultContinuationType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.ResultContinuationType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.ResultContinuationType [^java.lang.String name]
    (ResultContinuationType/valueOf name)))

