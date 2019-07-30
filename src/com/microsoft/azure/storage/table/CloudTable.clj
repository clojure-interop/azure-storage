(ns com.microsoft.azure.storage.table.CloudTable
  "Represents a table in the Microsoft Azure Table service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.table CloudTable]))

(defn ->cloud-table
  "Constructor.

  Creates an instance of the CloudTable class using the specified table URI and credentials.

  uri - A java.net.URI object that represents the absolute URI of the table. - `java.net.URI`
  credentials - A StorageCredentials object used to authenticate access. - `com.microsoft.azure.storage.StorageCredentials`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^CloudTable [^java.net.URI uri ^com.microsoft.azure.storage.StorageCredentials credentials]
    (new CloudTable uri credentials))
  (^CloudTable [^java.net.URI uri]
    (new CloudTable uri)))

(defn delete
  "Deletes the table from the storage service, using the specified request options and operation context.

  options - A TableRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudTableClient). - `com.microsoft.azure.storage.table.TableRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred during the operation."
  ([^CloudTable this ^com.microsoft.azure.storage.table.TableRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.delete options op-context)))
  ([^CloudTable this]
    (-> this (.delete))))

(defn generate-shared-access-signature
  "Creates a shared access signature for the table.

  policy - A SharedAccessTablePolicy object which represents the access policy for the shared access signature. - `com.microsoft.azure.storage.table.SharedAccessTablePolicy`
  access-policy-identifier - A String which represents a table-level access policy. - `java.lang.String`
  start-partition-key - A String which represents the starting partition key. - `java.lang.String`
  start-row-key - A String which represents the starting row key. - `java.lang.String`
  end-partition-key - A String which represents the ending partition key. - `java.lang.String`
  end-row-key - A String which represents the ending end key. - `java.lang.String`
  ip-range - A IPRange object containing the range of allowed IP addresses. - `com.microsoft.azure.storage.IPRange`
  protocols - A SharedAccessProtocols representing the allowed Internet protocols. - `com.microsoft.azure.storage.SharedAccessProtocols`

  returns: A String containing the shared access signature for the table. - `java.lang.String`

  throws: java.security.InvalidKeyException - If an invalid key was passed."
  (^java.lang.String [^CloudTable this ^com.microsoft.azure.storage.table.SharedAccessTablePolicy policy ^java.lang.String access-policy-identifier ^java.lang.String start-partition-key ^java.lang.String start-row-key ^java.lang.String end-partition-key ^java.lang.String end-row-key ^com.microsoft.azure.storage.IPRange ip-range ^com.microsoft.azure.storage.SharedAccessProtocols protocols]
    (-> this (.generateSharedAccessSignature policy access-policy-identifier start-partition-key start-row-key end-partition-key end-row-key ip-range protocols)))
  (^java.lang.String [^CloudTable this ^com.microsoft.azure.storage.table.SharedAccessTablePolicy policy ^java.lang.String access-policy-identifier ^java.lang.String start-partition-key ^java.lang.String start-row-key ^java.lang.String end-partition-key ^java.lang.String end-row-key]
    (-> this (.generateSharedAccessSignature policy access-policy-identifier start-partition-key start-row-key end-partition-key end-row-key))))

(defn upload-permissions
  "Uploads the table's permissions using the specified request options and operation context.

  permissions - A TablePermissions object that represents the permissions to upload. - `com.microsoft.azure.storage.table.TablePermissions`
  options - A TableRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudTableClient). - `com.microsoft.azure.storage.table.TableRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudTable this ^com.microsoft.azure.storage.table.TablePermissions permissions ^com.microsoft.azure.storage.table.TableRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadPermissions permissions options op-context)))
  ([^CloudTable this ^com.microsoft.azure.storage.table.TablePermissions permissions]
    (-> this (.uploadPermissions permissions))))

(defn get-storage-uri
  "Returns the list of URIs for all locations.

  returns: A StorageUri that represents the list of URIs for all locations.. - `com.microsoft.azure.storage.StorageUri`"
  (^com.microsoft.azure.storage.StorageUri [^CloudTable this]
    (-> this (.getStorageUri))))

