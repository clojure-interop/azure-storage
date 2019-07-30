(ns com.microsoft.azure.storage.StorageCredentialsToken
  "Represents storage account credentials, based on an authentication token, for accessing the Microsoft Azure
  storage services."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage StorageCredentialsToken]))

(defn ->storage-credentials-token
  "Constructor.

  Creates an instance of the StorageCredentialsToken class, using the specified token.
   Token credentials must only be used with HTTPS requests on the blob and queue services.
   The specified token is stored as a String.

  account-name - `java.lang.String`
  token - A String that represents the token. - `java.lang.String`"
  (^StorageCredentialsToken [^java.lang.String account-name ^java.lang.String token]
    (new StorageCredentialsToken account-name token)))

(defn https-only?
  "Gets whether this StorageCredentials object only allows access via HTTPS.

  returns: A boolean representing whether this StorageCredentials
           object only allows access via HTTPS. - `boolean`"
  (^Boolean [^StorageCredentialsToken this]
    (-> this (.isHttpsOnly))))

(defn get-token
  "Gets the token.

  returns: A String that contains the token. - `java.lang.String`"
  (^java.lang.String [^StorageCredentialsToken this]
    (-> this (.getToken))))

(defn update-token
  "Sets the token to be used when authenticating HTTPS requests.

  token - A String that represents the access token to be used when authenticating HTTPS requests. - `java.lang.String`"
  ([^StorageCredentialsToken this ^java.lang.String token]
    (-> this (.updateToken token))))

(defn get-account-name
  "Gets the account name.

  returns: A String that contains the account name. - `java.lang.String`"
  (^java.lang.String [^StorageCredentialsToken this]
    (-> this (.getAccountName))))

(defn to-string
  "Returns a String that represents this instance, optionally including sensitive data.

  export-secrets - true to include sensitive data in the return string; otherwise, false. - `boolean`

  returns: A String that represents this object, optionally including sensitive data. - `java.lang.String`"
  (^java.lang.String [^StorageCredentialsToken this ^Boolean export-secrets]
    (-> this (.toString export-secrets))))

(defn transform-uri
  "Description copied from class: StorageCredentials

  resource-uri - A java.net.URI object that represents the resource URI to be transformed. - `java.net.URI`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A java.net.URI object that represents the signature, including the resource URI and the
           shared access token. - `java.net.URI`"
  (^java.net.URI [^StorageCredentialsToken this ^java.net.URI resource-uri ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.transformUri resource-uri op-context))))

