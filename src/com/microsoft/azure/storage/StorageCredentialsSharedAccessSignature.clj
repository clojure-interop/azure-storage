(ns com.microsoft.azure.storage.StorageCredentialsSharedAccessSignature
  "Represents storage credentials for delegated access to Blob service resources via a shared access signature."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage StorageCredentialsSharedAccessSignature]))

(defn ->storage-credentials-shared-access-signature
  "Constructor.

  Creates an instance of the StorageCredentialsSharedAccessSignature class using the specified shared
   access signature token.

  token - A String that represents shared access signature token. - `java.lang.String`"
  (^StorageCredentialsSharedAccessSignature [^java.lang.String token]
    (new StorageCredentialsSharedAccessSignature token)))

(defn get-token
  "Returns the shared access signature token.

  returns: A String that contains the token. - `java.lang.String`"
  (^java.lang.String [^StorageCredentialsSharedAccessSignature this]
    (-> this (.getToken))))

(defn to-string
  "Returns a String that represents this instance, optionally including sensitive data.

  export-secrets - true to include sensitive data in the return string; otherwise, false. - `boolean`

  returns: A String that represents this object, optionally including sensitive data. - `java.lang.String`"
  (^java.lang.String [^StorageCredentialsSharedAccessSignature this ^Boolean export-secrets]
    (-> this (.toString export-secrets))))

(defn transform-uri
  "Transforms a resource URI into a shared access signature URI, by appending a shared access token and using the
   specified operation context.

  resource-uri - A java.net.URI object that represents the resource URI to be transformed. - `java.net.URI`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A java.net.URI object that represents the signature, including the resource URI and the
           shared access token. - `java.net.URI`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.net.URI [^StorageCredentialsSharedAccessSignature this ^java.net.URI resource-uri ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.transformUri resource-uri op-context))))

