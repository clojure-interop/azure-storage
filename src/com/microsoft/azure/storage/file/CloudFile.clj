(ns com.microsoft.azure.storage.file.CloudFile
  "Represents a Microsoft Azure File."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.file CloudFile]))

(defn ->cloud-file
  "Constructor.

  Creates an instance of the CloudFile class using the specified absolute URI
   and credentials.

  file-absolute-uri - A java.net.URI object that represents the absolute URI to the file. - `java.net.URI`
  credentials - A StorageCredentials object used to authenticate access. - `com.microsoft.azure.storage.StorageCredentials`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^CloudFile [^java.net.URI file-absolute-uri ^com.microsoft.azure.storage.StorageCredentials credentials]
    (new CloudFile file-absolute-uri credentials))
  (^CloudFile [^java.net.URI file-absolute-uri]
    (new CloudFile file-absolute-uri)))

(defn download-file-ranges
  "Returns a collection of file ranges and their starting and ending byte offsets using the specified request
   options and operation context.

  access-condition - An AccessCondition object which represents the access conditions for the file. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object which represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: An ArrayList object which represents the set of file ranges and their starting
              and ending byte offsets. - `java.util.ArrayList<com.microsoft.azure.storage.file.FileRange>`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.util.ArrayList [^CloudFile this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadFileRanges access-condition options op-context)))
  (^java.util.ArrayList [^CloudFile this]
    (-> this (.downloadFileRanges))))

(defn download-attributes
  "Populates a file's properties and metadata using the specified request options and operation context.

   This method populates the file's system properties and user-defined metadata. Before reading or modifying
   a file's properties or metadata, call this method or its overload to retrieve the latest values for
   the file's properties and metadata from the Microsoft Azure storage service.

  access-condition - An AccessCondition object that represents the access conditions for the file. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudFile this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadAttributes access-condition options op-context)))
  ([^CloudFile this]
    (-> this (.downloadAttributes))))

(defn abort-copy
  "Aborts an ongoing Azure File copy operation.

  copy-id - A String object that identifies the copy operation. - `java.lang.String`
  access-condition - An AccessCondition object that represents the access conditions for the Azure File. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudFile this ^java.lang.String copy-id ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.abortCopy copy-id access-condition options op-context)))
  ([^CloudFile this ^java.lang.String copy-id]
    (-> this (.abortCopy copy-id))))

(defn download-to-byte-array
  "Downloads a range of bytes from the file to the given byte buffer, using the specified request options and
   operation context.

  buffer - A byte array which represents the buffer to which the file bytes are downloaded. - `byte[]`
  buffer-offset - A long which represents the byte offset to use as the starting point for the target. - `int`
  access-condition - An AccessCondition object that represents the access conditions for the file. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: `int`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^Integer [^CloudFile this buffer ^Integer buffer-offset ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadToByteArray buffer buffer-offset access-condition options op-context)))
  (^Integer [^CloudFile this buffer ^Integer buffer-offset]
    (-> this (.downloadToByteArray buffer buffer-offset))))

(defn download-text
  "Downloads a file to a string using the specified encoding.

  charset-name - A String which represents the name of the charset to use to encode the content. If null, the platform's default encoding is used. - `java.lang.String`
  access-condition - An AccessCondition object that represents the access conditions for the file. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A String which represents the file's contents. - `java.lang.String`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.lang.String [^CloudFile this ^java.lang.String charset-name ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadText charset-name access-condition options op-context)))
  (^java.lang.String [^CloudFile this]
    (-> this (.downloadText))))

(defn get-stream-write-size-in-bytes
  "Gets the number of bytes to buffer when writing to a FileOutputStream.

  returns: A int which represents the number of bytes to buffer. - `int`"
  (^Integer [^CloudFile this]
    (-> this (.getStreamWriteSizeInBytes))))

(defn get-copy-state
  "Returns the Azure File's copy state.

  returns: A CopyState object that represents the copy state of the file. - `com.microsoft.azure.storage.file.CopyState`"
  (^com.microsoft.azure.storage.file.CopyState [^CloudFile this]
    (-> this (.getCopyState))))

(defn delete
  "Deletes the file using the specified access condition, request options, and operation context.

  access-condition - An AccessCondition object that represents the access conditions for the file. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudFile this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.delete access-condition options op-context)))
  ([^CloudFile this]
    (-> this (.delete))))

