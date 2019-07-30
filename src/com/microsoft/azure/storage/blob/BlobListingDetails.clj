(ns com.microsoft.azure.storage.blob.BlobListingDetails
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob BlobListingDetails]))

(def SNAPSHOTS
  "Enum Constant.

  Specifies listing committed blobs and blob snapshots.

  type: com.microsoft.azure.storage.blob.BlobListingDetails"
  BlobListingDetails/SNAPSHOTS)

(def METADATA
  "Enum Constant.

  Specifies listing blob metadata for each blob returned in the listing.

  type: com.microsoft.azure.storage.blob.BlobListingDetails"
  BlobListingDetails/METADATA)

(def UNCOMMITTED_BLOBS
  "Enum Constant.

  Specifies listing uncommitted blobs.

  type: com.microsoft.azure.storage.blob.BlobListingDetails"
  BlobListingDetails/UNCOMMITTED_BLOBS)

(def COPY
  "Enum Constant.

  Include copy properties in the listing.

  type: com.microsoft.azure.storage.blob.BlobListingDetails"
  BlobListingDetails/COPY)

(def DELETED
  "Enum Constant.

  Specifies that soft deleted blobs which are retained by the service should be included in the response.

  type: com.microsoft.azure.storage.blob.BlobListingDetails"
  BlobListingDetails/DELETED)

(defn value
  "Instance Field.

  Returns the value of this enum.

  type: int"
  (^Integer [^BlobListingDetails this]
    (-> this .-value)))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlobListingDetails c : BlobListingDetails.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.blob.BlobListingDetails[]`"
  ([]
    (BlobListingDetails/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.blob.BlobListingDetails`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.blob.BlobListingDetails [^java.lang.String name]
    (BlobListingDetails/valueOf name)))

