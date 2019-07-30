(ns com.microsoft.azure.storage.blob.CloudBlobContainer
  "Represents a container in the Microsoft Azure Blob service.

  Containers hold directories, which are encapsulated as CloudBlobDirectory objects, and directories hold block
  blobs and page blobs. Directories can also contain sub-directories."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob CloudBlobContainer]))

(defn ->cloud-blob-container
  "Constructor.

  Creates an instance of the CloudBlobContainer class using the specified URI and credentials.

  uri - A java.net.URI object that represents the absolute URI of the container. - `java.net.URI`
  credentials - A StorageCredentials object used to authenticate access. - `com.microsoft.azure.storage.StorageCredentials`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^CloudBlobContainer [^java.net.URI uri ^com.microsoft.azure.storage.StorageCredentials credentials]
    (new CloudBlobContainer uri credentials))
  (^CloudBlobContainer [^java.net.URI uri]
    (new CloudBlobContainer uri)))

(defn get-blob-reference-from-server
  "Gets a reference to a blob in this container. The blob must already exist on the service.

   Unlike the other get*Reference methods, this method does a service request to retrieve the blob's metadata and
   properties. The returned blob may be used directly as a CloudBlob or cast using either instanceof or
   getProperties().getBlobType() to determine its subtype.

  blob-name - A String that represents the name of the blob. - `java.lang.String`
  snapshot-id - A String that represents the snapshot ID of the blob. - `java.lang.String`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A CloudBlob object that represents a reference to the specified blob. - `com.microsoft.azure.storage.blob.CloudBlob`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.blob.CloudBlob [^CloudBlobContainer this ^java.lang.String blob-name ^java.lang.String snapshot-id ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.getBlobReferenceFromServer blob-name snapshot-id access-condition options op-context)))
  (^com.microsoft.azure.storage.blob.CloudBlob [^CloudBlobContainer this ^java.lang.String blob-name]
    (-> this (.getBlobReferenceFromServer blob-name))))

(defn download-attributes
  "Downloads the container's attributes, which consist of metadata and properties, using the specified request
   options and operation context.

  access-condition - An AccessCondition object that represents the access conditions for the container. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudBlobContainer this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadAttributes access-condition options op-context)))
  ([^CloudBlobContainer this]
    (-> this (.downloadAttributes))))

(defn list-containers-segmented
  "Returns a result segment containing a collection of containers whose names begin with
   the specified prefix for the service client associated with this container,
   using the specified listing details options, request options, and operation context.

  prefix - A String that represents the prefix of the container name. - `java.lang.String`
  details-included - A ContainerListingDetails object that indicates whether metadata is included. - `com.microsoft.azure.storage.blob.ContainerListingDetails`
  max-results - The maximum number of results to retrieve. If null or greater than 5000, the server will return up to 5,000 items. Must be at least 1. - `java.lang.Integer`
  continuation-token - A ResultContinuation object that represents a continuation token returned by a previous listing operation. - `com.microsoft.azure.storage.ResultContinuation`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A ResultSegment object that contains a segment of the enumerable collection
           of CloudBlobContainer objects that represent the containers whose names
           begin with the specified prefix for the service client associated with this container. - `com.microsoft.azure.storage.ResultSegment<com.microsoft.azure.storage.blob.CloudBlobContainer>`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.ResultSegment [^CloudBlobContainer this ^java.lang.String prefix ^com.microsoft.azure.storage.blob.ContainerListingDetails details-included ^java.lang.Integer max-results ^com.microsoft.azure.storage.ResultContinuation continuation-token ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.listContainersSegmented prefix details-included max-results continuation-token options op-context)))
  (^com.microsoft.azure.storage.ResultSegment [^CloudBlobContainer this ^java.lang.String prefix]
    (-> this (.listContainersSegmented prefix)))
  (^com.microsoft.azure.storage.ResultSegment [^CloudBlobContainer this]
    (-> this (.listContainersSegmented))))

(defn download-account-info
  "Gets information related to the storage account in which this container resides.

  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A AccountInformation object for the given storage account. - `com.microsoft.azure.storage.AccountInformation`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.AccountInformation [^CloudBlobContainer this ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadAccountInfo options op-context)))
  (^com.microsoft.azure.storage.AccountInformation [^CloudBlobContainer this]
    (-> this (.downloadAccountInfo))))

