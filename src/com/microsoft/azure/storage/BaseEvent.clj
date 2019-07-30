(ns com.microsoft.azure.storage.BaseEvent
  "Represents an event."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage BaseEvent]))

(defn ->base-event
  "Constructor.

  Creates an instance of the BaseEvent class.

  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`
  connection-object - Represents a connection object. Currently only java.net.HttpURLConnection is supported as a connection object. - `java.lang.Object`
  request-result - A RequestResult object that represents the current request result. - `com.microsoft.azure.storage.RequestResult`"
  (^BaseEvent [^com.microsoft.azure.storage.OperationContext op-context ^java.lang.Object connection-object ^com.microsoft.azure.storage.RequestResult request-result]
    (new BaseEvent op-context connection-object request-result)))

(defn get-connection-object
  "Gets a connection object. Currently only java.net.HttpURLConnection is supported as a
   connection object.

  returns: An Object for the connection. - `java.lang.Object`"
  (^java.lang.Object [^BaseEvent this]
    (-> this (.getConnectionObject))))

(defn get-op-context
  "Gets a context for the current operation. This object is used to track requests to the storage service, and
   to provide additional runtime information about the operation.

  returns: The OperationContext for the current operation. - `com.microsoft.azure.storage.OperationContext`"
  (^com.microsoft.azure.storage.OperationContext [^BaseEvent this]
    (-> this (.getOpContext))))

(defn get-request-result
  "Gets a RequestResult object that represents the current request result.

  returns: The RequestResult object for the current request result. - `com.microsoft.azure.storage.RequestResult`"
  (^com.microsoft.azure.storage.RequestResult [^BaseEvent this]
    (-> this (.getRequestResult))))

