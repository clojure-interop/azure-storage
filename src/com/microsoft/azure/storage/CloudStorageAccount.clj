(ns com.microsoft.azure.storage.CloudStorageAccount
  "Represents a Microsoft Azure storage account."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage CloudStorageAccount]))

(defn ->cloud-storage-account
  "Constructor.

  Creates an instance of the CloudStorageAccount class using the specified
   account credentials and service endpoints.

   Use this constructor to construct a CloudStorageAccount object using custom
   endpoints, in the case where you've configured a custom domain name for your storage account.

   The credentials provided when constructing the CloudStorageAccount object
   are used to authenticate all further requests against resources that are accessed via
   the CloudStorageAccount object or a client object created from it. A client
   object may be a CloudBlobClient object.

  storage-credentials - A StorageCredentials object that represents the storage credentials to use to authenticate this account. - `com.microsoft.azure.storage.StorageCredentials`
  blob-endpoint - A java.net.URI object that represents the Blob service endpoint. - `java.net.URI`
  queue-endpoint - A java.net.URI object that represents the Queue service endpoint. - `java.net.URI`
  table-endpoint - A java.net.URI object that represents the Table service endpoint. - `java.net.URI`
  file-endpoint - A java.net.URI object that represents the File service endpoint. - `java.net.URI`"
  (^CloudStorageAccount [^com.microsoft.azure.storage.StorageCredentials storage-credentials ^java.net.URI blob-endpoint ^java.net.URI queue-endpoint ^java.net.URI table-endpoint ^java.net.URI file-endpoint]
    (new CloudStorageAccount storage-credentials blob-endpoint queue-endpoint table-endpoint file-endpoint))
  (^CloudStorageAccount [^com.microsoft.azure.storage.StorageCredentials storage-credentials ^Boolean use-https ^java.lang.String endpoint-suffix ^java.lang.String account-name]
    (new CloudStorageAccount storage-credentials use-https endpoint-suffix account-name))
  (^CloudStorageAccount [^com.microsoft.azure.storage.StorageCredentials storage-credentials ^Boolean use-https ^java.lang.String endpoint-suffix]
    (new CloudStorageAccount storage-credentials use-https endpoint-suffix))
  (^CloudStorageAccount [^com.microsoft.azure.storage.StorageCredentials storage-credentials ^Boolean use-https]
    (new CloudStorageAccount storage-credentials use-https))
  (^CloudStorageAccount [^com.microsoft.azure.storage.StorageCredentials storage-credentials]
    (new CloudStorageAccount storage-credentials)))

(defn *get-development-storage-account
  "Returns a CloudStorageAccount object that represents the development storage credentials, using the
   specified proxy URI. Secondary endpoints are enabled by default.

  proxy-uri - A java.net.URI object that represents the proxy endpoint to use. Specifying null will use the default http://127.0.0.1. - `java.net.URI`

  returns: A CloudStorageAccount object for the development storage credentials. - `com.microsoft.azure.storage.CloudStorageAccount`

  throws: java.net.URISyntaxException - If the resource URI is invalid."
  (^com.microsoft.azure.storage.CloudStorageAccount [^java.net.URI proxy-uri]
    (CloudStorageAccount/getDevelopmentStorageAccount proxy-uri))
  (^com.microsoft.azure.storage.CloudStorageAccount []
    (CloudStorageAccount/getDevelopmentStorageAccount )))

(defn *parse
  "Parses a connection string and returns a cloud storage account created from the connection string.

   The connection string should be in the Azure
   connection string format.

   Note that while a connection string may include a SAS token, it is often easier to use the
   CloudBlobContainer.CloudBlobContainer(URI), CloudQueue.CloudQueue(URI),
   CloudTable.CloudTable(URI) constructors directly. To do this, create a
   StorageCredentialsSharedAccessSignature.StorageCredentialsSharedAccessSignature(String) object with your
   SAS token, use the StorageCredentials.transformUri(URI) method on the container,
   queue, or table URI, and then use that URI to construct the object.

  connection-string - A String that represents the connection string to parse. - `java.lang.String`

  returns: A CloudStorageAccount object that represents the cloud storage account constructed from the
           values provided in the connection string. - `com.microsoft.azure.storage.CloudStorageAccount`

  throws: java.security.InvalidKeyException - If credentials in the connection string contain an invalid key."
  (^com.microsoft.azure.storage.CloudStorageAccount [^java.lang.String connection-string]
    (CloudStorageAccount/parse connection-string)))

(defn get-endpoint-suffix
  "If an endpoint suffix was specified, return it

  returns: the endpoint suffix - `java.lang.String`"
  (^java.lang.String [^CloudStorageAccount this]
    (-> this (.getEndpointSuffix))))

(defn create-cloud-file-client
  "Creates a new File service client.

  returns: A CloudFileClient that represents the cloud File client. - `com.microsoft.azure.storage.file.CloudFileClient`"
  (^com.microsoft.azure.storage.file.CloudFileClient [^CloudStorageAccount this]
    (-> this (.createCloudFileClient))))

(defn create-cloud-queue-client
  "Creates a new Queue service client.

  returns: A client object that uses the Queue service endpoint. - `com.microsoft.azure.storage.queue.CloudQueueClient`"
  (^com.microsoft.azure.storage.queue.CloudQueueClient [^CloudStorageAccount this]
    (-> this (.createCloudQueueClient))))

