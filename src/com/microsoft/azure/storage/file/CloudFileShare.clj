(ns com.microsoft.azure.storage.file.CloudFileShare
  "Represents a share in the Microsoft Azure File service.

  Shares hold directories, which are encapsulated as CloudFileDirectory objects, and directories hold files.
  Directories can also contain sub-directories."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.file CloudFileShare]))

(defn ->cloud-file-share
  "Constructor.

  Creates an instance of the CloudFileShare class using the specified name and client.

  share-name - A String which represents the name of the share, which must adhere to share naming rules. The share name should not include any path separator characters (/). Share names must be lowercase, between 3-63 characters long and must start with a letter or number. Share names may contain only letters, numbers, and the dash (-) character. - `java.lang.String`
  snapshot-id - A String that represents the snapshot version, if applicable. - `java.lang.String`
  client - A CloudFileClient object that represents the associated service client, and that specifies the endpoint for the File service. - `com.microsoft.azure.storage.file.CloudFileClient`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^CloudFileShare [^java.lang.String share-name ^java.lang.String snapshot-id ^com.microsoft.azure.storage.file.CloudFileClient client]
    (new CloudFileShare share-name snapshot-id client))
  (^CloudFileShare [^java.net.URI uri ^com.microsoft.azure.storage.StorageCredentials credentials]
    (new CloudFileShare uri credentials))
  (^CloudFileShare [^java.net.URI uri]
    (new CloudFileShare uri)))

(defn download-attributes
  "Downloads the share's attributes, which consist of metadata and properties, using the specified request
   options and operation context.

  access-condition - An AccessCondition object that represents the access conditions for the share. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudFileShare this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadAttributes access-condition options op-context)))
  ([^CloudFileShare this]
    (-> this (.downloadAttributes))))

(defn delete
  "Deletes the share using the specified snapshot and request options, and operation context.

   A share that has snapshots cannot be deleted unless the snapshots are also deleted. If a share has snapshots, use
   the DeleteShareSnapshotsOption.INCLUDE_SNAPSHOTS value
   in the deleteSnapshotsOption parameter to include the snapshots when deleting the base share.

  delete-snapshots-option - A DeleteShareSnapshotsOption object that indicates whether to delete only snapshots, or the share and its snapshots. - `com.microsoft.azure.storage.file.DeleteShareSnapshotsOption`
  access-condition - An AccessCondition object that represents the access conditions for the share. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudFileShare this ^com.microsoft.azure.storage.file.DeleteShareSnapshotsOption delete-snapshots-option ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.delete delete-snapshots-option access-condition options op-context)))
  ([^CloudFileShare this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.delete access-condition options op-context)))
  ([^CloudFileShare this]
    (-> this (.delete))))

(defn get-stats
  "Queries the service for this share's ShareStats.

  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client (CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A ShareStats object for the given storage service. - `com.microsoft.azure.storage.file.ShareStats`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.file.ShareStats [^CloudFileShare this ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.getStats options op-context)))
  (^com.microsoft.azure.storage.file.ShareStats [^CloudFileShare this]
    (-> this (.getStats))))

(defn snapshot?
  "Indicates whether this share is a snapshot.

  returns: true if the share is a snapshot, otherwise false. - `boolean`"
  (^Boolean [^CloudFileShare this]
    (-> this (.isSnapshot))))

(defn get-snapshot
  "Returns the snapshotID for this share.

  returns: The snapshotID as a string for this share. - `java.lang.String`"
  (^java.lang.String [^CloudFileShare this]
    (-> this (.getSnapshot))))

(defn generate-shared-access-signature
  "Returns a shared access signature for the share. Note this does not contain the leading \"?\".

  policy - An SharedAccessFilePolicy object that represents the access policy for the shared access signature. - `com.microsoft.azure.storage.file.SharedAccessFilePolicy`
  group-policy-identifier - A String which represents the share-level access policy. - `java.lang.String`
  ip-range - A IPRange object containing the range of allowed IP addresses. - `com.microsoft.azure.storage.IPRange`
  protocols - A SharedAccessProtocols representing the allowed Internet protocols. - `com.microsoft.azure.storage.SharedAccessProtocols`

  returns: A String which represents a shared access signature for the share. - `java.lang.String`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.lang.String [^CloudFileShare this ^com.microsoft.azure.storage.file.SharedAccessFilePolicy policy ^java.lang.String group-policy-identifier ^com.microsoft.azure.storage.IPRange ip-range ^com.microsoft.azure.storage.SharedAccessProtocols protocols]
    (-> this (.generateSharedAccessSignature policy group-policy-identifier ip-range protocols)))
  (^java.lang.String [^CloudFileShare this ^com.microsoft.azure.storage.file.SharedAccessFilePolicy policy ^java.lang.String group-policy-identifier]
    (-> this (.generateSharedAccessSignature policy group-policy-identifier))))

