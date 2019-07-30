(ns com.microsoft.azure.storage.blob.BlobProperties
  "Represents the system properties for a blob."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob BlobProperties]))

(defn ->blob-properties
  "Constructor.

  Creates an instance of the BlobProperties class by copying values from another instance of the
   BlobProperties class.

  other - A BlobProperties object which represents the blob properties to copy. - `com.microsoft.azure.storage.blob.BlobProperties`"
  (^BlobProperties [^com.microsoft.azure.storage.blob.BlobProperties other]
    (new BlobProperties other))
  (^BlobProperties []
    (new BlobProperties )))

(defn set-content-encoding
  "Sets the content encoding value for the blob.

  content-encoding - A String which specifies the content encoding value to set. - `java.lang.String`"
  ([^BlobProperties this ^java.lang.String content-encoding]
    (-> this (.setContentEncoding content-encoding))))

(defn set-cache-control
  "Sets the cache control value for the blob.

  cache-control - A String which specifies the cache control value to set. - `java.lang.String`"
  ([^BlobProperties this ^java.lang.String cache-control]
    (-> this (.setCacheControl cache-control))))

(defn get-rehydration-status
  "The rehydration status if the blob is being rehydrated
   and the tier of the blob once the rehydration from archive has completed.

  returns: `com.microsoft.azure.storage.blob.RehydrationStatus`"
  (^com.microsoft.azure.storage.blob.RehydrationStatus [^BlobProperties this]
    (-> this (.getRehydrationStatus))))

(defn get-premium-page-blob-tier
  "If using a premium account and the blob is a page blob, gets the tier of the blob.

  returns: A PremiumPageBlobTier object which represents the tier of the blob
   or null if the tier has not been set. - `com.microsoft.azure.storage.blob.PremiumPageBlobTier`"
  (^com.microsoft.azure.storage.blob.PremiumPageBlobTier [^BlobProperties this]
    (-> this (.getPremiumPageBlobTier))))

(defn get-deleted-time
  "Gets the time when the blob was deleted.

  returns: A Date object which represents the time when the blob was deleted. It returns null if the blob has not been deleted. - `java.util.Date`"
  (^java.util.Date [^BlobProperties this]
    (-> this (.getDeletedTime))))

(defn set-content-type
  "Sets the content type value for the blob.

  content-type - A String which specifies the content type value to set. - `java.lang.String`"
  ([^BlobProperties this ^java.lang.String content-type]
    (-> this (.setContentType content-type))))

(defn get-copy-state
  "Gets the blob's copy state.

  returns: A CopyState object which represents the copy state of the blob. - `com.microsoft.azure.storage.blob.CopyState`"
  (^com.microsoft.azure.storage.blob.CopyState [^BlobProperties this]
    (-> this (.getCopyState))))

(defn get-page-blob-sequence-number
  "If the blob is a page blob, gets the page blob's current sequence number.

  returns: A Long containing the page blob's current sequence number. - `java.lang.Long`"
  (^java.lang.Long [^BlobProperties this]
    (-> this (.getPageBlobSequenceNumber))))

(defn get-standard-blob-tier
  "If using a standard account and the blob is a block blob, gets the tier of the blob.

  returns: A StandardBlobTier object which represents the tier of the blob
   or null if the tier has not been set. - `com.microsoft.azure.storage.blob.StandardBlobTier`"
  (^com.microsoft.azure.storage.blob.StandardBlobTier [^BlobProperties this]
    (-> this (.getStandardBlobTier))))

(defn get-content-encoding
  "Gets the content encoding value for the blob.

  returns: A String which represents the content encoding, or null if content encoding has not been set
           on the blob. - `java.lang.String`"
  (^java.lang.String [^BlobProperties this]
    (-> this (.getContentEncoding))))

(defn get-remaining-retention-days
  "Gets the number of days that the deleted blob will be kept by the service.

  returns: A Integer value that represents the number of days that the deleted blob will be kept by the service. - `java.lang.Integer`"
  (^java.lang.Integer [^BlobProperties this]
    (-> this (.getRemainingRetentionDays))))

(defn blob-tier-inferred?
  "Gets a value indicating if the tier of the blob has been inferred.

  returns: A Boolean object which represents if the blob tier was inferred. - `java.lang.Boolean`"
  (^java.lang.Boolean [^BlobProperties this]
    (-> this (.isBlobTierInferred))))

(defn get-content-type
  "Gets the content type value for the blob.

  returns: A String which represents the content type, or null if the content type has not be set for the blob. - `java.lang.String`"
  (^java.lang.String [^BlobProperties this]
    (-> this (.getContentType))))

(defn get-last-modified
  "Gets the last modified time for the blob.

  returns: A Date object which represents the last modified time. - `java.util.Date`"
  (^java.util.Date [^BlobProperties this]
    (-> this (.getLastModified))))

