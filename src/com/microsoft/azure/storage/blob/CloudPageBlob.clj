(ns com.microsoft.azure.storage.blob.CloudPageBlob
  "Represents a Microsoft Azure page blob."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob CloudPageBlob]))

(defn ->cloud-page-blob
  "Constructor.

  Creates an instance of the CloudPageBlob class using the specified absolute URI, snapshot ID, and
   credentials.

  blob-absolute-uri - A java.net.URI object that represents the absolute URI to the blob. - `java.net.URI`
  snapshot-id - A String that represents the snapshot version, if applicable. - `java.lang.String`
  credentials - A StorageCredentials object used to authenticate access. - `com.microsoft.azure.storage.StorageCredentials`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^CloudPageBlob [^java.net.URI blob-absolute-uri ^java.lang.String snapshot-id ^com.microsoft.azure.storage.StorageCredentials credentials]
    (new CloudPageBlob blob-absolute-uri snapshot-id credentials))
  (^CloudPageBlob [^java.net.URI blob-absolute-uri ^com.microsoft.azure.storage.StorageCredentials credentials]
    (new CloudPageBlob blob-absolute-uri credentials))
  (^CloudPageBlob [^java.net.URI blob-absolute-uri]
    (new CloudPageBlob blob-absolute-uri)))

(defn download-page-ranges
  "Returns a collection of page ranges and their starting and ending byte offsets using the specified request
   options and operation context.

  offset - The starting offset of the data range over which to list page ranges, in bytes. Must be a multiple of 512. - `long`
  length - The length of the data range over which to list page ranges, in bytes. Must be a multiple of 512. - `java.lang.Long`
  access-condition - An AccessCondition object which represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object which represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A List object which represents the set of page ranges and their starting and ending
           byte offsets. - `java.util.List<com.microsoft.azure.storage.blob.PageRange>`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.util.List [^CloudPageBlob this ^Long offset ^java.lang.Long length ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadPageRanges offset length access-condition options op-context)))
  (^java.util.ArrayList [^CloudPageBlob this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadPageRanges access-condition options op-context)))
  (^java.util.List [^CloudPageBlob this ^Long offset ^java.lang.Long length]
    (-> this (.downloadPageRanges offset length)))
  (^java.util.ArrayList [^CloudPageBlob this]
    (-> this (.downloadPageRanges))))

(defn clear-pages
  "Clears pages from a page blob using the specified lease ID, request options, and operation context.

   Calling clearPages releases the storage space used by the specified pages. Pages that have been
   cleared are no longer tracked as part of the page blob, and no longer incur a charge against the storage account.

  offset - A long which represents the offset, in bytes, at which to begin clearing pages. This value must be a multiple of 512. - `long`
  length - A long which represents the length, in bytes, of the data range to be cleared. This value must be a multiple of 512. - `long`
  access-condition - An AccessCondition object which represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object which represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudPageBlob this ^Long offset ^Long length ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.clearPages offset length access-condition options op-context)))
  ([^CloudPageBlob this ^Long offset ^Long length]
    (-> this (.clearPages offset length))))

(defn start-incremental-copy
  "Requests the service to start copying a blob's contents, properties, and metadata to a new blob, using the
   specified access conditions, lease ID, request options, and operation context.

  source-snapshot - A CloudPageBlob object that represents the source blob to copy. Must be a snapshot. - `com.microsoft.azure.storage.blob.CloudPageBlob`
  destination-access-condition - An AccessCondition object that represents the access conditions for the destination blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A String which represents the copy ID associated with the copy operation. - `java.lang.String`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.lang.String [^CloudPageBlob this ^com.microsoft.azure.storage.blob.CloudPageBlob source-snapshot ^com.microsoft.azure.storage.AccessCondition destination-access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.startIncrementalCopy source-snapshot destination-access-condition options op-context)))
  (^java.lang.String [^CloudPageBlob this ^com.microsoft.azure.storage.blob.CloudPageBlob source-snapshot]
    (-> this (.startIncrementalCopy source-snapshot))))

(defn upload-pages
  "Uploads a range of contiguous pages, up to 4 MB in size, at the specified offset in the page blob, using the
   specified lease ID, request options, and operation context.

  source-stream - An InputStream object which represents the input stream to write to the page blob. - `java.io.InputStream`
  offset - A long which represents the offset, in number of bytes, at which to begin writing the data. This value must be a multiple of 512. - `long`
  length - A long which represents the length, in bytes, of the data to write. This value must be a multiple of 512. - `long`
  access-condition - An AccessCondition object which represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object which represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: java.lang.IllegalArgumentException - If the offset or length are not multiples of 512, or if the length is greater than 4 MB."
  ([^CloudPageBlob this ^java.io.InputStream source-stream ^Long offset ^Long length ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadPages source-stream offset length access-condition options op-context)))
  ([^CloudPageBlob this ^java.io.InputStream source-stream ^Long offset ^Long length]
    (-> this (.uploadPages source-stream offset length))))

