(ns com.microsoft.azure.storage.table.EntityProperty
  "A class which represents a single typed property value in a table entity. An EntityProperty stores the data
  type as an EdmType. The value, which may be null for object types, but not for primitive types,
  is serialized and stored as a String.

  EntityProperty provides overloaded constructors and overloads of the setValue method for
  supported value types. Each overloaded constructor or setValue method sets the EdmType and
  serializes the value appropriately based on the parameter type.

  Use one of the getValueAsType methods to deserialize an EntityProperty as the
  appropriate Java type. The method will throw a ParseException or IllegalArgumentException if the
  EntityProperty cannot be deserialized as the Java type."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.table EntityProperty]))

(defn ->entity-property
  "Constructor.

  Constructs an EntityProperty instance from a boolean value.

  value - The boolean value of the entity property to set. - `boolean`"
  (^EntityProperty [^Boolean value]
    (new EntityProperty value)))

(defn get-value-as-byte-array
  "Gets the value of this EntityProperty as a byte array.

  returns: A byte[] representation of the EntityProperty value, or null. - `byte[]`"
  ([^EntityProperty this]
    (-> this (.getValueAsByteArray))))

(defn get-value-as-double-object
  "Gets the value of this EntityProperty as a double.

  returns: A double representation of the EntityProperty value. - `java.lang.Double`

  throws: java.lang.IllegalArgumentException - If the value is null or cannot be parsed as a double."
  (^java.lang.Double [^EntityProperty this]
    (-> this (.getValueAsDoubleObject))))

(defn get-type
  "Gets the class type of the EntityProperty.

  returns: The Class<?> of the EntityProperty. - `java.lang.Class<?>`"
  (^java.lang.Class [^EntityProperty this]
    (-> this (.getType))))

(defn get-value-as-string
  "Gets the value of this EntityProperty as a String.

  returns: A String representation of the EntityProperty value, or null. - `java.lang.String`"
  (^java.lang.String [^EntityProperty this]
    (-> this (.getValueAsString))))

(defn get-is-null?
  "Gets a flag indicating that the EntityProperty value is null.

  returns: A boolean flag indicating that the EntityProperty value is null. - `boolean`"
  (^Boolean [^EntityProperty this]
    (-> this (.getIsNull))))

(defn get-value-as-uuid
  "Gets the value of this EntityProperty as a java.util.UUID.

  returns: A java.util.UUID representation of the EntityProperty value, or null. - `java.util.UUID`

  throws: java.lang.IllegalArgumentException - If the value cannot be parsed as a java.util.UUID."
  (^java.util.UUID [^EntityProperty this]
    (-> this (.getValueAsUUID))))

(defn get-value-as-long-object
  "Gets the value of this EntityProperty as a Long.

  returns: A long representation of the EntityProperty value. - `java.lang.Long`

  throws: java.lang.IllegalArgumentException - If the value is null or cannot be parsed as a long."
  (^java.lang.Long [^EntityProperty this]
    (-> this (.getValueAsLongObject))))

(defn get-value-as-byte-object-array
  "Gets the value of this EntityProperty as a Byte array.

  returns: A Byte[] representation of the EntityProperty value, or null. - `java.lang.Byte[]`"
  ([^EntityProperty this]
    (-> this (.getValueAsByteObjectArray))))

(defn get-value-as-long
  "Gets the value of this EntityProperty as a long.

  returns: A long representation of the EntityProperty value. - `long`

  throws: java.lang.IllegalArgumentException - If the value is null or cannot be parsed as a long."
  (^Long [^EntityProperty this]
    (-> this (.getValueAsLong))))

(defn get-edm-type
  "Gets the EdmType storage data type for the EntityProperty.

  returns: The EdmType enumeration value for the data type of the EntityProperty. - `com.microsoft.azure.storage.table.EdmType`"
  (^com.microsoft.azure.storage.table.EdmType [^EntityProperty this]
    (-> this (.getEdmType))))

(defn set-value
  "Sets this EntityProperty using the serialized boolean value.

  value - The boolean value to set as the EntityProperty value. - `boolean`"
  ([^EntityProperty this ^Boolean value]
    (-> this (.setValue value))))

(defn get-value-as-boolean?
  "Gets the value of this EntityProperty as a boolean.

  returns: A boolean representation of the EntityProperty value. - `boolean`

  throws: java.lang.IllegalArgumentException - If the value is null or cannot be parsed as a Boolean."
  (^Boolean [^EntityProperty this]
    (-> this (.getValueAsBoolean))))

(defn get-value-as-integer-object
  "Gets the value of this EntityProperty as an Integer.

  returns: An Integer representation of the EntityProperty value. - `java.lang.Integer`

  throws: java.lang.IllegalArgumentException - If the value is null or cannot be parsed as an int."
  (^java.lang.Integer [^EntityProperty this]
    (-> this (.getValueAsIntegerObject))))

(defn get-value-as-boolean-object?
  "Gets the value of this EntityProperty as a Boolean.

  returns: A Boolean representation of the EntityProperty value. - `java.lang.Boolean`

  throws: java.lang.IllegalArgumentException - If the value is null or cannot be parsed as a Boolean."
  (^java.lang.Boolean [^EntityProperty this]
    (-> this (.getValueAsBooleanObject))))

(defn get-value-as-integer
  "Gets the value of this EntityProperty as an int.

  returns: An int representation of the EntityProperty value. - `int`

  throws: java.lang.IllegalArgumentException - If the value is null or cannot be parsed as an int."
  (^Integer [^EntityProperty this]
    (-> this (.getValueAsInteger))))

(defn get-value-as-date
  "Gets the value of this EntityProperty as a java.util.Date.

  returns: A java.util.Date representation of the EntityProperty value, or null. - `java.util.Date`

  throws: java.lang.IllegalArgumentException - If the value is not null and cannot be parsed as a java.util.Date."
  (^java.util.Date [^EntityProperty this]
    (-> this (.getValueAsDate))))

(defn get-value-as-double
  "Gets the value of this EntityProperty as a double.

  returns: A double representation of the EntityProperty value. - `double`

  throws: java.lang.IllegalArgumentException - If the value is null or cannot be parsed as a double."
  (^Double [^EntityProperty this]
    (-> this (.getValueAsDouble))))

