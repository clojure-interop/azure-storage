(ns com.microsoft.azure.storage.ResultContinuation
  "Represents a continuation token for listing operations. Continuation tokens are used in methods that return a
  ResultSegment object, such as CloudBlobDirectory.listBlobsSegmented()."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage ResultContinuation]))

(defn ->result-continuation
  "Constructor.

  Creates an instance of the ResultContinuation class."
  (^ResultContinuation []
    (new ResultContinuation )))

(defn has-continuation?
  "Indicates whether continuation information is available.

  returns: true if any continuation information is available; otherwise false. - `boolean`"
  (^Boolean [^ResultContinuation this]
    (-> this (.hasContinuation))))

(defn get-next-table-name
  "Gets the next table name for Table enumeration operations.

  returns: A String which represents the the next table name. - `java.lang.String`"
  (^java.lang.String [^ResultContinuation this]
    (-> this (.getNextTableName))))

(defn get-target-location
  "Gets the location that the token applies to.

  returns: A StorageLocation value which indicates the location. - `com.microsoft.azure.storage.StorageLocation`"
  (^com.microsoft.azure.storage.StorageLocation [^ResultContinuation this]
    (-> this (.getTargetLocation))))

(defn set-next-marker
  "Sets the next marker for continuing results of listing operations.

  next-marker - A String which represents the the next marker to set. - `java.lang.String`"
  ([^ResultContinuation this ^java.lang.String next-marker]
    (-> this (.setNextMarker next-marker))))

(defn set-next-partition-key
  "Sets the next partition key for TableServiceEntity enumeration operations.

  next-partition-key - A String which represents the the next partition key to set. - `java.lang.String`"
  ([^ResultContinuation this ^java.lang.String next-partition-key]
    (-> this (.setNextPartitionKey next-partition-key))))

(defn get-next-marker
  "Gets the next marker for continuing results of listing operations.

  returns: A String which represents the the next marker. - `java.lang.String`"
  (^java.lang.String [^ResultContinuation this]
    (-> this (.getNextMarker))))

(defn set-continuation-type
  "Sets the type of the continuation token.

  continuation-type - The ResultContinuationType value to set. - `com.microsoft.azure.storage.ResultContinuationType`"
  ([^ResultContinuation this ^com.microsoft.azure.storage.ResultContinuationType continuation-type]
    (-> this (.setContinuationType continuation-type))))

(defn get-continuation-type
  "Gets the type of the continuation token.

  returns: The ResultContinuationType value. - `com.microsoft.azure.storage.ResultContinuationType`"
  (^com.microsoft.azure.storage.ResultContinuationType [^ResultContinuation this]
    (-> this (.getContinuationType))))

(defn set-next-table-name
  "Sets the next table name for Table enumeration operations.

  next-table-name - A String which represents the the next table name to set. - `java.lang.String`"
  ([^ResultContinuation this ^java.lang.String next-table-name]
    (-> this (.setNextTableName next-table-name))))

(defn set-target-location
  "Sets the location that the token applies to.

  target-location - A StorageLocation value which indicates the location to set. - `com.microsoft.azure.storage.StorageLocation`"
  ([^ResultContinuation this ^com.microsoft.azure.storage.StorageLocation target-location]
    (-> this (.setTargetLocation target-location))))

(defn get-next-row-key
  "Gets the next row key for TableServiceEntity enumeration operations.

  returns: A String which represents the the next row key. - `java.lang.String`"
  (^java.lang.String [^ResultContinuation this]
    (-> this (.getNextRowKey))))

(defn get-next-partition-key
  "Gets the next partition key for TableServiceEntity enumeration operations.

  returns: A String which represents the the next partition key. - `java.lang.String`"
  (^java.lang.String [^ResultContinuation this]
    (-> this (.getNextPartitionKey))))

(defn set-next-row-key
  "Sets the next row key for TableServiceEntity enumeration operations.

  next-row-key - A String which represents the the next row key to set. - `java.lang.String`"
  ([^ResultContinuation this ^java.lang.String next-row-key]
    (-> this (.setNextRowKey next-row-key))))

