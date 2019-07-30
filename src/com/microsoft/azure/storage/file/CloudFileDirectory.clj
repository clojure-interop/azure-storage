(ns com.microsoft.azure.storage.file.CloudFileDirectory
  "Represents a virtual directory of files.

  Directories, which are encapsulated as CloudFileDirectory objects, hold files and can also contain
  sub-directories."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.file CloudFileDirectory]))

(defn ->cloud-file-directory
  "Constructor.

  Creates an instance of the CloudFileDirectory class using an absolute URI to the directory
   and credentials.

  directory-absolute-uri - A URI that represents the file directory's address. - `java.net.URI`
  credentials - A StorageCredentials object used to authenticate access. - `com.microsoft.azure.storage.StorageCredentials`

  throws: com.microsoft.azure.storage.StorageException"
  (^CloudFileDirectory [^java.net.URI directory-absolute-uri ^com.microsoft.azure.storage.StorageCredentials credentials]
    (new CloudFileDirectory directory-absolute-uri credentials))
  (^CloudFileDirectory [^java.net.URI directory-absolute-uri]
    (new CloudFileDirectory directory-absolute-uri)))

(defn download-attributes
  "Downloads the directory's properties using the specified request options and operation context.

  access-condition - An AccessCondition object that represents the access conditions for the directory. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudFileDirectory this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadAttributes access-condition options op-context)))
  ([^CloudFileDirectory this]
    (-> this (.downloadAttributes))))

(defn delete
  "Deletes the directory using the specified request options and operation context.

  access-condition - An AccessCondition object that represents the access conditions for the directory. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudFileDirectory this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.delete access-condition options op-context)))
  ([^CloudFileDirectory this]
    (-> this (.delete))))

(defn list-files-and-directories
  "Returns an enumerable collection of file and directory items for the directory.

  prefix - A string containing the file or directory name prefix. - `java.lang.String`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: An enumerable collection of ListFileItem objects that represent the file and directory items in
           this directory. - `java.lang.Iterable<com.microsoft.azure.storage.file.ListFileItem>`"
  (^java.lang.Iterable [^CloudFileDirectory this ^java.lang.String prefix ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.listFilesAndDirectories prefix options op-context)))
  (^java.lang.Iterable [^CloudFileDirectory this ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.listFilesAndDirectories options op-context)))
  (^java.lang.Iterable [^CloudFileDirectory this]
    (-> this (.listFilesAndDirectories))))

(defn get-file-reference
  "Returns a reference to a CloudFile object that represents a file in this directory.

  file-name - A String that represents the name of the file. - `java.lang.String`

  returns: A CloudFile object that represents a reference to the specified file. - `com.microsoft.azure.storage.file.CloudFile`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.file.CloudFile [^CloudFileDirectory this ^java.lang.String file-name]
    (-> this (.getFileReference file-name))))

(defn get-storage-uri
  "Returns the list of URIs for all locations.

  returns: A StorageUri that represents the list of URIs for all locations. - `com.microsoft.azure.storage.StorageUri`"
  (^com.microsoft.azure.storage.StorageUri [^CloudFileDirectory this]
    (-> this (.getStorageUri))))

(defn get-name
  "Returns the name of this directory.

  returns: An String that represents the name of the directory. - `java.lang.String`"
  (^java.lang.String [^CloudFileDirectory this]
    (-> this (.getName))))

(defn get-service-client
  "Returns the File service client associated with this directory.

  returns: An CloudFileClient object that represents the service client associated with the directory. - `com.microsoft.azure.storage.file.CloudFileClient`"
  (^com.microsoft.azure.storage.file.CloudFileClient [^CloudFileDirectory this]
    (-> this (.getServiceClient))))

(defn get-share
  "Returns the share for this directory.

  returns: A CloudFileShare that represents the share for this directory. - `com.microsoft.azure.storage.file.CloudFileShare`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.file.CloudFileShare [^CloudFileDirectory this]
    (-> this (.getShare))))

(defn get-uri
  "Returns the URI for this directory.

  returns: A java.net.URI object that represents the URI for this directory. - `java.net.URI`"
  (^java.net.URI [^CloudFileDirectory this]
    (-> this (.getUri))))

(defn get-properties
  "Returns the FileDirectoryProperties object that holds the directory's system properties.

  returns: A FileDirectoryProperties object that holds the system properties associated with the
           directory. - `com.microsoft.azure.storage.file.FileDirectoryProperties`"
  (^com.microsoft.azure.storage.file.FileDirectoryProperties [^CloudFileDirectory this]
    (-> this (.getProperties))))

(defn delete-if-exists
  "Deletes the directory if it exists using the specified request options and operation context.

  access-condition - An AccessCondition object that represents the access conditions for the directory. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: true if the directory existed and was deleted; otherwise, false. - `boolean`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^Boolean [^CloudFileDirectory this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.deleteIfExists access-condition options op-context)))
  (^Boolean [^CloudFileDirectory this]
    (-> this (.deleteIfExists))))

