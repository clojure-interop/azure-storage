(ns com.microsoft.azure.storage.table.QueryTableOperation
  "A class that extends TableOperation to implement a query to retrieve a single table entity. To execute a
  QueryTableOperation instance, call the execute method on a CloudTableClient instance.
  This operation can be executed directly or as part of a TableBatchOperation. If the
  QueryTableOperation returns an entity result, it is stored in the corresponding TableResult returned
  by the execute method."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.table QueryTableOperation]))

(defn get-partition-key
  "Gets the PartitionKey value for the entity to retrieve.

  returns: A String containing the PartitionKey value for the entity. - `java.lang.String`"
  (^java.lang.String [^QueryTableOperation this]
    (-> this (.getPartitionKey))))

(defn get-resolver
  "Gets the resolver to project the entity retrieved as a particular type.

  returns: The EntityResolver instance. - `com.microsoft.azure.storage.table.EntityResolver<?>`"
  (^com.microsoft.azure.storage.table.EntityResolver [^QueryTableOperation this]
    (-> this (.getResolver))))

(defn get-row-key
  "Gets the RowKey value for the entity to retrieve.

  returns: A String containing the RowKey value for the entity. - `java.lang.String`"
  (^java.lang.String [^QueryTableOperation this]
    (-> this (.getRowKey))))

