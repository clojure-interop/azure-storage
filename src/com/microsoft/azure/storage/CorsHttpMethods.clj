(ns com.microsoft.azure.storage.CorsHttpMethods
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage CorsHttpMethods]))

(def GET
  "Enum Constant.

  type: com.microsoft.azure.storage.CorsHttpMethods"
  CorsHttpMethods/GET)

(def HEAD
  "Enum Constant.

  type: com.microsoft.azure.storage.CorsHttpMethods"
  CorsHttpMethods/HEAD)

(def POST
  "Enum Constant.

  type: com.microsoft.azure.storage.CorsHttpMethods"
  CorsHttpMethods/POST)

(def PUT
  "Enum Constant.

  type: com.microsoft.azure.storage.CorsHttpMethods"
  CorsHttpMethods/PUT)

(def DELETE
  "Enum Constant.

  type: com.microsoft.azure.storage.CorsHttpMethods"
  CorsHttpMethods/DELETE)

(def TRACE
  "Enum Constant.

  type: com.microsoft.azure.storage.CorsHttpMethods"
  CorsHttpMethods/TRACE)

(def OPTIONS
  "Enum Constant.

  type: com.microsoft.azure.storage.CorsHttpMethods"
  CorsHttpMethods/OPTIONS)

(def CONNECT
  "Enum Constant.

  type: com.microsoft.azure.storage.CorsHttpMethods"
  CorsHttpMethods/CONNECT)

(def MERGE
  "Enum Constant.

  type: com.microsoft.azure.storage.CorsHttpMethods"
  CorsHttpMethods/MERGE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (CorsHttpMethods c : CorsHttpMethods.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.CorsHttpMethods[]`"
  ([]
    (CorsHttpMethods/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.CorsHttpMethods`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.CorsHttpMethods [^java.lang.String name]
    (CorsHttpMethods/valueOf name)))

