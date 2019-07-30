(ns com.microsoft.azure.storage.StorageErrorCode
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage StorageErrorCode]))

(def ACCESS_DENIED
  "Enum Constant.

  Access was denied (client-side error).

  type: com.microsoft.azure.storage.StorageErrorCode"
  StorageErrorCode/ACCESS_DENIED)

(def ACCOUNT_NOT_FOUND
  "Enum Constant.

  The specified account was not found (client-side error).

  type: com.microsoft.azure.storage.StorageErrorCode"
  StorageErrorCode/ACCOUNT_NOT_FOUND)

(def AUTHENTICATION_FAILURE
  "Enum Constant.

  An authentication error occurred (client-side error).

  type: com.microsoft.azure.storage.StorageErrorCode"
  StorageErrorCode/AUTHENTICATION_FAILURE)

(def BAD_GATEWAY
  "Enum Constant.

  There was an error with the gateway used for the request (client-side error).

  type: com.microsoft.azure.storage.StorageErrorCode"
  StorageErrorCode/BAD_GATEWAY)

(def BAD_REQUEST
  "Enum Constant.

  The request was incorrect or badly formed (client-side error).

  type: com.microsoft.azure.storage.StorageErrorCode"
  StorageErrorCode/BAD_REQUEST)

(def BLOB_ALREADY_EXISTS
  "Enum Constant.

  The specified blob already exists (client-side error).

  type: com.microsoft.azure.storage.StorageErrorCode"
  StorageErrorCode/BLOB_ALREADY_EXISTS)

(def BLOB_NOT_FOUND
  "Enum Constant.

  The specified blob was not found (client-side error).

  type: com.microsoft.azure.storage.StorageErrorCode"
  StorageErrorCode/BLOB_NOT_FOUND)

(def CONDITION_FAILED
  "Enum Constant.

  The specified condition failed (client-side error).

  type: com.microsoft.azure.storage.StorageErrorCode"
  StorageErrorCode/CONDITION_FAILED)

(def CONTAINER_ALREADY_EXISTS
  "Enum Constant.

  The specified container already exists (client-side error).

  type: com.microsoft.azure.storage.StorageErrorCode"
  StorageErrorCode/CONTAINER_ALREADY_EXISTS)

(def CONTAINER_NOT_FOUND
  "Enum Constant.

  The specified container was not found (client-side error).

  type: com.microsoft.azure.storage.StorageErrorCode"
  StorageErrorCode/CONTAINER_NOT_FOUND)

(def HTTP_VERSION_NOT_SUPPORTED
  "Enum Constant.

  The request version header is not supported (client-side error).

  type: com.microsoft.azure.storage.StorageErrorCode"
  StorageErrorCode/HTTP_VERSION_NOT_SUPPORTED)

(def NONE
  "Enum Constant.

  No error specified.

  type: com.microsoft.azure.storage.StorageErrorCode"
  StorageErrorCode/NONE)

(def NOT_IMPLEMENTED
  "Enum Constant.

  The requested operation is not implemented on the specified resource (client-side error).

  type: com.microsoft.azure.storage.StorageErrorCode"
  StorageErrorCode/NOT_IMPLEMENTED)

(def RESOURCE_ALREADY_EXISTS
  "Enum Constant.

  The specified resource already exists (client-side error).

  type: com.microsoft.azure.storage.StorageErrorCode"
  StorageErrorCode/RESOURCE_ALREADY_EXISTS)

(def RESOURCE_NOT_FOUND
  "Enum Constant.

  The specified resource was not found (client-side error).

  type: com.microsoft.azure.storage.StorageErrorCode"
  StorageErrorCode/RESOURCE_NOT_FOUND)

(def SERVICE_BAD_REQUEST
  "Enum Constant.

  The service returned a bad response (server-side error).

  type: com.microsoft.azure.storage.StorageErrorCode"
  StorageErrorCode/SERVICE_BAD_REQUEST)

(def SERVICE_INTEGRITY_CHECK_FAILED
  "Enum Constant.

  A service integrity check failed (server-side error).

  type: com.microsoft.azure.storage.StorageErrorCode"
  StorageErrorCode/SERVICE_INTEGRITY_CHECK_FAILED)

(def SERVICE_INTERNAL_ERROR
  "Enum Constant.

  An internal server error occurred (server-side error).

  type: com.microsoft.azure.storage.StorageErrorCode"
  StorageErrorCode/SERVICE_INTERNAL_ERROR)

(def SERVICE_TIMEOUT
  "Enum Constant.

  The service timed out (server-side error).

  type: com.microsoft.azure.storage.StorageErrorCode"
  StorageErrorCode/SERVICE_TIMEOUT)

(def TRANSPORT_ERROR
  "Enum Constant.

  A transport error occurred (server-side error).

  type: com.microsoft.azure.storage.StorageErrorCode"
  StorageErrorCode/TRANSPORT_ERROR)

(def LEASE_ID_MISSING
  "Enum Constant.

  A lease is required to perform the operation.

  type: com.microsoft.azure.storage.StorageErrorCode"
  StorageErrorCode/LEASE_ID_MISSING)

(def LEASE_ID_MISMATCH
  "Enum Constant.

  The given lease ID does not match the current lease.

  type: com.microsoft.azure.storage.StorageErrorCode"
  StorageErrorCode/LEASE_ID_MISMATCH)

(def LEASE_NOT_PRESENT
  "Enum Constant.

  A lease ID was used when no lease currently is held.

  type: com.microsoft.azure.storage.StorageErrorCode"
  StorageErrorCode/LEASE_NOT_PRESENT)

(def SERVER_BUSY
  "Enum Constant.

  The server is currently unavailable.

  type: com.microsoft.azure.storage.StorageErrorCode"
  StorageErrorCode/SERVER_BUSY)

(defn value
  "Instance Field.

  Returns the value of this enum.

  type: int"
  (^Integer [^StorageErrorCode this]
    (-> this .-value)))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (StorageErrorCode c : StorageErrorCode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.StorageErrorCode[]`"
  ([]
    (StorageErrorCode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.StorageErrorCode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.StorageErrorCode [^java.lang.String name]
    (StorageErrorCode/valueOf name)))

