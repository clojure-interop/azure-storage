(ns com.microsoft.azure.storage.blob.BlobContainerProperties
  "Represents the system properties for a container."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob BlobContainerProperties]))

(defn ->blob-container-properties
  "Constructor."
  (^BlobContainerProperties []
    (new BlobContainerProperties )))

(defn get-etag
  "Gets the ETag value of the container.

   The ETag value is a unique identifier that is updated when a write operation is performed against the container.
   It may be used to perform operations conditionally, providing concurrency control and improved efficiency.

   The AccessCondition.generateIfMatchCondition(String) and
   AccessCondition.generateIfNoneMatchCondition(String) methods take an ETag value and return an
   AccessCondition object that may be specified on the request.

  returns: A String which represents the ETag. - `java.lang.String`"
  (^java.lang.String [^BlobContainerProperties this]
    (-> this (.getEtag))))

(defn has-immutability-policy?
  "Gets the hasImmutabilityPolicy value of the container.

  returns: A Boolean which represents the hasImmutabilityPolicy value. - `java.lang.Boolean`"
  (^java.lang.Boolean [^BlobContainerProperties this]
    (-> this (.hasImmutabilityPolicy))))

(defn has-legal-hold?
  "Gets the hasLegalHold value of the container.

  returns: A Boolean which represents the hasLegalHold value. - `java.lang.Boolean`"
  (^java.lang.Boolean [^BlobContainerProperties this]
    (-> this (.hasLegalHold))))

(defn get-last-modified
  "Gets the last modified time on the container.

  returns: A java.util.Date object which represents the last modified time. - `java.util.Date`"
  (^java.util.Date [^BlobContainerProperties this]
    (-> this (.getLastModified))))

(defn get-lease-status
  "Gets the lease status of the container.

  returns: A LeaseStatus object which represents the lease status of the container. - `com.microsoft.azure.storage.blob.LeaseStatus`"
  (^com.microsoft.azure.storage.blob.LeaseStatus [^BlobContainerProperties this]
    (-> this (.getLeaseStatus))))

(defn get-lease-state
  "Gets the lease state of the container.

  returns: A LeaseState object which represents the lease state of the container. - `com.microsoft.azure.storage.blob.LeaseState`"
  (^com.microsoft.azure.storage.blob.LeaseState [^BlobContainerProperties this]
    (-> this (.getLeaseState))))

(defn get-lease-duration
  "Gets the lease duration of the container.

  returns: A LeaseDuration object which represents the lease duration of the container. - `com.microsoft.azure.storage.blob.LeaseDuration`"
  (^com.microsoft.azure.storage.blob.LeaseDuration [^BlobContainerProperties this]
    (-> this (.getLeaseDuration))))

(defn get-public-access
  "Gets the public access level for the container.
   This field should only be set using the container's create method or
   uploadPermissions method.

  returns: A BlobContainerPublicAccessType that specifies the level of public access
   that is allowed on the container. - `com.microsoft.azure.storage.blob.BlobContainerPublicAccessType`"
  (^com.microsoft.azure.storage.blob.BlobContainerPublicAccessType [^BlobContainerProperties this]
    (-> this (.getPublicAccess))))

