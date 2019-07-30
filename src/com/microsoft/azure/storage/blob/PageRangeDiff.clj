(ns com.microsoft.azure.storage.blob.PageRangeDiff
  "Represents a range of pages in a page blob which have changed since the previous snapshot specified."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob PageRangeDiff]))

(defn cleared?
  "Indicates whether the page range was cleared.

  returns: True if the page range is a cleared range, false otherwise. - `boolean`"
  (^Boolean [^PageRangeDiff this]
    (-> this (.isCleared))))

