(ns com.microsoft.azure.storage.StorageException
  "Represents an exception for the Microsoft Azure storage service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage StorageException]))

(defn ->storage-exception
  "Constructor.

  Creates an instance of the StorageException class using the specified parameters.

  error-code - A String that represents the error code returned by the operation. - `java.lang.String`
  message - A String that represents the error message returned by the operation. - `java.lang.String`
  status-code - The HTTP status code returned by the operation. - `int`
  extended-error-info - A StorageExtendedErrorInformation object that represents the extended error information returned by the operation. - `com.microsoft.azure.storage.StorageExtendedErrorInformation`
  inner-exception - An Exception object that represents a reference to the initial exception, if one exists. - `java.lang.Exception`"
  (^StorageException [^java.lang.String error-code ^java.lang.String message ^Integer status-code ^com.microsoft.azure.storage.StorageExtendedErrorInformation extended-error-info ^java.lang.Exception inner-exception]
    (new StorageException error-code message status-code extended-error-info inner-exception))
  (^StorageException [^java.lang.String error-code ^java.lang.String message ^java.lang.Exception inner-exception]
    (new StorageException error-code message inner-exception)))

(defn *translate-client-exception
  "RESERVED FOR INTERNAL USE. Translates the specified exception into a storage exception.

  cause - An Exception object that represents the exception to translate. - `java.lang.Exception`

  returns: A StorageException object that represents translated exception. - `com.microsoft.azure.storage.StorageException`"
  (^com.microsoft.azure.storage.StorageException [^java.lang.Exception cause]
    (StorageException/translateClientException cause)))

(defn *translate-exception
  "RESERVED FOR INTERNAL USE. Translates the specified exception into a storage exception.

  request - An HttpURLConnection object that represents the request whose exception is being translated. - `com.microsoft.azure.storage.core.StorageRequest`
  cause - An Exception object that represents the exception to translate. - `java.lang.Exception`
  op-context - `com.microsoft.azure.storage.OperationContext`

  returns: A StorageException object that represents translated exception. - `com.microsoft.azure.storage.StorageException`"
  (^com.microsoft.azure.storage.StorageException [^com.microsoft.azure.storage.core.StorageRequest request ^java.lang.Exception cause ^com.microsoft.azure.storage.OperationContext op-context]
    (StorageException/translateException request cause op-context)))

(defn get-error-code
  "Gets the error code returned by the operation.

  returns: the errorCode - `java.lang.String`"
  (^java.lang.String [^StorageException this]
    (-> this (.getErrorCode))))

(defn get-extended-error-information
  "Gets the extended error information returned by the operation.

  returns: the extendedErrorInformation - `com.microsoft.azure.storage.StorageExtendedErrorInformation`"
  (^com.microsoft.azure.storage.StorageExtendedErrorInformation [^StorageException this]
    (-> this (.getExtendedErrorInformation))))

(defn get-http-status-code
  "Gets the HTTP status code returned by the operation.

  returns: the httpStatusCode - `int`"
  (^Integer [^StorageException this]
    (-> this (.getHttpStatusCode))))