(defn get-name
  "Gets the name of the table.

  returns: A String object that represents the name of the table. - `java.lang.String`"
  (^java.lang.String [^CloudTable this]
    (-> this (.getName))))

(defn get-service-client
  "Gets the table service client associated with this queue.

  returns: A CloudTableClient object that represents the service client associated with this table. - `com.microsoft.azure.storage.table.CloudTableClient`"
  (^com.microsoft.azure.storage.table.CloudTableClient [^CloudTable this]
    (-> this (.getServiceClient))))

(defn execute-segmented
  "Executes a query in segmented mode with the specified ResultContinuation continuation token,
   using the specified TableRequestOptions and OperationContext, applying the EntityResolver
   to the result.
   Executing a query with executeSegmented allows the query to be resumed after returning partial
   results, using information returned by the server in the ResultSegment object.

   This method will invoke a Query
   Entities operation on the Table Service
   REST API to query the table, using the Table service endpoint and storage account credentials of this
   instance.

   Use the TableRequestOptions to override execution options such as the timeout or retry policy for the
   operation.

  query - A TableQuery instance specifying the table to query and the query parameters to use. - `com.microsoft.azure.storage.table.TableQuery`
  resolver - An EntityResolver instance which creates a projection of the table query result entities into the specified type R. - `com.microsoft.azure.storage.table.EntityResolver`
  continuation-token - A ResultContinuation object representing a continuation token from the server when the operation returns a partial result. Specify null on the initial call. Call the ResultSegment.getContinuationToken() method on the result to obtain the ResultContinuation object to use in the next call to resume the query. - `com.microsoft.azure.storage.ResultContinuation`
  options - A TableRequestOptions object that specifies execution options such as retry policy and timeout settings for the operation. Specify null to use the request options specified on the CloudTableClient. - `com.microsoft.azure.storage.table.TableRequestOptions`
  op-context - An OperationContext object for tracking the current operation. Specify null to safely ignore operation context. - `com.microsoft.azure.storage.OperationContext`

  returns: A ResultSegment containing the projection into type R of the results of executing
           the query. - `<R> com.microsoft.azure.storage.ResultSegment<R>`

  throws: com.microsoft.azure.storage.StorageException - if a storage service error occurred during the operation."
  ([^CloudTable this ^com.microsoft.azure.storage.table.TableQuery query ^com.microsoft.azure.storage.table.EntityResolver resolver ^com.microsoft.azure.storage.ResultContinuation continuation-token ^com.microsoft.azure.storage.table.TableRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.executeSegmented query resolver continuation-token options op-context)))
  ([^CloudTable this ^com.microsoft.azure.storage.table.TableQuery query ^com.microsoft.azure.storage.ResultContinuation continuation-token ^com.microsoft.azure.storage.table.TableRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.executeSegmented query continuation-token options op-context)))
  ([^CloudTable this ^com.microsoft.azure.storage.table.TableQuery query ^com.microsoft.azure.storage.table.EntityResolver resolver ^com.microsoft.azure.storage.ResultContinuation continuation-token]
    (-> this (.executeSegmented query resolver continuation-token)))
  ([^CloudTable this ^com.microsoft.azure.storage.table.TableQuery query ^com.microsoft.azure.storage.ResultContinuation continuation-token]
    (-> this (.executeSegmented query continuation-token))))

(defn get-uri
  "Gets the absolute URI for this table.

  returns: A java.net.URI object that represents the URI for this table. - `java.net.URI`"
  (^java.net.URI [^CloudTable this]
    (-> this (.getUri))))

(defn delete-if-exists
  "Deletes the table from the storage service using the specified request options and operation context, if it
   exists.

  options - A TableRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudTableClient). - `com.microsoft.azure.storage.table.TableRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A value of true if the table existed in the storage service and has been deleted, otherwise
           false. - `boolean`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred during the operation."
  (^Boolean [^CloudTable this ^com.microsoft.azure.storage.table.TableRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.deleteIfExists options op-context)))
  (^Boolean [^CloudTable this]
    (-> this (.deleteIfExists))))

(defn create-if-not-exists
  "Creates the table in the storage service with the specified request options and operation context, if it does not
   already exist.

  options - A TableRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudTableClient). - `com.microsoft.azure.storage.table.TableRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: true if the table did not already exist and was created; otherwise false . - `boolean`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred during the operation."
  (^Boolean [^CloudTable this ^com.microsoft.azure.storage.table.TableRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.createIfNotExists options op-context)))
  (^Boolean [^CloudTable this]
    (-> this (.createIfNotExists))))

