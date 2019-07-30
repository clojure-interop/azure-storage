(ns com.microsoft.azure.storage.file.ListFileItem
  "Represents an item that may be returned by a file listing operation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.file ListFileItem]))

(defn get-share
  "Returns the share for the file item.

  returns: A CloudFileShare object which represents the file item's share. - `com.microsoft.azure.storage.file.CloudFileShare`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.file.CloudFileShare [^ListFileItem this]
    (-> this (.getShare))))

(defn get-parent
  "Returns the parent for the file item.

  returns: A CloudFileDirectory object which represents the file item's parent. - `com.microsoft.azure.storage.file.CloudFileDirectory`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^com.microsoft.azure.storage.file.CloudFileDirectory [^ListFileItem this]
    (-> this (.getParent))))

(defn get-uri
  "Returns the URI for the file item.

  returns: A java.net.URI object which represents the file item's URI. - `java.net.URI`"
  (^java.net.URI [^ListFileItem this]
    (-> this (.getUri))))

(defn get-storage-uri
  "Returns the list of URIs for all storage locations of the file item.

  returns: A StorageUri object which represents the file item's URI. - `com.microsoft.azure.storage.StorageUri`"
  (^com.microsoft.azure.storage.StorageUri [^ListFileItem this]
    (-> this (.getStorageUri))))

