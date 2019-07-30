(ns com.microsoft.azure.storage.blob.BlobRequestOptions
  "Represents a set of options that may be specified on a request."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob BlobRequestOptions]))

(defn ->blob-request-options
  "Constructor.

  Creates an instance of the BlobRequestOptions class by copying values from another
   BlobRequestOptions instance.

  other - A BlobRequestOptions object which represents the blob request options to copy. - `com.microsoft.azure.storage.blob.BlobRequestOptions`"
  (^BlobRequestOptions [^com.microsoft.azure.storage.blob.BlobRequestOptions other]
    (new BlobRequestOptions other))
  (^BlobRequestOptions []
    (new BlobRequestOptions )))

(defn set-encryption-policy
  "Sets the BlobEncryptionPolicy object to use for this request.

   The default BlobEncryptionPolicy is set in the client and is by default null, indicating no encryption. You can
   change the BlobEncryptionPolicy on this request by setting this property. You can also change the value on the
   ServiceClient.getDefaultRequestOptions() object so that all subsequent requests made via the service
   client will use that BlobEncryptionPolicy.

  encryption-policy - the BlobEncryptionPolicy object to use when making service requests. - `com.microsoft.azure.storage.blob.BlobEncryptionPolicy`"
  ([^BlobRequestOptions this ^com.microsoft.azure.storage.blob.BlobEncryptionPolicy encryption-policy]
    (-> this (.setEncryptionPolicy encryption-policy))))

(defn set-absorb-conditional-errors-on-retry
  "Sets whether a conditional failure should be absorbed on a retry attempt for the request. This option
   is only used by CloudAppendBlob in upload and openWrite methods. By default, it is set to
   false. Set this to true only for single writer scenario.

   You can change the absorbConditionalErrorsOnRetry value on this request by setting this property. You can also
   change the value on the CloudBlobClient.getDefaultRequestOptions() object so that all subsequent requests
   made via the service client will use that absorbConditionalErrorsOnRetry value.

  absorb-conditional-errors-on-retry - the absorbConditionalErrorsOnRetry to set - `java.lang.Boolean`"
  ([^BlobRequestOptions this ^java.lang.Boolean absorb-conditional-errors-on-retry]
    (-> this (.setAbsorbConditionalErrorsOnRetry absorb-conditional-errors-on-retry))))

(defn get-absorb-conditional-errors-on-retry?
  "Indicates whether a conditional failure should be absorbed on a retry attempt for the request. For more
   information about absorb conditinal errors on retry defaults, see setAbsorbConditionalErrorsOnRetry(Boolean).

  returns: the absorbConditionalErrorsOnRetry - `java.lang.Boolean`"
  (^java.lang.Boolean [^BlobRequestOptions this]
    (-> this (.getAbsorbConditionalErrorsOnRetry))))

(defn get-use-transactional-content-md-5?
  "Gets whether a range PUT or GET operation will use the Content-MD5 header to enforce transactional security.
   All partial blob uploads or downloads will be restricted to 4 MB. For more information about transactional
   content MD5 defaults, see setUseTransactionalContentMD5(Boolean).

  returns: the useTransactionalContentMD5 - `java.lang.Boolean`"
  (^java.lang.Boolean [^BlobRequestOptions this]
    (-> this (.getUseTransactionalContentMD5))))

(defn set-use-transactional-content-md-5
  "Sets whether a range PUT or GET operation will use the Content-MD5 header to enforce transactional security.
   All partial blob uploads or downloads will be restricted to 4 MB.

   The default useTransactionalContentMD5 value is set in the client and is by default false. You can
   change the useTransactionalContentMD5 value on this request by setting this property. You can also change the
   value on the CloudBlobClient.getDefaultRequestOptions() object so that all subsequent requests made via
   the service client will use that useTransactionalContentMD5 value.

  use-transactional-content-md-5 - the useTransactionalContentMD5 to set - `java.lang.Boolean`"
  ([^BlobRequestOptions this ^java.lang.Boolean use-transactional-content-md-5]
    (-> this (.setUseTransactionalContentMD5 use-transactional-content-md-5))))

(defn get-single-blob-put-threshold-in-bytes
  "Gets the threshold size used for writing a single blob. For more information about the threshold size defaults,
   see setSingleBlobPutThresholdInBytes(Integer).

  returns: The maximum size, in bytes, of a blob that may be uploaded as a single blob, ranging from 1 to 64 MB
           inclusive. If a blob size is above the threshold, it will be uploaded as blocks. - `java.lang.Integer`"
  (^java.lang.Integer [^BlobRequestOptions this]
    (-> this (.getSingleBlobPutThresholdInBytes))))

