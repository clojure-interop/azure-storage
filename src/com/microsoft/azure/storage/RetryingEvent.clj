(ns com.microsoft.azure.storage.RetryingEvent
  "Represents an event that is fired when a request is retried."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage RetryingEvent]))

(defn ->retrying-event
  "Constructor.

  Creates an instance of the BaseEvent class which is fired when a request is retried.

  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`
  connection-object - Represents a connection object. Currently only java.net.HttpURLConnection is supported as a connection object. - `java.lang.Object`
  request-result - A RequestResult object that represents the current request result. - `com.microsoft.azure.storage.RequestResult`
  retry-context - A RetryContext object which contains the number of retries done for this request (including the pending retry) and other retry information. - `com.microsoft.azure.storage.RetryContext`"
  (^RetryingEvent [^com.microsoft.azure.storage.OperationContext op-context ^java.lang.Object connection-object ^com.microsoft.azure.storage.RequestResult request-result ^com.microsoft.azure.storage.RetryContext retry-context]
    (new RetryingEvent op-context connection-object request-result retry-context)))

(defn get-retry-context
  "Gets the context for a retry of a request made against the storage services. Includes current retry count,
   location mode, and next location.

  returns: the retryCount - `com.microsoft.azure.storage.RetryContext`"
  (^com.microsoft.azure.storage.RetryContext [^RetryingEvent this]
    (-> this (.getRetryContext))))