(defn list-blobs
  "Returns an enumerable collection of blob items for the container whose names begin with the specified prefix,
   using the specified flat or hierarchical option, listing details options, request options, and operation context.

  prefix - A String that represents the blob name prefix. This value must be preceded either by the name of the container or by the absolute path to the container. - `java.lang.String`
  use-flat-blob-listing - true to indicate that the returned list will be flat; false to indicate that the returned list will be hierarchical. - `boolean`
  listing-details - A java.util.EnumSet object that contains BlobListingDetails values that indicate whether snapshots, soft-deleted blobs, metadata, and/or uncommitted blocks are returned. Committed blocks are always returned. - `java.util.EnumSet`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: An enumerable collection of ListBlobItem objects retrieved lazily that represents the
           items whose names begin with the specified prefix in this container. - `java.lang.Iterable<com.microsoft.azure.storage.blob.ListBlobItem>`"
  (^java.lang.Iterable [^CloudBlobContainer this ^java.lang.String prefix ^Boolean use-flat-blob-listing ^java.util.EnumSet listing-details ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.listBlobs prefix use-flat-blob-listing listing-details options op-context)))
  (^java.lang.Iterable [^CloudBlobContainer this ^java.lang.String prefix ^Boolean use-flat-blob-listing]
    (-> this (.listBlobs prefix use-flat-blob-listing)))
  (^java.lang.Iterable [^CloudBlobContainer this ^java.lang.String prefix]
    (-> this (.listBlobs prefix)))
  (^java.lang.Iterable [^CloudBlobContainer this]
    (-> this (.listBlobs))))

(defn get-page-blob-reference
  "Returns a reference to a CloudPageBlob object that represents a page blob in the container, using the
   specified snapshot ID.

  blob-name - A String that represents the name of the blob. - `java.lang.String`
  snapshot-id - A String that represents the snapshot ID of the blob. - `java.lang.String`

  returns: A CloudPageBlob object that represents a reference to the specified page blob. - `com.microsoft.azure.storage.blob.CloudPageBlob`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.blob.CloudPageBlob [^CloudBlobContainer this ^java.lang.String blob-name ^java.lang.String snapshot-id]
    (-> this (.getPageBlobReference blob-name snapshot-id)))
  (^com.microsoft.azure.storage.blob.CloudPageBlob [^CloudBlobContainer this ^java.lang.String blob-name]
    (-> this (.getPageBlobReference blob-name))))

(defn delete
  "Deletes the container using the specified request options and operation context.

  access-condition - An AccessCondition object that represents the access conditions for the container. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudBlobContainer this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.delete access-condition options op-context)))
  ([^CloudBlobContainer this]
    (-> this (.delete))))

(defn list-blobs-segmented
  "Returns a result segment containing a collection of blob items whose names begin with the
   specified prefix, using the specified flat or hierarchical option, listing details options,
   request options, and operation context.

  prefix - A String that represents the prefix of the blob name. - `java.lang.String`
  use-flat-blob-listing - true to indicate that the returned list will be flat; false to indicate that the returned list will be hierarchical. - `boolean`
  listing-details - A java.util.EnumSet object that contains BlobListingDetails values that indicate whether snapshots, soft-deleted blobs, metadata, and/or uncommitted blocks are returned. Committed blocks are always returned. - `java.util.EnumSet`
  max-results - The maximum number of results to retrieve. If null or greater than 5000, the server will return up to 5,000 items. Must be at least 1. - `java.lang.Integer`
  continuation-token - A ResultContinuation object that represents a continuation token returned by a previous listing operation. - `com.microsoft.azure.storage.ResultContinuation`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client (CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A ResultSegment object that contains a segment of the enumerable collection
           of ListBlobItem objects that represent the block items whose names begin
           with the specified prefix in the container. - `com.microsoft.azure.storage.ResultSegment<com.microsoft.azure.storage.blob.ListBlobItem>`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.ResultSegment [^CloudBlobContainer this ^java.lang.String prefix ^Boolean use-flat-blob-listing ^java.util.EnumSet listing-details ^java.lang.Integer max-results ^com.microsoft.azure.storage.ResultContinuation continuation-token ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.listBlobsSegmented prefix use-flat-blob-listing listing-details max-results continuation-token options op-context)))
  (^com.microsoft.azure.storage.ResultSegment [^CloudBlobContainer this ^java.lang.String prefix]
    (-> this (.listBlobsSegmented prefix)))
  (^com.microsoft.azure.storage.ResultSegment [^CloudBlobContainer this]
    (-> this (.listBlobsSegmented))))

