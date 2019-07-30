(ns com.microsoft.azure.storage.SharedAccessProtocols
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage SharedAccessProtocols]))

(def HTTPS_ONLY
  "Enum Constant.

  Permission to use SAS only through https granted.

  type: com.microsoft.azure.storage.SharedAccessProtocols"
  SharedAccessProtocols/HTTPS_ONLY)

(def HTTPS_HTTP
  "Enum Constant.

  Permission to use SAS only through https or http granted.

  type: com.microsoft.azure.storage.SharedAccessProtocols"
  SharedAccessProtocols/HTTPS_HTTP)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (SharedAccessProtocols c : SharedAccessProtocols.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.SharedAccessProtocols[]`"
  ([]
    (SharedAccessProtocols/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.SharedAccessProtocols`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.SharedAccessProtocols [^java.lang.String name]
    (SharedAccessProtocols/valueOf name)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SharedAccessProtocols this]
    (-> this (.toString))))

