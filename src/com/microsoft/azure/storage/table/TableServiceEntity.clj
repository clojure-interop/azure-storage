(ns com.microsoft.azure.storage.table.TableServiceEntity
  "The TableServiceEntity class represents the base object type for a table entity in the Storage service.
  TableServiceEntity provides a base implementation for the TableEntity interface that provides
  readEntity and writeEntity methods that by default serialize and deserialize all properties
  via reflection. A table entity class may extend this class and override the readEntity and
  writeEntity methods to provide customized or more performant serialization logic.

  The use of reflection allows subclasses of TableServiceEntity to be serialized and deserialized without
  having to implement the serialization code themselves. When both a getter method and setter method are found for a
  given property name and data type, then the appropriate method is invoked automatically to serialize or deserialize
  the data. To take advantage of the automatic serialization code, your table entity classes should provide getter and
  setter methods for each property in the corresponding table entity in Microsoft Azure table storage. The reflection
  code looks for getter and setter methods in pairs of the form

  public type getPropertyName() { ... }

  and

  public void setPropertyName(type parameter) { ... }

  where PropertyName is a property name for the table entity, and type is a Java type compatible with
  the EDM data type of the property. See the table below for a map of property types to their Java equivalents. The
  StoreAs annotation may be applied with a name attribute to specify a property name for
  reflection on getter and setter methods that do not follow the property name convention. Method names and the
  name attribute of StoreAs annotations are case sensitive for matching property names with
  reflection. Use the Ignore annotation to prevent methods from being used by reflection for automatic
  serialization and deserialization. Note that the names \"PartitionKey\", \"RowKey\", \"Timestamp\", and \"Etag\" are reserved
  and will be ignored if set with the StoreAs annotation in a subclass.

  The following table shows the supported property data types in Microsoft Azure storage and the corresponding Java
  types when deserialized.


  Storage Type
  EdmType Value
  Java Type
  Description


  Edm.Binary
  EdmType.BINARY
  byte[], Byte[]
  An array of bytes up to 64 KB in size.


  Edm.Boolean
  EdmType.BOOLEAN
  boolean, Boolean
  A Boolean value.


  Edm.DateTime
  EdmType.DATE_TIME
  java.util.Date
  A 64-bit value expressed as Coordinated Universal Time (UTC). The supported range begins from 12:00 midnight,
  January 1, 1601 A.D. (C.E.), UTC. The range ends at December 31, 9999.


  Edm.Double
  EdmType.DOUBLE
  double, Double
  A 64-bit double-precision floating point value.


  Edm.Guid
  EdmType.GUID
  UUID
  A 128-bit globally unique identifier.


  Edm.Int32
  EdmType.INT32
  int, Integer
  A 32-bit integer value.


  Edm.Int64
  EdmType.INT64
  long, Long
  A 64-bit integer value.


  Edm.String
  EdmType.STRING
  String
  A UTF-16-encoded value. String values may be up to 64 KB in size.



  See the MSDN topic Understanding the Table Service
  Data Model for an overview of tables, entities, and properties as used in the Microsoft Azure Storage service.

  For an overview of the available EDM primitive data types and names, see the

  Primitive Data Types section of
  the OData Protocol Overview."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.table TableServiceEntity]))

(defn ->table-service-entity
  "Constructor.

  Initializes a new instance of the TableServiceEntity class with the specified partition key and row key.

  partition-key - A String which represents the partition key of the TableServiceEntity to be initialized. - `java.lang.String`
  row-key - A String which represents the row key of the TableServiceEntity to be initialized. - `java.lang.String`"
  (^TableServiceEntity [^java.lang.String partition-key ^java.lang.String row-key]
    (new TableServiceEntity partition-key row-key))
  (^TableServiceEntity []
    (new TableServiceEntity )))

(defn *read-entity-with-reflection
  "Deserializes the table entity property map into the specified object instance using reflection.

   This static method takes an object instance that represents a table entity type and uses reflection on its class
   type to find methods to deserialize the data from the property map into the instance.

   Each property name and data type in the properties map is compared with the methods in the class type for a pair
   of getter and setter methods to use for serialization and deserialization. The class is scanned for methods with
   names that match the property name with \"get\" and \"set\" prepended, or with the StoreAs annotation set
   with the property name. The methods must have return types or parameter data types that match the data type of
   the corresponding EntityProperty value. If such a pair is found, the data is copied into the instance
   object by invoking the setter method on the instance. Properties that do not match a method pair by name and data
   type are not copied.

  instance - An Object reference to an instance of a class implementing TableEntity to deserialize the table entity data into. - `java.lang.Object`
  properties - A java.util.HashMap object which maps String property names to EntityProperty objects containing typed data values to deserialize into the instance parameter object. - `java.util.HashMap`
  op-context - An OperationContext object that represents the context for the current operation. - `com.microsoft.azure.storage.OperationContext`

  throws: java.lang.IllegalArgumentException - if the table entity response received is invalid or improperly formatted."
  ([^java.lang.Object instance ^java.util.HashMap properties ^com.microsoft.azure.storage.OperationContext op-context]
    (TableServiceEntity/readEntityWithReflection instance properties op-context)))

(defn *write-entity-with-reflection
  "Serializes the property data from a table entity instance into a property map using reflection.

   This static method takes an object instance that represents a table entity type and uses reflection on its class
   type to find methods to serialize the data from the instance into the property map.

   Each property name and data type in the properties map is compared with the methods in the class type for a pair
   of getter and setter methods to use for serialization and deserialization. The class is scanned for methods with
   names that match the property name with \"get\" and \"set\" prepended, or with the StoreAs annotation set
   with the property name. The methods must have return types or parameter data types that match the data type of
   the corresponding EntityProperty value. If such a pair is found, the data is copied from the instance
   object by invoking the getter method on the instance. Properties that do not have a method pair with matching
   name and data type are not copied.

  instance - An Object reference to an instance of a class implementing TableEntity to serialize the table entity data from. - `java.lang.Object`

  returns: A java.util.HashMap object which maps String property names to
           EntityProperty objects containing typed data values serialized from the instance parameter
           object. - `java.util.HashMap<java.lang.String,com.microsoft.azure.storage.table.EntityProperty>`

  throws: java.lang.IllegalArgumentException - if the table entity is invalid or improperly formatted."
  (^java.util.HashMap [^java.lang.Object instance]
    (TableServiceEntity/writeEntityWithReflection instance)))

(defn *reflected-entity-cache-disabled?
  "Gets a value indicating whether or not the reflected entity cache is disabled. For most scenarios, disabling
   the reflected entity cache is not recommended due to its effect on performance.

   The reflected entity cache stores known entity types and their respective reflected entity dictionaries. Rather
   than using reflection on a known entity type, the values from the dictionary are used instead.

  returns: true if the reflected entity cache is disabled; otherwise, false. - `boolean`"
  (^Boolean []
    (TableServiceEntity/isReflectedEntityCacheDisabled )))

(defn *set-reflected-entity-cache-disabled
  "Sets a boolean representing whether or not the reflected entity cache is disabled. For most scenarios, disabling
   the reflected entity cache is not recommended due to its effect on performance.

   The reflected entity cache stores known entity types and their respective reflected entity dictionaries. Rather
   than using reflection on a known entity type, the values from the dictionary are used instead.

  disable-reflected-entity-cache - true to disable the reflected entity cache; otherwise, false. - `boolean`"
  ([^Boolean disable-reflected-entity-cache]
    (TableServiceEntity/setReflectedEntityCacheDisabled disable-reflected-entity-cache)))

(defn set-timestamp
  "Sets the timeStamp value for the entity. Note that the timestamp property is a read-only property,
   set by the service only.

  time-stamp - A java.util.Date containing the timeStamp value for the entity. - `java.util.Date`"
  ([^TableServiceEntity this ^java.util.Date time-stamp]
    (-> this (.setTimestamp time-stamp))))

(defn read-entity
  "Populates this table entity instance using the map of property names to EntityProperty data typed values.

   This method invokes readEntityWithReflection(java.lang.Object, java.util.HashMap<java.lang.String, com.microsoft.azure.storage.table.EntityProperty>, com.microsoft.azure.storage.OperationContext) to populate the table entity instance the
   method is called on using reflection. Table entity classes that extend TableServiceEntity can take
   advantage of this behavior by implementing getter and setter methods for the particular properties of the table
   entity in Microsoft Azure storage the class represents.

   Override this method in classes that extend TableServiceEntity to invoke custom serialization code.

  properties - The java.util.HashMap of String property names to EntityProperty data values to deserialize and store in this table entity instance. - `java.util.HashMap`
  op-context - An OperationContext object used to track the execution of the operation. - `com.microsoft.azure.storage.OperationContext`

  throws: com.microsoft.azure.storage.StorageException - if an error occurs during the deserialization."
  ([^TableServiceEntity this ^java.util.HashMap properties ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.readEntity properties op-context))))

