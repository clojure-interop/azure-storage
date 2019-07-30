(ns com.microsoft.azure.storage.file.CopyStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.file CopyStatus]))

(def UNSPECIFIED
  "Enum Constant.

  The copy status is not specified.

  type: com.microsoft.azure.storage.file.CopyStatus"
  CopyStatus/UNSPECIFIED)

(def INVALID
  "Enum Constant.

  The copy status is invalid.

  type: com.microsoft.azure.storage.file.CopyStatus"
  CopyStatus/INVALID)

(def PENDING
  "Enum Constant.

  The copy operation is pending.

  type: com.microsoft.azure.storage.file.CopyStatus"
  CopyStatus/PENDING)

(def SUCCESS
  "Enum Constant.

  The copy operation succeeded.

  type: com.microsoft.azure.storage.file.CopyStatus"
  CopyStatus/SUCCESS)

(def ABORTED
  "Enum Constant.

  The copy operation has been aborted.

  type: com.microsoft.azure.storage.file.CopyStatus"
  CopyStatus/ABORTED)

(def FAILED
  "Enum Constant.

  The copy operation encountered an error.

  type: com.microsoft.azure.storage.file.CopyStatus"
  CopyStatus/FAILED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (CopyStatus c : CopyStatus.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.file.CopyStatus[]`"
  ([]
    (CopyStatus/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.file.CopyStatus`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.file.CopyStatus [^java.lang.String name]
    (CopyStatus/valueOf name)))

