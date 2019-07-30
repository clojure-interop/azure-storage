(ns com.microsoft.azure.storage.table.TableEntity
  "An interface required for table entity types. The TableEntity interface declares getter and setter methods
  for the common entity properties, and writeEntity and readEntity methods for serialization
  and deserialization of all entity properties using a property map. Create classes implementing TableEntity to
  customize property storage, retrieval, serialization and deserialization, and to provide additional custom logic for
  a table entity.

  The Storage client library includes two implementations of TableEntity that provide for simple property
  access and serialization:

  DynamicTableEntity implements TableEntity and provides a simple property map to store and retrieve
  properties. Use a DynamicTableEntity for simple access to entity properties when only a subset of properties
  are returned (for example, by a select clause in a query), or for when your query can return multiple entity types
  with different properties. You can also use this type to perform bulk table updates of heterogeneous entities without
  losing property information.

  TableServiceEntity is an implementation of TableEntity that uses reflection-based serialization and
  deserialization behavior in its writeEntity and readEntity methods.
  TableServiceEntity-derived classes with methods that follow a convention for types and naming are serialized
  and deserialized automatically.

  Any class that implements TableEntity can take advantage of the automatic reflection-based serialization and
  deserialization behavior in TableServiceEntity by invoking the static methods
  TableServiceEntity.readEntityWithReflection in readEntity and
  TableServiceEntity.writeEntityWithReflection in writeEntity. The class must provide methods
  that follow the type and naming convention to be serialized and deserialized automatically. When both a getter method
  and setter method are found for a given property name and data type, then the appropriate method is invoked
  automatically to serialize or deserialize the data. The reflection code looks for getter and setter methods in pairs
  of the form

  public type getPropertyName() { ... }

  and

  public void setPropertyName(type parameter) { ... }

  where PropertyName is a property name for the table entity, and type is a Java type compatible with
  the EDM data type of the property. See the table in the class description for TableServiceEntity for a map of
  property types to their Java equivalents. The StoreAs annotation may be applied with a name
  attribute to specify a property name for reflection on getter and setter methods that do not follow the property name
  convention. Method names and the name attribute of StoreAs annotations are case sensitive for
  matching property names with reflection. Use the Ignore annotation to prevent methods from being used by
  reflection for automatic serialization and deserialization. Note that the names \"PartitionKey\", \"RowKey\",
  \"Timestamp\", and \"Etag\" are reserved and will be ignored if set with the StoreAs annotation in a subclass
  that uses the reflection methods."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.table TableEntity]))

(defn set-timestamp
  "Sets the Timestamp value for the entity. Note that timestamp is a read-only property on the service and should
   not be set by the user.

  time-stamp - A java.util.Date which specifies the Timestamp value to set for the entity. - `java.util.Date`"
  ([^TableEntity this ^java.util.Date time-stamp]
    (-> this (.setTimestamp time-stamp))))

(defn read-entity
  "Populates an instance of the object implementing TableEntity using the specified properties parameter,
   which represents a map of String property names to EntityProperty data typed values.

  properties - The java.util.HashMap of String to EntityProperty data typed values to use to populate the table entity instance. - `java.util.HashMap`
  op-context - An OperationContext object used to track the execution of the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - If an error occurs during the operation."
  ([^TableEntity this ^java.util.HashMap properties ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.readEntity properties op-context))))

(defn write-entity
  "Returns a map of String property names to EntityProperty data typed values
   that represents the serialized content of the table entity instance.

  op-context - An OperationContext object used to track the execution of the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A java.util.HashMap of String property names to EntityProperty data
           typed values representing the properties of the table entity. - `java.util.HashMap<java.lang.String,com.microsoft.azure.storage.table.EntityProperty>`

  throws: com.microsoft.azure.storage.StorageException - If an error occurs during the operation."
  (^java.util.HashMap [^TableEntity this ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.writeEntity op-context))))

(defn set-row-key
  "Sets the RowKey value for the entity.

  row-key - A String which specifies the RowKey value to set for the entity. - `java.lang.String`"
  ([^TableEntity this ^java.lang.String row-key]
    (-> this (.setRowKey row-key))))

(defn get-timestamp
  "Gets the Timestamp for the entity. The server manages the value of Timestamp, which cannot be modified.

  returns: A java.util.Date object which represents the Timestamp value for the entity. - `java.util.Date`"
  (^java.util.Date [^TableEntity this]
    (-> this (.getTimestamp))))

(defn get-row-key
  "Gets the RowKey value for the entity.

  returns: A String which represents the RowKey value for the entity. - `java.lang.String`"
  (^java.lang.String [^TableEntity this]
    (-> this (.getRowKey))))

(defn set-etag
  "Sets the ETag value to verify for the entity. This value is used to determine if the table entity has changed
   since it was last read from Microsoft Azure storage. The client cannot update this value on the service.

  etag - A String which specifies the ETag to set for the entity. - `java.lang.String`"
  ([^TableEntity this ^java.lang.String etag]
    (-> this (.setEtag etag))))

(defn get-partition-key
  "Gets the PartitionKey value for the entity.

  returns: A String which represents the PartitionKey value for the entity. - `java.lang.String`"
  (^java.lang.String [^TableEntity this]
    (-> this (.getPartitionKey))))

(defn get-etag
  "Gets the ETag value to verify for the entity. This value is used to determine if the table entity has changed
   since it was last read from Microsoft Azure storage. The client cannot update this value on the service.

  returns: A String which represents the ETag for the entity. - `java.lang.String`"
  (^java.lang.String [^TableEntity this]
    (-> this (.getEtag))))

(defn set-partition-key
  "Sets the PartitionKey value for the entity.

  partition-key - A String which specifies the PartitionKey value to set for the entity. - `java.lang.String`"
  ([^TableEntity this ^java.lang.String partition-key]
    (-> this (.setPartitionKey partition-key))))