(defn write-entity
  "Returns a map of property names to EntityProperty data typed values created by serializing this table
   entity instance.

   This method invokes writeEntityWithReflection(java.lang.Object) to serialize the table entity instance the method is
   called on using reflection. Table entity classes that extend TableServiceEntity can take advantage of
   this behavior by implementing getter and setter methods for the particular properties of the table entity in
   Microsoft Azure storage the class represents. Note that the property names \"PartitionKey\", \"RowKey\", and
   \"Timestamp\" are reserved and will be ignored if set on other methods with the StoreAs annotation.

   Override this method in classes that extend TableServiceEntity to invoke custom serialization code.

  op-context - An OperationContext object used to track the execution of the operation. - `com.microsoft.azure.storage.OperationContext`

  returns: A java.util.HashMap of String property names to EntityProperty data
           typed values representing the properties serialized from this table entity instance. - `java.util.HashMap<java.lang.String,com.microsoft.azure.storage.table.EntityProperty>`

  throws: com.microsoft.azure.storage.StorageException - if an error occurs during the serialization."
  (^java.util.HashMap [^TableServiceEntity this ^com.microsoft.azure.storage.OperationContext op-context]
    (-> this (.writeEntity op-context))))

(defn set-row-key
  "Sets the RowKey value for the entity.

  row-key - A String containing the RowKey value for the entity. - `java.lang.String`"
  ([^TableServiceEntity this ^java.lang.String row-key]
    (-> this (.setRowKey row-key))))

