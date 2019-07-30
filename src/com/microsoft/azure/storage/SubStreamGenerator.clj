(ns com.microsoft.azure.storage.SubStreamGenerator
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage SubStreamGenerator]))

(defn ->sub-stream-generator
  "Constructor.

  wrapped-stream - `java.io.InputStream`
  total-blocks - `int`
  block-size - `long`"
  (^SubStreamGenerator [^java.io.InputStream wrapped-stream ^Integer total-blocks ^Long block-size]
    (new SubStreamGenerator wrapped-stream total-blocks block-size)))

(defn set-last-block-size
  "block-size - `long`"
  ([^SubStreamGenerator this ^Long block-size]
    (-> this (.setLastBlockSize block-size))))

(defn iterator
  "returns: `java.util.Iterator<java.io.InputStream>`"
  (^java.util.Iterator [^SubStreamGenerator this]
    (-> this (.iterator))))