(defn upload
  "Uploads the source stream data to the page blob using the specified lease ID, request options, and operation
   context. If the blob already exists on the service, it will be overwritten.

  source-stream - An InputStream object to read from. - `java.io.InputStream`
  length - A long which represents the length, in bytes, of the stream data. This must be great than zero and a multiple of 512. - `long`
  premium-blob-tier - A PremiumPageBlobTier object which represents the tier of the blob. - `com.microsoft.azure.storage.blob.PremiumPageBlobTier`
  access-condition - An AccessCondition object which represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object which represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: java.io.IOException - If an I/O exception occurred."
  ([^CloudPageBlob this ^java.io.InputStream source-stream ^Long length ^com.microsoft.azure.storage.blob.PremiumPageBlobTier premium-blob-tier ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.upload source-stream length premium-blob-tier access-condition options op-context)))
  ([^CloudPageBlob this ^java.io.InputStream source-stream ^Long length ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.upload source-stream length access-condition options op-context)))
  ([^CloudPageBlob this ^java.io.InputStream source-stream ^Long length]
    (-> this (.upload source-stream length))))

(defn upload-from-byte-array
  "Uploads a blob from data in a byte array. If the blob already exists on the service, it will be overwritten.

  buffer - A byte array which represents the data to write to the blob. - `byte[]`
  offset - A int which represents the offset of the byte array from which to start the data upload. - `int`
  length - An int which represents the number of bytes to upload from the input buffer. - `int`
  premium-blob-tier - A PremiumPageBlobTier object which represents the tier of the blob. - `com.microsoft.azure.storage.blob.PremiumPageBlobTier`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudPageBlob this buffer ^Integer offset ^Integer length ^com.microsoft.azure.storage.blob.PremiumPageBlobTier premium-blob-tier ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadFromByteArray buffer offset length premium-blob-tier access-condition options op-context))))

(defn download-page-ranges-diff
  "Gets the collection of page ranges that differ between a specified snapshot and this object.

  previous-snapshot - A string representing the snapshot timestamp to use as the starting point for the diff. If this CloudPageBlob represents a snapshot, the previousSnapshot parameter must be prior to the current snapshot. - `java.lang.String`
  offset - The starting offset of the data range over which to list page ranges, in bytes. Must be a multiple of 512. - `java.lang.Long`
  length - The length of the data range over which to list page ranges, in bytes. Must be a multiple of 512. - `java.lang.Long`
  access-condition - An AccessCondition object which represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object which represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A List object containing the set of differing page ranges. - `java.util.List<com.microsoft.azure.storage.blob.PageRangeDiff>`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.util.List [^CloudPageBlob this ^java.lang.String previous-snapshot ^java.lang.Long offset ^java.lang.Long length ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadPageRangesDiff previous-snapshot offset length access-condition options op-context)))
  (^java.util.List [^CloudPageBlob this ^java.lang.String previous-snapshot]
    (-> this (.downloadPageRangesDiff previous-snapshot))))

(defn upload-from-file
  "Uploads a blob from a file. If the blob already exists on the service, it will be overwritten.

  path - A String which represents the path to the file to be uploaded. - `java.lang.String`
  premium-blob-tier - A PremiumPageBlobTier object which represents the tier of the blob. - `com.microsoft.azure.storage.blob.PremiumPageBlobTier`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudPageBlob this ^java.lang.String path ^com.microsoft.azure.storage.blob.PremiumPageBlobTier premium-blob-tier ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadFromFile path premium-blob-tier access-condition options op-context))))

(defn upload-premium-page-blob-tier
  "Sets the tier on a page blob on a premium storage account.

  premium-blob-tier - A PremiumPageBlobTier object which represents the tier of the blob. - `com.microsoft.azure.storage.blob.PremiumPageBlobTier`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object which represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudPageBlob this ^com.microsoft.azure.storage.blob.PremiumPageBlobTier premium-blob-tier ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadPremiumPageBlobTier premium-blob-tier options op-context)))
  ([^CloudPageBlob this ^com.microsoft.azure.storage.blob.PremiumPageBlobTier premium-blob-tier]
    (-> this (.uploadPremiumPageBlobTier premium-blob-tier))))