(defn generate-shared-access-signature
  "Returns a shared access signature for the container. Note this does not contain the leading \"?\".

  policy - An SharedAccessBlobPolicy object that represents the access policy for the shared access signature. - `com.microsoft.azure.storage.blob.SharedAccessBlobPolicy`
  group-policy-identifier - A String which represents the container-level access policy. - `java.lang.String`
  ip-range - A IPRange object containing the range of allowed IP addresses. - `com.microsoft.azure.storage.IPRange`
  protocols - A SharedAccessProtocols representing the allowed Internet protocols. - `com.microsoft.azure.storage.SharedAccessProtocols`

  returns: A String which represents a shared access signature for the container. - `java.lang.String`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.lang.String [^CloudBlobContainer this ^com.microsoft.azure.storage.blob.SharedAccessBlobPolicy policy ^java.lang.String group-policy-identifier ^com.microsoft.azure.storage.IPRange ip-range ^com.microsoft.azure.storage.SharedAccessProtocols protocols]
    (-> this (.generateSharedAccessSignature policy group-policy-identifier ip-range protocols)))
  (^java.lang.String [^CloudBlobContainer this ^com.microsoft.azure.storage.blob.SharedAccessBlobPolicy policy ^java.lang.String group-policy-identifier]
    (-> this (.generateSharedAccessSignature policy group-policy-identifier))))

(defn upload-permissions
  "Uploads the container's permissions using the specified request options and operation context.

  permissions - A BlobContainerPermissions object that represents the permissions to upload. - `com.microsoft.azure.storage.blob.BlobContainerPermissions`
  access-condition - An AccessCondition object that represents the access conditions for the container. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudBlobContainer this ^com.microsoft.azure.storage.blob.BlobContainerPermissions permissions ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadPermissions permissions access-condition options op-context)))
  ([^CloudBlobContainer this ^com.microsoft.azure.storage.blob.BlobContainerPermissions permissions]
    (-> this (.uploadPermissions permissions))))

(defn acquire-lease
  "Acquires a new lease on the container with the specified lease time, proposed lease ID, request
   options, and operation context.

  lease-time-in-seconds - An Integer which specifies the span of time for which to acquire the lease, in seconds. If null, an infinite lease will be acquired. If not null, the value must be greater than zero. - `java.lang.Integer`
  proposed-lease-id - A String that represents the proposed lease ID for the new lease, or null if no lease ID is proposed. - `java.lang.String`
  access-condition - An AccessCondition object that represents the access conditions for the container. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client (CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. The context is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A String that represents the lease ID. - `java.lang.String`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.lang.String [^CloudBlobContainer this ^java.lang.Integer lease-time-in-seconds ^java.lang.String proposed-lease-id ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.acquireLease lease-time-in-seconds proposed-lease-id access-condition options op-context)))
  (^java.lang.String [^CloudBlobContainer this ^java.lang.Integer lease-time-in-seconds ^java.lang.String proposed-lease-id]
    (-> this (.acquireLease lease-time-in-seconds proposed-lease-id)))
  (^java.lang.String [^CloudBlobContainer this]
    (-> this (.acquireLease))))

(defn get-storage-uri
  "Returns the list of URIs for all locations.

  returns: A StorageUri object which represents the list of URIs for all locations.. - `com.microsoft.azure.storage.StorageUri`"
  (^com.microsoft.azure.storage.StorageUri [^CloudBlobContainer this]
    (-> this (.getStorageUri))))

(defn get-name
  "Returns the name of the container.

  returns: A String that represents the name of the container. - `java.lang.String`"
  (^java.lang.String [^CloudBlobContainer this]
    (-> this (.getName))))

(defn get-service-client
  "Returns the Blob service client associated with this container.

  returns: A CloudBlobClient object that represents the service client associated with this container. - `com.microsoft.azure.storage.blob.CloudBlobClient`"
  (^com.microsoft.azure.storage.blob.CloudBlobClient [^CloudBlobContainer this]
    (-> this (.getServiceClient))))

(defn get-uri
  "Returns the URI for this container.

  returns: The absolute URI to the container. - `java.net.URI`"
  (^java.net.URI [^CloudBlobContainer this]
    (-> this (.getUri))))

(defn renew-lease
  "Renews an existing lease with the specified access conditions, request options, and operation context.

  access-condition - An AccessCondition object that represents the access conditions for the blob. The lease ID is required to be set with an access condition. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client (CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. The context is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudBlobContainer this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.renewLease access-condition options op-context)))
  ([^CloudBlobContainer this ^com.microsoft.azure.storage.AccessCondition access-condition]
    (-> this (.renewLease access-condition))))

(defn get-properties
  "Returns the properties for the container.

  returns: A BlobContainerProperties object that represents the properties for the container. - `com.microsoft.azure.storage.blob.BlobContainerProperties`"
  (^com.microsoft.azure.storage.blob.BlobContainerProperties [^CloudBlobContainer this]
    (-> this (.getProperties))))

