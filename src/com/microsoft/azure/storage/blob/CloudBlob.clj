(ns com.microsoft.azure.storage.blob.CloudBlob
  "Represents a Microsoft Azure blob. This is the base class for the CloudBlockBlob and CloudPageBlob
  classes."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob CloudBlob]))

(defn download-attributes
  "Populates a blob's properties and metadata using the specified request options and operation context.

   This method populates the blob's system properties and user-defined metadata. Before reading or modifying a
   blob's properties or metadata, call this method or its overload to retrieve the latest values for the blob's
   properties and metadata from the Microsoft Azure storage service.

  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudBlob this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadAttributes access-condition options op-context)))
  ([^CloudBlob this]
    (-> this (.downloadAttributes))))

(defn abort-copy
  "Aborts an ongoing blob copy operation.

  copy-id - A String object that identifying the copy operation. - `java.lang.String`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudBlob this ^java.lang.String copy-id ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.abortCopy copy-id access-condition options op-context)))
  ([^CloudBlob this ^java.lang.String copy-id]
    (-> this (.abortCopy copy-id))))

(defn download-account-info
  "Gets information related to the storage account in which this blob resides.

  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A AccountInformation object for the given storage account. - `com.microsoft.azure.storage.AccountInformation`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.AccountInformation [^CloudBlob this ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadAccountInfo options op-context)))
  (^com.microsoft.azure.storage.AccountInformation [^CloudBlob this]
    (-> this (.downloadAccountInfo))))

(defn download-to-byte-array
  "Downloads a range of bytes from the blob to the given byte buffer, using the specified request options and
   operation context.

  buffer - A byte array which represents the buffer to which the blob bytes are downloaded. - `byte[]`
  buffer-offset - A long which represents the byte offset to use as the starting point for the target. - `int`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: `int`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^Integer [^CloudBlob this buffer ^Integer buffer-offset ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadToByteArray buffer buffer-offset access-condition options op-context)))
  (^Integer [^CloudBlob this buffer ^Integer buffer-offset]
    (-> this (.downloadToByteArray buffer buffer-offset))))

(defn get-stream-write-size-in-bytes
  "Gets the number of bytes to buffer when writing to a BlobOutputStream (block and page blobs).

  returns: A int which represents the number of bytes to buffer or the size of a block, in bytes. - `int`"
  (^Integer [^CloudBlob this]
    (-> this (.getStreamWriteSizeInBytes))))

(defn get-copy-state
  "Returns the blob's copy state.

  returns: A CopyState object that represents the copy state of the blob. - `com.microsoft.azure.storage.blob.CopyState`"
  (^com.microsoft.azure.storage.blob.CopyState [^CloudBlob this]
    (-> this (.getCopyState))))

(defn delete
  "Deletes the blob using the specified snapshot and request options, and operation context.

   If a delete retention policy is enabled on the service, the blob will be retained for a specified period of time,
   before being removed permanently by garbage collection.


   A blob that has snapshots cannot be deleted unless the snapshots are also deleted. If a blob has snapshots, use
   the DeleteSnapshotsOption.DELETE_SNAPSHOTS_ONLY or DeleteSnapshotsOption.INCLUDE_SNAPSHOTS value
   in the deleteSnapshotsOption parameter to specify how the snapshots should be handled when the blob
   is deleted.

  delete-snapshots-option - A DeleteSnapshotsOption object that indicates whether to delete only snapshots, or the blob and its snapshots. - `com.microsoft.azure.storage.blob.DeleteSnapshotsOption`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudBlob this ^com.microsoft.azure.storage.blob.DeleteSnapshotsOption delete-snapshots-option ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.delete delete-snapshots-option access-condition options op-context)))
  ([^CloudBlob this]
    (-> this (.delete))))

(defn snapshot?
  "Indicates whether this blob is a snapshot.

  returns: true if the blob is a snapshot, otherwise false. - `boolean`"
  (^Boolean [^CloudBlob this]
    (-> this (.isSnapshot))))