(defn download
  "Downloads the contents of a file to a stream using the specified request options and operation context.

  out-stream - An OutputStream object that represents the target stream. - `java.io.OutputStream`
  access-condition - An AccessCondition object that represents the access conditions for the file. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudFile this ^java.io.OutputStream out-stream ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.download out-stream access-condition options op-context)))
  ([^CloudFile this ^java.io.OutputStream out-stream]
    (-> this (.download out-stream))))

(defn upload
  "Uploads the source stream data to the file using the specified access condition, request options, and operation
   context. If the file already exists on the service, it will be overwritten.

  source-stream - An InputStream object to read from. - `java.io.InputStream`
  length - A long which represents the length, in bytes, of the stream data. This must be greater than or equal to zero. - `long`
  access-condition - An AccessCondition object which represents the access conditions for the file. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object which represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: java.io.IOException - If an I/O exception occurred."
  ([^CloudFile this ^java.io.InputStream source-stream ^Long length ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.upload source-stream length access-condition options op-context)))
  ([^CloudFile this ^java.io.InputStream source-stream ^Long length]
    (-> this (.upload source-stream length))))

(defn generate-shared-access-signature
  "Returns a shared access signature for the file using the specified group policy identifier and
   shared access file headers. Note this does not contain the leading \"?\".

  policy - A SharedAccessFilePolicy object that represents the access policy for the shared access signature. - `com.microsoft.azure.storage.file.SharedAccessFilePolicy`
  headers - A SharedAccessFileHeaders object that represents the optional header values to set for a file accessed with this shared access signature. - `com.microsoft.azure.storage.file.SharedAccessFileHeaders`
  group-policy-identifier - A String that represents the share-level access policy. - `java.lang.String`
  ip-range - A IPRange object containing the range of allowed IP addresses. - `com.microsoft.azure.storage.IPRange`
  protocols - A SharedAccessProtocols representing the allowed Internet protocols. - `com.microsoft.azure.storage.SharedAccessProtocols`

  returns: A String that represents the shared access signature. - `java.lang.String`

  throws: java.lang.IllegalArgumentException - If the credentials are invalid."
  (^java.lang.String [^CloudFile this ^com.microsoft.azure.storage.file.SharedAccessFilePolicy policy ^com.microsoft.azure.storage.file.SharedAccessFileHeaders headers ^java.lang.String group-policy-identifier ^com.microsoft.azure.storage.IPRange ip-range ^com.microsoft.azure.storage.SharedAccessProtocols protocols]
    (-> this (.generateSharedAccessSignature policy headers group-policy-identifier ip-range protocols)))
  (^java.lang.String [^CloudFile this ^com.microsoft.azure.storage.file.SharedAccessFilePolicy policy ^com.microsoft.azure.storage.file.SharedAccessFileHeaders headers ^java.lang.String group-policy-identifier]
    (-> this (.generateSharedAccessSignature policy headers group-policy-identifier)))
  (^java.lang.String [^CloudFile this ^com.microsoft.azure.storage.file.SharedAccessFilePolicy policy ^java.lang.String group-policy-identifier]
    (-> this (.generateSharedAccessSignature policy group-policy-identifier))))

(defn upload-range
  "Uploads a range to a file using the specified lease ID, request options, and operation context.

  source-stream - An InputStream object which represents the input stream to write to the file. - `java.io.InputStream`
  offset - A long which represents the offset, in number of bytes, at which to begin writing the data. - `long`
  length - A long which represents the length, in bytes, of the data to write. - `long`
  access-condition - An AccessCondition object which represents the access conditions for the file. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object which represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: java.io.IOException - If an I/O exception occurred."
  ([^CloudFile this ^java.io.InputStream source-stream ^Long offset ^Long length ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadRange source-stream offset length access-condition options op-context)))
  ([^CloudFile this ^java.io.InputStream source-stream ^Long offset ^Long length]
    (-> this (.uploadRange source-stream offset length))))

(defn upload-from-byte-array
  "Uploads a file from data in a byte array. If the file already exists on the service, it will be overwritten.

  buffer - A byte array which represents the data to write to the file. - `byte[]`
  offset - A int which represents the offset of the byte array from which to start the data upload. - `int`
  length - An int which represents the number of bytes to upload from the input buffer. - `int`
  access-condition - An AccessCondition object that represents the access conditions for the file. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudFile this buffer ^Integer offset ^Integer length ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadFromByteArray buffer offset length access-condition options op-context)))
  ([^CloudFile this buffer ^Integer offset ^Integer length]
    (-> this (.uploadFromByteArray buffer offset length))))

