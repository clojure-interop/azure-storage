(ns com.microsoft.azure.storage.queue.QueueEncryptionPolicy
  "Represents a queue encryption policy that is used to perform envelope encryption/decryption of Azure queue messages."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.queue QueueEncryptionPolicy]))

(defn ->queue-encryption-policy
  "Constructor.

  Initializes a new instance of the QueueEncryptionPolicy class with the specified key and resolver.

   If the generated policy is intended to be used for encryption, users are expected to provide a key at the
   minimum. The absence of key will cause an exception to be thrown during encryption. If the generated policy is
   intended to be used for decryption, users can provide a keyResolver. The client library will - 1. Invoke the key
   resolver if specified to get the key. 2. If resolver is not specified but a key is specified, match the key id on
   the key and use it.

  key - An object of type IKey that is used to wrap/unwrap the content encryption key. - `com.microsoft.azure.keyvault.core.IKey`
  key-resolver - The key resolver used to select the correct key for decrypting existing queue messages. - `com.microsoft.azure.keyvault.core.IKeyResolver`"
  (^QueueEncryptionPolicy [^com.microsoft.azure.keyvault.core.IKey key ^com.microsoft.azure.keyvault.core.IKeyResolver key-resolver]
    (new QueueEncryptionPolicy key key-resolver)))

(defn key-wrapper
  "Instance Field.

  An object of type IKey that is used to wrap/unwrap the content key during encryption.

  type: com.microsoft.azure.keyvault.core.IKey"
  (^com.microsoft.azure.keyvault.core.IKey [^QueueEncryptionPolicy this]
    (-> this .-keyWrapper)))

(defn key-resolver
  "Instance Field.

  The IKeyResolver used to select the correct key for decrypting existing queue messages.

  type: com.microsoft.azure.keyvault.core.IKeyResolver"
  (^com.microsoft.azure.keyvault.core.IKeyResolver [^QueueEncryptionPolicy this]
    (-> this .-keyResolver)))

(defn get-key
  "Gets the IKey that is used to wrap/unwrap the content key during encryption.

  returns: An IKey object. - `com.microsoft.azure.keyvault.core.IKey`"
  (^com.microsoft.azure.keyvault.core.IKey [^QueueEncryptionPolicy this]
    (-> this (.getKey))))

(defn get-key-resolver
  "Gets the key resolver used to select the correct key for decrypting existing queue messages.

  returns: A resolver that returns an IKey given a keyId. - `com.microsoft.azure.keyvault.core.IKeyResolver`"
  (^com.microsoft.azure.keyvault.core.IKeyResolver [^QueueEncryptionPolicy this]
    (-> this (.getKeyResolver))))

(defn set-key
  "Sets the IKey that is used to wrap/unwrap the content key during encryption.

  key - An IKey object. - `com.microsoft.azure.keyvault.core.IKey`"
  ([^QueueEncryptionPolicy this ^com.microsoft.azure.keyvault.core.IKey key]
    (-> this (.setKey key))))

(defn set-key-resolver
  "Sets the key resolver used to select the correct key for decrypting existing queue messages.

  key-resolver - A resolver that returns an IKey given a keyId. - `com.microsoft.azure.keyvault.core.IKeyResolver`"
  ([^QueueEncryptionPolicy this ^com.microsoft.azure.keyvault.core.IKeyResolver key-resolver]
    (-> this (.setKeyResolver key-resolver))))