(defn download
  "Downloads the contents of a blob to a stream using the specified request options and operation context.

  out-stream - An OutputStream object that represents the target stream. - `java.io.OutputStream`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudBlob this ^java.io.OutputStream out-stream ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.download out-stream access-condition options op-context)))
  ([^CloudBlob this ^java.io.OutputStream out-stream]
    (-> this (.download out-stream))))

(defn upload
  "Uploads the source stream data to the blob using the specified lease ID, request options, and operation context.
   If the blob already exists on the service, it will be overwritten.

  source-stream - An InputStream object that represents the source stream to upload. - `java.io.InputStream`
  length - The length of the stream data in bytes, or -1 if unknown. The length must be greater than zero and a multiple of 512 for page blobs. - `long`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: java.io.IOException - If an I/O exception occurred."
  ([^CloudBlob this ^java.io.InputStream source-stream ^Long length ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.upload source-stream length access-condition options op-context)))
  ([^CloudBlob this ^java.io.InputStream source-stream ^Long length]
    (-> this (.upload source-stream length))))

(defn open-input-stream
  "Opens a blob input stream to download the blob using the specified request options and operation context.

   Use setStreamMinimumReadSizeInBytes(int) to configure the read size.

  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: An InputStream object that represents the stream to use for reading from the blob. - `com.microsoft.azure.storage.blob.BlobInputStream`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.blob.BlobInputStream [^CloudBlob this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.openInputStream access-condition options op-context)))
  (^com.microsoft.azure.storage.blob.BlobInputStream [^CloudBlob this]
    (-> this (.openInputStream))))

(defn generate-shared-access-signature
  "Returns a shared access signature for the blob using the specified group policy identifier and operation context.
   Note this does not contain the leading \"?\".

  policy - A SharedAccessPolicy object that represents the access policy for the shared access signature. - `com.microsoft.azure.storage.blob.SharedAccessBlobPolicy`
  headers - A SharedAccessBlobHeaders object that represents the optional header values to set for a blob accessed with this shared access signature. - `com.microsoft.azure.storage.blob.SharedAccessBlobHeaders`
  group-policy-identifier - A String that represents the container-level access policy. - `java.lang.String`
  ip-range - A IPRange object containing the range of allowed IP addresses. - `com.microsoft.azure.storage.IPRange`
  protocols - A SharedAccessProtocols representing the allowed Internet protocols. - `com.microsoft.azure.storage.SharedAccessProtocols`

  returns: A String that represents the shared access signature. - `java.lang.String`

  throws: java.lang.IllegalArgumentException - If the credentials are invalid or the blob is a snapshot."
  (^java.lang.String [^CloudBlob this ^com.microsoft.azure.storage.blob.SharedAccessBlobPolicy policy ^com.microsoft.azure.storage.blob.SharedAccessBlobHeaders headers ^java.lang.String group-policy-identifier ^com.microsoft.azure.storage.IPRange ip-range ^com.microsoft.azure.storage.SharedAccessProtocols protocols]
    (-> this (.generateSharedAccessSignature policy headers group-policy-identifier ip-range protocols)))
  (^java.lang.String [^CloudBlob this ^com.microsoft.azure.storage.blob.SharedAccessBlobPolicy policy ^com.microsoft.azure.storage.blob.SharedAccessBlobHeaders headers ^java.lang.String group-policy-identifier]
    (-> this (.generateSharedAccessSignature policy headers group-policy-identifier)))
  (^java.lang.String [^CloudBlob this ^com.microsoft.azure.storage.blob.SharedAccessBlobPolicy policy ^java.lang.String group-policy-identifier]
    (-> this (.generateSharedAccessSignature policy group-policy-identifier))))

