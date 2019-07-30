(ns com.microsoft.azure.storage.queue.QueueRequestOptions
  "Represents a set of options that may be specified on a queue request."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.queue QueueRequestOptions]))

(defn ->queue-request-options
  "Constructor.

  Initializes a new instance of the QueueRequestOptions class as a copy of
   another QueueRequestOptions instance.

  other - The QueueRequestOptions object to copy the values from. - `com.microsoft.azure.storage.queue.QueueRequestOptions`"
  (^QueueRequestOptions [^com.microsoft.azure.storage.queue.QueueRequestOptions other]
    (new QueueRequestOptions other))
  (^QueueRequestOptions []
    (new QueueRequestOptions )))

(defn get-encryption-policy
  "Gets the encryption policy to use for this request. For more information about the encryption policy defaults,
   see setEncryptionPolicy(QueueEncryptionPolicy).

  returns: An QueueEncryptionPolicy object that represents the current encryption policy. - `com.microsoft.azure.storage.queue.QueueEncryptionPolicy`"
  (^com.microsoft.azure.storage.queue.QueueEncryptionPolicy [^QueueRequestOptions this]
    (-> this (.getEncryptionPolicy))))

(defn set-encryption-policy
  "Sets the QueueEncryptionPolicy object to use for this request.

   The default QueueEncryptionPolicy is set in the client and is by default null, indicating no encryption. You can
   change the QueueEncryptionPolicy on this request by setting this property. You can also change the value on the
   ServiceClient.getDefaultRequestOptions() object so that all subsequent requests made via the service
   client will use that QueueEncryptionPolicy.

  encryption-policy - the QueueEncryptionPolicy object to use when making service requests. - `com.microsoft.azure.storage.queue.QueueEncryptionPolicy`"
  ([^QueueRequestOptions this ^com.microsoft.azure.storage.queue.QueueEncryptionPolicy encryption-policy]
    (-> this (.setEncryptionPolicy encryption-policy))))

