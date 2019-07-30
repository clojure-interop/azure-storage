(ns com.microsoft.azure.storage.blob.ListBlobItem
  "Represents an item that may be returned by a blob listing operation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob ListBlobItem]))

(defn get-container
  "Returns the container for the blob item.

  returns: A CloudBlobContainer object which represents the blob item's container. - `com.microsoft.azure.storage.blob.CloudBlobContainer`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.blob.CloudBlobContainer [^ListBlobItem this]
    (-> this (.getContainer))))

(defn get-parent
  "Returns the parent for the blob item.

  returns: A CloudBlobDirectory object which represents the blob item's parent. - `com.microsoft.azure.storage.blob.CloudBlobDirectory`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.blob.CloudBlobDirectory [^ListBlobItem this]
    (-> this (.getParent))))

(defn get-uri
  "Returns the URI for the blob item.

  returns: A java.net.URI object which represents the blob item's URI. - `java.net.URI`"
  (^java.net.URI [^ListBlobItem this]
    (-> this (.getUri))))

(defn get-storage-uri
  "Returns the list of URIs for all storage locations of the blob item.

  returns: A StorageUri object which represents the blob item's URI. - `com.microsoft.azure.storage.StorageUri`"
  (^com.microsoft.azure.storage.StorageUri [^ListBlobItem this]
    (-> this (.getStorageUri))))