(defn get-stream-minimum-read-size-in-bytes
  "Returns the minimum read size when using a FileInputStream.

  returns: A int which represents the minimum read size, in bytes, when using a FileInputStream
           object. - `int`"
  (^Integer [^CloudFile this]
    (-> this (.getStreamMinimumReadSizeInBytes))))

(defn get-storage-uri
  "Returns the list of URIs for all locations.

  returns: A StorageUri that represents the list of URIs for all locations. - `com.microsoft.azure.storage.StorageUri`"
  (^com.microsoft.azure.storage.StorageUri [^CloudFile this]
    (-> this (.getStorageUri))))

(defn get-name
  "Returns the name of the file.

  returns: A String that represents the name of the file. - `java.lang.String`"
  (^java.lang.String [^CloudFile this]
    (-> this (.getName))))

(defn get-service-client
  "Returns the file service client associated with the file.

  returns: A CloudFileClient object that represents the client. - `com.microsoft.azure.storage.file.CloudFileClient`"
  (^com.microsoft.azure.storage.file.CloudFileClient [^CloudFile this]
    (-> this (.getServiceClient))))

(defn clear-range
  "Clears a range from a file using the specified lease ID, request options, and operation context.

   Calling clearRange releases the storage space used by the specified range. Ranges that have been
   cleared are no longer tracked as part of the file.

  offset - A long which represents the offset, in bytes, at which to begin clearing. - `long`
  length - A long which represents the length, in bytes, of the data range to be cleared. - `long`
  access-condition - An AccessCondition object which represents the access conditions for the file. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object which represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudFile this ^Long offset ^Long length ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.clearRange offset length access-condition options op-context)))
  ([^CloudFile this ^Long offset ^Long length]
    (-> this (.clearRange offset length))))

(defn get-share
  "Returns the file's share.

  returns: A CloudFileShare object that represents the share of the file. - `com.microsoft.azure.storage.file.CloudFileShare`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.file.CloudFileShare [^CloudFile this]
    (-> this (.getShare))))

(defn get-uri
  "Returns the URI for this file.

  returns: A java.net.URI object that represents the URI for the file. - `java.net.URI`"
  (^java.net.URI [^CloudFile this]
    (-> this (.getUri))))

(defn get-properties
  "Returns the file's properties.

  returns: A FileProperties object that represents the properties of the file. - `com.microsoft.azure.storage.file.FileProperties`"
  (^com.microsoft.azure.storage.file.FileProperties [^CloudFile this]
    (-> this (.getProperties))))

(defn delete-if-exists
  "Deletes the file if it exists, using the specified access condition, request options, and operation context.

  access-condition - An AccessCondition object that represents the access conditions for the file. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: true if the file existed and was deleted; otherwise, false - `boolean`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^Boolean [^CloudFile this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.deleteIfExists access-condition options op-context)))
  (^Boolean [^CloudFile this]
    (-> this (.deleteIfExists))))

(defn get-parent
  "Returns the file item's parent.

  returns: A CloudFileDirectory object that represents the parent directory for the file. - `com.microsoft.azure.storage.file.CloudFileDirectory`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.file.CloudFileDirectory [^CloudFile this]
    (-> this (.getParent))))

(defn upload-from-file
  "Uploads a file from a local file. If the file already exists on the service, it will be overwritten.

  path - A String which represents the path to the file to be uploaded. - `java.lang.String`
  access-condition - An AccessCondition object that represents the access conditions for the file. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudFile this ^java.lang.String path ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadFromFile path access-condition options op-context)))
  ([^CloudFile this ^java.lang.String path]
    (-> this (.uploadFromFile path))))

(defn download-range-to-byte-array
  "Downloads a range of bytes from the file to the given byte buffer, using the specified request options and
   operation context.

  offset - A long which represents the byte offset to use as the starting point for the source. - `long`
  length - A Long which represents the number of bytes to read or null. - `java.lang.Long`
  buffer - A byte array which represents the buffer to which the file bytes are downloaded. - `byte[]`
  buffer-offset - An int which represents the byte offset to use as the starting point for the target. - `int`
  access-condition - An AccessCondition object that represents the access conditions for the file. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: `int`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^Integer [^CloudFile this ^Long offset ^java.lang.Long length buffer ^Integer buffer-offset ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadRangeToByteArray offset length buffer buffer-offset access-condition options op-context)))
  (^Integer [^CloudFile this ^Long offset ^java.lang.Long length buffer ^Integer buffer-offset]
    (-> this (.downloadRangeToByteArray offset length buffer buffer-offset))))

