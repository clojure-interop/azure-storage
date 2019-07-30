(ns com.microsoft.azure.storage.blob.CopyState
  "Represents the attributes of a copy operation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob CopyState]))

(defn ->copy-state
  "Constructor."
  (^CopyState []
    (new CopyState )))

(defn get-copy-id
  "Gets the ID of the copy operation.

  returns: A String which represents the ID of the copy operation. - `java.lang.String`"
  (^java.lang.String [^CopyState this]
    (-> this (.getCopyId))))

(defn get-completion-time
  "Gets the time that the copy operation completed.

  returns: A Date object which represents the time that the copy operation completed. - `java.util.Date`"
  (^java.util.Date [^CopyState this]
    (-> this (.getCompletionTime))))

(defn get-status
  "Gets the status of the copy operation.

  returns: A CopyStatus object representing the status of the copy operation. - `com.microsoft.azure.storage.blob.CopyStatus`"
  (^com.microsoft.azure.storage.blob.CopyStatus [^CopyState this]
    (-> this (.getStatus))))

(defn get-source
  "Gets the source URI of the copy operation.

  returns: A URI object which represents the source URI of the copy operation in a string. - `java.net.URI`"
  (^java.net.URI [^CopyState this]
    (-> this (.getSource))))

(defn get-bytes-copied
  "Gets the number of bytes copied in the operation so far.

  returns: A long which represents the number of bytes copied. - `java.lang.Long`"
  (^java.lang.Long [^CopyState this]
    (-> this (.getBytesCopied))))

(defn get-total-bytes
  "Gets the number of bytes total number of bytes to copy.

  returns: A long which represents the total number of bytes to copy. - `java.lang.Long`"
  (^java.lang.Long [^CopyState this]
    (-> this (.getTotalBytes))))

(defn get-status-description
  "Gets the status description of the copy operation.

  returns: A String which represents the status description. - `java.lang.String`"
  (^java.lang.String [^CopyState this]
    (-> this (.getStatusDescription))))

(defn get-copy-destination-snapshot-id
  "Gets the snapshot ID of the last successful incremental copy snapshot.

  returns: A String which represents the snapshot ID of the last successful incremental copy snapshot. - `java.lang.String`"
  (^java.lang.String [^CopyState this]
    (-> this (.getCopyDestinationSnapshotID))))

