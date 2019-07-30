(ns com.microsoft.azure.storage.table.TableRequestOptions$PropertyResolver
  "The interface whose function is used to get the EdmType for an entity property
  given the partition key, row, key, and the property name, if the interface is implemented"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.table TableRequestOptions$PropertyResolver]))

(defn property-resolver
  "Given the partition key, row, key, and the property name, produces the EdmType

  pk - A String which represents the partition key. - `java.lang.String`
  rk - A String which represents the row key. - `java.lang.String`
  key - A String which represents the property name. - `java.lang.String`
  value - A String which represents the property value. - `java.lang.String`

  returns: The EdmType of the property. - `com.microsoft.azure.storage.table.EdmType`"
  (^com.microsoft.azure.storage.table.EdmType [^TableRequestOptions$PropertyResolver this ^java.lang.String pk ^java.lang.String rk ^java.lang.String key ^java.lang.String value]
    (-> this (.propertyResolver pk rk key value))))

