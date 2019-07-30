(ns com.microsoft.azure.storage.blob.BlockSearchMode
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob BlockSearchMode]))

(def COMMITTED
  "Enum Constant.

  Specifies searching only the committed block list.

  type: com.microsoft.azure.storage.blob.BlockSearchMode"
  BlockSearchMode/COMMITTED)

(def UNCOMMITTED
  "Enum Constant.

  Specifies searching only the uncommitted block list.

  type: com.microsoft.azure.storage.blob.BlockSearchMode"
  BlockSearchMode/UNCOMMITTED)

(def LATEST
  "Enum Constant.

  Specifies searching the uncommitted block list first, and if the block is not found, then search the committed
   block list.

  type: com.microsoft.azure.storage.blob.BlockSearchMode"
  BlockSearchMode/LATEST)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockSearchMode c : BlockSearchMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.blob.BlockSearchMode[]`"
  ([]
    (BlockSearchMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.blob.BlockSearchMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.blob.BlockSearchMode [^java.lang.String name]
    (BlockSearchMode/valueOf name)))

