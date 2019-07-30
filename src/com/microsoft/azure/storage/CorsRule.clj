(ns com.microsoft.azure.storage.CorsRule
  "Represents a Cross-Origin Resource Sharing (CORS) rule."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage CorsRule]))

(defn ->cors-rule
  "Constructor."
  (^CorsRule []
    (new CorsRule )))

(defn get-allowed-origins
  "Gets the allowed origins.

  returns: A List object which contains the allowed origins. - `java.util.List<java.lang.String>`"
  (^java.util.List [^CorsRule this]
    (-> this (.getAllowedOrigins))))

(defn set-max-age-in-seconds
  "Sets the maximum age in seconds.

  max-age-in-seconds - An int which represents the the maximum age in seconds. - `int`"
  ([^CorsRule this ^Integer max-age-in-seconds]
    (-> this (.setMaxAgeInSeconds max-age-in-seconds))))

(defn set-allowed-origins
  "Sets the allowed origins.

   Limited to 64 origins OR \"*\" to allow all origins, no more than 256 characters each.

  allowed-origins - A List object which contains the allowed origins. - `java.util.List`"
  ([^CorsRule this ^java.util.List allowed-origins]
    (-> this (.setAllowedOrigins allowed-origins))))

(defn get-exposed-headers
  "Gets the exposed headers.

  returns: A List object which contains the exposed headers. - `java.util.List<java.lang.String>`"
  (^java.util.List [^CorsRule this]
    (-> this (.getExposedHeaders))))

(defn get-max-age-in-seconds
  "Gets the maximum age in seconds.

  returns: An int which represents the the maximum age in seconds. - `int`"
  (^Integer [^CorsRule this]
    (-> this (.getMaxAgeInSeconds))))

(defn get-allowed-headers
  "Gets the allowed headers.

  returns: A List object which contains the allowed headers. - `java.util.List<java.lang.String>`"
  (^java.util.List [^CorsRule this]
    (-> this (.getAllowedHeaders))))

(defn set-allowed-headers
  "Sets the allowed headers.

   Limited to 64 defined headers and two prefixed headers, no more than 256 characters each.

  allowed-headers - A List object which contains the allowed headers. - `java.util.List`"
  ([^CorsRule this ^java.util.List allowed-headers]
    (-> this (.setAllowedHeaders allowed-headers))))

(defn get-allowed-methods
  "Gets the allowed methods.

  returns: A List object which contains the allowed methods. - `java.util.EnumSet<com.microsoft.azure.storage.CorsHttpMethods>`"
  (^java.util.EnumSet [^CorsRule this]
    (-> this (.getAllowedMethods))))

(defn set-exposed-headers
  "Sets the exposed headers.

   Limited to 64 defined headers and two prefixed headers, no more than 256 characters each.

  exposed-headers - A List object which contains the exposed headers. - `java.util.List`"
  ([^CorsRule this ^java.util.List exposed-headers]
    (-> this (.setExposedHeaders exposed-headers))))

(defn set-allowed-methods
  "Sets the allowed methods.

  allowed-methods - A List object which contains the allowed methods. - `java.util.EnumSet`"
  ([^CorsRule this ^java.util.EnumSet allowed-methods]
    (-> this (.setAllowedMethods allowed-methods))))

