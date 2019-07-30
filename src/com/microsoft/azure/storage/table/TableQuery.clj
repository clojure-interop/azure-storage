(ns com.microsoft.azure.storage.table.TableQuery
  "A class which represents a query against a specified table. A TableQuery instance aggregates the query
  parameters to use when the query is executed. One of the execute or executeSegmented
  methods of CloudTableClient must be called to execute the query. The parameters are encoded and passed to the
  server when the table query is executed.

  To create a table query with fluent syntax, the from(java.lang.Class<T>) static factory method and the where(java.lang.String),
  select(java.lang.String[]), and take(java.lang.Integer) mutator methods each return a reference to the object which can be chained into a
  single expression. Use the from(Class) static class factory method to create a
  TableQuery instance that executes on the named table with entities of the specified TableEntity
  implementing type. Use the where(java.lang.String) method to specify a filter expression for the entities returned. Use the
  select(java.lang.String[]) method to specify the table entity properties to return. Use the take(java.lang.Integer) method to limit the
  number of entities returned by the query. Note that nothing prevents calling these methods more than once on a
  TableQuery, so the values saved in the TableQuery will be the last encountered in order of
  execution.

  As an example, you could construct a table query using fluent syntax:

  TableQuery<TableServiceEntity> myQuery = TableQuery.from(\"Products\", DynamicTableEntity.class)
      .where(\"(PartitionKey eq 'ProductsMNO') and (RowKey ge 'Napkin')\")
      .take(25)
      .select(new String[] {\"InventoryCount\"});

  This example creates a query on the \"Products\" table for all entities where the PartitionKey value is \"ProductsMNO\"
  and the RowKey value is greater than or equal to \"Napkin\" and requests the first 25 matching entities, selecting only
  the common properties and the property named \"InventoryCount\", and returns them as DynamicTableEntity
  objects.

  Filter expressions for use with the where(java.lang.String) method or setFilterString(java.lang.String) method can be created using
  fluent syntax with the overloaded generateFilterCondition(java.lang.String, java.lang.String, boolean) methods and combineFilters(java.lang.String, java.lang.String, java.lang.String) method, using
  the comparison operators defined in TableQuery.QueryComparisons and the logical operators defined in TableQuery.Operators.
  Note that the first operand in a filter comparison must be a property name, and the second operand must evaluate to a
  constant. The PartitionKey and RowKey property values are String types for comparison purposes.

  The values that may be used in table queries are explained in more detail in the MSDN topic Querying Tables and Entities, but note that
  the space characters within values do not need to be URL-encoded, as this will be done when the query is executed.

  The TableQuery(Class) constructor and from(Class) static factory methods
  require a class type which implements TableEntity and contains a nullary constructor. If the query will be
  executed using an EntityResolver, the caller may specify TableServiceEntity .class as
  the class type."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.table TableQuery]))

(defn ->table-query
  "Constructor.

  Initializes a TableQuery with the specified table entity type. Callers may specify
   TableServiceEntity.class as the class type parameter if no more specialized type is
   required.

  clazz-type - The java.lang.Class of the class T that represents the table entity type for the query. Class T must be a type that implements TableEntity and has a nullary constructor. - `java.lang.Class`"
  (^TableQuery [^java.lang.Class clazz-type]
    (new TableQuery clazz-type))
  (^TableQuery []
    (new TableQuery )))

(defn *from
  "A static factory method that constructs a TableQuery instance and defines its table entity type. The
   method returns the TableQuery instance reference, allowing additional methods to be chained to modify the
   query.

   The created TableQuery instance is specialized for table entities of the specified class type T. Callers
   may specify TableServiceEntity .class as the class type parameter if no more specialized
   type is required.

  clazz-type - The java.lang.Class of the class T implementing the TableEntity interface that represents the table entity type for the query. - `java.lang.Class`

  returns: The TableQuery instance with the entity type specialization set. - `<T extends com.microsoft.azure.storage.table.TableEntity> com.microsoft.azure.storage.table.TableQuery<T>`"
  ([^java.lang.Class clazz-type]
    (TableQuery/from clazz-type)))

(defn *generate-filter-condition
  "Generates a property filter condition string. Creates a formatted string to use in a filter expression that uses
   the specified operation to compare the property with the value, formatted as the specified EdmType.

  property-name - A String which specifies the name of the property to compare. - `java.lang.String`
  operation - A String which specifies the comparison operator to use. - `java.lang.String`
  value - A String which specifies the value to compare with the property. - `java.lang.String`
  edm-type - The EdmType to format the value as. - `com.microsoft.azure.storage.table.EdmType`

  returns: A String which represents the formatted filter condition. - `java.lang.String`"
  (^java.lang.String [^java.lang.String property-name ^java.lang.String operation ^java.lang.String value ^com.microsoft.azure.storage.table.EdmType edm-type]
    (TableQuery/generateFilterCondition property-name operation value edm-type))
  (^java.lang.String [^java.lang.String property-name ^java.lang.String operation ^Boolean value]
    (TableQuery/generateFilterCondition property-name operation value)))

(defn *combine-filters
  "Creates a filter condition using the specified logical operator on two filter conditions.

  filter-a - A String which specifies the first formatted filter condition. - `java.lang.String`
  operator - A String which specifies Operators.AND or Operators.OR. - `java.lang.String`
  filter-b - A String which specifies the first formatted filter condition. - `java.lang.String`

  returns: A String which represents the combined filter expression. - `java.lang.String`"
  (^java.lang.String [^java.lang.String filter-a ^java.lang.String operator ^java.lang.String filter-b]
    (TableQuery/combineFilters filter-a operator filter-b)))

(defn get-take-count
  "Gets the number of entities the query returns specified in the table query. If this value is not
   specified in a table query, a maximum of 1,000 entries will be returned. The number of entities to return may be
   specified with a call to the setTakeCount(java.lang.Integer) or take(java.lang.Integer) methods.

   If the value returned by getTakeCount is greater than 1,000, the query will throw a
   StorageException when executed.

  returns: An Integer which represents the maximum number of entities for the table query to return. - `java.lang.Integer`"
  (^java.lang.Integer [^TableQuery this]
    (-> this (.getTakeCount))))

(defn get-filter-string
  "Gets the filter expression specified in the table query. All entities in the table are returned by
   default if no filter expression is specified in the table query. A filter for the entities to return may be
   specified with a call to the setFilterString(java.lang.String) or where(java.lang.String) methods.

  returns: A String which represents the filter expression used in the query. - `java.lang.String`"
  (^java.lang.String [^TableQuery this]
    (-> this (.getFilterString))))

(defn set-columns
  "Sets the property names of the table entity properties to return when the table query is executed. By default, a
   query will return all properties from the table entity.

   Note that the system properties PartitionKey, RowKey, and Timestamp are
   automatically requested from the table service whether specified in the TableQuery or not.

  columns - An array of String objects which specify the property names of the table entity properties to return when the query is executed. - `java.lang.String[]`"
  ([^TableQuery this columns]
    (-> this (.setColumns columns))))

(defn set-filter-string
  "Sets the filter expression to use in the table query. A filter expression is optional; by default a table query
   will return all entities in the table.

   Filter expressions for use with the setFilterString(java.lang.String) method can be created using fluent syntax with the
   overloaded generateFilterCondition(java.lang.String, java.lang.String, boolean) methods and combineFilters(java.lang.String, java.lang.String, java.lang.String) method, using the comparison
   operators defined in TableQuery.QueryComparisons and the logical operators defined in TableQuery.Operators. Note that
   the first operand in a filter comparison must be a property name, and the second operand must evaluate to a
   constant. The PartitionKey and RowKey property values are String types for comparison purposes. For
   example, to query all entities with a PartitionKey value of \"AccessLogs\" on table query myQuery:

       myQuery.setFilterString(\"PartitionKey eq 'AccessLogs'\");

   The values that may be used in table queries are explained in more detail in the MSDN topic

   Querying Tables and Entities, but note
   that the space characters within values do not need to be URL-encoded, as this will be done when the query is
   executed.

   Note that no more than 15 discrete comparisons are permitted within a filter string.

  filter-string - A String which represents the filter expression to use in the query. - `java.lang.String`"
  ([^TableQuery this ^java.lang.String filter-string]
    (-> this (.setFilterString filter-string))))

(defn get-columns
  "Gets an array of the table entity property names specified in the table query. All properties in the table are
   returned by default if no property names are specified with a select clause in the table query. The table entity
   properties to return may be specified with a call to the setColumns(java.lang.String[]) or select(java.lang.String[]) methods with a
   array of property names as parameter.

   Note that the system properties PartitionKey, RowKey, and Timestamp are
   automatically requested from the table service whether specified in the TableQuery or not.

  returns: An array of String objects which represents the property names of the table entity properties to
           return in the query. - `java.lang.String[]`"
  ([^TableQuery this]
    (-> this (.getColumns))))

(defn set-take-count
  "Sets the upper bound for the number of entities the query returns. If this value is not specified in a table
   query, by default a maximum of 1,000 entries will be returned.

   If the value specified for the takeCount parameter is greater than 1,000, the query will throw a
   StorageException when executed.

  take-count - An Integer which represents the maximum number of entities for the table query to return. - `java.lang.Integer`"
  ([^TableQuery this ^java.lang.Integer take-count]
    (-> this (.setTakeCount take-count))))

(defn where
  "Defines a filter expression for the table query. Only entities that satisfy the specified filter expression will
   be returned by the query. Setting a filter expression is optional; by default, all entities in the table are
   returned if no filter expression is specified in the table query.

   Filter expressions for use with the where(java.lang.String) method can be created using fluent syntax with the overloaded
   generateFilterCondition(java.lang.String, java.lang.String, boolean) methods and combineFilters(java.lang.String, java.lang.String, java.lang.String) method, using the comparison operators
   defined in TableQuery.QueryComparisons and the logical operators defined in TableQuery.Operators. Note that the first
   operand in a filter comparison must be a property name, and the second operand must evaluate to a constant. The
   PartitionKey and RowKey property values are String types for comparison purposes. For example, to
   query all entities with a PartitionKey value of \"AccessLogs\" on table query myQuery:

       myQuery = myQuery.where(\"PartitionKey eq 'AccessLogs'\");

   The values that may be used in table queries are explained in more detail in the MSDN topic

   Querying Tables and Entities, but note
   that the space characters within values do not need to be URL-encoded, as this will be done when the query is
   executed.

   Note that no more than 15 discrete comparisons are permitted within a filter string.

  filter - A String which specifies the filter expression to apply to the table query. - `java.lang.String`

  returns: A reference to the TableQuery instance with the filter on entities to return set. - `com.microsoft.azure.storage.table.TableQuery<T>`"
  (^com.microsoft.azure.storage.table.TableQuery [^TableQuery this ^java.lang.String filter]
    (-> this (.where filter))))

(defn take
  "Defines the upper bound for the number of entities the query returns. If this value is not specified in a table
   query, by default a maximum of 1,000 entries will be returned.

   If the value specified for the take parameter is greater than 1,000, the query will throw a
   StorageException when executed.

  take - An Integer which represents the maximum number of entities for the table query to return. - `java.lang.Integer`

  returns: A reference to the TableQuery instance with the number of entities to return set. - `com.microsoft.azure.storage.table.TableQuery<T>`"
  (^com.microsoft.azure.storage.table.TableQuery [^TableQuery this ^java.lang.Integer take]
    (-> this (.take take))))

(defn select
  "Defines the property names of the table entity properties to return when the table query is executed. The
   select clause is optional on a table query, used to limit the table properties returned from the
   server. By default, a query will return all properties from the table entity.

   Note that the system properties PartitionKey, RowKey, and Timestamp are
   automatically requested from the table service whether specified in the TableQuery or not.

  columns - An array of String objects which specify the property names of the table entity properties to return when the query is executed. - `java.lang.String[]`

  returns: A reference to the TableQuery instance with the table entity properties to return set. - `com.microsoft.azure.storage.table.TableQuery<T>`"
  (^com.microsoft.azure.storage.table.TableQuery [^TableQuery this columns]
    (-> this (.select columns))))

(defn set-clazz-type
  "Sets the class type of the table entities returned by the query. A class type is required to execute a table
   query.

   Callers may specify TableServiceEntity.class as the class type parameter if no more
   specialized type is required.

  clazz-type - The java.lang.Class of the class T that represents the table entity type for the query. Class T must be a type that implements TableEntity and has a nullary constructor, - `java.lang.Class`"
  ([^TableQuery this ^java.lang.Class clazz-type]
    (-> this (.setClazzType clazz-type))))

(defn get-clazz-type
  "Gets the class type of the table entities returned by the query.

  returns: The java.lang.Class of the class T that represents the table entity type for
           the query. - `java.lang.Class<T>`"
  (^java.lang.Class [^TableQuery this]
    (-> this (.getClazzType))))

