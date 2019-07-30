(ns com.microsoft.azure.storage.DeleteRetentionPolicy
  "Represents the policy governing the retention of deleted blobs."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage DeleteRetentionPolicy]))

(defn ->delete-retention-policy
  "Constructor."
  (^DeleteRetentionPolicy []
    (new DeleteRetentionPolicy )))

(defn get-enabled?
  "Return a boolean indicating whether the DeleteRetentionPolicy is enabled.

  returns: A boolean indicating whether a deleted blob or snapshot is retained or immediately removed by a delete operation. - `boolean`"
  (^Boolean [^DeleteRetentionPolicy this]
    (-> this (.getEnabled))))

(defn get-retention-interval-in-days
  "Get the retention interval(in days) of the DeleteRetentionPolicy.

  returns: An Integer which contains the retention interval. - `java.lang.Integer`"
  (^java.lang.Integer [^DeleteRetentionPolicy this]
    (-> this (.getRetentionIntervalInDays))))

(defn set-enabled
  "Set a boolean indicating whether the DeleteRetentionPolicy is enabled.

  enabled - indicates whether the DeleteRetentionPolicy is enabled. - `boolean`"
  ([^DeleteRetentionPolicy this ^Boolean enabled]
    (-> this (.setEnabled enabled))))

(defn set-retention-interval-in-days
  "Set the retention interval in days for the delete retention policy.

  retention-interval-in-days - represents the number of days that a deleted blob is retained. - `java.lang.Integer`"
  ([^DeleteRetentionPolicy this ^java.lang.Integer retention-interval-in-days]
    (-> this (.setRetentionIntervalInDays retention-interval-in-days))))

