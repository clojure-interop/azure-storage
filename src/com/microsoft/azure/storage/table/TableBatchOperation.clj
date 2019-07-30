(ns com.microsoft.azure.storage.table.TableBatchOperation
  "A class which represents a batch operation. A batch operation is a collection of table operations which are executed
  by the Storage Service REST API as a single atomic operation, by invoking an Entity Group Transaction.

  A batch operation may contain up to 100 individual table operations, with the requirement that each operation entity
  must have same partition key. A batch with a retrieve operation cannot contain any other operations. Note that the
  total payload of a batch operation is limited to 4MB."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.table TableBatchOperation]))

(defn ->table-batch-operation
  "Constructor."
  (^TableBatchOperation []
    (new TableBatchOperation )))

(defn add-all
  "Adds the collection of table operations to the batch operation ArrayList starting at the specified
   index.

  index - An int which represents the index in the batch operation ArrayList to add the table operation at. - `int`
  c - A java.util.Collection of TableOperation objects to add to the batch operation. - `java.util.Collection`

  returns: true if the operations were added successfully. - `boolean`"
  (^Boolean [^TableBatchOperation this ^Integer index ^java.util.Collection c]
    (-> this (.addAll index c)))
  (^Boolean [^TableBatchOperation this ^java.util.Collection c]
    (-> this (.addAll c))))

(defn insert-or-merge
  "Adds a table operation to insert or merge the specified entity to the batch operation.

  entity - The TableEntity to insert if not found or to merge if it exists. - `com.microsoft.azure.storage.table.TableEntity`"
  ([^TableBatchOperation this ^com.microsoft.azure.storage.table.TableEntity entity]
    (-> this (.insertOrMerge entity))))

(defn delete
  "Adds a table operation to delete the specified entity to the batch operation.

  entity - The TableEntity to delete. - `com.microsoft.azure.storage.table.TableEntity`"
  ([^TableBatchOperation this ^com.microsoft.azure.storage.table.TableEntity entity]
    (-> this (.delete entity))))

(defn replace
  "Adds a table operation to replace the specified entity to the batch operation.

  entity - The TableEntity to replace. - `com.microsoft.azure.storage.table.TableEntity`"
  ([^TableBatchOperation this ^com.microsoft.azure.storage.table.TableEntity entity]
    (-> this (.replace entity))))

(defn remove
  "Removes the table operation at the specified index from the batch operation.

  index - An int which represents the index in the ArrayList of the table operation to remove from the batch operation. - `int`

  returns: `com.microsoft.azure.storage.table.TableOperation`"
  (^com.microsoft.azure.storage.table.TableOperation [^TableBatchOperation this ^Integer index]
    (-> this (.remove index))))

(defn insert-or-replace
  "Adds a table operation to insert or replace the specified entity to the batch operation.

  entity - The TableEntity to insert if not found or to replace if it exists. - `com.microsoft.azure.storage.table.TableEntity`"
  ([^TableBatchOperation this ^com.microsoft.azure.storage.table.TableEntity entity]
    (-> this (.insertOrReplace entity))))

(defn insert
  "Adds a table operation to insert the specified entity to the batch operation.

  entity - The TableEntity to insert. - `com.microsoft.azure.storage.table.TableEntity`
  echo-content - The boolean representing whether the message payload should be returned in the response. - `boolean`"
  ([^TableBatchOperation this ^com.microsoft.azure.storage.table.TableEntity entity ^Boolean echo-content]
    (-> this (.insert entity echo-content)))
  ([^TableBatchOperation this ^com.microsoft.azure.storage.table.TableEntity entity]
    (-> this (.insert entity))))

(defn retrieve
  "Adds a table operation to retrieve an entity of the specified class type with the specified PartitionKey and
   RowKey to the batch operation.

  partition-key - A String containing the PartitionKey of the entity to retrieve. - `java.lang.String`
  row-key - A String containing the RowKey of the entity to retrieve. - `java.lang.String`
  clazz-type - The class of the TableEntity type for the entity to retrieve. - `java.lang.Class`"
  ([^TableBatchOperation this ^java.lang.String partition-key ^java.lang.String row-key ^java.lang.Class clazz-type]
    (-> this (.retrieve partition-key row-key clazz-type))))

(defn add
  "Adds the table operation at the specified index in the batch operation ArrayList.

  index - An int which represents the index in the batch operation ArrayList to add the table operation at. - `int`
  element - The TableOperation to add to the batch operation. - `com.microsoft.azure.storage.table.TableOperation`"
  ([^TableBatchOperation this ^Integer index ^com.microsoft.azure.storage.table.TableOperation element]
    (-> this (.add index element)))
  (^Boolean [^TableBatchOperation this ^com.microsoft.azure.storage.table.TableOperation element]
    (-> this (.add element))))

(defn clear
  "Clears all table operations from the batch operation."
  ([^TableBatchOperation this]
    (-> this (.clear))))

(defn remove-all
  "Removes all elements of the specified collection from the batch operation.

  c - The collection of elements to remove from the batch operation. - `java.util.Collection`

  returns: true if the objects in the collection were removed successfully. - `boolean`"
  (^Boolean [^TableBatchOperation this ^java.util.Collection c]
    (-> this (.removeAll c))))

(defn merge
  "Adds a table operation to merge the specified entity to the batch operation.

  entity - The TableEntity to merge. - `com.microsoft.azure.storage.table.TableEntity`"
  ([^TableBatchOperation this ^com.microsoft.azure.storage.table.TableEntity entity]
    (-> this (.merge entity))))

