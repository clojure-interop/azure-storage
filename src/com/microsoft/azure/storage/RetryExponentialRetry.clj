(ns com.microsoft.azure.storage.RetryExponentialRetry
  "Represents a retry policy that performs a specified number of retries, using a randomized exponential backoff scheme
  to determine the interval between retries.

  This class extends the RetryPolicy class and implements the
  RetryPolicyFactory interface."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage RetryExponentialRetry]))

(defn ->retry-exponential-retry
  "Constructor.

  Creates an instance of the RetryExponentialRetry class using the specified minimum, maximum, and
   delta backoff amounts, and maximum number of retry attempts.

  min-backoff - The minimum backoff interval, in milliseconds, between retries. - `int`
  delta-backoff - The backoff interval, in milliseconds, between retries. - `int`
  max-back-off - The maximum backoff interval, in milliseconds, between retries. - `int`
  max-attempts - The maximum retry attempts, in milliseconds, between retries. - `int`"
  (^RetryExponentialRetry [^Integer min-backoff ^Integer delta-backoff ^Integer max-back-off ^Integer max-attempts]
    (new RetryExponentialRetry min-backoff delta-backoff max-back-off max-attempts))
  (^RetryExponentialRetry [^Integer delta-backoff ^Integer max-attempts]
    (new RetryExponentialRetry delta-backoff max-attempts))
  (^RetryExponentialRetry []
    (new RetryExponentialRetry )))

(defn create-instance
  "Generates a new retry policy for the current request attempt.

  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A RetryPolicy object that represents the retry policy for the current request attempt. - `com.microsoft.azure.storage.RetryPolicy`"
  (^com.microsoft.azure.storage.RetryPolicy [^RetryExponentialRetry this ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.createInstance op-context))))

(defn evaluate
  "Determines whether the operation should be retried and specifies the interval until the next retry.

  retry-context - A RetryContext object that indicates the number of retries, last request's results, whether the next retry should happen in the primary or secondary location, and specifies the location mode. - `com.microsoft.azure.storage.RetryContext`
  operation-context - An OperationContext object for tracking the current operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A RetryInfo object that indicates whether the next retry will happen in the primary or secondary
           location, and specifies the location mode. If null, the operation will not be retried. - `com.microsoft.azure.storage.RetryInfo`"
  (^com.microsoft.azure.storage.RetryInfo [^RetryExponentialRetry this ^com.microsoft.azure.storage.RetryContext retry-context ^com.microsoft.azure.storage.OperationContext operation-context]
    (-> this (.evaluate retry-context operation-context))))

