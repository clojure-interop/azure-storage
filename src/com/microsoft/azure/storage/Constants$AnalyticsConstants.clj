(ns com.microsoft.azure.storage.Constants$AnalyticsConstants
  "Defines constants for ServiceProperties requests."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage Constants$AnalyticsConstants]))

(defn ->constants.-analytics-constants
  "Constructor."
  (^Constants$AnalyticsConstants []
    (new Constants$AnalyticsConstants )))

(def *-allowed-headers-element
  "Static Constant.

  The XML element for the CORS Rule AllowedHeaders

  type: java.lang.String"
  Constants$AnalyticsConstants/ALLOWED_HEADERS_ELEMENT)

(def *-allowed-methods-element
  "Static Constant.

  The XML element for the CORS Rule AllowedMethods

  type: java.lang.String"
  Constants$AnalyticsConstants/ALLOWED_METHODS_ELEMENT)

(def *-allowed-origins-element
  "Static Constant.

  The XML element for the CORS Rule AllowedOrigins

  type: java.lang.String"
  Constants$AnalyticsConstants/ALLOWED_ORIGINS_ELEMENT)

(def *-cors-element
  "Static Constant.

  The XML element for the CORS

  type: java.lang.String"
  Constants$AnalyticsConstants/CORS_ELEMENT)

(def *-cors-rule-element
  "Static Constant.

  The XML element for the CORS Rules

  type: java.lang.String"
  Constants$AnalyticsConstants/CORS_RULE_ELEMENT)

(def *-days-element
  "Static Constant.

  The XML element for the RetentionPolicy Days.

  type: java.lang.String"
  Constants$AnalyticsConstants/DAYS_ELEMENT)

(def *-default-service-version
  "Static Constant.

  The XML element for the Default Service Version.

  type: java.lang.String"
  Constants$AnalyticsConstants/DEFAULT_SERVICE_VERSION)

(def *-delete-element
  "Static Constant.

  The XML element for the Logging Delete type.

  type: java.lang.String"
  Constants$AnalyticsConstants/DELETE_ELEMENT)

(def *-enabled-element
  "Static Constant.

  The XML element for the RetentionPolicy Enabled.

  type: java.lang.String"
  Constants$AnalyticsConstants/ENABLED_ELEMENT)

(def *-exposed-headers-element
  "Static Constant.

  The XML element for the CORS Rule ExposedHeaders

  type: java.lang.String"
  Constants$AnalyticsConstants/EXPOSED_HEADERS_ELEMENT)

(def *-hour-metrics-element
  "Static Constant.

  The XML element for the Hour Metrics

  type: java.lang.String"
  Constants$AnalyticsConstants/HOUR_METRICS_ELEMENT)

(def *-include-apis-element
  "Static Constant.

  The XML element for the Metrics IncludeAPIs.

  type: java.lang.String"
  Constants$AnalyticsConstants/INCLUDE_APIS_ELEMENT)

(def *-logs-container
  "Static Constant.

  Constant for the logs container.

  type: java.lang.String"
  Constants$AnalyticsConstants/LOGS_CONTAINER)

(def *-logging-element
  "Static Constant.

  The XML element for the Logging

  type: java.lang.String"
  Constants$AnalyticsConstants/LOGGING_ELEMENT)

(def *-max-age-in-seconds-element
  "Static Constant.

  The XML element for the CORS Rule MaxAgeInSeconds

  type: java.lang.String"
  Constants$AnalyticsConstants/MAX_AGE_IN_SECONDS_ELEMENT)

(def *-metrics-capacity-blob
  "Static Constant.

  Constant for the blob capacity metrics table.

  type: java.lang.String"
  Constants$AnalyticsConstants/METRICS_CAPACITY_BLOB)

(def *-metrics-hour-primary-transactions-blob
  "Static Constant.

  Constant for the blob service primary location hourly metrics table.

  type: java.lang.String"
  Constants$AnalyticsConstants/METRICS_HOUR_PRIMARY_TRANSACTIONS_BLOB)

(def *-metrics-hour-primary-transactions-file
  "Static Constant.

  Constant for the file service primary location hourly metrics table.

  type: java.lang.String"
  Constants$AnalyticsConstants/METRICS_HOUR_PRIMARY_TRANSACTIONS_FILE)

(def *-metrics-hour-primary-transactions-table
  "Static Constant.

  Constant for the table service primary location hourly metrics table.

  type: java.lang.String"
  Constants$AnalyticsConstants/METRICS_HOUR_PRIMARY_TRANSACTIONS_TABLE)

(def *-metrics-hour-primary-transactions-queue
  "Static Constant.

  Constant for the queue service primary location hourly metrics table.

  type: java.lang.String"
  Constants$AnalyticsConstants/METRICS_HOUR_PRIMARY_TRANSACTIONS_QUEUE)

(def *-metrics-minute-primary-transactions-blob
  "Static Constant.

  Constant for the blob service primary location minute metrics table.

  type: java.lang.String"
  Constants$AnalyticsConstants/METRICS_MINUTE_PRIMARY_TRANSACTIONS_BLOB)