(defn open-write-new
  "Opens an output stream object to write data to the page blob, using the specified lease ID, request options and
   operation context. The page blob does not need to yet exist and will be created with the length specified.If the
   blob already exists on the service, it will be overwritten.

   To avoid overwriting and instead throw an error, please pass in an AccessCondition generated using
   AccessCondition.generateIfNotExistsCondition().

  length - A long which represents the length, in bytes, of the stream to create. This value must be a multiple of 512. - `long`
  premium-blob-tier - A PremiumPageBlobTier object which represents the tier of the blob. - `com.microsoft.azure.storage.blob.PremiumPageBlobTier`
  access-condition - An AccessCondition object which represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object which represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A BlobOutputStream object used to write data to the blob. - `com.microsoft.azure.storage.blob.BlobOutputStream`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.blob.BlobOutputStream [^CloudPageBlob this ^Long length ^com.microsoft.azure.storage.blob.PremiumPageBlobTier premium-blob-tier ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.openWriteNew length premium-blob-tier access-condition options op-context)))
  (^com.microsoft.azure.storage.blob.BlobOutputStream [^CloudPageBlob this ^Long length ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.openWriteNew length access-condition options op-context)))
  (^com.microsoft.azure.storage.blob.BlobOutputStream [^CloudPageBlob this ^Long length]
    (-> this (.openWriteNew length))))

(defn create
  "Creates a page blob using the specified request options and operation context. If the blob already exists,
   this will replace it. To instead throw an error if the blob already exists, use
   AccessCondition.generateIfNotExistsCondition().

  length - A long which represents the size, in bytes, of the page blob. - `long`
  premium-blob-tier - A PremiumPageBlobTier object which represents the tier of the blob. - `com.microsoft.azure.storage.blob.PremiumPageBlobTier`
  access-condition - An AccessCondition object which represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object which represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: java.lang.IllegalArgumentException - If the length is not a multiple of 512."
  ([^CloudPageBlob this ^Long length ^com.microsoft.azure.storage.blob.PremiumPageBlobTier premium-blob-tier ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.create length premium-blob-tier access-condition options op-context)))
  ([^CloudPageBlob this ^Long length ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.create length access-condition options op-context)))
  ([^CloudPageBlob this ^Long length]
    (-> this (.create length))))

(defn set-stream-write-size-in-bytes
  "Sets the number of bytes to buffer when writing to a BlobOutputStream.

  stream-write-size-in-bytes - An int which represents the maximum number of bytes to buffer when writing to a page blob stream. This value must be a multiple of 512 and less than or equal to 4 MB. - `int`

  throws: java.lang.IllegalArgumentException - If streamWriteSizeInBytes is less than 512, greater than 4 MB, or not a multiple or 512."
  ([^CloudPageBlob this ^Integer stream-write-size-in-bytes]
    (-> this (.setStreamWriteSizeInBytes stream-write-size-in-bytes))))

(defn resize
  "Resizes the page blob to the specified size.

  size - A long which represents the size of the page blob, in bytes. - `long`
  access-condition - An AccessCondition object which represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object which represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudPageBlob this ^Long size ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.resize size access-condition options op-context)))
  ([^CloudPageBlob this ^Long size]
    (-> this (.resize size))))

(defn start-copy
  "Requests the service to start copying a blob's contents, properties, and metadata to a new blob, using the
   specified blob tier, access conditions, lease ID, request options, and operation context.

  source-blob - A CloudPageBlob object that represents the source blob to copy. - `com.microsoft.azure.storage.blob.CloudPageBlob`
  premium-blob-tier - A PremiumPageBlobTier object which represents the tier of the blob. - `com.microsoft.azure.storage.blob.PremiumPageBlobTier`
  source-access-condition - An AccessCondition object that represents the access conditions for the source blob. - `com.microsoft.azure.storage.AccessCondition`
  destination-access-condition - An AccessCondition object that represents the access conditions for the destination blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A String which represents the copy ID associated with the copy operation. - `java.lang.String`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.lang.String [^CloudPageBlob this ^com.microsoft.azure.storage.blob.CloudPageBlob source-blob ^com.microsoft.azure.storage.blob.PremiumPageBlobTier premium-blob-tier ^com.microsoft.azure.storage.AccessCondition source-access-condition ^com.microsoft.azure.storage.AccessCondition destination-access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.startCopy source-blob premium-blob-tier source-access-condition destination-access-condition options op-context)))
  (^java.lang.String [^CloudPageBlob this ^com.microsoft.azure.storage.blob.CloudPageBlob source-blob ^com.microsoft.azure.storage.AccessCondition source-access-condition ^com.microsoft.azure.storage.AccessCondition destination-access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.startCopy source-blob source-access-condition destination-access-condition options op-context)))
  (^java.lang.String [^CloudPageBlob this ^com.microsoft.azure.storage.blob.CloudPageBlob source-blob]
    (-> this (.startCopy source-blob))))

(defn open-write-existing
  "Opens an output stream object to write data to the page blob, using the specified lease ID, request options and
   operation context. The page blob must already exist and any existing data may be overwritten.

  access-condition - An AccessCondition object which represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object which represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A BlobOutputStream object used to write data to the blob. - `com.microsoft.azure.storage.blob.BlobOutputStream`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.blob.BlobOutputStream [^CloudPageBlob this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.openWriteExisting access-condition options op-context)))
  (^com.microsoft.azure.storage.blob.BlobOutputStream [^CloudPageBlob this]
    (-> this (.openWriteExisting))))

