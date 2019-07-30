(ns com.microsoft.azure.storage.blob.PageRange
  "Represents a range of pages in a page blob."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob PageRange]))

(defn ->page-range
  "Constructor.

  Creates an instance of the PageRange class.

  start - A long which represents the starting offset. - `long`
  end - A long which represents the ending offset. - `long`"
  (^PageRange [^Long start ^Long end]
    (new PageRange start end)))

(defn get-end-offset
  "Gets the ending offset.

  returns: A long which represents the ending offset. - `long`"
  (^Long [^PageRange this]
    (-> this (.getEndOffset))))

(defn get-start-offset
  "Gets the starting offset.

  returns: A long which represents the starting offset. - `long`"
  (^Long [^PageRange this]
    (-> this (.getStartOffset))))

(defn set-end-offset
  "Sets the ending offset.

  end-offset - A long which specifies the ending offset. - `long`"
  ([^PageRange this ^Long end-offset]
    (-> this (.setEndOffset end-offset))))

(defn set-start-offset
  "Sets the starting offset.

  start-offset - A long which specifies the starting offset. - `long`"
  ([^PageRange this ^Long start-offset]
    (-> this (.setStartOffset start-offset))))

(defn to-string
  "Returns the content of the page range as a string.

  returns: A String which represents the contents of the page range. - `java.lang.String`"
  (^java.lang.String [^PageRange this]
    (-> this (.toString))))