(defn break-lease
  "Breaks the existing lease, using the specified request options and operation context, and ensures that
   another client cannot acquire a new lease until the current lease period has expired.

  break-period-in-seconds - An Integer which specifies the time to wait, in seconds, until the current lease is broken. If null, the break period is the remainder of the current lease, or zero for infinite leases. - `java.lang.Integer`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client (CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. The context is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: The time, in seconds, remaining in the lease period. - `long`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^Long [^CloudBlobContainer this ^java.lang.Integer break-period-in-seconds ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.breakLease break-period-in-seconds access-condition options op-context)))
  (^Long [^CloudBlobContainer this ^java.lang.Integer break-period-in-seconds]
    (-> this (.breakLease break-period-in-seconds))))

(defn list-containers
  "Returns an enumerable collection of containers whose names begin with the specified prefix for the service client
   associated with this container, using the specified details setting, request options, and operation context.

  prefix - A String that represents the container name prefix. - `java.lang.String`
  details-included - A ContainerListingDetails value that indicates whether container metadata will be returned. - `com.microsoft.azure.storage.blob.ContainerListingDetails`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: An enumerable collection of CloudBlobContainer objects retrieved lazily that represents the
           containers for the
           service client associated with this container. - `java.lang.Iterable<com.microsoft.azure.storage.blob.CloudBlobContainer>`"
  (^java.lang.Iterable [^CloudBlobContainer this ^java.lang.String prefix ^com.microsoft.azure.storage.blob.ContainerListingDetails details-included ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.listContainers prefix details-included options op-context)))
  (^java.lang.Iterable [^CloudBlobContainer this ^java.lang.String prefix]
    (-> this (.listContainers prefix)))
  (^java.lang.Iterable [^CloudBlobContainer this]
    (-> this (.listContainers))))

(defn get-block-blob-reference
  "Returns a reference to a CloudBlockBlob object that represents a block blob in this container, using the
   specified snapshot ID.

  blob-name - A String that represents the name of the blob. - `java.lang.String`
  snapshot-id - A String that represents the snapshot ID of the blob. - `java.lang.String`

  returns: A CloudBlockBlob object that represents a reference to the specified block blob. - `com.microsoft.azure.storage.blob.CloudBlockBlob`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.blob.CloudBlockBlob [^CloudBlobContainer this ^java.lang.String blob-name ^java.lang.String snapshot-id]
    (-> this (.getBlockBlobReference blob-name snapshot-id)))
  (^com.microsoft.azure.storage.blob.CloudBlockBlob [^CloudBlobContainer this ^java.lang.String blob-name]
    (-> this (.getBlockBlobReference blob-name))))

(defn delete-if-exists
  "Deletes the container if it exists using the specified request options and operation context.

  access-condition - An AccessCondition object that represents the access conditions for the container. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: true if the container existed and was deleted; otherwise, false. - `boolean`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^Boolean [^CloudBlobContainer this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.deleteIfExists access-condition options op-context)))
  (^Boolean [^CloudBlobContainer this]
    (-> this (.deleteIfExists))))

(defn create-if-not-exists
  "Creates the container if it does not exist, using the specified request options and operation context.

  access-type - A BlobContainerPublicAccessType object that specifies whether data in the container may be accessed publicly and what level of access is to be allowed. - `com.microsoft.azure.storage.blob.BlobContainerPublicAccessType`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client (CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: true if the container did not already exist and was created; otherwise, false. - `boolean`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^Boolean [^CloudBlobContainer this ^com.microsoft.azure.storage.blob.BlobContainerPublicAccessType access-type ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.createIfNotExists access-type options op-context)))
  (^Boolean [^CloudBlobContainer this ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.createIfNotExists options op-context)))
  (^Boolean [^CloudBlobContainer this]
    (-> this (.createIfNotExists))))

(defn get-directory-reference
  "Returns a reference to a CloudBlobDirectory object that represents a virtual blob directory within this
   container.

  directory-name - A String that represents the name of the virtual blob directory. If the root directory (the directory representing the container itself) is desired, use an empty string. - `java.lang.String`

  returns: A CloudBlobDirectory that represents a virtual blob directory within this container. - `com.microsoft.azure.storage.blob.CloudBlobDirectory`

  throws: java.net.URISyntaxException - If the resource URI is invalid."
  (^com.microsoft.azure.storage.blob.CloudBlobDirectory [^CloudBlobContainer this ^java.lang.String directory-name]
    (-> this (.getDirectoryReference directory-name))))

