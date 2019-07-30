(ns com.microsoft.azure.storage.file.FileServiceProperties
  "Class representing a set of properties pertaining to the Azure File service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.file FileServiceProperties]))

(defn ->file-service-properties
  "Constructor.

  Generate a FileServiceProperties from a new ServiceProperties."
  (^FileServiceProperties []
    (new FileServiceProperties )))

(defn get-cors
  "Gets the Cross-Origin Resource Sharing (CORS) properties.

  returns: A CorsProperties object which represents the CORS properties. - `com.microsoft.azure.storage.CorsProperties`"
  (^com.microsoft.azure.storage.CorsProperties [^FileServiceProperties this]
    (-> this (.getCors))))

(defn set-cors
  "Sets the Cross-Origin Resource Sharing (CORS) properties.

  cors - A CorsProperties object which represents the CORS properties. - `com.microsoft.azure.storage.CorsProperties`"
  ([^FileServiceProperties this ^com.microsoft.azure.storage.CorsProperties cors]
    (-> this (.setCors cors))))

(defn get-hour-metrics
  "Gets the hour metrics properties.

  returns: A MetricsProperties object which represents the hour metrics properties. - `com.microsoft.azure.storage.MetricsProperties`"
  (^com.microsoft.azure.storage.MetricsProperties [^FileServiceProperties this]
    (-> this (.getHourMetrics))))

(defn set-hour-metrics
  "Sets the hour metrics properties.

  metrics - A MetricsProperties object which represents the hour metrics properties. - `com.microsoft.azure.storage.MetricsProperties`"
  ([^FileServiceProperties this ^com.microsoft.azure.storage.MetricsProperties metrics]
    (-> this (.setHourMetrics metrics))))

(defn get-minute-metrics
  "Gets the minute metrics properties.

  returns: A MetricsProperties object which represents the minute metrics properties. - `com.microsoft.azure.storage.MetricsProperties`"
  (^com.microsoft.azure.storage.MetricsProperties [^FileServiceProperties this]
    (-> this (.getMinuteMetrics))))

(defn set-minute-metrics
  "Sets the minute metrics properties.

  metrics - A MetricsProperties object which represents the minute metrics properties. - `com.microsoft.azure.storage.MetricsProperties`"
  ([^FileServiceProperties this ^com.microsoft.azure.storage.MetricsProperties metrics]
    (-> this (.setMinuteMetrics metrics))))

