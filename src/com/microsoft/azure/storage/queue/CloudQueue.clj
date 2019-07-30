(ns com.microsoft.azure.storage.queue.CloudQueue
  "This class represents a queue in the Microsoft Azure Queue service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.queue CloudQueue]))

(defn ->cloud-queue
  "Constructor.

  Creates an instance of the CloudQueue class using the specified queue URI and
   credentials. If the URI contains a SAS token, the credentials must be null.

  uri - A java.net.URI object that represents the absolute URI of the queue. - `java.net.URI`
  credentials - A StorageCredentials object used to authenticate access. - `com.microsoft.azure.storage.StorageCredentials`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^CloudQueue [^java.net.URI uri ^com.microsoft.azure.storage.StorageCredentials credentials]
    (new CloudQueue uri credentials))
  (^CloudQueue [^java.net.URI uri]
    (new CloudQueue uri)))

(defn add-message
  "Adds a message to the back of the queue with the specified options.

  message - A CloudQueueMessage object that specifies the message to add. The message object is modified to include the message ID and pop receipt, and can be used in subsequent calls to updateMessage and deleteMessage. - `com.microsoft.azure.storage.queue.CloudQueueMessage`
  time-to-live-in-seconds - The maximum time to allow the message to be in the queue. A value of zero will set the time-to-live to the service default value of seven days. A value of negative one will set an infinite time-to-live. - `int`
  initial-visibility-delay-in-seconds - The length of time during which the message will be invisible, starting when it is added to the queue, or 0 to make the message visible immediately. This value must be greater than or equal to zero and less than the time-to-live value. - `int`
  options - A QueueRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudQueueClient). - `com.microsoft.azure.storage.queue.QueueRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred during the operation."
  ([^CloudQueue this ^com.microsoft.azure.storage.queue.CloudQueueMessage message ^Integer time-to-live-in-seconds ^Integer initial-visibility-delay-in-seconds ^com.microsoft.azure.storage.queue.QueueRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.addMessage message time-to-live-in-seconds initial-visibility-delay-in-seconds options op-context)))
  ([^CloudQueue this ^com.microsoft.azure.storage.queue.CloudQueueMessage message]
    (-> this (.addMessage message))))

(defn download-attributes
  "Downloads the queue's metadata and approximate message count value, using the specified request options and
   operation context.

  options - A QueueRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudQueue). - `com.microsoft.azure.storage.queue.QueueRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred during the operation."
  ([^CloudQueue this ^com.microsoft.azure.storage.queue.QueueRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadAttributes options op-context)))
  ([^CloudQueue this]
    (-> this (.downloadAttributes))))

(defn delete
  "Deletes the queue, using the specified request options and operation context.

  options - A QueueRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudQueueClient). - `com.microsoft.azure.storage.queue.QueueRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred during the operation."
  ([^CloudQueue this ^com.microsoft.azure.storage.queue.QueueRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.delete options op-context)))
  ([^CloudQueue this]
    (-> this (.delete))))

(defn generate-shared-access-signature
  "Returns a shared access signature for the queue.

  policy - The access policy for the shared access signature. - `com.microsoft.azure.storage.queue.SharedAccessQueuePolicy`
  group-policy-identifier - A queue-level access policy. - `java.lang.String`
  ip-range - A IPRange object containing the range of allowed IP addresses. - `com.microsoft.azure.storage.IPRange`
  protocols - A SharedAccessProtocols representing the allowed Internet protocols. - `com.microsoft.azure.storage.SharedAccessProtocols`

  returns: A shared access signature for the queue. - `java.lang.String`

  throws: java.security.InvalidKeyException - If an invalid key was passed."
  (^java.lang.String [^CloudQueue this ^com.microsoft.azure.storage.queue.SharedAccessQueuePolicy policy ^java.lang.String group-policy-identifier ^com.microsoft.azure.storage.IPRange ip-range ^com.microsoft.azure.storage.SharedAccessProtocols protocols]
    (-> this (.generateSharedAccessSignature policy group-policy-identifier ip-range protocols)))
  (^java.lang.String [^CloudQueue this ^com.microsoft.azure.storage.queue.SharedAccessQueuePolicy policy ^java.lang.String group-policy-identifier]
    (-> this (.generateSharedAccessSignature policy group-policy-identifier))))

(defn upload-permissions
  "Uploads the queue's permissions using the specified request options and operation context.

  permissions - A QueuePermissions object that represents the permissions to upload. - `com.microsoft.azure.storage.queue.QueuePermissions`
  options - A QueueRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudQueueClient). - `com.microsoft.azure.storage.queue.QueueRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudQueue this ^com.microsoft.azure.storage.queue.QueuePermissions permissions ^com.microsoft.azure.storage.queue.QueueRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadPermissions permissions options op-context)))
  ([^CloudQueue this ^com.microsoft.azure.storage.queue.QueuePermissions permissions]
    (-> this (.uploadPermissions permissions))))

