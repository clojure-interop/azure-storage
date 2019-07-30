(ns com.microsoft.azure.storage.blob.CloudAppendBlob
  "Represents a Microsoft Azure Append Blob."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob CloudAppendBlob]))

(defn ->cloud-append-blob
  "Constructor.

  Creates an instance of the CloudAppendBlob class using the specified absolute URI, snapshot ID, and
   credentials.

  blob-absolute-uri - A java.net.URI object that represents the absolute URI to the blob. - `java.net.URI`
  snapshot-id - A String that represents the snapshot version, if applicable. - `java.lang.String`
  credentials - A StorageCredentials object used to authenticate access. - `com.microsoft.azure.storage.StorageCredentials`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^CloudAppendBlob [^java.net.URI blob-absolute-uri ^java.lang.String snapshot-id ^com.microsoft.azure.storage.StorageCredentials credentials]
    (new CloudAppendBlob blob-absolute-uri snapshot-id credentials))
  (^CloudAppendBlob [^java.net.URI blob-absolute-uri ^com.microsoft.azure.storage.StorageCredentials credentials]
    (new CloudAppendBlob blob-absolute-uri credentials))
  (^CloudAppendBlob [^java.net.URI blob-absolute-uri]
    (new CloudAppendBlob blob-absolute-uri)))

(defn append-block
  "Commits a new block of data to the end of the blob.

  source-stream - An InputStream object that represents the input stream to write to the Append blob. - `java.io.InputStream`
  length - A long which represents the length, in bytes, of the stream data, or -1 if unknown. - `long`
  access-condition - An AccessCondition object which represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object which represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: The offset at which the block was appended. - `java.lang.Long`

  throws: java.io.IOException - If an I/O exception occurred."
  (^java.lang.Long [^CloudAppendBlob this ^java.io.InputStream source-stream ^Long length ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.appendBlock source-stream length access-condition options op-context)))
  (^java.lang.Long [^CloudAppendBlob this ^java.io.InputStream source-stream ^Long length]
    (-> this (.appendBlock source-stream length))))

(defn upload
  "Uploads the source stream data to the append blob using the specified lease ID, request options, and operation
   context. If the blob already exists on the service, it will be overwritten.

   If you want to append data to an already existing blob, please see appendBlock(InputStream, long).

   If you are doing writes in a single writer scenario, please look at
   BlobRequestOptions.setAbsorbConditionalErrorsOnRetry(Boolean) and see if setting this flag
   to true is acceptable for you.

  source-stream - An InputStream object to read from. - `java.io.InputStream`
  length - A long which represents the length, in bytes, of the stream data, or -1 if unknown. - `long`
  access-condition - An AccessCondition object which represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object which represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: java.io.IOException - If an I/O exception occurred."
  ([^CloudAppendBlob this ^java.io.InputStream source-stream ^Long length ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.upload source-stream length access-condition options op-context)))
  ([^CloudAppendBlob this ^java.io.InputStream source-stream ^Long length]
    (-> this (.upload source-stream length))))

(defn create-or-replace
  "Creates an append blob using the specified request options and operation context. If the blob already exists,
   this will replace it.

   To avoid overwriting and instead throw an error, please pass in an AccessCondition generated using
   AccessCondition.generateIfNotExistsCondition().

  access-condition - An AccessCondition object which represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object which represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudAppendBlob this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.createOrReplace access-condition options op-context)))
  ([^CloudAppendBlob this]
    (-> this (.createOrReplace))))

(defn append-from-file
  "Appends a file to an append blob. This API should be used strictly in a single writer scenario because the API
   internally uses the append-offset conditional header to avoid duplicate blocks which does not work in a multiple
   writer scenario.

   If you are doing writes in a single writer scenario, please look at
   BlobRequestOptions.setAbsorbConditionalErrorsOnRetry(Boolean) and see if setting this flag
   to true is acceptable for you.

  path - A String which represents the path to the file to be appended. - `java.lang.String`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudAppendBlob this ^java.lang.String path ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.appendFromFile path access-condition options op-context)))
  ([^CloudAppendBlob this ^java.lang.String path]
    (-> this (.appendFromFile path))))

(defn open-write-new
  "Opens an output stream object to write data to the append blob, using the specified lease ID, request options and
   operation context. The append blob does not need to yet exist. If the blob already exists, this will replace it.

   To avoid overwriting and instead throw an error, please pass in an AccessCondition generated using
   AccessCondition.generateIfNotExistsCondition().

   If you are doing writes in a single writer scenario, please look at
   BlobRequestOptions.setAbsorbConditionalErrorsOnRetry(Boolean) and see if setting this flag
   to true is acceptable for you.

  access-condition - An AccessCondition object which represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object which represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A BlobOutputStream object used to write data to the blob. - `com.microsoft.azure.storage.blob.BlobOutputStream`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.blob.BlobOutputStream [^CloudAppendBlob this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.openWriteNew access-condition options op-context)))
  (^com.microsoft.azure.storage.blob.BlobOutputStream [^CloudAppendBlob this]
    (-> this (.openWriteNew))))

