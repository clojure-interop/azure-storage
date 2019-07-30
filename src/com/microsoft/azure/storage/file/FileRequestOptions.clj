(ns com.microsoft.azure.storage.file.FileRequestOptions
  "Represents a set of options that may be specified on a request."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.file FileRequestOptions]))

(defn ->file-request-options
  "Constructor.

  Creates an instance of the FileRequestOptions class by copying values from another
   FileRequestOptions instance.

  other - A FileRequestOptions object which represents the file request options to copy. - `com.microsoft.azure.storage.file.FileRequestOptions`"
  (^FileRequestOptions [^com.microsoft.azure.storage.file.FileRequestOptions other]
    (new FileRequestOptions other))
  (^FileRequestOptions []
    (new FileRequestOptions )))

(defn set-store-file-content-md-5
  "Sets whether the file's ContentMD5 header should be set on uploads.

   The default storeFileContentMD5 value is set in the client and is by default true. You can change
   the storeFileContentMD5 value on this request by setting this property. You can also change the value on the
   CloudFileClient.getDefaultRequestOptions() object so that all subsequent requests made via the service
   client will use that storeFileContentMD5 value.

  store-file-content-md-5 - the storeFileContentMD5 to set - `java.lang.Boolean`"
  ([^FileRequestOptions this ^java.lang.Boolean store-file-content-md-5]
    (-> this (.setStoreFileContentMD5 store-file-content-md-5))))

(defn get-use-transactional-content-md-5?
  "Gets whether a range PUT or GET operation will use the Content-MD5 header to enforce transactional security.
   All partial file uploads or downloads will be restricted to 4 MB. For more information about transactional
   content MD5 defaults, see setUseTransactionalContentMD5(Boolean).

  returns: the useTransactionalContentMD5 - `java.lang.Boolean`"
  (^java.lang.Boolean [^FileRequestOptions this]
    (-> this (.getUseTransactionalContentMD5))))

(defn set-require-encryption
  "Encryption is not supported for files.

  require-encryption - A value to indicate whether all data written and read must be encrypted. - `java.lang.Boolean`"
  ([^FileRequestOptions this ^java.lang.Boolean require-encryption]
    (-> this (.setRequireEncryption require-encryption))))

(defn set-use-transactional-content-md-5
  "Sets whether a range PUT or GET operation will use the Content-MD5 header to enforce transactional security.

   The default useTransactionalContentMD5 value is set in the client and is by default false. You can
   change the useTransactionalContentMD5 value on this request by setting this property. You can also change the
   value on the CloudFileClient.getDefaultRequestOptions() object so that all subsequent requests made via
   the service client will use that useTransactionalContentMD5 value.

  use-transactional-content-md-5 - the useTransactionalContentMD5 to set - `java.lang.Boolean`"
  ([^FileRequestOptions this ^java.lang.Boolean use-transactional-content-md-5]
    (-> this (.setUseTransactionalContentMD5 use-transactional-content-md-5))))

(defn get-disable-content-md-5-validation?
  "Gets whether download and FileInputStream methods should ignore the file's ContentMD5 header. For more
   information about disabling content MD5 validation defaults, see setDisableContentMD5Validation(Boolean)
   .

  returns: the disableContentMD5Validation - `java.lang.Boolean`"
  (^java.lang.Boolean [^FileRequestOptions this]
    (-> this (.getDisableContentMD5Validation))))

(defn get-store-file-content-md-5?
  "Gets whether the file's ContentMD5 header should be set on uploads. For more information about storing file
   content MD5 defaults, see setStoreFileContentMD5(Boolean) .

  returns: the storeFileContentMD5 - `java.lang.Boolean`"
  (^java.lang.Boolean [^FileRequestOptions this]
    (-> this (.getStoreFileContentMD5))))

(defn set-disable-content-md-5-validation
  "Sets whether download and FileInputStream methods should ignore the file's ContentMD5 header.

   The default disableContentMD5Validation value is set in the client and is by default false. You can
   change the disableContentMD5Validation value on this request by setting this property. You can also change the
   value on the CloudFileClient.getDefaultRequestOptions() object so that all subsequent requests made via
   the service client will use that disableContentMD5Validation value.

  disable-content-md-5-validation - the disableContentMD5Validation to set - `java.lang.Boolean`"
  ([^FileRequestOptions this ^java.lang.Boolean disable-content-md-5-validation]
    (-> this (.setDisableContentMD5Validation disable-content-md-5-validation))))

(defn set-location-mode
  "Sets the LocationMode for this request.

   The default LocationMode is set in the client and is by default LocationMode.PRIMARY_ONLY. You
   can change the LocationMode on this request by setting this property. You can also change the value on
   the ServiceClient.getDefaultRequestOptions() object so that all subsequent requests made via the service
   client will use that LocationMode.

  location-mode - the locationMode to set - `com.microsoft.azure.storage.LocationMode`"
  ([^FileRequestOptions this ^com.microsoft.azure.storage.LocationMode location-mode]
    (-> this (.setLocationMode location-mode))))

(defn get-concurrent-request-count
  "Gets the concurrent number of simultaneous requests per operation. For more information about concurrent request
   count defaults, see setConcurrentRequestCount(Integer).

  returns: the concurrentRequestCount - `java.lang.Integer`"
  (^java.lang.Integer [^FileRequestOptions this]
    (-> this (.getConcurrentRequestCount))))

(defn set-concurrent-request-count
  "Sets the concurrent number of simultaneous requests per operation.

   The default concurrent request count is set in the client and is by default 1, indicating no concurrency. You can
   change the concurrent request count on this request by setting this property. You can also change the value on
   the CloudFileClient.getDefaultRequestOptions() object so that all subsequent requests made via the
   service client will use that concurrent request count.

  concurrent-request-count - the concurrentRequestCount to set - `java.lang.Integer`"
  ([^FileRequestOptions this ^java.lang.Integer concurrent-request-count]
    (-> this (.setConcurrentRequestCount concurrent-request-count))))

