(ns com.microsoft.azure.storage.analytics.StorageService
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.analytics StorageService]))

(def BLOB
  "Enum Constant.

  Blob service.

  type: com.microsoft.azure.storage.analytics.StorageService"
  StorageService/BLOB)

(def FILE
  "Enum Constant.

  File service.

  type: com.microsoft.azure.storage.analytics.StorageService"
  StorageService/FILE)

(def QUEUE
  "Enum Constant.

  Queue Service.

  type: com.microsoft.azure.storage.analytics.StorageService"
  StorageService/QUEUE)

(def TABLE
  "Enum Constant.

  Table Service.

  type: com.microsoft.azure.storage.analytics.StorageService"
  StorageService/TABLE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (StorageService c : StorageService.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.analytics.StorageService[]`"
  ([]
    (StorageService/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.analytics.StorageService`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.analytics.StorageService [^java.lang.String name]
    (StorageService/valueOf name)))

