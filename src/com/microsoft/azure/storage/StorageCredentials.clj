(ns com.microsoft.azure.storage.StorageCredentials
  "Represents a set of credentials used to authenticate access to a Microsoft Azure storage account. This is the base
  class for the StorageCredentialsAccountAndKey, StorageCredentialsToken, and StorageCredentialsSharedAccessSignature classes."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage StorageCredentials]))

(defn ->storage-credentials
  "Constructor."
  (^StorageCredentials []
    (new StorageCredentials )))

(defn *try-parse-credentials
  "Tries to determine the storage credentials from a connection string.

   The format for the connection string is in the pattern \"keyname=value\". Multiple key/value pairs can be
   separated by a semi-colon, for example, \"keyname1=value1;keyname2=value2\". Either include an account name
   with an account key or a shared access signature. If you use an account name and account key, do not include a
   shared access signature, and vice versa.

   The same connection string can be used as for CloudStorageAccount.parse(String) but here only the account
   name, account key, and sas key/value pairs will be examined.

  connection-string - A String that contains the key/value pairs that represent the storage credentials. - `java.lang.String`

  returns: A StorageCredentials object representing the storage credentials determined from the connection
           string. - `com.microsoft.azure.storage.StorageCredentials`

  throws: java.security.InvalidKeyException - If the account key specified in connectionString is not valid."
  (^com.microsoft.azure.storage.StorageCredentials [^java.lang.String connection-string]
    (StorageCredentials/tryParseCredentials connection-string)))

(defn https-only?
  "Gets whether this StorageCredentials object only allows access via HTTPS.

  returns: A boolean representing whether this StorageCredentials
           object only allows access via HTTPS. - `boolean`"
  (^Boolean [^StorageCredentials this]
    (-> this (.isHttpsOnly))))

(defn get-account-name
  "Returns the associated account name for the credentials. This is null for anonymous and shared access signature
   credentials.

  returns: A String that represents the associated account name for the credentials - `java.lang.String`"
  (^java.lang.String [^StorageCredentials this]
    (-> this (.getAccountName))))

(defn to-string
  "Returns a String that represents this instance.

  export-secrets - true to include sensitive data in the return string; otherwise, false. - `boolean`

  returns: A String that represents this object, optionally including sensitive data. - `java.lang.String`"
  (^java.lang.String [^StorageCredentials this ^Boolean export-secrets]
    (-> this (.toString export-secrets))))

(defn transform-uri
  "Transforms a resource URI into a shared access signature URI, by appending a shared access token and using the
   specified operation context.

  resource-uri - A java.net.URI object that represents the resource URI to be transformed. - `java.net.URI`
  op-context - An OperationContext object that represents the context for the current operation. This object is used to track requests to the storage service, and to provide additional runtime information about the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A java.net.URI object that represents the signature, including the resource URI and the
           shared access token. - `java.net.URI`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.net.URI [^StorageCredentials this ^java.net.URI resource-uri ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.transformUri resource-uri op-context)))
  (^java.net.URI [^StorageCredentials this ^java.net.URI resource-uri]
    (-> this (.transformUri resource-uri))))