(defn get-timestamp
  "Gets the Timestamp for the entity. The server manages the value of Timestamp, which cannot be modified.

  returns: A java.util.Date object which represents the Timestamp value for the entity. - `java.util.Date`"
  (^java.util.Date [^TableServiceEntity this]
    (-> this (.getTimestamp))))

(defn get-row-key
  "Gets the RowKey value for the entity.

  returns: A String containing the RowKey value for the entity. - `java.lang.String`"
  (^java.lang.String [^TableServiceEntity this]
    (-> this (.getRowKey))))

(defn set-etag
  "Sets the ETag value to verify for the entity. This value is used to determine if the table entity has changed
   since it was last read from Microsoft Azure storage. The client cannot update this value on the service.

  etag - A String containing the ETag for the entity. - `java.lang.String`"
  ([^TableServiceEntity this ^java.lang.String etag]
    (-> this (.setEtag etag))))

(defn get-partition-key
  "Gets the PartitionKey value for the entity.

  returns: A String containing the PartitionKey value for the entity. - `java.lang.String`"
  (^java.lang.String [^TableServiceEntity this]
    (-> this (.getPartitionKey))))

(defn get-etag
  "Gets the ETag value to verify for the entity. This value is used to determine if the table entity has changed
   since it was last read from Microsoft Azure storage. The client cannot update this value on the service.

  returns: A String containing the ETag for the entity. - `java.lang.String`"
  (^java.lang.String [^TableServiceEntity this]
    (-> this (.getEtag))))

(defn set-partition-key
  "Sets the PartitionKey value for the entity.

  partition-key - A String containing the PartitionKey value for the entity. - `java.lang.String`"
  ([^TableServiceEntity this ^java.lang.String partition-key]
    (-> this (.setPartitionKey partition-key))))

