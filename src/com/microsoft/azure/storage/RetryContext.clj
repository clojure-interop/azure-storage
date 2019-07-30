(ns com.microsoft.azure.storage.RetryContext
  "Represents the context for a retry of a request made against the storage services."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage RetryContext]))

(defn ->retry-context
  "Constructor.

  Creates an instance of the RequestResult class.

  current-retry-count - An int which represents the number of retries for the given operation. - `int`
  last-request-result - A RequestResult object which represents the last request's results. - `com.microsoft.azure.storage.RequestResult`
  next-location - A StorageLocation object which represents the location mode for subsequent retries. - `com.microsoft.azure.storage.StorageLocation`
  location-mode - A LocationMode value which represents the location mode for subsequent retries. - `com.microsoft.azure.storage.LocationMode`"
  (^RetryContext [^Integer current-retry-count ^com.microsoft.azure.storage.RequestResult last-request-result ^com.microsoft.azure.storage.StorageLocation next-location ^com.microsoft.azure.storage.LocationMode location-mode]
    (new RetryContext current-retry-count last-request-result next-location location-mode)))

(defn get-current-retry-count
  "Gets the number of retries for the given operation.

  returns: An int which represents the number of retries for the given operation. - `int`"
  (^Integer [^RetryContext this]
    (-> this (.getCurrentRetryCount))))

(defn get-last-request-result
  "Gets the last request's results.

  returns: A RequestResult object which represents the last request's results. - `com.microsoft.azure.storage.RequestResult`"
  (^com.microsoft.azure.storage.RequestResult [^RetryContext this]
    (-> this (.getLastRequestResult))))

(defn get-location-mode
  "Gets the location mode for subsequent retries.

  returns: A LocationMode value which represents the location mode for subsequent retries. - `com.microsoft.azure.storage.LocationMode`"
  (^com.microsoft.azure.storage.LocationMode [^RetryContext this]
    (-> this (.getLocationMode))))

(defn get-next-location
  "Gets the location that the next retry should target.

  returns: A StorageLocation object which represents the location for subsequent retries. - `com.microsoft.azure.storage.StorageLocation`"
  (^com.microsoft.azure.storage.StorageLocation [^RetryContext this]
    (-> this (.getNextLocation))))

(defn to-string
  "Returns a string that represents the current RetryContext instance.

  returns: An String which represents the current RetryContext instance. - `java.lang.String`"
  (^java.lang.String [^RetryContext this]
    (-> this (.toString))))

