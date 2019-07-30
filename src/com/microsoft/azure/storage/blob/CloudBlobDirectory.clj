(ns com.microsoft.azure.storage.blob.CloudBlobDirectory
  "Represents a virtual directory of blobs, designated by a delimiter character.

  Containers, which are encapsulated as CloudBlobContainer objects, hold directories, and directories hold
  block blobs and page blobs. Directories can also contain sub-directories."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob CloudBlobDirectory]))

(defn list-blobs
  "Returns an enumerable collection of blob items whose names begin with the specified prefix, using the specified
   flat or hierarchical option, listing details options, request options, and operation context.

  prefix - A String that represents the prefix of the blob name. - `java.lang.String`
  use-flat-blob-listing - true to indicate that the returned list will be flat; false to indicate that the returned list will be hierarchical. - `boolean`
  listing-details - A java.util.EnumSet object that contains BlobListingDetails values that indicate whether snapshots, metadata, and/or uncommitted blocks are returned. Committed blocks are always returned. - `java.util.EnumSet`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: An enumerable collection of ListBlobItem objects that represent the block items whose names begin
           with the specified prefix in this directory. - `java.lang.Iterable<com.microsoft.azure.storage.blob.ListBlobItem>`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.lang.Iterable [^CloudBlobDirectory this ^java.lang.String prefix ^Boolean use-flat-blob-listing ^java.util.EnumSet listing-details ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.listBlobs prefix use-flat-blob-listing listing-details options op-context)))
  (^java.lang.Iterable [^CloudBlobDirectory this ^java.lang.String prefix]
    (-> this (.listBlobs prefix)))
  (^java.lang.Iterable [^CloudBlobDirectory this]
    (-> this (.listBlobs))))

(defn get-page-blob-reference
  "Returns a reference to a CloudPageBlob object that represents a page blob in the directory, using the
   specified snapshot ID.

  blob-name - A String that represents the name of the blob. - `java.lang.String`
  snapshot-id - A String that represents the snapshot ID of the blob. - `java.lang.String`

  returns: A CloudPageBlob object that represents a reference to the specified page blob. - `com.microsoft.azure.storage.blob.CloudPageBlob`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.blob.CloudPageBlob [^CloudBlobDirectory this ^java.lang.String blob-name ^java.lang.String snapshot-id]
    (-> this (.getPageBlobReference blob-name snapshot-id)))
  (^com.microsoft.azure.storage.blob.CloudPageBlob [^CloudBlobDirectory this ^java.lang.String blob-name]
    (-> this (.getPageBlobReference blob-name))))

(defn list-blobs-segmented
  "Returns a result segment containing a collection of blob items whose names begin with the specified prefix, using
   the specified flat or hierarchical option, listing details options, request options, and operation context.

  prefix - A String that represents the prefix of the blob name. - `java.lang.String`
  use-flat-blob-listing - true to indicate that the returned list will be flat; false to indicate that the returned list will be hierarchical. - `boolean`
  listing-details - A java.util.EnumSet object that contains BlobListingDetails values that indicate whether snapshots, metadata, and/or uncommitted blocks are returned. Committed blocks are always returned. - `java.util.EnumSet`
  max-results - The maximum number of results to retrieve. - `java.lang.Integer`
  continuation-token - A ResultContinuation object that represents a continuation token returned by a previous listing operation. - `com.microsoft.azure.storage.ResultContinuation`
  options - A BlobRequestOptions object that specifies any additional options for the request. Specifying null will use the default request options from the associated service client ( CloudBlobClient). - `com.microsoft.azure.storage.blob.BlobRequestOptions`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A ResultSegment object that contains a segment of the enumerable collection of
           ListBlobItem objects that represent the block items whose names begin with the specified prefix
           in the directory. - `com.microsoft.azure.storage.ResultSegment<com.microsoft.azure.storage.blob.ListBlobItem>`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.ResultSegment [^CloudBlobDirectory this ^java.lang.String prefix ^Boolean use-flat-blob-listing ^java.util.EnumSet listing-details ^java.lang.Integer max-results ^com.microsoft.azure.storage.ResultContinuation continuation-token ^com.microsoft.azure.storage.blob.BlobRequestOptions options ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.listBlobsSegmented prefix use-flat-blob-listing listing-details max-results continuation-token options op-context)))
  (^com.microsoft.azure.storage.ResultSegment [^CloudBlobDirectory this ^java.lang.String prefix]
    (-> this (.listBlobsSegmented prefix)))
  (^com.microsoft.azure.storage.ResultSegment [^CloudBlobDirectory this]
    (-> this (.listBlobsSegmented))))