(defn get-store-blob-content-md-5?
  "Gets whether the blob's ContentMD5 header should be set on uploads. This field is not supported for page
   blobs. For more information about storing blob content MD5 defaults, see setStoreBlobContentMD5(Boolean)
   .

  returns: the storeBlobContentMD5 - `java.lang.Boolean`"
  (^java.lang.Boolean [^BlobRequestOptions this]
    (-> this (.getStoreBlobContentMD5))))

(defn set-single-blob-put-threshold-in-bytes
  "Sets the threshold size used for writing a single blob to use.

   The default threshold size is set in the client and is by default 32MB. You can change the threshold size on this
   request by setting this property. You can also change the value on the
   CloudBlobClient.getDefaultRequestOptions() object so that all subsequent requests made via the service
   client will use that threshold size.

  single-blob-put-threshold-in-bytes - The maximum size, in bytes, of a blob that may be uploaded as a single blob, ranging from 1 MB to 64 MB inclusive. If a blob size is above the threshold, it will be uploaded as blocks. - `java.lang.Integer`

  throws: java.lang.IllegalArgumentException - If minimumReadSize is less than 1 MB or greater than 64 MB."
  ([^BlobRequestOptions this ^java.lang.Integer single-blob-put-threshold-in-bytes]
    (-> this (.setSingleBlobPutThresholdInBytes single-blob-put-threshold-in-bytes))))

(defn set-store-blob-content-md-5
  "Sets whether the blob's ContentMD5 header should be set on uploads. This field is not supported for page
   blobs.

   The default storeBlobContentMD5 value is set in the client and is by default true for block blobs.
   You can change the storeBlobContentMD5 value on this request by setting this property. You can also change the
   value on the CloudBlobClient.getDefaultRequestOptions() object so that all subsequent requests made via
   the service client will use that storeBlobContentMD5 value.

  store-blob-content-md-5 - the storeBlobContentMD5 to set - `java.lang.Boolean`"
  ([^BlobRequestOptions this ^java.lang.Boolean store-blob-content-md-5]
    (-> this (.setStoreBlobContentMD5 store-blob-content-md-5))))

(defn get-disable-content-md-5-validation?
  "Gets whether download and BlobInputStream methods should ignore the blob's ContentMD5 header. For more
   information about disabling content MD5 validation defaults, see setDisableContentMD5Validation(Boolean)
   .

  returns: the disableContentMD5Validation - `java.lang.Boolean`"
  (^java.lang.Boolean [^BlobRequestOptions this]
    (-> this (.getDisableContentMD5Validation))))

(defn set-disable-content-md-5-validation
  "Sets whether download and BlobInputStream methods should ignore the blob's ContentMD5 header.

   The default disableContentMD5Validation value is set in the client and is by default false. You can
   change the disableContentMD5Validation value on this request by setting this property. You can also change the
   value on the CloudBlobClient.getDefaultRequestOptions() object so that all subsequent requests made via
   the service client will use that disableContentMD5Validation value.

  disable-content-md-5-validation - the disableContentMD5Validation to set - `java.lang.Boolean`"
  ([^BlobRequestOptions this ^java.lang.Boolean disable-content-md-5-validation]
    (-> this (.setDisableContentMD5Validation disable-content-md-5-validation))))

(defn get-encryption-policy
  "Gets the encryption policy to use for this request. For more information about the encryption policy defaults,
   see setEncryptionPolicy(BlobEncryptionPolicy).

  returns: An BlobEncryptionPolicy object that represents the current encryption policy. - `com.microsoft.azure.storage.blob.BlobEncryptionPolicy`"
  (^com.microsoft.azure.storage.blob.BlobEncryptionPolicy [^BlobRequestOptions this]
    (-> this (.getEncryptionPolicy))))

(defn get-concurrent-request-count
  "Gets the concurrent number of simultaneous requests per operation. For more information about concurrent request
   count defaults, see setConcurrentRequestCount(Integer).

  returns: the concurrentRequestCount - `java.lang.Integer`"
  (^java.lang.Integer [^BlobRequestOptions this]
    (-> this (.getConcurrentRequestCount))))

(defn set-concurrent-request-count
  "Sets the concurrent number of simultaneous requests per operation.

   The default concurrent request count is set in the client and is by default 1, indicating no concurrency. You can
   change the concurrent request count on this request by setting this property. You can also change the value on
   the CloudBlobClient.getDefaultRequestOptions() object so that all subsequent requests made via the
   service client will use that concurrent request count.

  concurrent-request-count - the concurrentRequestCount to set - `java.lang.Integer`"
  ([^BlobRequestOptions this ^java.lang.Integer concurrent-request-count]
    (-> this (.setConcurrentRequestCount concurrent-request-count))))

