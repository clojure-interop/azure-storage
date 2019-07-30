(ns com.microsoft.azure.storage.RetryInfo
  "Represents the context for a retry of a request made against the storage services."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage RetryInfo]))

(defn ->retry-info
  "Constructor.

  Initializes a new instance of the RetryInfo class.

  retry-context - The RetryContext object that was passed in to the retry policy. - `com.microsoft.azure.storage.RetryContext`"
  (^RetryInfo [^com.microsoft.azure.storage.RetryContext retry-context]
    (new RetryInfo retry-context))
  (^RetryInfo []
    (new RetryInfo )))

(defn get-retry-interval
  "Gets the interval in milliseconds until the next retry. The minimum back-off interval is 3 seconds.

  returns: An int which represents the retry interval (in milliseconds). - `int`"
  (^Integer [^RetryInfo this]
    (-> this (.getRetryInterval))))

(defn get-target-location
  "Gets the location that the next retry should target.

  returns: A StorageLocation object which represents the location for the next retry. - `com.microsoft.azure.storage.StorageLocation`"
  (^com.microsoft.azure.storage.StorageLocation [^RetryInfo this]
    (-> this (.getTargetLocation))))

(defn get-updated-location-mode
  "Gets the location mode for subsequent retries.

  returns: A LocationMode object which represents the location mode for subsequent retries. - `com.microsoft.azure.storage.LocationMode`"
  (^com.microsoft.azure.storage.LocationMode [^RetryInfo this]
    (-> this (.getUpdatedLocationMode))))

(defn set-retry-interval
  "Sets the interval in milliseconds until the next retry. The minimum back-off interval is 3 seconds.

  retry-interval - An int which represents the retry interval to set. - `int`"
  ([^RetryInfo this ^Integer retry-interval]
    (-> this (.setRetryInterval retry-interval))))

(defn set-target-location
  "Sets the location that the next retry should target.

  target-location - A StorageLocation object which represents the location to set. - `com.microsoft.azure.storage.StorageLocation`"
  ([^RetryInfo this ^com.microsoft.azure.storage.StorageLocation target-location]
    (-> this (.setTargetLocation target-location))))

(defn set-updated-location-mode
  "Sets the location mode for subsequent retries.

  updated-location-mode - A LocationMode object which represents the the location mode to set. - `com.microsoft.azure.storage.LocationMode`"
  ([^RetryInfo this ^com.microsoft.azure.storage.LocationMode updated-location-mode]
    (-> this (.setUpdatedLocationMode updated-location-mode))))

(defn to-string
  "Returns a string that represents the current RetryInfo instance.

  returns: A String which represents the current RetryInfo instance. - `java.lang.String`"
  (^java.lang.String [^RetryInfo this]
    (-> this (.toString))))

