(ns com.microsoft.azure.storage.LocationMode
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage LocationMode]))

(def PRIMARY_ONLY
  "Enum Constant.

  Requests should always be sent to the primary location.

  type: com.microsoft.azure.storage.LocationMode"
  LocationMode/PRIMARY_ONLY)

(def PRIMARY_THEN_SECONDARY
  "Enum Constant.

  Requests should always be sent to the primary location first. If the request fails, it should be sent to the
   secondary location.

  type: com.microsoft.azure.storage.LocationMode"
  LocationMode/PRIMARY_THEN_SECONDARY)

(def SECONDARY_ONLY
  "Enum Constant.

  Requests should always be sent to the secondary location.

  type: com.microsoft.azure.storage.LocationMode"
  LocationMode/SECONDARY_ONLY)

(def SECONDARY_THEN_PRIMARY
  "Enum Constant.

  Requests should always be sent to the secondary location first. If the request fails, it should be sent to the
   primary location.

  type: com.microsoft.azure.storage.LocationMode"
  LocationMode/SECONDARY_THEN_PRIMARY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (LocationMode c : LocationMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.LocationMode[]`"
  ([]
    (LocationMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.LocationMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.LocationMode [^java.lang.String name]
    (LocationMode/valueOf name)))

