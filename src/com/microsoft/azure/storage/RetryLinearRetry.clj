(ns com.microsoft.azure.storage.RetryLinearRetry
  "Represents a retry policy that performs a specified number of retries, using a specified fixed time interval between
  retries.

  This class extends the RetryPolicy class and implements the RetryPolicyFactory interface."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage RetryLinearRetry]))

(defn ->retry-linear-retry
  "Constructor.

  Creates an instance of the RetryLinearRetry class using the specified delta backoff and maximum
   retry attempts.

  delta-backoff - The backoff interval, in milliseconds, between retries. - `int`
  max-attempts - The maximum number of retry attempts. - `int`"
  (^RetryLinearRetry [^Integer delta-backoff ^Integer max-attempts]
    (new RetryLinearRetry delta-backoff max-attempts))
  (^RetryLinearRetry []
    (new RetryLinearRetry )))

(defn create-instance
  "Generates a new retry policy for the current request attempt.

  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A RetryPolicy object that represents the retry policy for the current request attempt. - `com.microsoft.azure.storage.RetryPolicy`"
  (^com.microsoft.azure.storage.RetryPolicy [^RetryLinearRetry this ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.createInstance op-context))))

(defn evaluate
  "Determines whether the operation should be retried and specifies the interval until the next retry.

  retry-context - A RetryContext object that indicates the number of retries, last request's results, whether the next retry should happen in the primary or secondary location, and specifies the location mode. - `com.microsoft.azure.storage.RetryContext`
  operation-context - An OperationContext object for tracking the current operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A RetryInfo object that indicates whether the next retry will happen in the primary or secondary
           location, and specifies the location mode. If null, the operation will not be retried. - `com.microsoft.azure.storage.RetryInfo`"
  (^com.microsoft.azure.storage.RetryInfo [^RetryLinearRetry this ^com.microsoft.azure.storage.RetryContext retry-context ^com.microsoft.azure.storage.OperationContext operation-context]
    (-> this (.evaluate retry-context operation-context))))

