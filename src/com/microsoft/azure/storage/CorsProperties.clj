(ns com.microsoft.azure.storage.CorsProperties
  "Class representing the service properties pertaining to CORS."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage CorsProperties]))

(defn ->cors-properties
  "Constructor."
  (^CorsProperties []
    (new CorsProperties )))

(defn get-cors-rules
  "returns: the corsRules - `java.util.List<com.microsoft.azure.storage.CorsRule>`"
  (^java.util.List [^CorsProperties this]
    (-> this (.getCorsRules))))