(defn open-write-new
  "Opens an output stream object to write data to the file, using the specified lease ID, request options and
   operation context. The file does not need to yet exist and will be created with the length specified. If the file
    already exists on the service, it will be overwritten.

   To avoid overwriting and instead throw an error, please pass in an AccessCondition generated using
   AccessCondition.generateIfNotExistsCondition().

  length - A long which represents the length, in bytes, of the stream to create. - `long`
  access-condition - An AccessCondition object which represents the access conditions for the file. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object which represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A FileOutputStream object used to write data to the file. - `com.microsoft.azure.storage.file.FileOutputStream`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.file.FileOutputStream [^CloudFile this ^Long length ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.openWriteNew length access-condition options op-context)))
  (^com.microsoft.azure.storage.file.FileOutputStream [^CloudFile this ^Long length]
    (-> this (.openWriteNew length))))

(defn create
  "Creates a file using the specified access condition, request options and operation context. If the file already
   exists, this will replace it.

  size - A long which represents the size, in bytes, of the file. - `long`
  access-condition - An AccessCondition object which represents the access conditions for the file. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object which represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudFile this ^Long size ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.create size access-condition options op-context)))
  ([^CloudFile this ^Long size]
    (-> this (.create size))))

(defn upload-metadata
  "Uploads the file's metadata to the storage service using the access condition, request options, and operation
   context.

   Use downloadAttributes() to retrieve the latest values for the file's properties and metadata
   from the Microsoft Azure storage service.

  access-condition - An AccessCondition object that represents the access conditions for the file. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudFile this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadMetadata access-condition options op-context)))
  ([^CloudFile this]
    (-> this (.uploadMetadata))))

(defn exists?
  "Checks to see if the file exists, using the specified access condition, request options and operation context.

  access-condition - An AccessCondition object that represents the access conditions for the file. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: true if the file exists, otherwise false. - `boolean`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^Boolean [^CloudFile this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.exists access-condition options op-context)))
  (^Boolean [^CloudFile this]
    (-> this (.exists))))

(defn upload-text
  "Uploads a file from a string using the specified encoding. If the file already exists on the service, it will be
   overwritten.

  content - A String which represents the content that will be uploaded to the file. - `java.lang.String`
  charset-name - A String which represents the name of the charset to use to encode the content. If null, the platform's default encoding is used. - `java.lang.String`
  access-condition - An AccessCondition object that represents the access conditions for the file. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudFile this ^java.lang.String content ^java.lang.String charset-name ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadText content charset-name access-condition options op-context)))
  ([^CloudFile this ^java.lang.String content]
    (-> this (.uploadText content))))

(defn get-metadata
  "Returns the metadata for the file.

  returns: A java.util.HashMap object that represents the metadata for the file. - `java.util.HashMap<java.lang.String,java.lang.String>`"
  (^java.util.HashMap [^CloudFile this]
    (-> this (.getMetadata))))

(defn set-stream-write-size-in-bytes
  "Sets the number of bytes to buffer when writing to a FileOutputStream.

  stream-write-size-in-bytes - An int which represents the number of bytes to buffer while using a FileOutputStream object, ranging from 512 bytes to 4 MB, inclusive. - `int`

  throws: java.lang.IllegalArgumentException - If streamWriteSizeInBytes is less than 512 bytes or greater than 4 MB."
  ([^CloudFile this ^Integer stream-write-size-in-bytes]
    (-> this (.setStreamWriteSizeInBytes stream-write-size-in-bytes))))

(defn resize
  "Resizes the file to the specified size.

  size - A long which represents the size of the file, in bytes. - `long`
  access-condition - An AccessCondition object which represents the access conditions for the file. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object which represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudFile this ^Long size ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.resize size access-condition options op-context)))
  ([^CloudFile this ^Long size]
    (-> this (.resize size))))

(defn download-to-file
  "Downloads a file.

  path - A String which represents the path to the file that will be created. - `java.lang.String`
  access-condition - An AccessCondition object that represents the access conditions for the file. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudFile this ^java.lang.String path ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadToFile path access-condition options op-context)))
  ([^CloudFile this ^java.lang.String path]
    (-> this (.downloadToFile path))))