(defn delete-message
  "Deletes the specified message from the queue, using the specified request options and operation context.

  message - A CloudQueueMessage object that specifies the message to delete. - `com.microsoft.azure.storage.queue.CloudQueueMessage`
  options - A QueueRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudQueueClient). - `com.microsoft.azure.storage.queue.QueueRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred during the operation."
  ([^CloudQueue this ^com.microsoft.azure.storage.queue.CloudQueueMessage message ^com.microsoft.azure.storage.queue.QueueRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.deleteMessage message options op-context)))
  ([^CloudQueue this ^com.microsoft.azure.storage.queue.CloudQueueMessage message]
    (-> this (.deleteMessage message))))

(defn get-storage-uri
  "Returns the list of URIs for all locations.

  returns: A StorageUri that represents the list of URIs for all locations.. - `com.microsoft.azure.storage.StorageUri`"
  (^com.microsoft.azure.storage.StorageUri [^CloudQueue this]
    (-> this (.getStorageUri))))

(defn set-should-encode-message
  "Sets the flag indicating whether the message should be base-64 encoded.

  should-encode-message - The value indicates whether the message should be base-64 encoded. - `boolean`"
  ([^CloudQueue this ^Boolean should-encode-message]
    (-> this (.setShouldEncodeMessage should-encode-message))))

(defn get-name
  "Gets the name of the queue.

  returns: A String object that represents the name of the queue. - `java.lang.String`"
  (^java.lang.String [^CloudQueue this]
    (-> this (.getName))))

(defn peek-message
  "Peeks a message from the queue, using the specified request options and operation context. A peek request
   retrieves a message from the front of the queue without changing its visibility.

  options - A QueueRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudQueueClient). - `com.microsoft.azure.storage.queue.QueueRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: An CloudQueueMessage object that represents the requested message from the queue. - `com.microsoft.azure.storage.queue.CloudQueueMessage`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred during the operation."
  (^com.microsoft.azure.storage.queue.CloudQueueMessage [^CloudQueue this ^com.microsoft.azure.storage.queue.QueueRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.peekMessage options op-context)))
  (^com.microsoft.azure.storage.queue.CloudQueueMessage [^CloudQueue this]
    (-> this (.peekMessage))))

(defn get-service-client
  "Gets the queue service client associated with this queue.

  returns: A CloudQueueClient object that represents the service client associated with this queue. - `com.microsoft.azure.storage.queue.CloudQueueClient`"
  (^com.microsoft.azure.storage.queue.CloudQueueClient [^CloudQueue this]
    (-> this (.getServiceClient))))

(defn get-uri
  "Gets the absolute URI for this queue.

  returns: A java.net.URI object that represents the URI for this queue. - `java.net.URI`"
  (^java.net.URI [^CloudQueue this]
    (-> this (.getUri))))

(defn get-should-encode-message?
  "Gets the value indicating whether the message should be base-64 encoded.

  returns: A Boolean that represents whether the message should be base-64 encoded. - `boolean`"
  (^Boolean [^CloudQueue this]
    (-> this (.getShouldEncodeMessage))))

