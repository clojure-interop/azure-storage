(ns com.microsoft.azure.storage.table.TableEncryptionPolicy
  "Represents a table encryption policy that is used to perform envelope encryption/decryption of Azure table entities."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.table TableEncryptionPolicy]))

(defn ->table-encryption-policy
  "Constructor.

  Initializes a new instance of the TableEncryptionPolicy class with the specified key and resolver.

   If the generated policy is intended to be used for encryption, users are expected to provide a key at the
   minimum. The absence of key will cause an exception to be thrown during encryption. If the generated policy is
   intended to be used for decryption, users can provide a keyResolver. The client library will - 1. Invoke the key
   resolver if specified to get the key. 2. If resolver is not specified but a key is specified, match the key id on
   the key and use it.

  key - An object of type IKey that is used to wrap/unwrap the content encryption key. - `com.microsoft.azure.keyvault.core.IKey`
  key-resolver - The key resolver used to select the correct key for decrypting existing table entities. - `com.microsoft.azure.keyvault.core.IKeyResolver`"
  (^TableEncryptionPolicy [^com.microsoft.azure.keyvault.core.IKey key ^com.microsoft.azure.keyvault.core.IKeyResolver key-resolver]
    (new TableEncryptionPolicy key key-resolver)))

(defn key-wrapper
  "Instance Field.

  An object of type IKey that is used to wrap/unwrap the content key during encryption.

  type: com.microsoft.azure.keyvault.core.IKey"
  (^com.microsoft.azure.keyvault.core.IKey [^TableEncryptionPolicy this]
    (-> this .-keyWrapper)))

(defn key-resolver
  "Instance Field.

  The IKeyResolver used to select the correct key for decrypting existing table entities.

  type: com.microsoft.azure.keyvault.core.IKeyResolver"
  (^com.microsoft.azure.keyvault.core.IKeyResolver [^TableEncryptionPolicy this]
    (-> this .-keyResolver)))

(defn get-key
  "Gets the IKey that is used to wrap/unwrap the content key during encryption.

  returns: An IKey object. - `com.microsoft.azure.keyvault.core.IKey`"
  (^com.microsoft.azure.keyvault.core.IKey [^TableEncryptionPolicy this]
    (-> this (.getKey))))

(defn get-key-resolver
  "Gets the key resolver used to select the correct key for decrypting existing table entities.

  returns: A resolver that returns an IKey given a keyId. - `com.microsoft.azure.keyvault.core.IKeyResolver`"
  (^com.microsoft.azure.keyvault.core.IKeyResolver [^TableEncryptionPolicy this]
    (-> this (.getKeyResolver))))

(defn set-key
  "Sets the IKey that is used to wrap/unwrap the content key during encryption.

  key - An IKey object. - `com.microsoft.azure.keyvault.core.IKey`"
  ([^TableEncryptionPolicy this ^com.microsoft.azure.keyvault.core.IKey key]
    (-> this (.setKey key))))

(defn set-key-resolver
  "Sets the key resolver used to select the correct key for decrypting existing table entities.

  key-resolver - A resolver that returns an IKey given a keyId. - `com.microsoft.azure.keyvault.core.IKeyResolver`"
  ([^TableEncryptionPolicy this ^com.microsoft.azure.keyvault.core.IKeyResolver key-resolver]
    (-> this (.setKeyResolver key-resolver))))