(defn undelete
  "Un-deletes a blob that has been soft-deleted, using the specified request options, and operation context.

   The un-delete Blob operation restores the contents and metadata of soft deleted blob and all its snapshots.
   Attempting to undelete a blob or snapshot that is not soft deleted will succeed without any changes.

  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudBlob this ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.undelete options op-context)))
  ([^CloudBlob this]
    (-> this (.undelete))))

(defn acquire-lease
  "Acquires a new lease on the blob with the specified lease time, proposed lease ID, request
   options, and operation context.

  lease-time-in-seconds - An Integer which specifies the span of time for which to acquire the lease, in seconds. If null, an infinite lease will be acquired. If not null, the value must be greater than zero. - `java.lang.Integer`
  proposed-lease-id - A String that represents the proposed lease ID for the new lease, or null if no lease ID is proposed. - `java.lang.String`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client (CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. The context is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A String that represents the lease ID. - `java.lang.String`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.lang.String [^CloudBlob this ^java.lang.Integer lease-time-in-seconds ^java.lang.String proposed-lease-id ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.acquireLease lease-time-in-seconds proposed-lease-id access-condition options op-context)))
  (^java.lang.String [^CloudBlob this ^java.lang.Integer lease-time-in-seconds ^java.lang.String proposed-lease-id]
    (-> this (.acquireLease lease-time-in-seconds proposed-lease-id)))
  (^java.lang.String [^CloudBlob this]
    (-> this (.acquireLease))))

(defn upload-from-byte-array
  "Uploads a blob from data in a byte array. If the blob already exists on the service, it will be overwritten.

  buffer - A byte array which represents the data to write to the blob. - `byte[]`
  offset - A int which represents the offset of the byte array from which to start the data upload. - `int`
  length - An int which represents the number of bytes to upload from the input buffer. - `int`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudBlob this buffer ^Integer offset ^Integer length ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadFromByteArray buffer offset length access-condition options op-context)))
  ([^CloudBlob this buffer ^Integer offset ^Integer length]
    (-> this (.uploadFromByteArray buffer offset length))))

(defn get-stream-minimum-read-size-in-bytes
  "Returns the minimum read size when using a BlobInputStream.

  returns: A int which represents the minimum read size, in bytes, when using a BlobInputStream
           object. - `int`"
  (^Integer [^CloudBlob this]
    (-> this (.getStreamMinimumReadSizeInBytes))))

(defn get-storage-uri
  "Returns the list of URIs for all locations.

  returns: A StorageUri that represents the list of URIs for all locations.. - `com.microsoft.azure.storage.StorageUri`"
  (^com.microsoft.azure.storage.StorageUri [^CloudBlob this]
    (-> this (.getStorageUri))))

(defn get-snapshot-id
  "Gets the Blob Snapshot ID.

  returns: A String which represents the Blob Snapshot ID. - `java.lang.String`"
  (^java.lang.String [^CloudBlob this]
    (-> this (.getSnapshotID))))

(defn get-name
  "Returns the name of the blob.

  returns: A String that represents the name of the blob. - `java.lang.String`"
  (^java.lang.String [^CloudBlob this]
    (-> this (.getName))))

(defn get-service-client
  "Returns the Blob service client associated with the blob.

  returns: A CloudBlobClient object that represents the client. - `com.microsoft.azure.storage.blob.CloudBlobClient`"
  (^com.microsoft.azure.storage.blob.CloudBlobClient [^CloudBlob this]
    (-> this (.getServiceClient))))

(defn get-uri
  "Returns the URI for this blob.

  returns: A java.net.URI object that represents the URI for the blob. - `java.net.URI`"
  (^java.net.URI [^CloudBlob this]
    (-> this (.getUri))))

(defn renew-lease
  "Renews an existing lease using the specified request options and operation context.

  access-condition - An AccessCondition object that represents the access conditions for the blob. The LeaseID is required to be set on the AccessCondition. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudBlob this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.renewLease access-condition options op-context)))
  ([^CloudBlob this ^com.microsoft.azure.storage.AccessCondition access-condition]
    (-> this (.renewLease access-condition))))

