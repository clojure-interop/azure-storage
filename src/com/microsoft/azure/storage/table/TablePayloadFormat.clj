(ns com.microsoft.azure.storage.table.TablePayloadFormat
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.table TablePayloadFormat]))

(def JsonFullMetadata
  "Enum Constant.

  Use JSON with full metadata.

  type: com.microsoft.azure.storage.table.TablePayloadFormat"
  TablePayloadFormat/JsonFullMetadata)

(def Json
  "Enum Constant.

  Use JSON with minimal metadata.

  type: com.microsoft.azure.storage.table.TablePayloadFormat"
  TablePayloadFormat/Json)

(def JsonNoMetadata
  "Enum Constant.

  Use JSON with no metadata.

  type: com.microsoft.azure.storage.table.TablePayloadFormat"
  TablePayloadFormat/JsonNoMetadata)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (TablePayloadFormat c : TablePayloadFormat.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.table.TablePayloadFormat[]`"
  ([]
    (TablePayloadFormat/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.table.TablePayloadFormat`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.table.TablePayloadFormat [^java.lang.String name]
    (TablePayloadFormat/valueOf name)))

