(ns com.microsoft.azure.storage.table.EntityResolver
  "An interface to perform client side projection on a retrieved entity. An EntityResolver instance must
  implement a resolve method projecting the entity data represented by the parameters passed in as a new
  instance of the type specified by the type parameter.

  This interface is useful for converting directly from table entity data to a client object type without requiring a
  separate table entity class type that deserializes every property individually. For example, a client can perform a
  client side projection of a Customer entity by simply returning the String for the
  CustomerName property of each entity. The result of this projection will be a collection of
  Strings containing each customer name."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.table EntityResolver]))

(defn resolve
  "Returns a reference to a new object instance of type T containing a projection of the specified
   table entity data.

  partition-key - A String containing the PartitionKey value for the entity. - `java.lang.String`
  row-key - A String containing the RowKey value for the entity. - `java.lang.String`
  time-stamp - A java.util.Date containing the Timestamp value for the entity. - `java.util.Date`
  properties - The java.util.HashMap of String property names to EntityProperty data type and value pairs representing the table entity data. - `java.util.HashMap`
  etag - A String containing the Etag for the entity. - `java.lang.String`

  returns: A reference to an object instance of type T constructed as a projection of the table entity
           parameters. - `T`

  throws: com.microsoft.azure.storage.StorageException - if an error occurs during the operation."
  ([^EntityResolver this ^java.lang.String partition-key ^java.lang.String row-key ^java.util.Date time-stamp ^java.util.HashMap properties ^java.lang.String etag]
    (-> this (.resolve partition-key row-key time-stamp properties etag))))

