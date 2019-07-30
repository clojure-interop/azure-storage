(ns com.microsoft.azure.storage.queue.CloudQueueClient
  "Provides a service client for accessing the Microsoft Azure Queue service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.queue CloudQueueClient]))

(defn ->cloud-queue-client
  "Constructor.

  Initializes a new instance of the CloudQueueClient class using the specified Queue service endpoint
   and account credentials.

  base-uri - A java.net.URI object that represents the Queue service endpoint used to create the client. - `java.net.URI`
  credentials - A StorageCredentials object that represents the account credentials. - `com.microsoft.azure.storage.StorageCredentials`"
  (^CloudQueueClient [^java.net.URI base-uri ^com.microsoft.azure.storage.StorageCredentials credentials]
    (new CloudQueueClient base-uri credentials)))

(defn get-queue-reference
  "Gets a CloudQueue object with the specified name.

  queue-name - The name of the queue, which must adhere to queue naming rules. The queue name should not include any path separator characters (/). Queue names must be lowercase, between 3-63 characters long and must start with a letter or number. Queue names may contain only letters, numbers, and the dash (-) character. - `java.lang.String`

  returns: A reference to a CloudQueue object. - `com.microsoft.azure.storage.queue.CloudQueue`

  throws: java.net.URISyntaxException - If the resource URI constructed based on the queueName is invalid."
  (^com.microsoft.azure.storage.queue.CloudQueue [^CloudQueueClient this ^java.lang.String queue-name]
    (-> this (.getQueueReference queue-name))))

(defn list-queues
  "Returns an iterable collection of queues whose names begin with the
   specified prefix for this Queue service client, using the specified
   details setting, request options, and operation context.

  prefix - A String that represents the queue name prefix. - `java.lang.String`
  details-included - A QueueListingDetails value that indicates whether queue metadata will be returned. - `com.microsoft.azure.storage.queue.QueueListingDetails`
  options - A QueueRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudQueue). - `com.microsoft.azure.storage.queue.QueueRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: An iterable collection of CloudQueue objects retrieved lazily that
           represents the specified queues for this client. - `java.lang.Iterable<com.microsoft.azure.storage.queue.CloudQueue>`"
  (^java.lang.Iterable [^CloudQueueClient this ^java.lang.String prefix ^com.microsoft.azure.storage.queue.QueueListingDetails details-included ^com.microsoft.azure.storage.queue.QueueRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.listQueues prefix details-included options op-context)))
  (^java.lang.Iterable [^CloudQueueClient this ^java.lang.String prefix]
    (-> this (.listQueues prefix)))
  (^java.lang.Iterable [^CloudQueueClient this]
    (-> this (.listQueues))))

(defn list-queues-segmented
  "Gets a result segment of an iterable collection of queues whose names
   begin with the specified prefix for this queue, using the specified
   listing details options, request options, and operation context.

  prefix - A String that represents the prefix of the queue name to match. - `java.lang.String`
  details-included - A QueueListingDetails value that indicates whether queue metadata will be returned. - `com.microsoft.azure.storage.queue.QueueListingDetails`
  max-results - The maximum number of results to retrieve. If null or greater than 5000, the server will return up to 5,000 items. Must be at least 1. - `java.lang.Integer`
  continuation-token - A ResultContinuation object that represents a continuation token returned by a previous listing operation. - `com.microsoft.azure.storage.ResultContinuation`
  options - A QueueRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudQueue). - `com.microsoft.azure.storage.queue.QueueRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A ResultSegment of CloudQueue objects that contains a segment of
           the iterable collection of CloudQueue objects that represent the requested
           queues in the storage service. - `com.microsoft.azure.storage.ResultSegment<com.microsoft.azure.storage.queue.CloudQueue>`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred during the operation."
  (^com.microsoft.azure.storage.ResultSegment [^CloudQueueClient this ^java.lang.String prefix ^com.microsoft.azure.storage.queue.QueueListingDetails details-included ^java.lang.Integer max-results ^com.microsoft.azure.storage.ResultContinuation continuation-token ^com.microsoft.azure.storage.queue.QueueRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.listQueuesSegmented prefix details-included max-results continuation-token options op-context)))
  (^com.microsoft.azure.storage.ResultSegment [^CloudQueueClient this ^java.lang.String prefix]
    (-> this (.listQueuesSegmented prefix)))
  (^com.microsoft.azure.storage.ResultSegment [^CloudQueueClient this]
    (-> this (.listQueuesSegmented))))

(defn get-service-stats
  "Queries the service for the ServiceStats.

  options - A QueueRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudQueueClient). - `com.microsoft.azure.storage.queue.QueueRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: ServiceStats for the given storage service - `com.microsoft.azure.storage.ServiceStats`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.ServiceStats [^CloudQueueClient this ^com.microsoft.azure.storage.queue.QueueRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.getServiceStats options op-context)))
  (^com.microsoft.azure.storage.ServiceStats [^CloudQueueClient this]
    (-> this (.getServiceStats))))

(defn download-service-properties
  "Retrieves the current ServiceProperties for the given storage service. This includes Logging,
   HourMetrics, MinuteMetrics and CORS configurations.

  options - A QueueRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudQueueClient). - `com.microsoft.azure.storage.queue.QueueRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: the ServiceProperties object representing the current configuration of the service. - `com.microsoft.azure.storage.ServiceProperties`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.ServiceProperties [^CloudQueueClient this ^com.microsoft.azure.storage.queue.QueueRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadServiceProperties options op-context)))
  (^com.microsoft.azure.storage.ServiceProperties [^CloudQueueClient this]
    (-> this (.downloadServiceProperties))))

(defn upload-service-properties
  "Uploads a new ServiceProperties configuration to the given storage service. This includes Logging,
   HourMetrics, MinuteMetrics and CORS configurations.

  properties - The ServiceProperties to upload. - `com.microsoft.azure.storage.ServiceProperties`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.queue.QueueRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudQueueClient this ^com.microsoft.azure.storage.ServiceProperties properties ^com.microsoft.azure.storage.queue.QueueRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadServiceProperties properties options op-context)))
  ([^CloudQueueClient this ^com.microsoft.azure.storage.ServiceProperties properties]
    (-> this (.uploadServiceProperties properties))))

(defn get-default-request-options
  "Gets the QueueRequestOptions that is used for requests associated with this CloudQueueClient

  returns: The QueueRequestOptions object containing the values used by this CloudQueueClient - `com.microsoft.azure.storage.queue.QueueRequestOptions`"
  (^com.microsoft.azure.storage.queue.QueueRequestOptions [^CloudQueueClient this]
    (-> this (.getDefaultRequestOptions))))

(defn set-default-request-options
  "Sets the QueueRequestOptions that is used for any queue accessed with this CloudQueueClient
   object.

  default-request-options - The QueueRequestOptions to use. - `com.microsoft.azure.storage.queue.QueueRequestOptions`"
  ([^CloudQueueClient this ^com.microsoft.azure.storage.queue.QueueRequestOptions default-request-options]
    (-> this (.setDefaultRequestOptions default-request-options))))