(defn get-parent
  "Returns the CloudFileDirectory parent directory associated with this directory.

  returns: An CloudFileDirectory object that represents the parent directory associated with the directory. - `com.microsoft.azure.storage.file.CloudFileDirectory`

  throws: com.microsoft.azure.storage.StorageException"
  (^com.microsoft.azure.storage.file.CloudFileDirectory [^CloudFileDirectory this]
    (-> this (.getParent))))

(defn create-if-not-exists
  "Creates the directory if it does not exist, using the specified request options and operation context.

  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client (CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: true if the directory did not already exist and was created; otherwise, false. - `boolean`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^Boolean [^CloudFileDirectory this ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.createIfNotExists options op-context)))
  (^Boolean [^CloudFileDirectory this]
    (-> this (.createIfNotExists))))

(defn list-files-and-directories-segmented
  "Returns a result segment of an enumerable collection of files and directories for this directory, using the
   specified listing details options, request options, and operation context.

  prefix - A string containing the file or directory name prefix. - `java.lang.String`
  max-results - The maximum number of results to retrieve. If null or greater than 5000, the server will return up to 5,000 items. Must be at least 1. - `java.lang.Integer`
  continuation-token - A ResultContinuation object that represents a continuation token returned by a previous listing operation. - `com.microsoft.azure.storage.ResultContinuation`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A ResultSegment object that contains a segment of the enumerable collection of
           ListFileItem objects that represent the files and directories in this directory. - `com.microsoft.azure.storage.ResultSegment<com.microsoft.azure.storage.file.ListFileItem>`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.ResultSegment [^CloudFileDirectory this ^java.lang.String prefix ^java.lang.Integer max-results ^com.microsoft.azure.storage.ResultContinuation continuation-token ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.listFilesAndDirectoriesSegmented prefix max-results continuation-token options op-context)))
  (^com.microsoft.azure.storage.ResultSegment [^CloudFileDirectory this ^java.lang.Integer max-results ^com.microsoft.azure.storage.ResultContinuation continuation-token ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.listFilesAndDirectoriesSegmented max-results continuation-token options op-context)))
  (^com.microsoft.azure.storage.ResultSegment [^CloudFileDirectory this]
    (-> this (.listFilesAndDirectoriesSegmented))))

(defn get-directory-reference
  "Returns a reference to a CloudFileDirectory object that represents a directory in this directory.

  item-name - A String that represents the name of the directory. - `java.lang.String`

  returns: A CloudFileDirectory object that represents a reference to the specified directory. - `com.microsoft.azure.storage.file.CloudFileDirectory`

  throws: java.net.URISyntaxException - If the resource URI is invalid."
  (^com.microsoft.azure.storage.file.CloudFileDirectory [^CloudFileDirectory this ^java.lang.String item-name]
    (-> this (.getDirectoryReference item-name))))

(defn create
  "Creates the directory using the specified options and operation context.

  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudFileDirectory this ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.create options op-context)))
  ([^CloudFileDirectory this]
    (-> this (.create))))

(defn upload-metadata
  "Uploads the directory's metadata using the specified request options and operation context.

  access-condition - An AccessCondition object that represents the access conditions for the directory. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudFileDirectory this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadMetadata access-condition options op-context)))
  ([^CloudFileDirectory this]
    (-> this (.uploadMetadata))))

(defn exists?
  "Returns a value that indicates whether the directory exists, using the specified request options and operation
   context.

  access-condition - An AccessCondition object that represents the access conditions for the share. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: true if the directory exists, otherwise false. - `boolean`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^Boolean [^CloudFileDirectory this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.exists access-condition options op-context)))
  (^Boolean [^CloudFileDirectory this]
    (-> this (.exists))))

(defn get-metadata
  "Returns the metadata for the directory. This value is initialized with the metadata from the directory
   by a call to downloadAttributes(), and is set on the directory with a call to uploadMetadata().

  returns: A java.util.HashMap object that represents the metadata for the directory. - `java.util.HashMap<java.lang.String,java.lang.String>`"
  (^java.util.HashMap [^CloudFileDirectory this]
    (-> this (.getMetadata))))

(defn set-metadata
  "Sets the metadata collection of name-value pairs to be set on the directory with an uploadMetadata() call.
   This collection will overwrite any existing directory metadata. If this is set to an empty collection, the
   directory metadata will be cleared on an uploadMetadata() call.

  metadata - A java.util.HashMap object that represents the metadata being assigned to the directory. - `java.util.HashMap`"
  ([^CloudFileDirectory this ^java.util.HashMap metadata]
    (-> this (.setMetadata metadata))))

