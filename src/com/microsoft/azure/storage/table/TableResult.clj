(ns com.microsoft.azure.storage.table.TableResult
  "A class which represents the result of a table operation. The TableResult class encapsulates the HTTP
  response
  and any table entity results returned by the Storage Service REST API operation called for a particular
  TableOperation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.table TableResult]))

(defn ->table-result
  "Constructor.

  Initializes a TableResult instance with the specified HTTP status code.

  http-status-code - An int which represents the HTTP status code for the table operation returned by the server. - `int`"
  (^TableResult [^Integer http-status-code]
    (new TableResult http-status-code))
  (^TableResult []
    (new TableResult )))

(defn get-etag
  "Gets the ETag returned with the table operation results. The server will return the same ETag value for a
   table, entity, or entity group returned by an operation as long as it is unchanged on the server.

  returns: A String containing the ETag returned by the server with the table operation results. - `java.lang.String`"
  (^java.lang.String [^TableResult this]
    (-> this (.getEtag))))

(defn get-http-status-code
  "Gets the HTTP status code returned by a table operation request.

  returns: An int which represents the HTTP status code for the table operation returned by the server. - `int`"
  (^Integer [^TableResult this]
    (-> this (.getHttpStatusCode))))

(defn get-properties
  "Gets the map of properties for a table entity returned by the table operation.

  returns: A java.util.HashMap of String property names to EntityProperty data
           typed values representing the properties of a table entity. - `java.util.HashMap<java.lang.String,com.microsoft.azure.storage.table.EntityProperty>`"
  (^java.util.HashMap [^TableResult this]
    (-> this (.getProperties))))

(defn get-result
  "Gets the result returned by the table operation as an Object.

  returns: An Object reference which represents the result returned by the table operation. - `java.lang.Object`"
  (^java.lang.Object [^TableResult this]
    (-> this (.getResult))))

(defn get-result-as-type
  "Gets the result returned by the table operation as an instance of the specified type.

  returns: An T reference which represents the result returned by the table operation. - `<T> T`"
  ([^TableResult this]
    (-> this (.getResultAsType))))

