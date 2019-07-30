(ns com.microsoft.azure.storage.RequestOptions
  "Represents the options to use while processing a given request."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage RequestOptions]))

(defn ->request-options
  "Constructor.

  Creates an instance of the RequestOptions class by copying values from another
   RequestOptions instance.

  other - A RequestOptions object that represents the request options to copy. - `com.microsoft.azure.storage.RequestOptions`"
  (^RequestOptions [^com.microsoft.azure.storage.RequestOptions other]
    (new RequestOptions other))
  (^RequestOptions []
    (new RequestOptions )))

(defn set-timeout-interval-in-ms
  "Sets the timeout to use when making this request.

   The server timeout interval begins at the time that the complete request has been received by the service, and
   the server begins processing the response. If the timeout interval elapses before the response is returned to the
   client, the operation times out. The timeout interval resets with each retry, if the request is retried.

   The default server timeout is set in the client and is by default null, indicating no server timeout. You can
   change the server timeout on this request by setting this property. You can also change the value on the
   ServiceClient.getDefaultRequestOptions() object so that all subsequent requests made via the service
   client will use that server timeout.

  timeout-interval-in-ms - The timeout, in milliseconds, to use for this request. - `java.lang.Integer`"
  ([^RequestOptions this ^java.lang.Integer timeout-interval-in-ms]
    (-> this (.setTimeoutIntervalInMs timeout-interval-in-ms))))

(defn set-require-encryption
  "Sets a value to indicate whether all data written and read must be encrypted. Use true to
   encrypt/decrypt data for transactions; otherwise, false.

   The default is set in the client and is by default false, indicating encryption is not required. You can change
   the value on this request by setting this property. You can also change the value on the
   ServiceClient.getDefaultRequestOptions() object so that all subsequent requests made via the service
   client will use the appropriate value.

  require-encryption - A value to indicate whether all data written and read must be encrypted. - `java.lang.Boolean`"
  ([^RequestOptions this ^java.lang.Boolean require-encryption]
    (-> this (.setRequireEncryption require-encryption))))

(defn get-location-mode
  "Gets the default location mode for this request. For more information about location mode, see
   setLocationMode(LocationMode).

  returns: A LocationMode object that represents the location mode for this request. - `com.microsoft.azure.storage.LocationMode`"
  (^com.microsoft.azure.storage.LocationMode [^RequestOptions this]
    (-> this (.getLocationMode))))

(defn get-maximum-execution-time-in-ms
  "Gets the maximum execution time for this request. For more information about maximum execution time defaults, see
   setMaximumExecutionTimeInMs(Integer).

  returns: The current maximum execution time, in milliseconds, for this request. - `java.lang.Integer`"
  (^java.lang.Integer [^RequestOptions this]
    (-> this (.getMaximumExecutionTimeInMs))))

(defn require-encryption
  "Gets a value to indicate whether all data written and read must be encrypted. Use true to
   encrypt/decrypt data for transactions; otherwise, false. For more
   information about require encryption defaults, see setRequireEncryption(Boolean).

  returns: A value to indicate whether all data written and read must be encrypted. - `java.lang.Boolean`"
  (^java.lang.Boolean [^RequestOptions this]
    (-> this (.requireEncryption))))

(defn set-retry-policy-factory
  "Sets the RetryPolicyFactory object to use for this request.

   The default RetryPolicyFactory is set in the client and is by default RetryExponentialRetry. You can
   change the RetryPolicyFactory on this request by setting this property. You can also change the value on the
   ServiceClient.getDefaultRequestOptions() object so that all subsequent requests made via the service
   client will use that RetryPolicyFactory.

  retry-policy-factory - the RetryPolicyFactory object to use when making service requests. - `com.microsoft.azure.storage.RetryPolicyFactory`"
  ([^RequestOptions this ^com.microsoft.azure.storage.RetryPolicyFactory retry-policy-factory]
    (-> this (.setRetryPolicyFactory retry-policy-factory))))

(defn set-maximum-execution-time-in-ms
  "Sets the maximum execution time to use when making this request.

   The maximum execution time interval begins at the time that the client begins building the request. The maximum
   execution time is checked intermittently while uploading data, downloading data, and before executing retries.
   The service will continue to upload, download, and retry until the maximum execution time is reached. At that
   time, any partial uploads or downloads will be cancelled and an exception will be thrown.

   The default maximum execution is set in the client and is by default null, indicating no maximum time. You can
   change the maximum execution time on this request by setting this property. You can also change the value on the
   ServiceClient.getDefaultRequestOptions() object so that all subsequent requests made via the service
   client will use the maximum execution time.

  maximum-execution-time-in-ms - The maximum execution time, in milliseconds, to use for this request. - `java.lang.Integer`"
  ([^RequestOptions this ^java.lang.Integer maximum-execution-time-in-ms]
    (-> this (.setMaximumExecutionTimeInMs maximum-execution-time-in-ms))))

(defn get-retry-policy-factory
  "Gets the retry policy to use for this request. For more information about the retry policy defaults, see
   setRetryPolicyFactory(RetryPolicyFactory).

  returns: An RetryPolicyFactory object that represents the current retry policy. - `com.microsoft.azure.storage.RetryPolicyFactory`"
  (^com.microsoft.azure.storage.RetryPolicyFactory [^RequestOptions this]
    (-> this (.getRetryPolicyFactory))))

(defn set-location-mode
  "Sets the LocationMode for this request.

   The default LocationMode is set in the client and is by default LocationMode.PRIMARY_ONLY. You
   can change the LocationMode on this request by setting this property. You can also change the value on
   the ServiceClient.getDefaultRequestOptions() object so that all subsequent requests made via the service
   client will use that LocationMode.

  location-mode - the locationMode to set - `com.microsoft.azure.storage.LocationMode`"
  ([^RequestOptions this ^com.microsoft.azure.storage.LocationMode location-mode]
    (-> this (.setLocationMode location-mode))))

(defn get-timeout-interval-in-ms
  "Returns the timeout value for this request. For more information about the timeout defaults, see
   setTimeoutIntervalInMs(Integer).

  returns: The current timeout value, in milliseconds, for this request. - `java.lang.Integer`"
  (^java.lang.Integer [^RequestOptions this]
    (-> this (.getTimeoutIntervalInMs))))

(defn get-operation-expiry-time-in-ms
  "RESERVED FOR INTERNAL USE.

   Returns the time at which this operation expires. This is computed by adding the time the operation begins and
   the maximum execution time and will be null if maximum execution time is null. For more information about maximum
   execution time, see setMaximumExecutionTimeInMs(Integer).

  returns: The current operation expiry time, in milliseconds, for this request. - `java.lang.Long`"
  (^java.lang.Long [^RequestOptions this]
    (-> this (.getOperationExpiryTimeInMs))))