(defn download-range
  "Downloads the contents of a file to a stream using the specified request options and operation context.

  offset - A long which represents the offset to use as the starting point for the source. - `long`
  length - A Long which represents the number of bytes to read or null. - `java.lang.Long`
  out-stream - An OutputStream object that represents the target stream. - `java.io.OutputStream`
  access-condition - An AccessCondition object that represents the access conditions for the file. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudFile this ^Long offset ^java.lang.Long length ^java.io.OutputStream out-stream ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.downloadRange offset length out-stream access-condition options op-context)))
  ([^CloudFile this ^Long offset ^java.lang.Long length ^java.io.OutputStream out-stream]
    (-> this (.downloadRange offset length out-stream))))

(defn upload-properties
  "Updates the file's properties using the access condition, request options, and operation context.

   Use downloadAttributes() to retrieve the latest values for the file's properties and metadata
   from the Microsoft Azure storage service.

  access-condition - An AccessCondition object that represents the access conditions for the file. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudFile this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.uploadProperties access-condition options op-context)))
  ([^CloudFile this]
    (-> this (.uploadProperties))))

(defn start-copy
  "Requests the service to start copying a file's contents, properties, and metadata to a new file,
   using the specified access conditions, lease ID, request options, and operation context.

  source-blob - A CloudBlob object that represents the source blob to copy. - `com.microsoft.azure.storage.blob.CloudBlob`
  source-access-condition - An AccessCondition object that represents the access conditions for the source blob. - `com.microsoft.azure.storage.AccessCondition`
  destination-access-condition - An AccessCondition object that represents the access conditions for the destination file. - `com.microsoft.azure.storage.AccessCondition`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client (CloudBlobClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A String which represents the copy ID associated with the copy operation. - `java.lang.String`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.lang.String [^CloudFile this ^com.microsoft.azure.storage.blob.CloudBlob source-blob ^com.microsoft.azure.storage.AccessCondition source-access-condition ^com.microsoft.azure.storage.AccessCondition destination-access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.startCopy source-blob source-access-condition destination-access-condition options op-context)))
  (^java.lang.String [^CloudFile this ^com.microsoft.azure.storage.blob.CloudBlob source-blob]
    (-> this (.startCopy source-blob))))

(defn open-read
  "Opens a file input stream to download the file using the specified request options and
   operation context.

   Use setStreamMinimumReadSizeInBytes(int) to configure the read size.

  access-condition - An AccessCondition object that represents the access conditions for the file. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: An InputStream object that represents the stream to use for reading from the file. - `com.microsoft.azure.storage.file.FileInputStream`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.file.FileInputStream [^CloudFile this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.openRead access-condition options op-context)))
  (^com.microsoft.azure.storage.file.FileInputStream [^CloudFile this]
    (-> this (.openRead))))

(defn set-stream-minimum-read-size-in-bytes
  "Sets the minimum read size when using a FileInputStream.

  minimum-read-size - An int that represents the minimum number of bytes to buffer when reading from a file while using a FileInputStream object. Must be greater than or equal to 16 KB. - `int`

  throws: java.lang.IllegalArgumentException - If minimumReadSize is less than 16 KB."
  ([^CloudFile this ^Integer minimum-read-size]
    (-> this (.setStreamMinimumReadSizeInBytes minimum-read-size))))

(defn open-write-existing
  "Opens an output stream object to write data to the file, using specified request options and
   operation context. The file must already exist and any existing data may be overwritten.

  access-condition - An AccessCondition object which represents the access conditions for the file. - `com.microsoft.azure.storage.AccessCondition`
  options - A FileRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudFileClient). - `com.microsoft.azure.storage.file.FileRequestOptions`
  op-context - An OperationContext object which represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A FileOutputStream object used to write data to the file. - `com.microsoft.azure.storage.file.FileOutputStream`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.file.FileOutputStream [^CloudFile this ^com.microsoft.azure.storage.AccessCondition access-condition ^com.microsoft.azure.storage.file.FileRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.openWriteExisting access-condition options op-context)))
  (^com.microsoft.azure.storage.file.FileOutputStream [^CloudFile this]
    (-> this (.openWriteExisting))))

(defn set-metadata
  "Sets the metadata for the file.

  metadata - A java.util.HashMap object that contains the metadata being assigned to the file. - `java.util.HashMap`"
  ([^CloudFile this ^java.util.HashMap metadata]
    (-> this (.setMetadata metadata))))

