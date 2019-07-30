(ns com.microsoft.azure.storage.table.EdmType
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.table EdmType]))

(def NULL
  "Enum Constant.

  Null Represents the absence of a value

  type: com.microsoft.azure.storage.table.EdmType"
  EdmType/NULL)

(def BINARY
  "Enum Constant.

  Edm.Binary Represents fixed- or variable-length binary data

  type: com.microsoft.azure.storage.table.EdmType"
  EdmType/BINARY)

(def BOOLEAN
  "Enum Constant.

  Edm.Boolean Represents the mathematical concept of binary-valued logic

  type: com.microsoft.azure.storage.table.EdmType"
  EdmType/BOOLEAN)

(def BYTE
  "Enum Constant.

  Edm.Byte Represents a unsigned 8-bit integer value

  type: com.microsoft.azure.storage.table.EdmType"
  EdmType/BYTE)

(def DATE_TIME
  "Enum Constant.

  Edm.DateTime Represents date and time with values ranging from 12:00:00 midnight, January 1,
   1753 A.D. through 11:59:59 P.M, December 9999 A.D.

  type: com.microsoft.azure.storage.table.EdmType"
  EdmType/DATE_TIME)

(def DATE_TIME_OFFSET
  "Enum Constant.

  Edm.DateTimeOffset Represents date and time as an Offset in minutes from GMT, with values
   ranging from 12:00:00 midnight, January 1, 1753 A.D. through 11:59:59 P.M, December 9999 A.D

  type: com.microsoft.azure.storage.table.EdmType"
  EdmType/DATE_TIME_OFFSET)

(def DECIMAL
  "Enum Constant.

  Edm.Decimal Represents numeric values with fixed precision and scale. This type can describe a
   numeric value ranging from negative 10^255  1 to positive 10^255 -1

  type: com.microsoft.azure.storage.table.EdmType"
  EdmType/DECIMAL)

(def DOUBLE
  "Enum Constant.

  Edm.Double Represents a floating point number with 15 digits precision that can represent values
   with approximate range of /- 2.23e -308 through /- 1.79e 308

  type: com.microsoft.azure.storage.table.EdmType"
  EdmType/DOUBLE)

(def SINGLE
  "Enum Constant.

  Edm.Single Represents a floating point number with 7 digits precision that can represent values
   with approximate range of /- 1.18e -38 through /- 3.40e 38

  type: com.microsoft.azure.storage.table.EdmType"
  EdmType/SINGLE)

(def GUID
  "Enum Constant.

  Edm.Guid Represents a 16-byte (128-bit) unique identifier value

  type: com.microsoft.azure.storage.table.EdmType"
  EdmType/GUID)

(def INT16
  "Enum Constant.

  Edm.Int16 Represents a signed 16-bit integer value

  type: com.microsoft.azure.storage.table.EdmType"
  EdmType/INT16)

(def INT32
  "Enum Constant.

  Edm.Int32 Represents a signed 32-bit integer value

  type: com.microsoft.azure.storage.table.EdmType"
  EdmType/INT32)

(def INT64
  "Enum Constant.

  Edm.Int64 Represents a signed 64-bit integer value

  type: com.microsoft.azure.storage.table.EdmType"
  EdmType/INT64)

(def SBYTE
  "Enum Constant.

  Edm.SByte Represents a signed 8-bit integer value

  type: com.microsoft.azure.storage.table.EdmType"
  EdmType/SBYTE)

(def STRING
  "Enum Constant.

  Edm.String Represents fixed- or variable-length character data

  type: com.microsoft.azure.storage.table.EdmType"
  EdmType/STRING)

(def TIME
  "Enum Constant.

  Edm.Time Represents the time of day with values ranging from 0:00:00.x to 23:59:59.y, where x
   and y depend upon the precision

  type: com.microsoft.azure.storage.table.EdmType"
  EdmType/TIME)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EdmType c : EdmType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.table.EdmType[]`"
  ([]
    (EdmType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.table.EdmType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.table.EdmType [^java.lang.String name]
    (EdmType/valueOf name)))

(defn *parse
  "Parses an EDM data type name and return the matching EdmType enumeration value. A null or
   empty value parameter is matched as STRING. Note that only the subset of EDM data types
   supported in Microsoft Azure Table storage is parsed, consisting of BINARY, BOOLEAN,
   BYTE , DATE_TIME, DOUBLE, GUID, INT32, INT64, and
   STRING. Any
   other type will cause an IllegalArgumentException to be thrown.

  value - A String containing the name of an EDM data type. - `java.lang.String`

  returns: The EdmType enumeration value matching the specified EDM data type. - `com.microsoft.azure.storage.table.EdmType`

  throws: java.lang.IllegalArgumentException - if an EDM data type not supported in Microsoft Azure Table storage is passed as an argument."
  (^com.microsoft.azure.storage.table.EdmType [^java.lang.String value]
    (EdmType/parse value)))

(defn to-string
  "Returns the name of the EDM data type corresponding to the enumeration value.

  returns: A String containing the name of the EDM data type. - `java.lang.String`"
  (^java.lang.String [^EdmType this]
    (-> this (.toString))))

