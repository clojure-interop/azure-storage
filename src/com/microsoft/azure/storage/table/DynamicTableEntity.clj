(ns com.microsoft.azure.storage.table.DynamicTableEntity
  "A TableEntity type which allows callers direct access to the property map of the entity. This class extends
  TableServiceEntity to eliminate the use of reflection for serialization and deserialization."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.table DynamicTableEntity]))

(defn ->dynamic-table-entity
  "Constructor.

  Initializes a new instance of the DynamicTableEntity class with the specified partition key and row key.

  partition-key - A String which represents the partition key of the DynamicTableEntity to be initialized. - `java.lang.String`
  row-key - A String which represents the row key of the DynamicTableEntity to be initialized. - `java.lang.String`
  etag - The ETag of the DynamicTableEntity to be initialized. This value is used to determine if the table entity has changed since it was last read from Microsoft Azure storage. The client cannot update this value on the service. - `java.lang.String`
  properties - A java.util.HashMap containing a map of String property names to EntityProperty data typed values to store in the new DynamicTableEntity. - `java.util.HashMap`"
  (^DynamicTableEntity [^java.lang.String partition-key ^java.lang.String row-key ^java.lang.String etag ^java.util.HashMap properties]
    (new DynamicTableEntity partition-key row-key etag properties))
  (^DynamicTableEntity [^java.lang.String partition-key ^java.lang.String row-key ^java.util.HashMap properties]
    (new DynamicTableEntity partition-key row-key properties))
  (^DynamicTableEntity [^java.lang.String partition-key ^java.lang.String row-key]
    (new DynamicTableEntity partition-key row-key))
  (^DynamicTableEntity [^java.util.HashMap properties]
    (new DynamicTableEntity properties))
  (^DynamicTableEntity []
    (new DynamicTableEntity )))

(defn get-properties
  "Gets the property map for this DynamicTableEntity instance.

  returns: A java.util.HashMap containing the map of String property names to
           EntityProperty data typed values for this DynamicTableEntity instance. - `java.util.HashMap<java.lang.String,com.microsoft.azure.storage.table.EntityProperty>`"
  (^java.util.HashMap [^DynamicTableEntity this]
    (-> this (.getProperties))))

(defn read-entity
  "Populates this DynamicTableEntity instance using the specified map of property names to
   EntityProperty data typed values.

  properties - The java.util.HashMap of String property names to EntityProperty data typed values to store in this DynamicTableEntity instance. - `java.util.HashMap`
  op-context - An OperationContext object used to track the execution of the operation. - `com.microsoft.azure.storage.OperationContext`"
  ([^DynamicTableEntity this ^java.util.HashMap properties ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.readEntity properties op-context))))

(defn set-properties
  "Sets the property map for this DynamicTableEntity instance.

  properties - A java.util.HashMap containing the map of String property names to EntityProperty data typed values to set in this DynamicTableEntity instance. - `java.util.HashMap`"
  ([^DynamicTableEntity this ^java.util.HashMap properties]
    (-> this (.setProperties properties))))

(defn write-entity
  "Returns the map of property names to EntityProperty data values from this DynamicTableEntity
   instance.

  op-context - An OperationContext object used to track the execution of the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A java.util.HashMap containing the map of String property names to
           EntityProperty data typed values stored in this DynamicTableEntity instance. - `java.util.HashMap<java.lang.String,com.microsoft.azure.storage.table.EntityProperty>`

  throws: com.microsoft.azure.storage.StorageException - if a Storage service error occurs."
  (^java.util.HashMap [^DynamicTableEntity this ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.writeEntity op-context))))