(defn get-properties
  "Returns the blob's properties.

  returns: A BlobProperties object that represents the properties of the blob. - `com.microsoft.azure.storage.blob.BlobProperties`"
  (^com.microsoft.azure.storage.blob.BlobProperties [^CloudBlob this]
    (-> this (.getProperties))))

(defn break-lease
  "Breaks the existing lease, using the specified request options and operation context, and ensures that another
   client cannot acquire a new lease until the current lease period has expired.

  break-period-in-seconds - An Integer which specifies the time to wait, in seconds, until the current lease is broken. If null, the break period is the remainder of the current lease, or zero for infinite leases. - `java.lang.Integer`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client (CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. The context is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: An long which represents the time, in seconds, remaining in the lease period. - `long`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^Long [^CloudBlob this ^java.lang.Integer break-period-in-seconds ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.breakLease break-period-in-seconds access-condition options op-context)))
  (^Long [^CloudBlob this ^java.lang.Integer break-period-in-seconds]
    (-> this (.breakLease break-period-in-seconds))))

(defn delete-if-exists
  "Deletes the blob if it exists, using the specified snapshot and request options, and operation context.

   A blob that has snapshots cannot be deleted unless the snapshots are also deleted. If a blob has snapshots, use
   the DeleteSnapshotsOption.DELETE_SNAPSHOTS_ONLY or DeleteSnapshotsOption.INCLUDE_SNAPSHOTS value
   in the deleteSnapshotsOption parameter to specify how the snapshots should be handled when the blob
   is deleted.

  delete-snapshots-option - A DeleteSnapshotsOption object that indicates whether to delete only snapshots, or the blob and its snapshots. - `com.microsoft.azure.storage.blob.DeleteSnapshotsOption`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: true if the blob existed and was deleted; otherwise, false - `boolean`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^Boolean [^CloudBlob this ^com.microsoft.azure.storage.blob.DeleteSnapshotsOption delete-snapshots-option ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.deleteIfExists delete-snapshots-option access-condition options op-context)))
  (^Boolean [^CloudBlob this]
    (-> this (.deleteIfExists))))

(defn get-parent
  "Returns the blob item's parent.

  returns: A CloudBlobDirectory object that represents the parent directory for the blob. - `com.microsoft.azure.storage.blob.CloudBlobDirectory`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.blob.CloudBlobDirectory [^CloudBlob this]
    (-> this (.getParent))))

(defn get-container
  "Returns the blob's container.

  returns: A CloudBlobContainer object that represents the container of the blob. - `com.microsoft.azure.storage.blob.CloudBlobContainer`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.blob.CloudBlobContainer [^CloudBlob this]
    (-> this (.getContainer))))

(defn upload-from-file
  "Uploads a blob from a file. If the blob already exists on the service, it will be overwritten.

  path - A String which represents the path to the file to be uploaded. - `java.lang.String`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudBlob this ^java.lang.String path ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadFromFile path access-condition options op-context)))
  ([^CloudBlob this ^java.lang.String path]
    (-> this (.uploadFromFile path))))

(defn get-snapshot-qualified-storage-uri
  "Returns the blob's URI for both the primary and secondary locations, including query string information if the blob is a snapshot.

  returns: A StorageUri object containing the blob's URIs for both the primary and secondary locations,
           including snapshot query information if the blob is a snapshot. - `com.microsoft.azure.storage.StorageUri`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.StorageUri [^CloudBlob this]
    (-> this (.getSnapshotQualifiedStorageUri))))

