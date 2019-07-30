(ns com.microsoft.azure.storage.table.CloudTableClient
  "Provides a service client for accessing the Microsoft Azure Table service.

  The CloudTableClient class encapsulates the base URI for the Table service endpoint and the credentials for
  accessing the storage account, and provides methods to create, delete, list, and query tables, as well as methods to
  execute operations and queries on table entities. These methods invoke Storage Service REST API operations to make
  the requests and obtain the results that are returned.

  A Table service endpoint is the base URI for Table service resources, including the DNS name of the storage account:

      http://myaccount.table.core.windows.net
  For more information, see the MSDN topic Addressing Table Service Resources.

  The credentials can be a combination of the storage account name and a key, or a shared access signature. For more
  information, see the MSDN topic Authenticating
  Access to Your Storage Account."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.table CloudTableClient]))

(defn ->cloud-table-client
  "Constructor.

  Initializes an instance of the CloudTableClient class using a Table service endpoint and
   storage account credentials.

  base-uri - A java.net.URI object that represents the Table service endpoint used to initialize the client. - `java.net.URI`
  credentials - A StorageCredentials object that represents the storage account credentials for access. - `com.microsoft.azure.storage.StorageCredentials`"
  (^CloudTableClient [^java.net.URI base-uri ^com.microsoft.azure.storage.StorageCredentials credentials]
    (new CloudTableClient base-uri credentials)))

(defn get-table-reference
  "Gets a CloudTable object with the specified name.

  table-name - A String which represents the name of the table, which must adhere to table naming rules. The table name should not include any path separator characters (/). Table names are case insensitive, must be unique within an account and must be between 3-63 characters long. Table names must start with an cannot begin with a numeric character and may only contain alphanumeric characters. Some table names are reserved, including \"table\". - `java.lang.String`

  returns: A reference to a CloudTable object. - `com.microsoft.azure.storage.table.CloudTable`

  throws: java.net.URISyntaxException - If the resource URI constructed based on the tableName is invalid."
  (^com.microsoft.azure.storage.table.CloudTable [^CloudTableClient this ^java.lang.String table-name]
    (-> this (.getTableReference table-name))))

(defn list-tables
  "Lists the table names in the storage account that match the specified prefix, using the specified
   TableRequestOptions and OperationContext.

   This method invokes the Query Tables
   REST API to list the table names that match the prefix, using the Table service endpoint and storage account
   credentials of this instance.

   Use the TableRequestOptions to override execution options such as the timeout or retry policy for the
   operation.

  prefix - A String containing the prefix to match on table names to return. - `java.lang.String`
  options - A TableRequestOptions object that specifies execution options such as retry policy and timeout settings for the operation. Specify null to use the request options specified on the CloudTableClient. - `com.microsoft.azure.storage.table.TableRequestOptions`
  op-context - An OperationContext object for tracking the current operation. Specify null to safely ignore operation context. - `com.microsoft.azure.storage.OperationContext`

  returns: An Iterable collection of the table names in the storage account retrieved lazily that match
           the specified
           prefix. - `java.lang.Iterable<java.lang.String>`"
  (^java.lang.Iterable [^CloudTableClient this ^java.lang.String prefix ^com.microsoft.azure.storage.table.TableRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.listTables prefix options op-context)))
  (^java.lang.Iterable [^CloudTableClient this ^java.lang.String prefix]
    (-> this (.listTables prefix)))
  (^java.lang.Iterable [^CloudTableClient this]
    (-> this (.listTables))))