(defn upload-permissions
  "Uploads the share's permissions using the specified request options and operation context.

  permissions - A FileSharePermissions object that represents the permissions to upload. - `com.microsoft.azure.storage.file.FileSharePermissions`
  access-condition - An AccessCondition object that represents the access conditions for the share. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudFileShare this ^com.microsoft.azure.storage.file.FileSharePermissions permissions ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadPermissions permissions access-condition options op-context)))
  ([^CloudFileShare this ^com.microsoft.azure.storage.file.FileSharePermissions permissions]
    (-> this (.uploadPermissions permissions))))

(defn get-storage-uri
  "Returns the list of URIs for all locations.

  returns: A StorageUri object which represents the list of URIs for all locations. - `com.microsoft.azure.storage.StorageUri`"
  (^com.microsoft.azure.storage.StorageUri [^CloudFileShare this]
    (-> this (.getStorageUri))))

(defn get-name
  "Returns the name of the share.

  returns: A String that represents the name of the share. - `java.lang.String`"
  (^java.lang.String [^CloudFileShare this]
    (-> this (.getName))))

(defn get-service-client
  "Returns the File service client associated with this share.

  returns: A CloudFileClient object that represents the service client associated with this share. - `com.microsoft.azure.storage.file.CloudFileClient`"
  (^com.microsoft.azure.storage.file.CloudFileClient [^CloudFileShare this]
    (-> this (.getServiceClient))))

(defn get-uri
  "Returns the URI for this share.

  returns: The absolute URI to the share. - `java.net.URI`"
  (^java.net.URI [^CloudFileShare this]
    (-> this (.getUri))))

(defn get-properties
  "Returns the properties for the share.

  returns: A FileShareProperties object that represents the properties for the share. - `com.microsoft.azure.storage.file.FileShareProperties`"
  (^com.microsoft.azure.storage.file.FileShareProperties [^CloudFileShare this]
    (-> this (.getProperties))))

(defn delete-if-exists
  "Deletes the share if it exists, using the specified snapshot and request options, and operation context.

   A share that has snapshots cannot be deleted unless the snapshots are also deleted. If a share has snapshots, use
   the DeleteShareSnapshotsOption.INCLUDE_SNAPSHOTS value
   in the deleteSnapshotsOption parameter to include the snapshots when deleting the base share.

  delete-snapshots-option - A DeleteShareSnapshotsOption object that indicates whether to delete only snapshots, or the share and its snapshots. - `com.microsoft.azure.storage.file.DeleteShareSnapshotsOption`
  access-condition - An AccessCondition object that represents the access conditions for the share. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: true if the share existed and was deleted; otherwise, false. - `boolean`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^Boolean [^CloudFileShare this ^com.microsoft.azure.storage.file.DeleteShareSnapshotsOption delete-snapshots-option ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.deleteIfExists delete-snapshots-option access-condition options op-context)))
  (^Boolean [^CloudFileShare this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.deleteIfExists access-condition options op-context)))
  (^Boolean [^CloudFileShare this]
    (-> this (.deleteIfExists))))

(defn get-root-directory-reference
  "Returns a reference to a CloudFileDirectory object that represents the root file directory within this
   share.

  returns: A CloudFileDirectory reference to the root directory for this share. - `com.microsoft.azure.storage.file.CloudFileDirectory`

  throws: com.microsoft.azure.storage.StorageException"
  (^com.microsoft.azure.storage.file.CloudFileDirectory [^CloudFileShare this]
    (-> this (.getRootDirectoryReference))))

