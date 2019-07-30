(ns com.microsoft.azure.storage.StorageCredentialsAnonymous
  "Represents credentials for anonymous access."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage StorageCredentialsAnonymous]))

(def *-anonymous
  "Static Constant.

  Stores the singleton instance of this class.

  type: com.microsoft.azure.storage.StorageCredentials"
  StorageCredentialsAnonymous/ANONYMOUS)

(defn to-string
  "Returns a String object that represents this instance.

  export-secrets - true to include sensitive data in the string; otherwise, false - `boolean`

  returns: a string representation of the credentials, optionally including sensitive data. - `java.lang.String`"
  (^java.lang.String [^StorageCredentialsAnonymous this ^Boolean export-secrets]
    (-> this (.toString export-secrets))))

(defn transform-uri
  "Description copied from class: StorageCredentials

  resource-uri - A java.net.URI object that represents the resource URI to be transformed. - `java.net.URI`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A java.net.URI object that represents the signature, including the resource URI and the
           shared access token. - `java.net.URI`"
  (^java.net.URI [^StorageCredentialsAnonymous this ^java.net.URI resource-uri ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.transformUri resource-uri op-context))))