(defn download-range-to-byte-array
  "Downloads a range of bytes from the blob to the given byte buffer, using the specified request options and
   operation context.

  offset - A long which represents the byte offset to use as the starting point for the source. - `long`
  length - A Long which represents the number of bytes to read or null. - `java.lang.Long`
  buffer - A byte array which represents the buffer to which the blob bytes are downloaded. - `byte[]`
  buffer-offset - An int which represents the byte offset to use as the starting point for the target. - `int`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: The total number of bytes read into the buffer. - `int`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^Integer [^CloudBlob this ^Long offset ^java.lang.Long length buffer ^Integer buffer-offset ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadRangeToByteArray offset length buffer buffer-offset access-condition options op-context)))
  (^Integer [^CloudBlob this ^Long offset ^java.lang.Long length buffer ^Integer buffer-offset]
    (-> this (.downloadRangeToByteArray offset length buffer buffer-offset))))

(defn get-qualified-storage-uri
  "Deprecated. use getSnapshotQualifiedStorageUri() instead.

  returns: A StorageUri object that represents the snapshot or shared access signature. - `com.microsoft.azure.storage.StorageUri`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.StorageUri [^CloudBlob this]
    (-> this (.getQualifiedStorageUri))))

(defn get-qualified-uri
  "Deprecated. use getSnapshotQualifiedUri() instead.

  returns: A java.net.URI object that represents the snapshot or shared access signature. - `java.net.URI`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.net.URI [^CloudBlob this]
    (-> this (.getQualifiedUri))))

(defn change-lease
  "Changes the existing lease ID to the proposed lease Id with the specified access conditions, request options,
   and operation context.

  proposed-lease-id - A String that represents the proposed lease ID for the new lease, or null if no lease ID is proposed. - `java.lang.String`
  access-condition - An AccessCondition object that represents the access conditions for the blob. The lease ID is required to be set with an access condition. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client (CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. The context is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A String that represents the new lease ID. - `java.lang.String`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.lang.String [^CloudBlob this ^java.lang.String proposed-lease-id ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.changeLease proposed-lease-id access-condition options op-context)))
  (^java.lang.String [^CloudBlob this ^java.lang.String proposed-lease-id ^com.microsoft.azure.storage.AccessCondition access-condition]
    (-> this (.changeLease proposed-lease-id access-condition))))

(defn upload-metadata
  "Uploads the blob's metadata to the storage service using the specified lease ID, request options, and operation
   context.

   Use downloadAttributes() to retrieve the latest values for the blob's properties and metadata
   from the Microsoft Azure storage service.

  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudBlob this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadMetadata access-condition options op-context)))
  ([^CloudBlob this]
    (-> this (.uploadMetadata))))

(defn exists?
  "Checks to see if the blob exists, using the specified request options and operation context.

  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: true if the blob exists, other wise false. - `boolean`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^Boolean [^CloudBlob this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.exists access-condition options op-context)))
  (^Boolean [^CloudBlob this]
    (-> this (.exists))))

(defn get-metadata
  "Returns the metadata for the blob.

  returns: A java.util.HashMap object that represents the metadata for the blob. - `java.util.HashMap<java.lang.String,java.lang.String>`"
  (^java.util.HashMap [^CloudBlob this]
    (-> this (.getMetadata))))

(defn set-stream-write-size-in-bytes
  "Sets the number of bytes to buffer when writing to a BlobOutputStream (block and page blobs).

  stream-write-size-in-bytes - An int that represents the number of bytes to buffer or the size of a block, in bytes. - `int`"
  ([^CloudBlob this ^Integer stream-write-size-in-bytes]
    (-> this (.setStreamWriteSizeInBytes stream-write-size-in-bytes))))

(defn download-to-file
  "Downloads a blob, storing the contents in a file.

  path - A String which represents the path to the file that will be created with the contents of the blob. - `java.lang.String`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudBlob this ^java.lang.String path ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadToFile path access-condition options op-context)))
  ([^CloudBlob this ^java.lang.String path]
    (-> this (.downloadToFile path))))

(defn get-snapshot-qualified-uri
  "Returns the absolute URI to the blob, including query string information if the blob is a snapshot.

  returns: A java.net.URI object specifying the absolute URI to the blob,
           including snapshot query information if the blob is a snapshot. - `java.net.URI`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.net.URI [^CloudBlob this]
    (-> this (.getSnapshotQualifiedUri))))