(defn create-if-not-exists
  "Creates the share if it does not exist, using the specified request options and operation context.

  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client (CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: true if the share did not already exist and was created; otherwise, false. - `boolean`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^Boolean [^CloudFileShare this ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.createIfNotExists options op-context)))
  (^Boolean [^CloudFileShare this]
    (-> this (.createIfNotExists))))

(defn set-properties
  "Sets the properties for the share.

  properties - A FileShareProperties object that represents the properties being assigned to the share. - `com.microsoft.azure.storage.file.FileShareProperties`"
  ([^CloudFileShare this ^com.microsoft.azure.storage.file.FileShareProperties properties]
    (-> this (.setProperties properties))))

(defn create
  "Creates the share using the specified options and operation context.

  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudFileShare this ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.create options op-context)))
  ([^CloudFileShare this]
    (-> this (.create))))

(defn get-qualified-uri
  "Returns the snapshot or shared access signature qualified URI for this share.

  returns: A java.net.URI object that represents the snapshot or shared access signature. - `java.net.URI`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.net.URI [^CloudFileShare this]
    (-> this (.getQualifiedUri))))

(defn upload-metadata
  "Uploads the share's metadata using the specified request options and operation context.

  access-condition - An AccessCondition object that represents the access conditions for the share. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudFileShare this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadMetadata access-condition options op-context)))
  ([^CloudFileShare this]
    (-> this (.uploadMetadata))))

(defn exists?
  "Returns a value that indicates whether the share exists, using the specified request options and operation
   context.

  access-condition - An AccessCondition object that represents the access conditions for the share. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: true if the share exists, otherwise false. - `boolean`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^Boolean [^CloudFileShare this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.exists access-condition options op-context)))
  (^Boolean [^CloudFileShare this]
    (-> this (.exists))))

(defn get-metadata
  "Returns the metadata for the share. This value is initialized with the metadata from the share by a call to
   downloadAttributes(), and is set on the share with a call to uploadMetadata().

  returns: A java.util.HashMap object that represents the metadata for the share. - `java.util.HashMap<java.lang.String,java.lang.String>`"
  (^java.util.HashMap [^CloudFileShare this]
    (-> this (.getMetadata))))

(defn download-permissions
  "Downloads the permissions settings for the share using the specified request options and operation context.

  access-condition - An AccessCondition object that represents the access conditions for the share. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A FileSharePermissions object that represents the share's permissions. - `com.microsoft.azure.storage.file.FileSharePermissions`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.file.FileSharePermissions [^CloudFileShare this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadPermissions access-condition options op-context)))
  (^com.microsoft.azure.storage.file.FileSharePermissions [^CloudFileShare this]
    (-> this (.downloadPermissions))))

(defn upload-properties
  "Updates the share's properties using the request options, and operation context.

   Use downloadAttributes() to retrieve the latest values for
   the share's properties and metadata from the Microsoft Azure storage service.

  access-condition - An AccessCondition object that represents the access conditions for the share. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudFileShare this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadProperties access-condition options op-context)))
  ([^CloudFileShare this]
    (-> this (.uploadProperties))))

(defn create-snapshot
  "Creates a snapshot of the file share using the specified request options and operation context.

  metadata - A collection of name-value pairs defining the metadata of the snapshot, or null. - `java.util.HashMap`
  access-condition - An AccessCondition object that represents the access conditions for the file share. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A CloudFileShare object that represents the snapshot of the file share. - `com.microsoft.azure.storage.file.CloudFileShare`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.file.CloudFileShare [^CloudFileShare this ^java.util.HashMap metadata ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.createSnapshot metadata access-condition options op-context)))
  (^com.microsoft.azure.storage.file.CloudFileShare [^CloudFileShare this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.createSnapshot access-condition options op-context)))
  (^com.microsoft.azure.storage.file.CloudFileShare [^CloudFileShare this]
    (-> this (.createSnapshot))))

(defn set-metadata
  "Sets the metadata collection of name-value pairs to be set on the share with an uploadMetadata() call.
   This collection will overwrite any existing share metadata. If this is set to an empty collection, the
   share metadata will be cleared on an uploadMetadata() call.

  metadata - A java.util.HashMap object that represents the metadata being assigned to the share. - `java.util.HashMap`"
  ([^CloudFileShare this ^java.util.HashMap metadata]
    (-> this (.setMetadata metadata))))

