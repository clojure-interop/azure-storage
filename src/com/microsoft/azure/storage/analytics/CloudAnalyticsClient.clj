(ns com.microsoft.azure.storage.analytics.CloudAnalyticsClient
  "Provides a client-side logical representation for Microsoft Azure Storage Analytics. This client is used to configure
  and execute storage analytics requests.

  The service client encapsulates the endpoint or endpoints for the blob and table service. It also encapsulates the
  credentials for accessing the storage account."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.analytics CloudAnalyticsClient]))

(defn ->cloud-analytics-client
  "Constructor.

  Initializes a new instance of the CloudAnalyticsClient class using the specified blob and table
   service endpoints and account credentials.

  blob-storage-uri - A StorageUri object containing the Blob service endpoint to use to create the client. - `com.microsoft.azure.storage.StorageUri`
  table-storage-uri - A StorageUri object containing the Table service endpoint to use to create the client. - `com.microsoft.azure.storage.StorageUri`
  credentials - A StorageCredentials object. - `com.microsoft.azure.storage.StorageCredentials`"
  (^CloudAnalyticsClient [^com.microsoft.azure.storage.StorageUri blob-storage-uri ^com.microsoft.azure.storage.StorageUri table-storage-uri ^com.microsoft.azure.storage.StorageCredentials credentials]
    (new CloudAnalyticsClient blob-storage-uri table-storage-uri credentials)))

(defn *parse-log-blobs
  "Returns an enumerable collection of log records, retrieved lazily.

  log-blobs - An Iterable of blobs to parse LogRecords from. - `java.lang.Iterable`

  returns: An enumerable collection of objects that implement LogRecord and are retrieved lazily. - `java.lang.Iterable<com.microsoft.azure.storage.analytics.LogRecord>`"
  (^java.lang.Iterable [^java.lang.Iterable log-blobs]
    (CloudAnalyticsClient/parseLogBlobs log-blobs)))

(defn *parse-log-blob
  "Returns an enumerable collection of log records, retrieved lazily.

  log-blob - A single blob to parse LogRecords from. - `com.microsoft.azure.storage.blob.ListBlobItem`

  returns: An enumerable collection of objects that implement LogRecord and are retrieved lazily. - `java.lang.Iterable<com.microsoft.azure.storage.analytics.LogRecord>`"
  (^java.lang.Iterable [^com.microsoft.azure.storage.blob.ListBlobItem log-blob]
    (CloudAnalyticsClient/parseLogBlob log-blob)))

(defn get-log-directory
  "Gets the CloudBlobDirectory object for the logs for a specific storage service.

  service - A StorageService enumeration value that indicates which storage service to use. - `com.microsoft.azure.storage.analytics.StorageService`

  returns: A CloudBlobDirectory object. - `com.microsoft.azure.storage.blob.CloudBlobDirectory`

  throws: java.net.URISyntaxException"
  (^com.microsoft.azure.storage.blob.CloudBlobDirectory [^CloudAnalyticsClient this ^com.microsoft.azure.storage.analytics.StorageService service]
    (-> this (.getLogDirectory service))))

(defn get-hour-metrics-table
  "Gets the hour metrics table for a specific storage service.

  service - A StorageService enumeration value that indicates which storage service to use. - `com.microsoft.azure.storage.analytics.StorageService`
  location - A StorageLocation enumeration value that indicates which storage location to use. - `com.microsoft.azure.storage.StorageLocation`

  returns: The CloudTable object for the storage service. - `com.microsoft.azure.storage.table.CloudTable`

  throws: java.net.URISyntaxException"
  (^com.microsoft.azure.storage.table.CloudTable [^CloudAnalyticsClient this ^com.microsoft.azure.storage.analytics.StorageService service ^com.microsoft.azure.storage.StorageLocation location]
    (-> this (.getHourMetricsTable service location)))
  (^com.microsoft.azure.storage.table.CloudTable [^CloudAnalyticsClient this ^com.microsoft.azure.storage.analytics.StorageService service]
    (-> this (.getHourMetricsTable service))))

(defn get-minute-metrics-table
  "Gets the minute metrics table for a specific storage service.

  service - A StorageService enumeration value that indicates which storage service to use. - `com.microsoft.azure.storage.analytics.StorageService`
  location - A StorageLocation enumeration value that indicates which storage location to use. - `com.microsoft.azure.storage.StorageLocation`

  returns: The CloudTable object for the storage service. - `com.microsoft.azure.storage.table.CloudTable`

  throws: java.net.URISyntaxException"
  (^com.microsoft.azure.storage.table.CloudTable [^CloudAnalyticsClient this ^com.microsoft.azure.storage.analytics.StorageService service ^com.microsoft.azure.storage.StorageLocation location]
    (-> this (.getMinuteMetricsTable service location)))
  (^com.microsoft.azure.storage.table.CloudTable [^CloudAnalyticsClient this ^com.microsoft.azure.storage.analytics.StorageService service]
    (-> this (.getMinuteMetricsTable service))))

(defn get-capacity-table
  "Gets the capacity metrics table for the blob service.

  returns: A CloudTable object. - `com.microsoft.azure.storage.table.CloudTable`

  throws: java.net.URISyntaxException"
  (^com.microsoft.azure.storage.table.CloudTable [^CloudAnalyticsClient this]
    (-> this (.getCapacityTable))))

(defn list-log-blobs
  "Returns an enumerable collection of log blobs, retrieved lazily.

  service - A StorageService enumeration value that indicates which storage service to use. - `com.microsoft.azure.storage.analytics.StorageService`
  start-time - A java.util.Date object representing the start of the time range for which logs should be retrieved. - `java.util.Date`
  end-time - A java.util.Date object representing the end of the time range for which logs should be retrieved. - `java.util.Date`
  operations - A LoggingOperations enumeration set that indicates which log types to return. - `java.util.EnumSet`
  details - A BlobListingDetails enumeration set that indicates whether or not blob metadata should be returned. None or METADATA are the only valid values. - `com.microsoft.azure.storage.blob.BlobListingDetails`
  options - A BlobRequestOptions object that specifies additional options for the request. - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  operation-context - An OperationContext object that represents the context for the current operation. - `com.microsoft.azure.storage.OperationContext`

  returns: An enumerable collection of objects that implement ListBlobItem and are retrieved lazily. - `java.lang.Iterable<com.microsoft.azure.storage.blob.ListBlobItem>`

  throws: com.microsoft.azure.storage.StorageException"
  (^java.lang.Iterable [^CloudAnalyticsClient this ^com.microsoft.azure.storage.analytics.StorageService service ^java.util.Date start-time ^java.util.Date end-time ^java.util.EnumSet operations ^com.microsoft.azure.storage.blob.BlobListingDetails details ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext operation-context]
    (-> this (.listLogBlobs service start-time end-time operations details options operation-context)))
  (^java.lang.Iterable [^CloudAnalyticsClient this ^com.microsoft.azure.storage.analytics.StorageService service]
    (-> this (.listLogBlobs service))))

(defn list-log-records
  "Returns an enumerable collection of log records, retrieved lazily.

  service - A StorageService enumeration value that indicates which storage service to use. - `com.microsoft.azure.storage.analytics.StorageService`
  start-time - A java.util.Date object representing the start of the time range for which logs should be retrieved. - `java.util.Date`
  end-time - A java.util.Date object representing the end of the time range for which logs should be retrieved. - `java.util.Date`
  options - A BlobRequestOptions object that specifies additional options for the request. - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  operation-context - An OperationContext object that represents the context for the current operation. - `com.microsoft.azure.storage.OperationContext`

  returns: An enumerable collection of objects that implement ListBlobItem and are retrieved lazily. - `java.lang.Iterable<com.microsoft.azure.storage.analytics.LogRecord>`

  throws: com.microsoft.azure.storage.StorageException"
  (^java.lang.Iterable [^CloudAnalyticsClient this ^com.microsoft.azure.storage.analytics.StorageService service ^java.util.Date start-time ^java.util.Date end-time ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext operation-context]
    (-> this (.listLogRecords service start-time end-time options operation-context)))
  (^java.lang.Iterable [^CloudAnalyticsClient this ^com.microsoft.azure.storage.analytics.StorageService service]
    (-> this (.listLogRecords service))))

