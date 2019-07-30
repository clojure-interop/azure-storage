(ns com.microsoft.azure.storage.MetricsProperties
  "Represents the metrics properties for the analytics service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage MetricsProperties]))

(defn ->metrics-properties
  "Constructor."
  (^MetricsProperties []
    (new MetricsProperties )))

(defn get-metrics-level
  "Gets the MetricsLevel for the analytics service.

  returns: The MetricsLevel. - `com.microsoft.azure.storage.MetricsLevel`"
  (^com.microsoft.azure.storage.MetricsLevel [^MetricsProperties this]
    (-> this (.getMetricsLevel))))

(defn get-retention-interval-in-days
  "Gets the metrics retention interval (in days).

  returns: An Integer which contains the retention interval. - `java.lang.Integer`"
  (^java.lang.Integer [^MetricsProperties this]
    (-> this (.getRetentionIntervalInDays))))

(defn get-version
  "Gets the analytics version.

  returns: A String which contains the analytics version. - `java.lang.String`"
  (^java.lang.String [^MetricsProperties this]
    (-> this (.getVersion))))

(defn set-metrics-level
  "Sets the MetricsLevel for the analytics service.

  metrics-level - The MetricsLevel to set. - `com.microsoft.azure.storage.MetricsLevel`"
  ([^MetricsProperties this ^com.microsoft.azure.storage.MetricsLevel metrics-level]
    (-> this (.setMetricsLevel metrics-level))))

(defn set-retention-interval-in-days
  "Sets the retention interval (in days).

  retention-interval-in-days - An Integer which contains the retention interval to set. - `java.lang.Integer`"
  ([^MetricsProperties this ^java.lang.Integer retention-interval-in-days]
    (-> this (.setRetentionIntervalInDays retention-interval-in-days))))

(defn set-version
  "Sets the analytics version.

  version - A String which contains the analytics version to set. - `java.lang.String`"
  ([^MetricsProperties this ^java.lang.String version]
    (-> this (.setVersion version))))

