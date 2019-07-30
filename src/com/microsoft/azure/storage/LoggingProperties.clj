(ns com.microsoft.azure.storage.LoggingProperties
  "Represents the logging properties for the analytics service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage LoggingProperties]))

(defn ->logging-properties
  "Constructor."
  (^LoggingProperties []
    (new LoggingProperties )))

(defn get-log-operation-types
  "Gets an EnumSet of LoggingOperations that represents which storage operations should be logged.

  returns: An EnumSet of LoggingOperations. - `java.util.EnumSet<com.microsoft.azure.storage.LoggingOperations>`"
  (^java.util.EnumSet [^LoggingProperties this]
    (-> this (.getLogOperationTypes))))

(defn get-retention-interval-in-days
  "Gets the retention interval (in days).

  returns: An Integer which contains the retention interval. - `java.lang.Integer`"
  (^java.lang.Integer [^LoggingProperties this]
    (-> this (.getRetentionIntervalInDays))))

(defn get-version
  "Gets the analytics version.

  returns: A String which contains the version. - `java.lang.String`"
  (^java.lang.String [^LoggingProperties this]
    (-> this (.getVersion))))

(defn set-log-operation-types
  "Sets the LoggingOperations for which storage operations should be logged.

  log-operation-types - An EnumSet of LoggingOperations to set. - `java.util.EnumSet`"
  ([^LoggingProperties this ^java.util.EnumSet log-operation-types]
    (-> this (.setLogOperationTypes log-operation-types))))

(defn set-retention-interval-in-days
  "Sets the retention interval (in days).

  retention-interval-in-days - An Integer which contains the retention interval to set. - `java.lang.Integer`"
  ([^LoggingProperties this ^java.lang.Integer retention-interval-in-days]
    (-> this (.setRetentionIntervalInDays retention-interval-in-days))))

(defn set-version
  "Sets the analytics version.

  version - A String which contains the version to set. - `java.lang.String`"
  ([^LoggingProperties this ^java.lang.String version]
    (-> this (.setVersion version))))

