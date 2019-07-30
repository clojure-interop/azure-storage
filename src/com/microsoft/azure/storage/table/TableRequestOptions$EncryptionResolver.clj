(ns com.microsoft.azure.storage.table.TableRequestOptions$EncryptionResolver
  "The interface whose function is used to get the value indicating whether a property should be encrypted or not
  given the partition key, row key, and the property name."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.table TableRequestOptions$EncryptionResolver]))

(defn encryption-resolver
  "Given the partition key, row, key, and the property name, produces a boolean indicating whether to encrypt
   the property.

  pk - A String which represents the partition key. - `java.lang.String`
  rk - A String which represents the row key. - `java.lang.String`
  key - A String which represents the property name. - `java.lang.String`

  returns: A boolean indicating whether the property should be encrypted. - `boolean`"
  (^Boolean [^TableRequestOptions$EncryptionResolver this ^java.lang.String pk ^java.lang.String rk ^java.lang.String key]
    (-> this (.encryptionResolver pk rk key))))

