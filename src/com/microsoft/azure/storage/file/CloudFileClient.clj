(ns com.microsoft.azure.storage.file.CloudFileClient
  "Provides a client for accessing the Microsoft Azure File service.

  This class provides a point of access to the File service. The service client encapsulates the base URI for the File
  service. It also encapsulates the credentials for accessing the storage account."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.file CloudFileClient]))

(defn ->cloud-file-client
  "Constructor.

  Creates an instance of the CloudFileClient class using the specified File service endpoint and
   account credentials.

  base-uri - A java.net.URI object that represents the File service endpoint used to create the client. - `java.net.URI`
  credentials - A StorageCredentials object that represents the account credentials. - `com.microsoft.azure.storage.StorageCredentials`"
  (^CloudFileClient [^java.net.URI base-uri ^com.microsoft.azure.storage.StorageCredentials credentials]
    (new CloudFileClient base-uri credentials)))

(defn get-share-reference
  "Gets a CloudFileShare object with the specified name.

  share-name - The name of the share, which must adhere to share naming rules. The share name should not include any path separator characters (/). Share names must be lowercase, between 3-63 characters long and must start with a letter or number. Share names may contain only letters, numbers, and the dash (-) character. - `java.lang.String`
  snapshot-id - A String that represents the snapshot ID of the share. - `java.lang.String`

  returns: A reference to a CloudFileShare object. - `com.microsoft.azure.storage.file.CloudFileShare`

  throws: com.microsoft.azure.storage.StorageException"
  (^com.microsoft.azure.storage.file.CloudFileShare [^CloudFileClient this ^java.lang.String share-name ^java.lang.String snapshot-id]
    (-> this (.getShareReference share-name snapshot-id)))
  (^com.microsoft.azure.storage.file.CloudFileShare [^CloudFileClient this ^java.lang.String share-name]
    (-> this (.getShareReference share-name))))

(defn list-shares
  "Returns an enumerable collection of shares whose names begin with the specified prefix for this File
   service client, using the specified details settings, request options, and operation context.

  prefix - A String that represents the share name prefix. - `java.lang.String`
  details-included - A java.util.EnumSet object that contains ShareListingDetails values that indicate whether share snapshots and/or metadata will be returned. - `java.util.EnumSet`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: An enumerable collection of CloudFileShare objects retrieved lazily that represents the
           shares for this client. - `java.lang.Iterable<com.microsoft.azure.storage.file.CloudFileShare>`"
  (^java.lang.Iterable [^CloudFileClient this ^java.lang.String prefix ^java.util.EnumSet details-included ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.listShares prefix details-included options op-context)))
  (^java.lang.Iterable [^CloudFileClient this ^java.lang.String prefix]
    (-> this (.listShares prefix)))
  (^java.lang.Iterable [^CloudFileClient this]
    (-> this (.listShares))))

(defn list-shares-segmented
  "Returns a result segment of an enumerable collection of shares whose names begin with the specified
   prefix, using the specified listing details options, request options, and operation context.

  prefix - A String that represents the prefix of the share name. - `java.lang.String`
  details-included - A java.util.EnumSet object that contains ShareListingDetails values that indicate whether share snapshots and/or metadata will be returned. - `java.util.EnumSet`
  max-results - The maximum number of results to retrieve. If null or greater than 5000, the server will return up to 5,000 items. Must be at least 1. - `java.lang.Integer`
  continuation-token - A ResultContinuation object that represents a continuation token returned by a previous listing operation. - `com.microsoft.azure.storage.ResultContinuation`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A ResultSegment object that contains a segment of the enumerable collection
           of CloudFileShare objects that represent the shares for this client. - `com.microsoft.azure.storage.ResultSegment<com.microsoft.azure.storage.file.CloudFileShare>`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.ResultSegment [^CloudFileClient this ^java.lang.String prefix ^java.util.EnumSet details-included ^java.lang.Integer max-results ^com.microsoft.azure.storage.ResultContinuation continuation-token ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.listSharesSegmented prefix details-included max-results continuation-token options op-context)))
  (^com.microsoft.azure.storage.ResultSegment [^CloudFileClient this ^java.lang.String prefix]
    (-> this (.listSharesSegmented prefix)))
  (^com.microsoft.azure.storage.ResultSegment [^CloudFileClient this]
    (-> this (.listSharesSegmented))))

(defn download-service-properties
  "Retrieves the current FileServiceProperties for the given storage service. This encapsulates
   the CORS configurations.

  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client (CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A FileServiceProperties object representing the current configuration of the service. - `com.microsoft.azure.storage.file.FileServiceProperties`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.file.FileServiceProperties [^CloudFileClient this ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadServiceProperties options op-context)))
  (^com.microsoft.azure.storage.file.FileServiceProperties [^CloudFileClient this]
    (-> this (.downloadServiceProperties))))

(defn upload-service-properties
  "Uploads a new FileServiceProperties configuration to the given storage service. This encapsulates
   the CORS configurations.

  properties - A FileServiceProperties object which specifies the service properties to upload. - `com.microsoft.azure.storage.file.FileServiceProperties`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client (CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudFileClient this ^com.microsoft.azure.storage.file.FileServiceProperties properties ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadServiceProperties properties options op-context)))
  ([^CloudFileClient this ^com.microsoft.azure.storage.file.FileServiceProperties properties]
    (-> this (.uploadServiceProperties properties))))

(defn get-default-request-options
  "Gets the FileRequestOptions that is used for requests associated with this CloudFileClient

  returns: The FileRequestOptions object containing the values used by this CloudFileClient - `com.microsoft.azure.storage.file.FileRequestOptions`"
  (^com.microsoft.azure.storage.file.FileRequestOptions [^CloudFileClient this]
    (-> this (.getDefaultRequestOptions))))

(defn set-default-request-options
  "Sets the FileRequestOptions that is used for any requests associated with this
   CloudFileClient object.

  default-request-options - A FileRequestOptions object which specifies the options to use. - `com.microsoft.azure.storage.file.FileRequestOptions`"
  ([^CloudFileClient this ^com.microsoft.azure.storage.file.FileRequestOptions default-request-options]
    (-> this (.setDefaultRequestOptions default-request-options))))

