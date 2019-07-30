(ns com.microsoft.azure.storage.table.TableServiceException
  "An exception that results when a table storage service operation fails to complete successfully."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.table TableServiceException]))

(defn ->table-service-exception
  "Constructor.

  Constructs a TableServiceException instance using the specified error code, message, status code,
   extended error information and inner exception.

  error-code - A String that represents the error code returned by the table operation. - `java.lang.String`
  message - A String that represents the error message returned by the table operation. - `java.lang.String`
  status-code - An int which represents the HTTP status code returned by the table operation. - `int`
  extended-error-info - A StorageExtendedErrorInformation object that represents the extended error information returned by the table operation. - `com.microsoft.azure.storage.StorageExtendedErrorInformation`
  inner-exception - An Exception object that represents a reference to the initial exception, if one exists. - `java.lang.Exception`"
  (^TableServiceException [^java.lang.String error-code ^java.lang.String message ^Integer status-code ^com.microsoft.azure.storage.StorageExtendedErrorInformation extended-error-info ^java.lang.Exception inner-exception]
    (new TableServiceException error-code message status-code extended-error-info inner-exception)))

(defn get-operation
  "Gets the table operation that caused the TableServiceException to be thrown.

  returns: The TableOperation object representing the table operation that caused this
           TableServiceException to be thrown. - `com.microsoft.azure.storage.table.TableOperation`"
  (^com.microsoft.azure.storage.table.TableOperation [^TableServiceException this]
    (-> this (.getOperation))))

