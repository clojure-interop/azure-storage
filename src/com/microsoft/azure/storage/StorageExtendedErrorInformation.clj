(ns com.microsoft.azure.storage.StorageExtendedErrorInformation
  "Represents extended error information returned by the Microsoft Azure storage service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage StorageExtendedErrorInformation]))

(defn ->storage-extended-error-information
  "Constructor.

  Creates an instance of the StorageExtendedErrorInformation class."
  (^StorageExtendedErrorInformation []
    (new StorageExtendedErrorInformation )))

(defn get-additional-details
  "Gets additional error details, as a java.util.HashMap object.

  returns: A java.util.HashMap of key/value pairs which contain the additional error details. - `java.util.HashMap<java.lang.String,java.lang.String[]>`"
  ([^StorageExtendedErrorInformation this]
    (-> this (.getAdditionalDetails))))

(defn get-error-code
  "Deprecated. use the property on RequestResult instead.

  returns: A String which contains the error code. - `java.lang.String`"
  (^java.lang.String [^StorageExtendedErrorInformation this]
    (-> this (.getErrorCode))))

(defn get-error-message
  "Gets the storage service error message.

  returns: A String which contains the error message. - `java.lang.String`"
  (^java.lang.String [^StorageExtendedErrorInformation this]
    (-> this (.getErrorMessage))))

(defn set-additional-details
  "RESERVED FOR INTERNAL USE.

   Sets additional error details.

  additional-details - A java.util.HashMap of key/value pairs which contain the additional error details. - `java.util.HashMap`"
  ([^StorageExtendedErrorInformation this ^java.util.HashMap additional-details]
    (-> this (.setAdditionalDetails additional-details))))

(defn set-error-code
  "RESERVED FOR INTERNAL USE.

   Sets the storage service error code.

  error-code - A String which contains the error code. - `java.lang.String`"
  ([^StorageExtendedErrorInformation this ^java.lang.String error-code]
    (-> this (.setErrorCode error-code))))

(defn set-error-message
  "RESERVED FOR INTERNAL USE.

   Sets the storage service error message.

  error-message - A String which contains the error message. - `java.lang.String`"
  ([^StorageExtendedErrorInformation this ^java.lang.String error-message]
    (-> this (.setErrorMessage error-message))))

