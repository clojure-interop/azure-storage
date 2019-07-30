(ns com.microsoft.azure.storage.blob.BlobType
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob BlobType]))

(def UNSPECIFIED
  "Enum Constant.

  Specifies the blob type is not specified.

  type: com.microsoft.azure.storage.blob.BlobType"
  BlobType/UNSPECIFIED)

(def BLOCK_BLOB
  "Enum Constant.

  Specifies the blob is a block blob.

  type: com.microsoft.azure.storage.blob.BlobType"
  BlobType/BLOCK_BLOB)

(def PAGE_BLOB
  "Enum Constant.

  Specifies the blob is a page blob.

  type: com.microsoft.azure.storage.blob.BlobType"
  BlobType/PAGE_BLOB)

(def APPEND_BLOB
  "Enum Constant.

  Specifies the blob is an append blob.

  type: com.microsoft.azure.storage.blob.BlobType"
  BlobType/APPEND_BLOB)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlobType c : BlobType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.blob.BlobType[]`"
  ([]
    (BlobType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.blob.BlobType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.blob.BlobType [^java.lang.String name]
    (BlobType/valueOf name)))

