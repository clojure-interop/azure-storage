(ns com.microsoft.azure.storage.blob.CloudBlockBlob
  "Represents a blob that is uploaded as a set of blocks."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob CloudBlockBlob]))

(defn ->cloud-block-blob
  "Constructor.

  Creates an instance of the CloudBlockBlob class using the specified absolute URI, snapshot ID, and
   credentials.

  blob-absolute-uri - A java.net.URI object that represents the absolute URI to the blob. - `java.net.URI`
  snapshot-id - A String that represents the snapshot version, if applicable. - `java.lang.String`
  credentials - A StorageCredentials object used to authenticate access. - `com.microsoft.azure.storage.StorageCredentials`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^CloudBlockBlob [^java.net.URI blob-absolute-uri ^java.lang.String snapshot-id ^com.microsoft.azure.storage.StorageCredentials credentials]
    (new CloudBlockBlob blob-absolute-uri snapshot-id credentials))
  (^CloudBlockBlob [^java.net.URI blob-absolute-uri ^com.microsoft.azure.storage.StorageCredentials credentials]
    (new CloudBlockBlob blob-absolute-uri credentials))
  (^CloudBlockBlob [^java.net.URI blob-absolute-uri]
    (new CloudBlockBlob blob-absolute-uri)))

(defn upload-standard-blob-tier
  "Sets the tier on a block blob on a standard storage account.

  standard-blob-tier - A StandardBlobTier object which represents the tier of the blob. - `com.microsoft.azure.storage.blob.StandardBlobTier`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object which represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudBlockBlob this ^com.microsoft.azure.storage.blob.StandardBlobTier standard-blob-tier ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadStandardBlobTier standard-blob-tier options op-context)))
  ([^CloudBlockBlob this ^com.microsoft.azure.storage.blob.StandardBlobTier standard-blob-tier]
    (-> this (.uploadStandardBlobTier standard-blob-tier))))

(defn download-text
  "Downloads a blob to a string using the specified encoding.

  charset-name - A String which represents the name of the charset to use to encode the content. If null, the platform's default encoding is used. - `java.lang.String`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A String which represents the blob's contents. - `java.lang.String`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.lang.String [^CloudBlockBlob this ^java.lang.String charset-name ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadText charset-name access-condition options op-context)))
  (^java.lang.String [^CloudBlockBlob this]
    (-> this (.downloadText))))

(defn upload
  "Uploads the source stream data to the blob, using the specified lease ID, request options, and operation context.
   If the blob already exists on the service, it will be overwritten.

  source-stream - An InputStream object that represents the input stream to write to the block blob. - `java.io.InputStream`
  length - A long which represents the length, in bytes, of the stream data, or -1 if unknown. - `long`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: java.io.IOException - If an I/O error occurred."
  ([^CloudBlockBlob this ^java.io.InputStream source-stream ^Long length ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.upload source-stream length access-condition options op-context)))
  ([^CloudBlockBlob this ^java.io.InputStream source-stream ^Long length]
    (-> this (.upload source-stream length))))

(defn stream-write-size-modified?
  "Gets the flag that indicates whether the default streamWriteSize was modified.

  returns: `boolean`"
  (^Boolean [^CloudBlockBlob this]
    (-> this (.isStreamWriteSizeModified))))

(defn open-output-stream
  "Creates and opens an output stream to write data to the block blob using the specified request options and
   operation context. If the blob already exists on the service, it will be overwritten.

   To avoid overwriting and instead throw an error, please pass in an AccessCondition generated using
   AccessCondition.generateIfNotExistsCondition().

  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A BlobOutputStream object used to write data to the blob. - `com.microsoft.azure.storage.blob.BlobOutputStream`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.blob.BlobOutputStream [^CloudBlockBlob this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.openOutputStream access-condition options op-context)))
  (^com.microsoft.azure.storage.blob.BlobOutputStream [^CloudBlockBlob this]
    (-> this (.openOutputStream))))

(defn upload-block
  "Uploads a block to be committed as part of the block blob, using the specified block ID, the specified lease ID,
   request options, and operation context.

  block-id - A String that represents the Base-64 encoded block ID. Note for a given blob the length of all Block IDs must be identical. - `java.lang.String`
  source-stream - An InputStream object that represents the input stream to write to the block blob. - `java.io.InputStream`
  length - A long which represents the length, in bytes, of the stream data, or -1 if unknown. - `long`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: java.io.IOException - If an I/O error occurred."
  ([^CloudBlockBlob this ^java.lang.String block-id ^java.io.InputStream source-stream ^Long length ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadBlock block-id source-stream length access-condition options op-context)))
  ([^CloudBlockBlob this ^java.lang.String block-id ^java.io.InputStream source-stream ^Long length]
    (-> this (.uploadBlock block-id source-stream length))))

