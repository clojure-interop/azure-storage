(ns com.microsoft.azure.storage.StorageUri
  "Holds a list of URIs that represents the storage resource."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage StorageUri]))

(defn ->storage-uri
  "Constructor.

  Initializes a new instance of the StorageUri class using the specified primary and secondary URIs.

  primary-uri - A java.net.URI object for the primary URI. - `java.net.URI`
  secondary-uri - A java.net.URI object for the secondary URI. - `java.net.URI`"
  (^StorageUri [^java.net.URI primary-uri ^java.net.URI secondary-uri]
    (new StorageUri primary-uri secondary-uri))
  (^StorageUri [^java.net.URI primary-uri]
    (new StorageUri primary-uri)))

(defn validate-location-mode
  "Validate that a URI exists for the specified LocationMode.

  mode - The LocationMode to validate. - `com.microsoft.azure.storage.LocationMode`

  returns: true if a URI exists for the specified mode; otherwise false. - `boolean`"
  (^Boolean [^StorageUri this ^com.microsoft.azure.storage.LocationMode mode]
    (-> this (.validateLocationMode mode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StorageUri this]
    (-> this (.toString))))

(defn get-query
  "Returns the decoded query component of this StorageUri object.

  returns: A String which contains the decoded query component of the current StorageUri,
           or null if the query is undefined. - `java.lang.String`"
  (^java.lang.String [^StorageUri this]
    (-> this (.getQuery))))

(defn get-primary-uri
  "Gets the endpoint for the primary location for the storage account.

  returns: A java.net.URI object for the primary URI. - `java.net.URI`"
  (^java.net.URI [^StorageUri this]
    (-> this (.getPrimaryUri))))

(defn get-uri
  "Gets the URI for a specified StorageLocation.

  location - The StorageLocation object for which to retrieve a URI. - `com.microsoft.azure.storage.StorageLocation`

  returns: A java.net.URI object for the specified StorageLocation. - `java.net.URI`"
  (^java.net.URI [^StorageUri this ^com.microsoft.azure.storage.StorageLocation location]
    (-> this (.getUri location))))

(defn get-secondary-uri
  "Gets the endpoint for the secondary location for the storage account.

  returns: A java.net.URI object for the secondary URI. - `java.net.URI`"
  (^java.net.URI [^StorageUri this]
    (-> this (.getSecondaryUri))))

(defn hash-code
  "returns: `int`"
  (^Integer [^StorageUri this]
    (-> this (.hashCode))))

(defn equals
  "Indicates whether a StorageUri object is equal to the current StorageUri object.

  other - A reference to a StorageUri object to compare. - `com.microsoft.azure.storage.StorageUri`

  returns: true if this object is the same as the other argument; otherwise false. - `boolean`"
  (^Boolean [^StorageUri this ^com.microsoft.azure.storage.StorageUri other]
    (-> this (.equals other))))

(defn absolute?
  "Indicates whether this StorageUri is absolute.

  returns: true if the current StorageUri is absolute; otherwise false. - `boolean`"
  (^Boolean [^StorageUri this]
    (-> this (.isAbsolute))))

