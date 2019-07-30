(ns com.microsoft.azure.storage.StorageCredentialsAccountAndKey
  "Represents storage account credentials, based on storage account and access key, for accessing the Microsoft Azure
  storage services."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage StorageCredentialsAccountAndKey]))

(defn ->storage-credentials-account-and-key
  "Constructor.

  Creates an instance of the StorageCredentialsAccountAndKey class, using the specified storage
   account name and access key; the specified access key is in the form of a byte array.

  account-name - A String that represents the name of the storage account. - `java.lang.String`
  key - An array of bytes that represent the account access key. - `byte[]`"
  (^StorageCredentialsAccountAndKey [^java.lang.String account-name key]
    (new StorageCredentialsAccountAndKey account-name key)))

(defn get-account-name
  "Gets the account name.

  returns: A String that contains the account name. - `java.lang.String`"
  (^java.lang.String [^StorageCredentialsAccountAndKey this]
    (-> this (.getAccountName))))

(defn export-base-64-encoded-key
  "Exports the value of the access key to a Base64-encoded string.

  returns: A String that represents the Base64-encoded access key. - `java.lang.String`"
  (^java.lang.String [^StorageCredentialsAccountAndKey this]
    (-> this (.exportBase64EncodedKey))))

(defn export-key
  "Exports the value of the access key to an array of bytes.

  returns: A byte array that represents the access key. - `byte[]`"
  ([^StorageCredentialsAccountAndKey this]
    (-> this (.exportKey))))

(defn set-account-name
  "Sets the account name.

  account-name - A String that contains the account name. - `java.lang.String`"
  ([^StorageCredentialsAccountAndKey this ^java.lang.String account-name]
    (-> this (.setAccountName account-name))))

(defn update-key
  "Sets the name of the access key to be used when signing the request.

  key - A String that represents the name of the access key to be used when signing the request. - `java.lang.String`"
  ([^StorageCredentialsAccountAndKey this ^java.lang.String key]
    (-> this (.updateKey key))))

(defn to-string
  "Returns a String that represents this instance, optionally including sensitive data.

  export-secrets - true to include sensitive data in the return string; otherwise, false. - `boolean`

  returns: A String that represents this object, optionally including sensitive data. - `java.lang.String`"
  (^java.lang.String [^StorageCredentialsAccountAndKey this ^Boolean export-secrets]
    (-> this (.toString export-secrets))))

(defn transform-uri
  "Description copied from class: StorageCredentials

  resource-uri - A java.net.URI object that represents the resource URI to be transformed. - `java.net.URI`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A java.net.URI object that represents the signature, including the resource URI and the
           shared access token. - `java.net.URI`"
  (^java.net.URI [^StorageCredentialsAccountAndKey this ^java.net.URI resource-uri ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.transformUri resource-uri op-context))))

(defn get-hmac-256
  "Gets the HmacSha256 associated with the account key.

  returns: A MAC created with the account key. - `javax.crypto.Mac`

  throws: java.security.InvalidKeyException - If the key is not a valid storage key."
  (^javax.crypto.Mac [^StorageCredentialsAccountAndKey this]
    (-> this (.getHmac256))))

