(ns com.microsoft.azure.storage.blob.CloudBlobClient
  "Provides a client for accessing the Microsoft Azure Blob service.

  This class provides a point of access to the Blob service. The service client encapsulates the base URI for the Blob
  service. If the service client will be used for authenticated access, it also encapsulates the credentials for
  accessing the storage account."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob CloudBlobClient]))

(defn ->cloud-blob-client
  "Constructor.

  Creates an instance of the CloudBlobClient class using the specified Blob service endpoint and
   account credentials.

  base-uri - A java.net.URI object that represents the Blob service endpoint used to create the client. - `java.net.URI`
  credentials - A StorageCredentials object that represents the account credentials. - `com.microsoft.azure.storage.StorageCredentials`"
  (^CloudBlobClient [^java.net.URI base-uri ^com.microsoft.azure.storage.StorageCredentials credentials]
    (new CloudBlobClient base-uri credentials))
  (^CloudBlobClient [^java.net.URI base-uri]
    (new CloudBlobClient base-uri)))

(defn set-directory-delimiter
  "Sets the value for the default delimiter used for cloud blob directories.

  directory-delimiter - A String that specifies the value for the default directory delimiter. - `java.lang.String`"
  ([^CloudBlobClient this ^java.lang.String directory-delimiter]
    (-> this (.setDirectoryDelimiter directory-delimiter))))

(defn list-containers-segmented
  "Returns a result segment of an enumerable collection of blob containers whose names begin with the specified
   prefix for this Blob service client, using the specified listing details options, request options, and operation
   context.

  prefix - A String that represents the prefix of the container name. - `java.lang.String`
  details-included - A ContainerListingDetails value that indicates whether container metadata will be returned. - `com.microsoft.azure.storage.blob.ContainerListingDetails`
  max-results - The maximum number of results to retrieve. If null or greater than 5000, the server will return up to 5,000 items. Must be at least 1. - `java.lang.Integer`
  continuation-token - A ResultContinuation object that represents a continuation token returned by a previous listing operation. - `com.microsoft.azure.storage.ResultContinuation`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client (CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A ResultSegment object that contains a segment of the enumerable collection of
           CloudBlobContainer objects that represent the containers for this Blob service client. - `com.microsoft.azure.storage.ResultSegment<com.microsoft.azure.storage.blob.CloudBlobContainer>`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.ResultSegment [^CloudBlobClient this ^java.lang.String prefix ^com.microsoft.azure.storage.blob.ContainerListingDetails details-included ^java.lang.Integer max-results ^com.microsoft.azure.storage.ResultContinuation continuation-token ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.listContainersSegmented prefix details-included max-results continuation-token options op-context)))
  (^com.microsoft.azure.storage.ResultSegment [^CloudBlobClient this ^java.lang.String prefix]
    (-> this (.listContainersSegmented prefix)))
  (^com.microsoft.azure.storage.ResultSegment [^CloudBlobClient this]
    (-> this (.listContainersSegmented))))

(defn download-account-info
  "Gets information related to the storage account.

  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A AccountInformation object for the given storage account. - `com.microsoft.azure.storage.AccountInformation`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.AccountInformation [^CloudBlobClient this ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadAccountInfo options op-context)))
  (^com.microsoft.azure.storage.AccountInformation [^CloudBlobClient this]
    (-> this (.downloadAccountInfo))))

(defn get-directory-delimiter
  "Returns the value for the default delimiter used for cloud blob directories. The default is '/'.

  returns: A String which represents the value for the default delimiter. - `java.lang.String`"
  (^java.lang.String [^CloudBlobClient this]
    (-> this (.getDirectoryDelimiter))))

