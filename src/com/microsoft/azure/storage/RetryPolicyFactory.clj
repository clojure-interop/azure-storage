(ns com.microsoft.azure.storage.RetryPolicyFactory
  "Represents a retry policy factory that creates a new RetryPolicy object per transaction."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage RetryPolicyFactory]))

(defn create-instance
  "Creates a new RetryPolicy object for the current request attempt.

  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A RetryPolicy object that represents the new retry policy for the current request attempt. - `com.microsoft.azure.storage.RetryPolicy`"
  (^com.microsoft.azure.storage.RetryPolicy [^RetryPolicyFactory this ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.createInstance op-context))))

