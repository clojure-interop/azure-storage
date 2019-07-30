(ns com.microsoft.azure.storage.MetricsLevel
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage MetricsLevel]))

(def DISABLED
  "Enum Constant.

  Metrics collection is disabled.

  type: com.microsoft.azure.storage.MetricsLevel"
  MetricsLevel/DISABLED)

(def SERVICE
  "Enum Constant.

  Service-level metrics collection is enabled.

  type: com.microsoft.azure.storage.MetricsLevel"
  MetricsLevel/SERVICE)

(def SERVICE_AND_API
  "Enum Constant.

  Service-level and API metrics collection are enabled.

  type: com.microsoft.azure.storage.MetricsLevel"
  MetricsLevel/SERVICE_AND_API)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (MetricsLevel c : MetricsLevel.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.MetricsLevel[]`"
  ([]
    (MetricsLevel/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.MetricsLevel`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.MetricsLevel [^java.lang.String name]
    (MetricsLevel/valueOf name)))

