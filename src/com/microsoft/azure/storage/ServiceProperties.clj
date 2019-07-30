(ns com.microsoft.azure.storage.ServiceProperties
  "Represents the analytics properties for the service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage ServiceProperties]))

(defn ->service-properties
  "Constructor.

  Initializes a new instances of the ServiceProperties class."
  (^ServiceProperties []
    (new ServiceProperties )))

(defn set-default-service-version
  "Sets default service version.

  default-service-version - A String which represents the default service version. - `java.lang.String`"
  ([^ServiceProperties this ^java.lang.String default-service-version]
    (-> this (.setDefaultServiceVersion default-service-version))))

(defn set-hour-metrics
  "Sets the hour metrics properties.

  metrics - A MetricsProperties object which represents the hour metrics properties. - `com.microsoft.azure.storage.MetricsProperties`"
  ([^ServiceProperties this ^com.microsoft.azure.storage.MetricsProperties metrics]
    (-> this (.setHourMetrics metrics))))

(defn get-default-service-version
  "Gets default service version.

  returns: A String which represents the default service version. - `java.lang.String`"
  (^java.lang.String [^ServiceProperties this]
    (-> this (.getDefaultServiceVersion))))

(defn set-static-website-properties
  "static-website-properties - The static website properties. - `com.microsoft.azure.storage.StaticWebsiteProperties`"
  ([^ServiceProperties this ^com.microsoft.azure.storage.StaticWebsiteProperties static-website-properties]
    (-> this (.setStaticWebsiteProperties static-website-properties))))

(defn set-minute-metrics
  "Sets the minute metrics properties.

  metrics - A MetricsProperties object which represents the minute metrics properties. - `com.microsoft.azure.storage.MetricsProperties`"
  ([^ServiceProperties this ^com.microsoft.azure.storage.MetricsProperties metrics]
    (-> this (.setMinuteMetrics metrics))))

(defn get-delete-retention-policy
  "Get the delete retention policy.

  returns: the policy which indicates whether to retain deleted blobs for a period of time. - `com.microsoft.azure.storage.DeleteRetentionPolicy`"
  (^com.microsoft.azure.storage.DeleteRetentionPolicy [^ServiceProperties this]
    (-> this (.getDeleteRetentionPolicy))))

(defn get-cors
  "Gets the Cross-Origin Resource Sharing (CORS) properties.

  returns: A CorsProperties object which represents the CORS properties. - `com.microsoft.azure.storage.CorsProperties`"
  (^com.microsoft.azure.storage.CorsProperties [^ServiceProperties this]
    (-> this (.getCors))))

(defn get-static-website-properties
  "returns: The static website properties. - `com.microsoft.azure.storage.StaticWebsiteProperties`"
  (^com.microsoft.azure.storage.StaticWebsiteProperties [^ServiceProperties this]
    (-> this (.getStaticWebsiteProperties))))

(defn get-minute-metrics
  "Gets the minute metrics properties.

  returns: A MetricsProperties object which represents the minute metrics properties. - `com.microsoft.azure.storage.MetricsProperties`"
  (^com.microsoft.azure.storage.MetricsProperties [^ServiceProperties this]
    (-> this (.getMinuteMetrics))))

(defn get-logging
  "Gets the logging properties.

  returns: A LoggingProperties object which represents the logging properties. - `com.microsoft.azure.storage.LoggingProperties`"
  (^com.microsoft.azure.storage.LoggingProperties [^ServiceProperties this]
    (-> this (.getLogging))))

(defn get-hour-metrics
  "Gets the hour metrics properties.

  returns: A MetricsProperties object which represents the hour metrics properties. - `com.microsoft.azure.storage.MetricsProperties`"
  (^com.microsoft.azure.storage.MetricsProperties [^ServiceProperties this]
    (-> this (.getHourMetrics))))

(defn set-logging
  "Sets the logging properties.

  logging - A LoggingProperties object which represents the logging properties. - `com.microsoft.azure.storage.LoggingProperties`"
  ([^ServiceProperties this ^com.microsoft.azure.storage.LoggingProperties logging]
    (-> this (.setLogging logging))))

(defn set-delete-retention-policy
  "Set the delete retention policy for blobs.

  delete-retention-policy - is the policy which indicates whether to retain deleted blobs for a period of time. - `com.microsoft.azure.storage.DeleteRetentionPolicy`"
  ([^ServiceProperties this ^com.microsoft.azure.storage.DeleteRetentionPolicy delete-retention-policy]
    (-> this (.setDeleteRetentionPolicy delete-retention-policy))))

(defn set-cors
  "Sets the Cross-Origin Resource Sharing (CORS) properties.

  cors - A CorsProperties object which represents the CORS properties. - `com.microsoft.azure.storage.CorsProperties`"
  ([^ServiceProperties this ^com.microsoft.azure.storage.CorsProperties cors]
    (-> this (.setCors cors))))