(defn generate-shared-access-signature
  "Returns a shared access signature for the account.

  policy - A SharedAccessAccountPolicy specifying the access policy for the shared access signature. - `com.microsoft.azure.storage.SharedAccessAccountPolicy`

  returns: The query string returned includes the leading question mark. - `java.lang.String`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.lang.String [^CloudStorageAccount this ^com.microsoft.azure.storage.SharedAccessAccountPolicy policy]
    (-> this (.generateSharedAccessSignature policy))))

(defn get-queue-storage-uri
  "Returns the endpoint for the Queue service for the storage account.

  returns: A StorageUri object that represents the Queue endpoint associated with this account. - `com.microsoft.azure.storage.StorageUri`"
  (^com.microsoft.azure.storage.StorageUri [^CloudStorageAccount this]
    (-> this (.getQueueStorageUri))))

(defn to-string
  "Returns a connection string for this storage account, optionally with sensitive data.

  export-secrets - true to include sensitive data in the string; otherwise, false. - `boolean`

  returns: A String that represents the connection string for this storage account,
           optionally with sensitive data. - `java.lang.String`"
  (^java.lang.String [^CloudStorageAccount this ^Boolean export-secrets]
    (-> this (.toString export-secrets)))
  (^java.lang.String [^CloudStorageAccount this]
    (-> this (.toString))))

(defn get-file-storage-uri
  "Returns the endpoint for the File service for the storage account. This method is not supported when using shared
   access signature credentials.

  returns: A StorageUri object that represents the File endpoint associated with this account. - `com.microsoft.azure.storage.StorageUri`"
  (^com.microsoft.azure.storage.StorageUri [^CloudStorageAccount this]
    (-> this (.getFileStorageUri))))

(defn get-blob-storage-uri
  "Returns the endpoint for the Blob service for the storage account. This method is not supported when using shared
   access signature credentials.

  returns: A StorageUri object that represents the Blob endpoint associated with this account. - `com.microsoft.azure.storage.StorageUri`"
  (^com.microsoft.azure.storage.StorageUri [^CloudStorageAccount this]
    (-> this (.getBlobStorageUri))))

(defn create-cloud-blob-client
  "Creates a new Blob service client.

  returns: A CloudBlobClient that represents the cloud Blob client. - `com.microsoft.azure.storage.blob.CloudBlobClient`"
  (^com.microsoft.azure.storage.blob.CloudBlobClient [^CloudStorageAccount this]
    (-> this (.createCloudBlobClient))))

(defn get-table-storage-uri
  "Returns the endpoint for the Table service for the storage account.

  returns: A java.net.URI object that represents the Table endpoint associated with this account. - `com.microsoft.azure.storage.StorageUri`"
  (^com.microsoft.azure.storage.StorageUri [^CloudStorageAccount this]
    (-> this (.getTableStorageUri))))

(defn get-blob-endpoint
  "Returns the endpoint for the Blob service for the storage account. This method is not supported when using shared
   access signature credentials.

  returns: A java.net.URI object that represents the Blob endpoint associated with this account. - `java.net.URI`"
  (^java.net.URI [^CloudStorageAccount this]
    (-> this (.getBlobEndpoint))))

(defn create-cloud-table-client
  "Creates a new Table service client.

  returns: A client object that uses the Table service endpoint. - `com.microsoft.azure.storage.table.CloudTableClient`"
  (^com.microsoft.azure.storage.table.CloudTableClient [^CloudStorageAccount this]
    (-> this (.createCloudTableClient))))

(defn get-queue-endpoint
  "Returns the endpoint for the Queue service for the storage account.

  returns: A java.net.URI object that represents the queue endpoint associated with this account. - `java.net.URI`"
  (^java.net.URI [^CloudStorageAccount this]
    (-> this (.getQueueEndpoint))))

(defn create-cloud-analytics-client
  "Creates a new Analytics service client.

  returns: An analytics client object that uses the Blob and Table service endpoints. - `com.microsoft.azure.storage.analytics.CloudAnalyticsClient`"
  (^com.microsoft.azure.storage.analytics.CloudAnalyticsClient [^CloudStorageAccount this]
    (-> this (.createCloudAnalyticsClient))))

(defn get-table-endpoint
  "Returns the endpoint for the Table service for the storage account.

  returns: A StorageUri object that represents the Table endpoint associated with this account. - `java.net.URI`"
  (^java.net.URI [^CloudStorageAccount this]
    (-> this (.getTableEndpoint))))

(defn get-file-endpoint
  "Returns the endpoint for the File service for the storage account. This method is not supported when using shared
   access signature credentials.

  returns: A java.net.URI object that represents the File endpoint associated with this account. - `java.net.URI`"
  (^java.net.URI [^CloudStorageAccount this]
    (-> this (.getFileEndpoint))))

(defn get-credentials
  "Returns the credentials for the storage account.

  returns: A StorageCredentials object that represents the credentials for this storage account. - `com.microsoft.azure.storage.StorageCredentials`"
  (^com.microsoft.azure.storage.StorageCredentials [^CloudStorageAccount this]
    (-> this (.getCredentials))))