(defn append
  "Appends a stream to an append blob. This API should be used strictly in a single writer scenario because the API
   internally uses the append-offset conditional header to avoid duplicate blocks which does not work in a multiple
   writer scenario.

   If you are doing writes in a single writer scenario, please look at
   BlobRequestOptions.setAbsorbConditionalErrorsOnRetry(Boolean) and see if setting this flag
   to true is acceptable for you.

  source-stream - A InputStream object providing the blob content to append. - `java.io.InputStream`
  length - A long which represents the length, in bytes, of the stream data, or -1 if unknown. - `long`
  access-condition - An AccessCondition object which represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object which represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudAppendBlob this ^java.io.InputStream source-stream ^Long length ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.append source-stream length access-condition options op-context)))
  ([^CloudAppendBlob this ^java.io.InputStream source-stream ^Long length]
    (-> this (.append source-stream length))))

(defn append-text
  "Appends a string of text to an append blob using the specified encoding. This API should be used strictly in a
   single writer scenario because the API internally uses the append-offset conditional header to avoid duplicate
   blocks which does not work in a multiple writer scenario.

   If you are doing writes in a single writer scenario, please look at
   BlobRequestOptions.setAbsorbConditionalErrorsOnRetry(Boolean) and see if setting this flag
   to true is acceptable for you.

  content - A String which represents the content that will be appended to the blob. - `java.lang.String`
  charset-name - A String which represents the name of the charset to use to encode the content. If null, the platform's default encoding is used. - `java.lang.String`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudAppendBlob this ^java.lang.String content ^java.lang.String charset-name ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.appendText content charset-name access-condition options op-context)))
  ([^CloudAppendBlob this ^java.lang.String content]
    (-> this (.appendText content))))

(defn set-stream-write-size-in-bytes
  "Sets the number of bytes to buffer when writing to a BlobOutputStream.

  stream-write-size-in-bytes - An int which represents the maximum block size, in bytes, for writing to an append blob while using a BlobOutputStream object, ranging from 16 KB to 4 MB, inclusive. - `int`

  throws: java.lang.IllegalArgumentException - If streamWriteSizeInBytes is less than 16 KB or greater than 4 MB."
  ([^CloudAppendBlob this ^Integer stream-write-size-in-bytes]
    (-> this (.setStreamWriteSizeInBytes stream-write-size-in-bytes))))

(defn append-from-byte-array
  "Appends the contents of a byte array to an append blob.This API should be used strictly in a single writer
   scenario because the API internally uses the append-offset conditional header to avoid duplicate blocks which
   does not work in a multiple writer scenario.

   If you are doing writes in a single writer scenario, please look at
   BlobRequestOptions.setAbsorbConditionalErrorsOnRetry(Boolean) and see if setting this flag
   to true is acceptable for you.

  buffer - A byte array which represents the data to append to the blob. - `byte[]`
  offset - A int which represents the offset of the byte array from which to start the data upload. - `int`
  length - An int which represents the number of bytes to upload from the input buffer. - `int`
  access-condition - An AccessCondition object that represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudAppendBlob this buffer ^Integer offset ^Integer length ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.appendFromByteArray buffer offset length access-condition options op-context)))
  ([^CloudAppendBlob this buffer ^Integer offset ^Integer length]
    (-> this (.appendFromByteArray buffer offset length))))

(defn start-copy
  "Requests the service to start copying a append blob's contents, properties, and metadata to a new append blob,
   using the specified access conditions, lease ID, request options, and operation context.

  source-blob - A CloudAppendBlob object that represents the source blob to copy. - `com.microsoft.azure.storage.blob.CloudAppendBlob`
  source-access-condition - An AccessCondition object that represents the access conditions for the source blob. - `com.microsoft.azure.storage.AccessCondition`
  destination-access-condition - An AccessCondition object that represents the access conditions for the destination blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A String which represents the copy ID associated with the copy operation. - `java.lang.String`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.lang.String [^CloudAppendBlob this ^com.microsoft.azure.storage.blob.CloudAppendBlob source-blob ^com.microsoft.azure.storage.AccessCondition source-access-condition ^com.microsoft.azure.storage.AccessCondition destination-access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.startCopy source-blob source-access-condition destination-access-condition options op-context)))
  (^java.lang.String [^CloudAppendBlob this ^com.microsoft.azure.storage.blob.CloudAppendBlob source-blob]
    (-> this (.startCopy source-blob))))

(defn open-write-existing
  "Opens an output stream object to write data to the append blob, using the specified lease ID, request options and
   operation context. The append blob must already exist and will be appended to.

   If you are doing writes in a single writer scenario, please look at
   BlobRequestOptions.setAbsorbConditionalErrorsOnRetry(Boolean) and see if setting this flag
   to true is acceptable for you.

  access-condition - An AccessCondition object which represents the access conditions for the blob. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object which represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A BlobOutputStream object used to write data to the blob. - `com.microsoft.azure.storage.blob.BlobOutputStream`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.blob.BlobOutputStream [^CloudAppendBlob this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.openWriteExisting access-condition options op-context)))
  (^com.microsoft.azure.storage.blob.BlobOutputStream [^CloudAppendBlob this]
    (-> this (.openWriteExisting))))

