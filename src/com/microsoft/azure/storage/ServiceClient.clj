(ns com.microsoft.azure.storage.ServiceClient
  "Provides a client for accessing the Microsoft Azure Storage service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage ServiceClient]))

(defn get-credentials
  "Returns the storage credentials associated with this service client.

  returns: A StorageCredentials object which represents the storage credentials associated with this client. - `com.microsoft.azure.storage.StorageCredentials`"
  (^com.microsoft.azure.storage.StorageCredentials [^ServiceClient this]
    (-> this (.getCredentials))))

(defn get-endpoint
  "Returns the base URI for this service client.

  returns: A java.net.URI object which represents the base URI for the service client. - `java.net.URI`"
  (^java.net.URI [^ServiceClient this]
    (-> this (.getEndpoint))))

(defn get-storage-uri
  "Returns the list of URIs for all locations.

  returns: A StorageUri object which represents the list of URIs for all locations. - `com.microsoft.azure.storage.StorageUri`"
  (^com.microsoft.azure.storage.StorageUri [^ServiceClient this]
    (-> this (.getStorageUri))))

(defn get-default-request-options
  "Gets the RequestOptions that is used for requests associated with this ServiceClient

  returns: The RequestOptions object containing the values used by this ServiceClient - `com.microsoft.azure.storage.RequestOptions`"
  (^com.microsoft.azure.storage.RequestOptions [^ServiceClient this]
    (-> this (.getDefaultRequestOptions))))

