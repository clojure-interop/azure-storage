(ns com.microsoft.azure.storage.blob.BlobContainerPublicAccessType
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob BlobContainerPublicAccessType]))

(def BLOB
  "Enum Constant.

  Specifies blob-level public access. Clients can read the content and metadata of blobs within this container, but
   cannot read container metadata or list the blobs within the container.

  type: com.microsoft.azure.storage.blob.BlobContainerPublicAccessType"
  BlobContainerPublicAccessType/BLOB)

(def CONTAINER
  "Enum Constant.

  Specifies container-level public access. Clients can read blob content and metadata and container metadata, and
   can list the blobs within the container.

  type: com.microsoft.azure.storage.blob.BlobContainerPublicAccessType"
  BlobContainerPublicAccessType/CONTAINER)

(def OFF
  "Enum Constant.

  Specifies no public access. Only the account owner can access resources in this container.

  type: com.microsoft.azure.storage.blob.BlobContainerPublicAccessType"
  BlobContainerPublicAccessType/OFF)

(def UNKNOWN
  "Enum Constant.

  Specifies that the public access type is unknown.

  type: com.microsoft.azure.storage.blob.BlobContainerPublicAccessType"
  BlobContainerPublicAccessType/UNKNOWN)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlobContainerPublicAccessType c : BlobContainerPublicAccessType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.blob.BlobContainerPublicAccessType[]`"
  ([]
    (BlobContainerPublicAccessType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.blob.BlobContainerPublicAccessType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.blob.BlobContainerPublicAccessType [^java.lang.String name]
    (BlobContainerPublicAccessType/valueOf name)))