(defn create
  "Creates the container using the specified options and operation context.

  access-type - A BlobContainerPublicAccessType object that specifies whether data in the container may be accessed publicly and what level of access is to be allowed. - `com.microsoft.azure.storage.blob.BlobContainerPublicAccessType`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudBlobContainer this ^com.microsoft.azure.storage.blob.BlobContainerPublicAccessType access-type ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.create access-type options op-context)))
  ([^CloudBlobContainer this ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.create options op-context)))
  ([^CloudBlobContainer this]
    (-> this (.create))))

(defn change-lease
  "Changes the existing lease ID to the proposed lease Id with the specified access conditions, request options,
   and operation context.

  proposed-lease-id - A String that represents the proposed lease ID for the new lease. This cannot be null. - `java.lang.String`
  access-condition - An AccessCondition object that represents the access conditions for the blob. The lease ID is required to be set with an access condition. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client (CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. The context is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A String that represents the new lease ID. - `java.lang.String`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.lang.String [^CloudBlobContainer this ^java.lang.String proposed-lease-id ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.changeLease proposed-lease-id access-condition options op-context)))
  (^java.lang.String [^CloudBlobContainer this ^java.lang.String proposed-lease-id ^com.microsoft.azure.storage.AccessCondition access-condition]
    (-> this (.changeLease proposed-lease-id access-condition))))

(defn upload-metadata
  "Uploads the container's metadata using the specified request options and operation context.

  access-condition - An AccessCondition object that represents the access conditions for the container. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudBlobContainer this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadMetadata access-condition options op-context)))
  ([^CloudBlobContainer this]
    (-> this (.uploadMetadata))))

(defn exists?
  "Returns a value that indicates whether the container exists, using the specified request options and operation
   context.

  access-condition - An AccessCondition object that represents the access conditions for the container. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: true if the container exists, otherwise false. - `boolean`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^Boolean [^CloudBlobContainer this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.exists access-condition options op-context)))
  (^Boolean [^CloudBlobContainer this]
    (-> this (.exists))))

(defn get-metadata
  "Returns the metadata for the container. This value is initialized with the metadata from the queue by a call to
   downloadAttributes(), and is set on the queue with a call to uploadMetadata().

  returns: A java.util.HashMap object that represents the metadata for the container. - `java.util.HashMap<java.lang.String,java.lang.String>`"
  (^java.util.HashMap [^CloudBlobContainer this]
    (-> this (.getMetadata))))

(defn get-append-blob-reference
  "Returns a reference to a CloudAppendBlob object that represents an append blob in the container, using the
   specified snapshot ID.

  blob-name - A String that represents the name of the blob. - `java.lang.String`
  snapshot-id - A String that represents the snapshot ID of the blob. - `java.lang.String`

  returns: A CloudAppendBlob object that represents a reference to the specified append blob. - `com.microsoft.azure.storage.blob.CloudAppendBlob`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.blob.CloudAppendBlob [^CloudBlobContainer this ^java.lang.String blob-name ^java.lang.String snapshot-id]
    (-> this (.getAppendBlobReference blob-name snapshot-id)))
  (^com.microsoft.azure.storage.blob.CloudAppendBlob [^CloudBlobContainer this ^java.lang.String blob-name]
    (-> this (.getAppendBlobReference blob-name))))

(defn release-lease
  "Releases the lease on the container using the specified access conditions, request options, and operation
   context.

  access-condition - An AccessCondition object that represents the access conditions for the blob. The lease ID is required to be set with an access condition. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client (CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. The context is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudBlobContainer this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.releaseLease access-condition options op-context)))
  ([^CloudBlobContainer this ^com.microsoft.azure.storage.AccessCondition access-condition]
    (-> this (.releaseLease access-condition))))

(defn download-permissions
  "Downloads the permissions settings for the container using the specified request options and operation context.

  access-condition - An AccessCondition object that represents the access conditions for the container. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A BlobContainerPermissions object that represents the container's permissions. - `com.microsoft.azure.storage.blob.BlobContainerPermissions`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.blob.BlobContainerPermissions [^CloudBlobContainer this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadPermissions access-condition options op-context)))
  (^com.microsoft.azure.storage.blob.BlobContainerPermissions [^CloudBlobContainer this]
    (-> this (.downloadPermissions))))

(defn set-metadata
  "Sets the metadata collection of name-value pairs to be set on the container with an uploadMetadata() call.
   This collection will overwrite any existing container metadata. If this is set to an empty collection, the
   container metadata will be cleared on an uploadMetadata() call.

  metadata - A java.util.HashMap object that represents the metadata being assigned to the container. - `java.util.HashMap`"
  ([^CloudBlobContainer this ^java.util.HashMap metadata]
    (-> this (.setMetadata metadata))))