(defn delete-if-exists
  "Deletes the queue if it exists, using the specified request options and operation context.

  options - A QueueRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudQueueClient). - `com.microsoft.azure.storage.queue.QueueRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A value of true if the queue existed in the storage service and has been deleted, otherwise
           false. - `boolean`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred during the operation."
  (^Boolean [^CloudQueue this ^com.microsoft.azure.storage.queue.QueueRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.deleteIfExists options op-context)))
  (^Boolean [^CloudQueue this]
    (-> this (.deleteIfExists))))

(defn create-if-not-exists
  "Creates the queue if it does not already exist, using the specified request options and operation context.

  options - A QueueRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudQueueClient). - `com.microsoft.azure.storage.queue.QueueRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A value of true if the queue is created in the storage service, otherwise false
           . - `boolean`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred during the operation."
  (^Boolean [^CloudQueue this ^com.microsoft.azure.storage.queue.QueueRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.createIfNotExists options op-context)))
  (^Boolean [^CloudQueue this]
    (-> this (.createIfNotExists))))

(defn peek-messages
  "Peeks a set of messages from the queue, using the specified request options and operation context. A peek request
   retrieves messages from the front of the queue without changing their visibility.

  number-of-messages - The number of messages to retrieve. - `int`
  options - A QueueRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudQueueClient). - `com.microsoft.azure.storage.queue.QueueRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: An enumerable collection of CloudQueueMessage objects that represents the requested messages from
           the queue. - `java.lang.Iterable<com.microsoft.azure.storage.queue.CloudQueueMessage>`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred during the operation."
  (^java.lang.Iterable [^CloudQueue this ^Integer number-of-messages ^com.microsoft.azure.storage.queue.QueueRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.peekMessages number-of-messages options op-context)))
  (^java.lang.Iterable [^CloudQueue this ^Integer number-of-messages]
    (-> this (.peekMessages number-of-messages))))

(defn get-approximate-message-count
  "Gets the approximate messages count of the queue. This value is initialized by a request to
   downloadAttributes() and represents the approximate message count when that request completed.

  returns: A Long object that represents the approximate messages count of the queue. - `long`"
  (^Long [^CloudQueue this]
    (-> this (.getApproximateMessageCount))))

(defn create
  "Creates the queue, using the specified request options and operation context.

  options - A QueueRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudQueueClient). - `com.microsoft.azure.storage.queue.QueueRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred during the operation."
  ([^CloudQueue this ^com.microsoft.azure.storage.queue.QueueRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.create options op-context)))
  ([^CloudQueue this]
    (-> this (.create))))

(defn upload-metadata
  "Uploads the metadata in the CloudQueue object to the queue, using the specified request options and
   operation context.

  options - A QueueRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudQueueClient). - `com.microsoft.azure.storage.queue.QueueRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred during the operation."
  ([^CloudQueue this ^com.microsoft.azure.storage.queue.QueueRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadMetadata options op-context)))
  ([^CloudQueue this]
    (-> this (.uploadMetadata))))

(defn exists?
  "Returns a value that indicates whether the queue existse, using the specified request options and operation
   context.

  options - A QueueRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudQueueClient). - `com.microsoft.azure.storage.queue.QueueRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: true if the queue exists in the storage service, otherwise false. - `boolean`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred during the operation."
  (^Boolean [^CloudQueue this ^com.microsoft.azure.storage.queue.QueueRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.exists options op-context)))
  (^Boolean [^CloudQueue this]
    (-> this (.exists))))

(defn get-metadata
  "Gets the metadata collection for the queue as stored in this CloudQueue object. This value is
   initialized with the metadata from the queue by a call to downloadAttributes(), and is set on the queue
   with a call to uploadMetadata().

  returns: A java.util.HashMap object that represents the metadata for the queue. - `java.util.HashMap<java.lang.String,java.lang.String>`"
  (^java.util.HashMap [^CloudQueue this]
    (-> this (.getMetadata))))