(defn download-range
  "Downloads the contents of a blob to a stream using the specified request options and operation context.

  offset - A long which represents the offset to use as the starting point for the source. - `long`
  length - A Long which represents the number of bytes to read or null. - `java.lang.Long`
  out-stream - An OutputStream object that represents the target stream. - `java.io.OutputStream`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudBlob this ^Long offset ^java.lang.Long length ^java.io.OutputStream out-stream ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadRange offset length out-stream access-condition options op-context)))
  ([^CloudBlob this ^Long offset ^java.lang.Long length ^java.io.OutputStream out-stream]
    (-> this (.downloadRange offset length out-stream))))

(defn release-lease
  "Releases the lease on the blob using the specified request options and operation context.

  access-condition - An AccessCondition object that represents the access conditions for the blob.The LeaseID is required to be set on the AccessCondition. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudBlob this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.releaseLease access-condition options op-context)))
  ([^CloudBlob this ^com.microsoft.azure.storage.AccessCondition access-condition]
    (-> this (.releaseLease access-condition))))

(defn upload-properties
  "Updates the blob's properties using the specified lease ID, request options, and operation context.

   Use downloadAttributes() to retrieve the latest values for the blob's properties and metadata
   from the Microsoft Azure storage service.

  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudBlob this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadProperties access-condition options op-context)))
  ([^CloudBlob this]
    (-> this (.uploadProperties))))

(defn start-copy
  "Requests the service to start copying a URI's contents, properties, and metadata to a new blob, using the
   specified access conditions, lease ID, request options, and operation context.

  source - A java.net.URI The source URI. URIs for resources outside of Azure may only be copied into block blobs. - `java.net.URI`
  source-access-condition - An AccessCondition object that represents the access conditions for the source. - `com.microsoft.azure.storage.AccessCondition`
  destination-access-condition - An AccessCondition object that represents the access conditions for the destination. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client (CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A String which represents the copy ID associated with the copy operation. - `java.lang.String`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.lang.String [^CloudBlob this ^java.net.URI source ^com.microsoft.azure.storage.AccessCondition source-access-condition ^com.microsoft.azure.storage.AccessCondition destination-access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.startCopy source source-access-condition destination-access-condition options op-context)))
  (^java.lang.String [^CloudBlob this ^java.net.URI source]
    (-> this (.startCopy source))))

(defn set-stream-minimum-read-size-in-bytes
  "Sets the minimum read size when using a BlobInputStream.

  minimum-read-size - An int that represents the minimum block size, in bytes, for reading from a blob while using a BlobInputStream object. Must be greater than or equal to 16 KB. - `int`

  throws: java.lang.IllegalArgumentException - If minimumReadSize is less than 16 KB."
  ([^CloudBlob this ^Integer minimum-read-size]
    (-> this (.setStreamMinimumReadSizeInBytes minimum-read-size))))

(defn create-snapshot
  "Creates a snapshot of the blob using the specified request options and operation context.

  metadata - A collection of name-value pairs defining the metadata of the snapshot, or null. - `java.util.HashMap`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A CloudBlob object that represents the snapshot of the blob. - `com.microsoft.azure.storage.blob.CloudBlob`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.blob.CloudBlob [^CloudBlob this ^java.util.HashMap metadata ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.createSnapshot metadata access-condition options op-context)))
  (^com.microsoft.azure.storage.blob.CloudBlob [^CloudBlob this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.createSnapshot access-condition options op-context)))
  (^com.microsoft.azure.storage.blob.CloudBlob [^CloudBlob this]
    (-> this (.createSnapshot))))

(defn set-metadata
  "Sets the metadata for the blob.

  metadata - A java.util.HashMap object that contains the metadata being assigned to the blob. - `java.util.HashMap`"
  ([^CloudBlob this ^java.util.HashMap metadata]
    (-> this (.setMetadata metadata))))