(defn get-storage-uri
  "Returns the list of URIs for all locations.

  returns: A StorageUri that represents the list of URIs for all locations.. - `com.microsoft.azure.storage.StorageUri`"
  (^com.microsoft.azure.storage.StorageUri [^CloudBlobDirectory this]
    (-> this (.getStorageUri))))

(defn get-service-client
  "Returns the Blob service client associated with this directory.

  returns: An CloudBlobClient object that represents the service client associated with the directory. - `com.microsoft.azure.storage.blob.CloudBlobClient`"
  (^com.microsoft.azure.storage.blob.CloudBlobClient [^CloudBlobDirectory this]
    (-> this (.getServiceClient))))

(defn get-uri
  "Returns the URI for this directory.

  returns: A java.net.URI object that represents the URI for this directory. - `java.net.URI`"
  (^java.net.URI [^CloudBlobDirectory this]
    (-> this (.getUri))))

(defn get-block-blob-reference
  "Returns a reference to a CloudBlockBlob object that represents a block blob in this directory, using the
   specified snapshot ID.

  blob-name - A String that represents the name of the blob. - `java.lang.String`
  snapshot-id - A String that represents the snapshot ID of the blob. - `java.lang.String`

  returns: A CloudBlockBlob object that represents a reference to the specified block blob. - `com.microsoft.azure.storage.blob.CloudBlockBlob`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.blob.CloudBlockBlob [^CloudBlobDirectory this ^java.lang.String blob-name ^java.lang.String snapshot-id]
    (-> this (.getBlockBlobReference blob-name snapshot-id)))
  (^com.microsoft.azure.storage.blob.CloudBlockBlob [^CloudBlobDirectory this ^java.lang.String blob-name]
    (-> this (.getBlockBlobReference blob-name))))

(defn get-parent
  "Returns the parent directory of this directory.

  returns: A CloudBlobDirectory object that represents the parent of this directory. - `com.microsoft.azure.storage.blob.CloudBlobDirectory`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.blob.CloudBlobDirectory [^CloudBlobDirectory this]
    (-> this (.getParent))))

(defn get-container
  "Returns the container for this directory.

  returns: A CloudBlobContainer that represents the container for this directory. - `com.microsoft.azure.storage.blob.CloudBlobContainer`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.blob.CloudBlobContainer [^CloudBlobDirectory this]
    (-> this (.getContainer))))

(defn get-directory-reference
  "Returns a reference to a virtual blob directory beneath this directory.

  directory-name - A String that represents the name of the virtual subdirectory. - `java.lang.String`

  returns: A CloudBlobDirectory object that represents a virtual blob directory beneath this directory. - `com.microsoft.azure.storage.blob.CloudBlobDirectory`

  throws: java.net.URISyntaxException - If the resource URI is invalid."
  (^com.microsoft.azure.storage.blob.CloudBlobDirectory [^CloudBlobDirectory this ^java.lang.String directory-name]
    (-> this (.getDirectoryReference directory-name))))

(defn get-append-blob-reference
  "Returns a reference to a CloudAppendBlob object that represents an append blob in the directory, using the
   specified snapshot ID.

  blob-name - A String that represents the name of the blob. - `java.lang.String`
  snapshot-id - A String that represents the snapshot ID of the blob. - `java.lang.String`

  returns: A CloudAppendBlob object that represents a reference to the specified append blob. - `com.microsoft.azure.storage.blob.CloudAppendBlob`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.blob.CloudAppendBlob [^CloudBlobDirectory this ^java.lang.String blob-name ^java.lang.String snapshot-id]
    (-> this (.getAppendBlobReference blob-name snapshot-id)))
  (^com.microsoft.azure.storage.blob.CloudAppendBlob [^CloudBlobDirectory this ^java.lang.String blob-name]
    (-> this (.getAppendBlobReference blob-name))))

(defn get-prefix
  "Returns the prefix for this directory.

  returns: A String that represents the prefix for this directory. - `java.lang.String`"
  (^java.lang.String [^CloudBlobDirectory this]
    (-> this (.getPrefix))))

