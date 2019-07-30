(ns com.microsoft.azure.storage.table.TableOperation
  "A class which represents a single table operation.

  Use the static factory methods to construct TableOperation instances for operations on tables that insert,
  update, merge, delete, replace or retrieve table entities. To execute a TableOperation instance, call the
  execute method on a CloudTableClient instance. A TableOperation may be executed directly
  or as part of a TableBatchOperation. If a TableOperation returns an entity result, it is stored in
  the corresponding TableResult returned by the execute method."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.table TableOperation]))

(defn *delete
  "A static factory method returning a TableOperation instance to delete the specified entity from Microsoft
   Azure storage. To execute this TableOperation on a given table, call the
   CloudTable.execute(TableOperation) method on a CloudTableClient instance with the

  entity - The object instance implementing TableEntity to associate with the operation. - `com.microsoft.azure.storage.table.TableEntity`

  returns: A new TableOperation instance to insert the table entity. - `com.microsoft.azure.storage.table.TableOperation`"
  (^com.microsoft.azure.storage.table.TableOperation [^com.microsoft.azure.storage.table.TableEntity entity]
    (TableOperation/delete entity)))

(defn *insert
  "A static factory method returning a TableOperation instance to insert the specified entity into
   Microsoft Azure storage. To execute this TableOperation on a given table, call the
   CloudTable.execute(TableOperation) method on a CloudTableClient instance with the

  entity - The object instance implementing TableEntity to associate with the operation. - `com.microsoft.azure.storage.table.TableEntity`
  echo-content - The boolean representing whether the message payload should be returned in the response. - `boolean`

  returns: A new TableOperation instance to insert the table entity. - `com.microsoft.azure.storage.table.TableOperation`"
  (^com.microsoft.azure.storage.table.TableOperation [^com.microsoft.azure.storage.table.TableEntity entity ^Boolean echo-content]
    (TableOperation/insert entity echo-content))
  (^com.microsoft.azure.storage.table.TableOperation [^com.microsoft.azure.storage.table.TableEntity entity]
    (TableOperation/insert entity)))

(defn *insert-or-merge
  "A static factory method returning a TableOperation instance to merge the specified entity into
   Microsoft Azure storage, or insert it if it does not exist. To execute this TableOperation on a given
   table, call
   the CloudTable.execute(TableOperation) method on a CloudTableClient instance with
   the table name and the TableOperation as arguments.

  entity - The object instance implementing TableEntity to associate with the operation. - `com.microsoft.azure.storage.table.TableEntity`

  returns: A new TableOperation instance for inserting or merging the table entity. - `com.microsoft.azure.storage.table.TableOperation`"
  (^com.microsoft.azure.storage.table.TableOperation [^com.microsoft.azure.storage.table.TableEntity entity]
    (TableOperation/insertOrMerge entity)))

(defn *insert-or-replace
  "A static factory method returning a TableOperation instance to replace the specified entity in
   Microsoft Azure storage, or insert it if it does not exist. To execute this TableOperation on a given
   table, call
   the CloudTable.execute(TableOperation) method on a CloudTableClient instance with
   the table name and the TableOperation as arguments.

  entity - The object instance implementing TableEntity to associate with the operation. - `com.microsoft.azure.storage.table.TableEntity`

  returns: A new TableOperation instance for inserting or replacing the table entity. - `com.microsoft.azure.storage.table.TableOperation`"
  (^com.microsoft.azure.storage.table.TableOperation [^com.microsoft.azure.storage.table.TableEntity entity]
    (TableOperation/insertOrReplace entity)))

(defn *merge
  "A static factory method returning a TableOperation instance to merge the specified table entity into
   Microsoft Azure storage. To execute this TableOperation on a given table, call the
   CloudTable.execute(TableOperation) method on a CloudTableClient instance with the

  entity - The object instance implementing TableEntity to associate with the operation. - `com.microsoft.azure.storage.table.TableEntity`

  returns: A new TableOperation instance for merging the table entity. - `com.microsoft.azure.storage.table.TableOperation`"
  (^com.microsoft.azure.storage.table.TableOperation [^com.microsoft.azure.storage.table.TableEntity entity]
    (TableOperation/merge entity)))

(defn *retrieve
  "A static factory method returning a TableOperation instance to retrieve the specified table entity and
   return it as the specified type. To execute this TableOperation on a given table, call the
   CloudTable.execute(TableOperation) method on a CloudTableClient instance with the

  partition-key - A String which specifies the PartitionKey value for the entity to retrieve. - `java.lang.String`
  row-key - A String which specifies the RowKey value for the entity to retrieve. - `java.lang.String`
  clazz-type - The class type of the table entity object to retrieve. - `java.lang.Class`

  returns: A new TableOperation instance for retrieving the table entity. - `com.microsoft.azure.storage.table.TableOperation`"
  (^com.microsoft.azure.storage.table.TableOperation [^java.lang.String partition-key ^java.lang.String row-key ^java.lang.Class clazz-type]
    (TableOperation/retrieve partition-key row-key clazz-type)))

(defn *replace
  "A static factory method returning a TableOperation instance to replace the specified table entity. To
   execute this TableOperation on a given table, call the
   CloudTable.execute(TableOperation) method.

  entity - The object instance implementing TableEntity to associate with the operation. - `com.microsoft.azure.storage.table.TableEntity`

  returns: A new TableOperation instance for replacing the table entity. - `com.microsoft.azure.storage.table.TableOperation`"
  (^com.microsoft.azure.storage.table.TableOperation [^com.microsoft.azure.storage.table.TableEntity entity]
    (TableOperation/replace entity)))