(defn clear
  "Clears all messages from the queue, using the specified request options and operation context.

  options - A QueueRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudQueueClient). - `com.microsoft.azure.storage.queue.QueueRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred during the operation."
  ([^CloudQueue this ^com.microsoft.azure.storage.queue.QueueRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.clear options op-context)))
  ([^CloudQueue this]
    (-> this (.clear))))

(defn update-message
  "Updates a message in the queue, using the specified request options and operation context.

  message - The CloudQueueMessage to update in the queue. - `com.microsoft.azure.storage.queue.CloudQueueMessage`
  visibility-timeout-in-seconds - Specifies the new visibility timeout for the message, in seconds. - `int`
  message-update-fields - An EnumSet of MessageUpdateFields values that specifies which parts of the message are to be updated. - `java.util.EnumSet`
  options - A QueueRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudQueueClient). - `com.microsoft.azure.storage.queue.QueueRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred during the operation."
  ([^CloudQueue this ^com.microsoft.azure.storage.queue.CloudQueueMessage message ^Integer visibility-timeout-in-seconds ^java.util.EnumSet message-update-fields ^com.microsoft.azure.storage.queue.QueueRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.updateMessage message visibility-timeout-in-seconds message-update-fields options op-context)))
  ([^CloudQueue this ^com.microsoft.azure.storage.queue.CloudQueueMessage message ^Integer visibility-timeout-in-seconds]
    (-> this (.updateMessage message visibility-timeout-in-seconds))))

(defn retrieve-messages
  "Retrieves the specified number of messages from the front of the queue using the specified request options and
   operation context. This operation marks the retrieved messages as invisible in the queue for the default
   visibility timeout period.

  number-of-messages - The number of messages to retrieve. - `int`
  visibility-timeout-in-seconds - Specifies the visibility timeout for the retrieved messages, in seconds. - `int`
  options - A QueueRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudQueueClient). - `com.microsoft.azure.storage.queue.QueueRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: An enumerable collection of CloudQueueMessage objects that represents the messages retrieved from
           the queue. - `java.lang.Iterable<com.microsoft.azure.storage.queue.CloudQueueMessage>`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred during the operation."
  (^java.lang.Iterable [^CloudQueue this ^Integer number-of-messages ^Integer visibility-timeout-in-seconds ^com.microsoft.azure.storage.queue.QueueRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.retrieveMessages number-of-messages visibility-timeout-in-seconds options op-context)))
  (^java.lang.Iterable [^CloudQueue this ^Integer number-of-messages]
    (-> this (.retrieveMessages number-of-messages))))

(defn download-permissions
  "Downloads the permissions settings for the queue using the specified request options and operation context.

  options - A QueueRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudQueueClient). - `com.microsoft.azure.storage.queue.QueueRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A QueuePermissions object that represents the container's permissions. - `com.microsoft.azure.storage.queue.QueuePermissions`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.queue.QueuePermissions [^CloudQueue this ^com.microsoft.azure.storage.queue.QueueRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadPermissions options op-context)))
  (^com.microsoft.azure.storage.queue.QueuePermissions [^CloudQueue this]
    (-> this (.downloadPermissions))))

(defn retrieve-message
  "Retrieves a message from the front of the queue, using the specified request options and operation context. This
   operation marks the retrieved message as invisible in the queue for the specified visibility timeout period.

  visibility-timeout-in-seconds - Specifies the visibility timeout for the message, in seconds. - `int`
  options - A QueueRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudQueueClient). - `com.microsoft.azure.storage.queue.QueueRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: An CloudQueueMessage object that represents a message in this queue. - `com.microsoft.azure.storage.queue.CloudQueueMessage`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred during the operation."
  (^com.microsoft.azure.storage.queue.CloudQueueMessage [^CloudQueue this ^Integer visibility-timeout-in-seconds ^com.microsoft.azure.storage.queue.QueueRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.retrieveMessage visibility-timeout-in-seconds options op-context)))
  (^com.microsoft.azure.storage.queue.CloudQueueMessage [^CloudQueue this]
    (-> this (.retrieveMessage))))

(defn set-metadata
  "Sets the metadata collection of name-value pairs to be set on the queue with an uploadMetadata() call.
   This collection will overwrite any existing queue metadata. If this is set to an empty collection, the queue
   metadata will be cleared on an uploadMetadata() call.

  metadata - A java.util.HashMap object that represents the metadata being assigned to the queue. - `java.util.HashMap`"
  ([^CloudQueue this ^java.util.HashMap metadata]
    (-> this (.setMetadata metadata))))