(def *-metrics-minute-primary-transactions-file
  "Static Constant.

  Constant for the file service primary location minute metrics table.

  type: java.lang.String"
  Constants$AnalyticsConstants/METRICS_MINUTE_PRIMARY_TRANSACTIONS_FILE)

(def *-metrics-minute-primary-transactions-table
  "Static Constant.

  Constant for the table service primary location minute metrics table.

  type: java.lang.String"
  Constants$AnalyticsConstants/METRICS_MINUTE_PRIMARY_TRANSACTIONS_TABLE)

(def *-metrics-minute-primary-transactions-queue
  "Static Constant.

  Constant for the queue service primary location minute metrics table.

  type: java.lang.String"
  Constants$AnalyticsConstants/METRICS_MINUTE_PRIMARY_TRANSACTIONS_QUEUE)

(def *-metrics-hour-secondary-transactions-blob
  "Static Constant.

  Constant for the blob service secondary location hourly metrics table.

  type: java.lang.String"
  Constants$AnalyticsConstants/METRICS_HOUR_SECONDARY_TRANSACTIONS_BLOB)

(def *-metrics-hour-secondary-transactions-file
  "Static Constant.

  Constant for the file service secondary location hourly metrics table.

  type: java.lang.String"
  Constants$AnalyticsConstants/METRICS_HOUR_SECONDARY_TRANSACTIONS_FILE)

(def *-metrics-hour-secondary-transactions-table
  "Static Constant.

  Constant for the table service secondary location hourly metrics table.

  type: java.lang.String"
  Constants$AnalyticsConstants/METRICS_HOUR_SECONDARY_TRANSACTIONS_TABLE)

(def *-metrics-hour-secondary-transactions-queue
  "Static Constant.

  Constant for the queue service secondary location hourly metrics table.

  type: java.lang.String"
  Constants$AnalyticsConstants/METRICS_HOUR_SECONDARY_TRANSACTIONS_QUEUE)

(def *-metrics-minute-secondary-transactions-blob
  "Static Constant.

  Constant for the blob service secondary location minute metrics table.

  type: java.lang.String"
  Constants$AnalyticsConstants/METRICS_MINUTE_SECONDARY_TRANSACTIONS_BLOB)

(def *-metrics-minute-secondary-transactions-file
  "Static Constant.

  Constant for the file service secondary location minute metrics table.

  type: java.lang.String"
  Constants$AnalyticsConstants/METRICS_MINUTE_SECONDARY_TRANSACTIONS_FILE)

(def *-metrics-minute-secondary-transactions-table
  "Static Constant.

  Constant for the table service secondary location minute metrics table.

  type: java.lang.String"
  Constants$AnalyticsConstants/METRICS_MINUTE_SECONDARY_TRANSACTIONS_TABLE)

(def *-metrics-minute-secondary-transactions-queue
  "Static Constant.

  Constant for the queue service secondary location minute metrics table.

  type: java.lang.String"
  Constants$AnalyticsConstants/METRICS_MINUTE_SECONDARY_TRANSACTIONS_QUEUE)

(def *-minute-metrics-element
  "Static Constant.

  The XML element for the Minute Metrics

  type: java.lang.String"
  Constants$AnalyticsConstants/MINUTE_METRICS_ELEMENT)

(def *-read-element
  "Static Constant.

  The XML element for the Logging Read type.

  type: java.lang.String"
  Constants$AnalyticsConstants/READ_ELEMENT)

(def *-retention-policy-element
  "Static Constant.

  The XML element for the RetentionPolicy.

  type: java.lang.String"
  Constants$AnalyticsConstants/RETENTION_POLICY_ELEMENT)

(def *-static-website-element
  "Static Constant.

  The XML element for Static Website.

  type: java.lang.String"
  Constants$AnalyticsConstants/STATIC_WEBSITE_ELEMENT)

(def *-static-website-index-document-element
  "Static Constant.

  The XML element for IndexDocument

  type: java.lang.String"
  Constants$AnalyticsConstants/STATIC_WEBSITE_INDEX_DOCUMENT_ELEMENT)

(def *-static-website-error-document-404-path-element
  "Static Constant.

  THe XML element for ErroDocument404PathName.

  type: java.lang.String"
  Constants$AnalyticsConstants/STATIC_WEBSITE_ERROR_DOCUMENT_404_PATH_ELEMENT)

(def *-storage-service-properties-element
  "Static Constant.

  The XML element for the StorageServiceProperties

  type: java.lang.String"
  Constants$AnalyticsConstants/STORAGE_SERVICE_PROPERTIES_ELEMENT)

(def *-storage-service-stats
  "Static Constant.

  The XML element for the StorageServiceStats

  type: java.lang.String"
  Constants$AnalyticsConstants/STORAGE_SERVICE_STATS)

(def *-version-element
  "Static Constant.

  The XML element for the Version

  type: java.lang.String"
  Constants$AnalyticsConstants/VERSION_ELEMENT)

(def *-write-element
  "Static Constant.

  The XML element for the Logging Write type.

  type: java.lang.String"
  Constants$AnalyticsConstants/WRITE_ELEMENT)

(def *-delete-retention-policy-element
  "Static Constant.

  The XML element for the delete retention policy.

  type: java.lang.String"
  Constants$AnalyticsConstants/DELETE_RETENTION_POLICY_ELEMENT)

