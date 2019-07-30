(ns com.microsoft.azure.storage.queue.CloudQueueMessage
  "Represents a message in the Microsoft Azure Queue service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.queue CloudQueueMessage]))

(defn ->cloud-queue-message
  "Constructor.

  Initializes a new instance of the CloudQueueMessage class with a byte
   array containing the message.

  content - A byte array which contains the message. - `byte[]`"
  (^CloudQueueMessage [content]
    (new CloudQueueMessage content)))

(defn get-dequeue-count
  "Gets the dequeue count.

  returns: An int which contains the dequeue count. - `int`"
  (^Integer [^CloudQueueMessage this]
    (-> this (.getDequeueCount))))

(defn get-id
  "Gets the message ID.

  returns: A String which contains the message ID. - `java.lang.String`"
  (^java.lang.String [^CloudQueueMessage this]
    (-> this (.getId))))

(defn get-pop-receipt
  "Gets the message's pop receipt.

  returns: A String which contains the message's pop receipt. - `java.lang.String`"
  (^java.lang.String [^CloudQueueMessage this]
    (-> this (.getPopReceipt))))

(defn get-message-id
  "Gets the message ID.

  returns: A String which contains the message ID. - `java.lang.String`"
  (^java.lang.String [^CloudQueueMessage this]
    (-> this (.getMessageId))))

(defn get-expiration-time
  "Gets the time that the message expires.

  returns: A java.util.Date object which represents the time that the message expires. - `java.util.Date`"
  (^java.util.Date [^CloudQueueMessage this]
    (-> this (.getExpirationTime))))

(defn get-message-content-as-byte
  "Gets the content of the message as a byte array.

  returns: A byte array which contains the content of the message. - `byte[]`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  ([^CloudQueueMessage this]
    (-> this (.getMessageContentAsByte))))

(defn get-next-visible-time
  "Gets the time that the message will next be visible.

  returns: A java.util.Date with the time that the message will
           next be visible. - `java.util.Date`"
  (^java.util.Date [^CloudQueueMessage this]
    (-> this (.getNextVisibleTime))))

(defn get-message-content-as-string
  "Gets the content of the message as a string.

  returns: A String which contains the content of the message. - `java.lang.String`

  throws: com.microsoft.azure.storage.StorageException - If a storage service error occurred."
  (^java.lang.String [^CloudQueueMessage this]
    (-> this (.getMessageContentAsString))))

(defn set-message-content
  "Sets the content of the message as a byte array.

  content - A byte array which contains the content of the message. - `byte[]`"
  ([^CloudQueueMessage this content]
    (-> this (.setMessageContent content))))

(defn get-insertion-time
  "Gets the time the message was added to the queue.

  returns: A java.util.Date which represents the time the message was added to the queue. - `java.util.Date`"
  (^java.util.Date [^CloudQueueMessage this]
    (-> this (.getInsertionTime))))

