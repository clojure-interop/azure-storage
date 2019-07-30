(ns com.microsoft.azure.storage.ResponseReceivedEvent
  "Represents an event that is fired when a response is received."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage ResponseReceivedEvent]))

(defn ->response-received-event
  "Constructor.

  Creates an instance of the BaseEvent class that is fired when a response is received.

  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`
  connection-object - Represents a connection object. Currently only java.net.HttpURLConnection is supported as a connection object. - `java.lang.Object`
  request-result - A RequestResult object that represents the current request result. - `com.microsoft.azure.storage.RequestResult`"
  (^ResponseReceivedEvent [^com.microsoft.azure.storage.OperationContext op-context ^java.lang.Object connection-object ^com.microsoft.azure.storage.RequestResult request-result]
    (new ResponseReceivedEvent op-context connection-object request-result)))

