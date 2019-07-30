(ns com.microsoft.azure.storage.RetryPolicy
  "Abstract class that represents a retry policy."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage RetryPolicy]))

(defn ->retry-policy
  "Constructor.

  Creates an instance of the RetryPolicy class using the specified delta backoff and maximum retry
   attempts.

  delta-backoff - The backoff interval, in milliseconds, between retries. - `int`
  max-attempts - The maximum number of retry attempts. - `int`"
  (^RetryPolicy [^Integer delta-backoff ^Integer max-attempts]
    (new RetryPolicy delta-backoff max-attempts))
  (^RetryPolicy []
    (new RetryPolicy )))

(def *-default-client-backoff
  "Static Constant.

  Represents the default client backoff interval, in milliseconds.

  type: int"
  RetryPolicy/DEFAULT_CLIENT_BACKOFF)

(def *-default-client-retry-count
  "Static Constant.

  Represents the default client retry count.

  type: int"
  RetryPolicy/DEFAULT_CLIENT_RETRY_COUNT)

(def *-default-max-backoff
  "Static Constant.

  Represents the default maximum backoff interval, in milliseconds.

  type: int"
  RetryPolicy/DEFAULT_MAX_BACKOFF)

(def *-default-min-backoff
  "Static Constant.

  Represents the default minimum backoff interval, in milliseconds.

  type: int"
  RetryPolicy/DEFAULT_MIN_BACKOFF)

(defn evaluate
  "Determines whether the operation should be retried and specifies the interval until the next retry.

  retry-context - A RetryContext object that indicates the number of retries, last request's results, whether the next retry should happen in the primary or secondary location, and specifies the location mode. - `com.microsoft.azure.storage.RetryContext`
  operation-context - An OperationContext object for tracking the current operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A RetryInfo object that indicates whether the next retry will happen in the primary or secondary
           location, and specifies the location mode. If null, the operation will not be retried. - `com.microsoft.azure.storage.RetryInfo`"
  (^com.microsoft.azure.storage.RetryInfo [^RetryPolicy this ^com.microsoft.azure.storage.RetryContext retry-context ^com.microsoft.azure.storage.OperationContext operation-context]
    (-> this (.evaluate retry-context operation-context))))