(defn list-tables-segmented
  "Lists up to the specified maximum of the table names in the storage account that match the specified prefix in a
   resumable mode with the specified ResultContinuation continuation token, using the specified
   TableRequestOptions and OperationContext. This method allows listing of tables to be resumed
   after returning a page of results, using information returned by the server in the ResultSegment object.

   This method invokes the Query Tables
   REST API to list the table names that match the prefix, using the Table service endpoint and storage account
   credentials of this instance.

   Use the TableRequestOptions to override execution options such as the timeout or retry policy for the
   operation.

  prefix - A String containing the prefix to match on table names to return. - `java.lang.String`
  max-results - The maximum number of table names to return in the ResultSegment. If this parameter is null, the query will list up to the maximum 1,000 results. - `java.lang.Integer`
  continuation-token - A ResultContinuation object representing a continuation token from the server when the operation returns a partial result. Specify null on the initial call. Call the ResultSegment.getContinuationToken() method on the result to obtain the ResultContinuation object to use in the next call to resume the query. - `com.microsoft.azure.storage.ResultContinuation`
  options - A TableRequestOptions object that specifies execution options such as retry policy and timeout settings for the operation. Specify null to use the request options specified on the CloudTableClient. - `com.microsoft.azure.storage.table.TableRequestOptions`
  op-context - An OperationContext object for tracking the current operation. Specify null to safely ignore operation context. - `com.microsoft.azure.storage.OperationContext`

  returns: A ResultSegment of String objects containing table names in the storage account. - `com.microsoft.azure.storage.ResultSegment<java.lang.String>`

  throws: com.microsoft.azure.storage.StorageException - if a storage service error occurred during the operation."
  (^com.microsoft.azure.storage.ResultSegment [^CloudTableClient this ^java.lang.String prefix ^java.lang.Integer max-results ^com.microsoft.azure.storage.ResultContinuation continuation-token ^com.microsoft.azure.storage.table.TableRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.listTablesSegmented prefix max-results continuation-token options op-context)))
  (^com.microsoft.azure.storage.ResultSegment [^CloudTableClient this ^java.lang.String prefix]
    (-> this (.listTablesSegmented prefix)))
  (^com.microsoft.azure.storage.ResultSegment [^CloudTableClient this]
    (-> this (.listTablesSegmented))))

(defn get-service-stats
  "Queries the given storage service for the ServiceStats.

  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.table.TableRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: ServiceStats for the given storage service - `com.microsoft.azure.storage.ServiceStats`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.ServiceStats [^CloudTableClient this ^com.microsoft.azure.storage.table.TableRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.getServiceStats options op-context)))
  (^com.microsoft.azure.storage.ServiceStats [^CloudTableClient this]
    (-> this (.getServiceStats))))

(defn download-service-properties
  "Retrieves the current ServiceProperties for the given storage service. This includes Logging,
   HourMetrics, MinuteMetrics and CORS configurations.

  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.table.TableRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: the ServiceProperties object representing the current configuration of the service. - `com.microsoft.azure.storage.ServiceProperties`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.ServiceProperties [^CloudTableClient this ^com.microsoft.azure.storage.table.TableRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadServiceProperties options op-context)))
  (^com.microsoft.azure.storage.ServiceProperties [^CloudTableClient this]
    (-> this (.downloadServiceProperties))))

(defn upload-service-properties
  "Uploads a new ServiceProperties configuration to the given storage service. This includes Logging,
   HourMetrics, MinuteMetrics and CORS configurations.

  properties - The ServiceProperties to upload. - `com.microsoft.azure.storage.ServiceProperties`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.table.TableRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudTableClient this ^com.microsoft.azure.storage.ServiceProperties properties ^com.microsoft.azure.storage.table.TableRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadServiceProperties properties options op-context)))
  ([^CloudTableClient this ^com.microsoft.azure.storage.ServiceProperties properties]
    (-> this (.uploadServiceProperties properties))))

(defn get-default-request-options
  "Gets the TableRequestOptions that is used for requests associated with this CloudTableClient

  returns: The TableRequestOptions object containing the values used by this CloudTableClient - `com.microsoft.azure.storage.table.TableRequestOptions`"
  (^com.microsoft.azure.storage.table.TableRequestOptions [^CloudTableClient this]
    (-> this (.getDefaultRequestOptions))))

(defn set-default-request-options
  "Sets the TableRequestOptions that is used for any table accessed with this CloudTableClient
   object.

  default-request-options - The TableRequestOptions to use. - `com.microsoft.azure.storage.table.TableRequestOptions`"
  ([^CloudTableClient this ^com.microsoft.azure.storage.table.TableRequestOptions default-request-options]
    (-> this (.setDefaultRequestOptions default-request-options))))

