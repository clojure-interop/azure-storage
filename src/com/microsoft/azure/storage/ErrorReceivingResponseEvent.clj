(ns com.microsoft.azure.storage.ErrorReceivingResponseEvent
  "Represents an event that is fired when a network error occurs before the HTTP response status and headers are received."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage ErrorReceivingResponseEvent]))

(defn ->error-receiving-response-event
  "Constructor.

  Creates an instance of the BaseEvent class that is fired when a network error occurs before the HTTP response status and headers are received.

  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`
  connection-object - Represents a connection object. Currently only java.net.HttpURLConnection is supported as a connection object. - `java.lang.Object`
  request-result - A RequestResult object that represents the current request result. - `com.microsoft.azure.storage.RequestResult`"
  (^ErrorReceivingResponseEvent [^com.microsoft.azure.storage.OperationContext op-context ^java.lang.Object connection-object ^com.microsoft.azure.storage.RequestResult request-result]
    (new ErrorReceivingResponseEvent op-context connection-object request-result)))

