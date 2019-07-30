(ns com.microsoft.azure.storage.RequestResult
  "Represents the result of a physical request."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage RequestResult]))

(defn ->request-result
  "Constructor."
  (^RequestResult []
    (new RequestResult )))

(defn set-request-service-encrypted
  "Sets the request's server-encryption status.

  request-service-encrypted - A boolean object which represents the server-encryption status to set. - `boolean`"
  ([^RequestResult this ^Boolean request-service-encrypted]
    (-> this (.setRequestServiceEncrypted request-service-encrypted))))

(defn set-status-code
  "Sets the HTTP status code for the request.

  status-code - An int which contains the HTTP status code to set. - `int`"
  ([^RequestResult this ^Integer status-code]
    (-> this (.setStatusCode status-code))))

(defn get-target-location
  "Gets the location that the request was sent to.

  returns: A StorageLocation object. - `com.microsoft.azure.storage.StorageLocation`"
  (^com.microsoft.azure.storage.StorageLocation [^RequestResult this]
    (-> this (.getTargetLocation))))

(defn get-start-date
  "Gets the start date for the request.

  returns: A java.util.Date object which contains the start date. - `java.util.Date`"
  (^java.util.Date [^RequestResult this]
    (-> this (.getStartDate))))

(defn set-request-date
  "Sets the request date.

  request-date - A java.util.Date object which contains the request date to set. - `java.lang.String`"
  ([^RequestResult this ^java.lang.String request-date]
    (-> this (.setRequestDate request-date))))

(defn set-error-code
  "Sets the service ErrorCode for the request.

  error-code - A String which contains the service ErrorCode to set. - `java.lang.String`"
  ([^RequestResult this ^java.lang.String error-code]
    (-> this (.setErrorCode error-code))))

(defn set-service-request-id
  "Sets the service request ID.

  service-request-id - A String object which contains the service request ID to set. - `java.lang.String`"
  ([^RequestResult this ^java.lang.String service-request-id]
    (-> this (.setServiceRequestID service-request-id))))

(defn get-request-date
  "Gets the request date.

  returns: A String which contains the date of the request. - `java.lang.String`"
  (^java.lang.String [^RequestResult this]
    (-> this (.getRequestDate))))

(defn set-etag
  "Sets the ETag for the request.

  etag - A String object which contains the ETag to set. - `java.lang.String`"
  ([^RequestResult this ^java.lang.String etag]
    (-> this (.setEtag etag))))

(defn request-service-encrypted?
  "Gets whether the request is server-side encrypted.

  returns: A boolean which contains the server-side encryption status of the request. - `boolean`"
  (^Boolean [^RequestResult this]
    (-> this (.isRequestServiceEncrypted))))

(defn get-etag
  "Gets the ETag for the request.

  returns: A String which contains the ETag. - `java.lang.String`"
  (^java.lang.String [^RequestResult this]
    (-> this (.getEtag))))

(defn set-stop-date
  "Sets the stop date for the request.

  stop-date - A java.util.Date object which contains the stop date to set. - `java.util.Date`"
  ([^RequestResult this ^java.util.Date stop-date]
    (-> this (.setStopDate stop-date))))

(defn get-service-request-id
  "Gets the service request ID.

  returns: A String which contains the service request ID. - `java.lang.String`"
  (^java.lang.String [^RequestResult this]
    (-> this (.getServiceRequestID))))

(defn get-exception
  "Gets the Exception for the request.

  returns: An Exception. - `java.lang.Exception`"
  (^java.lang.Exception [^RequestResult this]
    (-> this (.getException))))

(defn get-error-code
  "Gets the service ErrorCode for the request.

  returns: A String which contains the service ErrorCode. - `java.lang.String`"
  (^java.lang.String [^RequestResult this]
    (-> this (.getErrorCode))))

(defn set-target-location
  "Sets the location that the request was sent to.

  target-location - A StorageLocation object to set. - `com.microsoft.azure.storage.StorageLocation`"
  ([^RequestResult this ^com.microsoft.azure.storage.StorageLocation target-location]
    (-> this (.setTargetLocation target-location))))

(defn get-status-code
  "Gets the HTTP status code for the request.

  returns: An int which contains the HTTP status code. - `int`"
  (^Integer [^RequestResult this]
    (-> this (.getStatusCode))))

(defn set-exception
  "Sets the Exception for the request.

  exception - The Exception to set. - `java.lang.Exception`"
  ([^RequestResult this ^java.lang.Exception exception]
    (-> this (.setException exception))))

(defn set-content-md-5
  "Sets the MD5 hash for the request.

  content-md-5 - A String object which contains the MD5 hash to set. - `java.lang.String`"
  ([^RequestResult this ^java.lang.String content-md-5]
    (-> this (.setContentMD5 content-md-5))))

(defn get-content-md-5
  "Gets the MD5 hash for the request.

  returns: A String which contains the MD5 hash. - `java.lang.String`"
  (^java.lang.String [^RequestResult this]
    (-> this (.getContentMD5))))

(defn set-start-date
  "Sets the start date for the request.

  start-date - A java.util.Date object which contains the start date to set. - `java.util.Date`"
  ([^RequestResult this ^java.util.Date start-date]
    (-> this (.setStartDate start-date))))

(defn get-status-message
  "Gets the HTTP status message for the request.

  returns: A String which contains the HTTP status message. - `java.lang.String`"
  (^java.lang.String [^RequestResult this]
    (-> this (.getStatusMessage))))

(defn get-stop-date
  "Gets the stop date for the request.

  returns: A java.util.Date object which contains the stop date. - `java.util.Date`"
  (^java.util.Date [^RequestResult this]
    (-> this (.getStopDate))))

(defn set-status-message
  "Sets the HTTP status message for the request.

  status-message - A String which contains the status message to set. - `java.lang.String`"
  ([^RequestResult this ^java.lang.String status-message]
    (-> this (.setStatusMessage status-message))))