(defn execute
  "Executes a query, applying the specified EntityResolver to the result, using the
   specified TableRequestOptions and OperationContext.

   This method will invoke a Query
   Entities operation on the Table Service
   REST API to query the table, using the Table service endpoint and storage account credentials of this
   instance.

   Use the TableRequestOptions to override execution options such as the timeout or retry policy for the
   operation.

  query - A TableQuery instance specifying the table to query and the query parameters to use. - `com.microsoft.azure.storage.table.TableQuery`
  resolver - An EntityResolver instance which creates a projection of the table query result entities into the specified type R. - `com.microsoft.azure.storage.table.EntityResolver`
  options - A TableRequestOptions object that specifies execution options such as retry policy and timeout settings for the operation. Specify null to use the request options specified on the CloudTableClient. - `com.microsoft.azure.storage.table.TableRequestOptions`
  op-context - An OperationContext object for tracking the current operation. Specify null to safely ignore operation context. - `com.microsoft.azure.storage.OperationContext`

  returns: A collection implementing the Iterable interface containing the projection into type
           R of the results of executing the query. - `<R> java.lang.Iterable<R>`"
  ([^CloudTable this ^com.microsoft.azure.storage.table.TableQuery query ^com.microsoft.azure.storage.table.EntityResolver resolver ^com.microsoft.azure.storage.table.TableRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.execute query resolver options op-context)))
  (^java.util.ArrayList [^CloudTable this ^com.microsoft.azure.storage.table.TableBatchOperation batch ^com.microsoft.azure.storage.table.TableRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.execute batch options op-context)))
  ([^CloudTable this ^com.microsoft.azure.storage.table.TableQuery query ^com.microsoft.azure.storage.table.EntityResolver resolver]
    (-> this (.execute query resolver)))
  (^java.util.ArrayList [^CloudTable this ^com.microsoft.azure.storage.table.TableBatchOperation batch]
    (-> this (.execute batch))))

(defn create
  "Creates the table in the storage service, using the specified TableRequestOptions and
   OperationContext.

   This method invokes the Create Table
   REST API to create the specified table, using the Table service endpoint and storage account credentials of this
   instance.

   Use the TableRequestOptions to override execution options such as the timeout or retry policy for the
   operation.

  options - A TableRequestOptions object that specifies execution options such as retry policy and timeout settings for the operation. Specify null to use the request options specified on the CloudTableClient. - `com.microsoft.azure.storage.table.TableRequestOptions`
  op-context - An OperationContext object for tracking the current operation. Specify null to safely ignore operation context. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If an error occurs accessing the storage service, or because the table cannot be created, or already exists."
  ([^CloudTable this ^com.microsoft.azure.storage.table.TableRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.create options op-context)))
  ([^CloudTable this]
    (-> this (.create))))

(defn exists?
  "Returns a value that indicates whether the table exists in the storage service, using the specified request
   options and operation context.

  options - A TableRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudTableClient). - `com.microsoft.azure.storage.table.TableRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: true if the table exists in the storage service, otherwise false. - `boolean`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred during the operation."
  (^Boolean [^CloudTable this ^com.microsoft.azure.storage.table.TableRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.exists options op-context)))
  (^Boolean [^CloudTable this]
    (-> this (.exists))))

(defn download-permissions
  "Downloads the permissions settings for the table using the specified request options and operation context.

  options - A TableRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudTableClient). - `com.microsoft.azure.storage.table.TableRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A TablePermissions object that represents the table's permissions. - `com.microsoft.azure.storage.table.TablePermissions`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.table.TablePermissions [^CloudTable this ^com.microsoft.azure.storage.table.TableRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadPermissions options op-context)))
  (^com.microsoft.azure.storage.table.TablePermissions [^CloudTable this]
    (-> this (.downloadPermissions))))