(defn upload-service-properties
  "Uploads a new ServiceProperties configuration to the given storage service. This includes Logging,
   HourMetrics, MinuteMetrics and CORS configurations.

  properties - A ServiceProperties object which specifies the service properties to upload. - `com.microsoft.azure.storage.ServiceProperties`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudBlobClient this ^com.microsoft.azure.storage.ServiceProperties properties ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadServiceProperties properties options op-context)))
  ([^CloudBlobClient this ^com.microsoft.azure.storage.ServiceProperties properties]
    (-> this (.uploadServiceProperties properties))))

(defn list-containers
  "Returns an enumerable collection of blob containers whose names begin with the specified prefix for this Blob
   service client, using the specified details setting, request options, and operation context.

  prefix - A String that represents the container name prefix. - `java.lang.String`
  details-included - A ContainerListingDetails value that indicates whether container metadata will be returned. - `com.microsoft.azure.storage.blob.ContainerListingDetails`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: An enumerable collection of CloudBlobContainer objects retrieved lazily that represents the
           containers for this client. - `java.lang.Iterable<com.microsoft.azure.storage.blob.CloudBlobContainer>`"
  (^java.lang.Iterable [^CloudBlobClient this ^java.lang.String prefix ^com.microsoft.azure.storage.blob.ContainerListingDetails details-included ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.listContainers prefix details-included options op-context)))
  (^java.lang.Iterable [^CloudBlobClient this ^java.lang.String prefix]
    (-> this (.listContainers prefix)))
  (^java.lang.Iterable [^CloudBlobClient this]
    (-> this (.listContainers))))

(defn get-default-request-options
  "Gets the BlobRequestOptions that is used for requests associated with this CloudBlobClient

  returns: The BlobRequestOptions object containing the values used by this CloudBlobClient - `com.microsoft.azure.storage.blob.BlobRequestOptions`"
  (^com.microsoft.azure.storage.blob.BlobRequestOptions [^CloudBlobClient this]
    (-> this (.getDefaultRequestOptions))))

(defn get-service-stats
  "Queries the given storage service for the ServiceStats.

  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A ServiceStats object for the given storage service. - `com.microsoft.azure.storage.ServiceStats`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.ServiceStats [^CloudBlobClient this ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.getServiceStats options op-context)))
  (^com.microsoft.azure.storage.ServiceStats [^CloudBlobClient this]
    (-> this (.getServiceStats))))

(defn set-default-request-options
  "Sets the BlobRequestOptions that is used for any requests associated with this
   CloudBlobClient object.

  default-request-options - A BlobRequestOptions object which specifies the options to use. - `com.microsoft.azure.storage.blob.BlobRequestOptions`"
  ([^CloudBlobClient this ^com.microsoft.azure.storage.blob.BlobRequestOptions default-request-options]
    (-> this (.setDefaultRequestOptions default-request-options))))

(defn download-service-properties
  "Retrieves the current ServiceProperties for the given storage service. This includes Logging,
   HourMetrics, MinuteMetrics and CORS configurations.

  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A ServiceProperties object representing the current configuration of the service. - `com.microsoft.azure.storage.ServiceProperties`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.ServiceProperties [^CloudBlobClient this ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadServiceProperties options op-context)))
  (^com.microsoft.azure.storage.ServiceProperties [^CloudBlobClient this]
    (-> this (.downloadServiceProperties))))

(defn get-container-reference
  "Gets a CloudBlobContainer object with the specified name.

  container-name - The name of the container, which must adhere to container naming rules. The container name should not include any path separator characters (/). Container names must be lowercase, between 3-63 characters long and must start with a letter or number. Container names may contain only letters, numbers, and the dash (-) character. - `java.lang.String`

  returns: A reference to a CloudBlobContainer object. - `com.microsoft.azure.storage.blob.CloudBlobContainer`

  throws: java.net.URISyntaxException - If the resource URI constructed based on the containerName is invalid."
  (^com.microsoft.azure.storage.blob.CloudBlobContainer [^CloudBlobClient this ^java.lang.String container-name]
    (-> this (.getContainerReference container-name))))