(defn get-content-language
  "Gets the content language value for the blob.

  returns: A String which represents the content language, or null if content language has not been set on
           the blob. - `java.lang.String`"
  (^java.lang.String [^BlobProperties this]
    (-> this (.getContentLanguage))))

(defn get-created-time
  "Gets the time when the blob was created.

  returns: A Date object which represents the time when the blob was created. - `java.util.Date`"
  (^java.util.Date [^BlobProperties this]
    (-> this (.getCreatedTime))))

(defn get-cache-control
  "Gets the cache control value for the blob.

  returns: A String which represents the content cache control value for the blob. - `java.lang.String`"
  (^java.lang.String [^BlobProperties this]
    (-> this (.getCacheControl))))

(defn get-lease-duration
  "Gets the lease duration for the blob.

  returns: A LeaseDuration object which represents the lease duration. - `com.microsoft.azure.storage.blob.LeaseDuration`"
  (^com.microsoft.azure.storage.blob.LeaseDuration [^BlobProperties this]
    (-> this (.getLeaseDuration))))

(defn get-etag
  "Gets the ETag value for the blob.

   The ETag value is a unique identifier that is updated when a write operation is performed against the container.
   It may be used to perform operations conditionally, providing concurrency control and improved efficiency.

   The AccessCondition.generateIfMatchCondition(String) and
   AccessCondition.generateIfNoneMatchCondition(String) methods take an ETag value and return an
   AccessCondition object that may be specified on the request.

  returns: A String which represents the ETag value. - `java.lang.String`"
  (^java.lang.String [^BlobProperties this]
    (-> this (.getEtag))))

(defn set-content-language
  "Sets the content language for the blob.

  content-language - A String which specifies the content language value to set. - `java.lang.String`"
  ([^BlobProperties this ^java.lang.String content-language]
    (-> this (.setContentLanguage content-language))))

(defn get-lease-status
  "Gets the lease status for the blob.

  returns: A LeaseStatus object which represents the lease status. - `com.microsoft.azure.storage.blob.LeaseStatus`"
  (^com.microsoft.azure.storage.blob.LeaseStatus [^BlobProperties this]
    (-> this (.getLeaseStatus))))

(defn get-append-blob-committed-block-count
  "If the blob is an append blob, gets the number of committed blocks.

  returns: A Integer value that represents the number of committed blocks. - `java.lang.Integer`"
  (^java.lang.Integer [^BlobProperties this]
    (-> this (.getAppendBlobCommittedBlockCount))))

(defn get-length
  "Gets the size, in bytes, of the blob.

  returns: A long which represents the length of the blob. - `long`"
  (^Long [^BlobProperties this]
    (-> this (.getLength))))

(defn set-content-md-5
  "Sets the content MD5 value for the blob.

  content-md-5 - A String which specifies the content MD5 value to set. - `java.lang.String`"
  ([^BlobProperties this ^java.lang.String content-md-5]
    (-> this (.setContentMD5 content-md-5))))

(defn set-content-disposition
  "Sets the content disposition value for the blob.

  content-disposition - A String which specifies the content disposition value to set. - `java.lang.String`"
  ([^BlobProperties this ^java.lang.String content-disposition]
    (-> this (.setContentDisposition content-disposition))))

(defn server-encrypted?
  "Gets the blob's server-side encryption status;

  returns: A boolean which specifies the blob's encryption status. - `boolean`"
  (^Boolean [^BlobProperties this]
    (-> this (.isServerEncrypted))))

(defn get-content-md-5
  "Gets the content MD5 value for the blob.

  returns: A String which represents the content MD5 value. - `java.lang.String`"
  (^java.lang.String [^BlobProperties this]
    (-> this (.getContentMD5))))

(defn get-tier-change-time
  "Gets a value indicating the last time the tier was changed on the blob.

  returns: A Date object which represents the last time the tier was changed. - `java.util.Date`"
  (^java.util.Date [^BlobProperties this]
    (-> this (.getTierChangeTime))))

(defn get-blob-type
  "Gets the blob type for the blob.

  returns: A BlobType value that represents the blob type. - `com.microsoft.azure.storage.blob.BlobType`"
  (^com.microsoft.azure.storage.blob.BlobType [^BlobProperties this]
    (-> this (.getBlobType))))

(defn get-content-disposition
  "Gets the content disposition value for the blob.

  returns: A String which represents the content disposition, or null if content disposition has not been set
           on the blob. - `java.lang.String`"
  (^java.lang.String [^BlobProperties this]
    (-> this (.getContentDisposition))))

(defn incremental-copy?
  "Gets if the blob is an incremental copy

  returns: A boolean which specifies if the blob is an incremental copy. - `boolean`"
  (^Boolean [^BlobProperties this]
    (-> this (.isIncrementalCopy))))

(defn get-lease-state
  "Gets the lease state for the blob.

  returns: A LeaseState object which represents the lease state. - `com.microsoft.azure.storage.blob.LeaseState`"
  (^com.microsoft.azure.storage.blob.LeaseState [^BlobProperties this]
    (-> this (.getLeaseState))))