(defn create-block-from-uri
  "Creates a block to be committed as part of the block blob, using the specified block ID, the specified source
   URL, the specified lease ID, request options, and operation context.

  block-id - A String that represents the Base-64 encoded block ID. Note for a given blob the length of all Block IDs must be identical. - `java.lang.String`
  copy-source - The URI of the source data. It can point to any Azure Blob or File that is public or the URL can include a shared access signature. - `java.net.URI`
  offset - A long which represents the offset to use as the starting point for the source. - `java.lang.Long`
  length - A Long which represents the number of bytes to copy or null to copy until the end of the blob. - `java.lang.Long`
  md-5 - A String which represents the MD5 caluclated for the range of bytes of the source. - `java.lang.String`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudBlockBlob this ^java.lang.String block-id ^java.net.URI copy-source ^java.lang.Long offset ^java.lang.Long length ^java.lang.String md-5 ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.createBlockFromURI block-id copy-source offset length md-5 access-condition options op-context)))
  ([^CloudBlockBlob this ^java.lang.String block-id ^java.net.URI copy-source ^java.lang.Long offset ^java.lang.Long length]
    (-> this (.createBlockFromURI block-id copy-source offset length))))

(defn commit-block-list
  "Commits a block list to the storage service using the specified lease ID, request options, and operation context.
   In order to be written as part of a blob, a block must have been successfully written to the server in a prior
   uploadBlock operation.

  block-list - An enumerable collection of BlockEntry objects that represents the list block items being committed. The size field is ignored. - `java.lang.Iterable`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudBlockBlob this ^java.lang.Iterable block-list ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.commitBlockList block-list access-condition options op-context)))
  ([^CloudBlockBlob this ^java.lang.Iterable block-list]
    (-> this (.commitBlockList block-list))))

(defn download-block-list
  "Downloads the block list from the block blob using the specified block listing filter, request options, and
   operation context.

   The committed block list includes the list of blocks that have been successfully committed to the block blob. The
   list of committed blocks is returned in the same order that they were committed to the blob. No block may appear
   more than once in the committed block list.

  block-listing-filter - A BlockListingFilter value that specifies whether to download committed blocks, uncommitted blocks, or all blocks. - `com.microsoft.azure.storage.blob.BlockListingFilter`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: An ArrayList object of BlockEntry objects that represent the list block items
           downloaded from the block blob. - `java.util.ArrayList<com.microsoft.azure.storage.blob.BlockEntry>`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.util.ArrayList [^CloudBlockBlob this ^com.microsoft.azure.storage.blob.BlockListingFilter block-listing-filter ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadBlockList block-listing-filter access-condition options op-context)))
  (^java.util.ArrayList [^CloudBlockBlob this]
    (-> this (.downloadBlockList))))

(defn upload-text
  "Uploads a blob from a string using the specified encoding. If the blob already exists on the service, it will be
   overwritten.

  content - A String which represents the content that will be uploaded to the blob. - `java.lang.String`
  charset-name - A String which represents the name of the charset to use to encode the content. If null, the platform's default encoding is used. - `java.lang.String`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudBlockBlob this ^java.lang.String content ^java.lang.String charset-name ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadText content charset-name access-condition options op-context)))
  ([^CloudBlockBlob this ^java.lang.String content]
    (-> this (.uploadText content))))

(defn set-stream-write-size-in-bytes
  "Sets the number of bytes to buffer when writing to a BlobOutputStream.

  stream-write-size-in-bytes - An int which represents the maximum block size, in bytes, for writing to a block blob while using a BlobOutputStream object, ranging from 16 KB to 100 MB, inclusive. - `int`

  throws: java.lang.IllegalArgumentException - If streamWriteSizeInBytes is less than 16 KB or greater than 100 MB."
  ([^CloudBlockBlob this ^Integer stream-write-size-in-bytes]
    (-> this (.setStreamWriteSizeInBytes stream-write-size-in-bytes))))

(defn start-copy
  "Requests the service to start copying a block blob's contents, properties, and metadata to a new block blob,
   using the specified access conditions, lease ID, request options, and operation context.

  source-blob - A CloudBlockBlob object that represents the source blob to copy. - `com.microsoft.azure.storage.blob.CloudBlockBlob`
  source-access-condition - An AccessCondition object that represents the access conditions for the source blob. - `com.microsoft.azure.storage.AccessCondition`
  destination-access-condition - An AccessCondition object that represents the access conditions for the destination blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A String which represents the copy ID associated with the copy operation. - `java.lang.String`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.lang.String [^CloudBlockBlob this ^com.microsoft.azure.storage.blob.CloudBlockBlob source-blob ^com.microsoft.azure.storage.AccessCondition source-access-condition ^com.microsoft.azure.storage.AccessCondition destination-access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.startCopy source-blob source-access-condition destination-access-condition options op-context)))
  (^java.lang.String [^CloudBlockBlob this ^com.microsoft.azure.storage.blob.CloudBlockBlob source-blob]
    (-> this (.startCopy source-blob))))

