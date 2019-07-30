(ns com.microsoft.azure.storage.file.FileRange
  "Represents a range of bytes in a file."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.file FileRange]))

(defn ->file-range
  "Constructor.

  Creates an instance of the FileRange class.

  start - A long which represents the starting offset. - `long`
  end - A long which represents the ending offset. - `long`"
  (^FileRange [^Long start ^Long end]
    (new FileRange start end)))

(defn get-end-offset
  "Gets the ending offset.

  returns: A long which represents the ending offset. - `long`"
  (^Long [^FileRange this]
    (-> this (.getEndOffset))))

(defn get-start-offset
  "Gets the starting offset.

  returns: A long which represents the starting offset. - `long`"
  (^Long [^FileRange this]
    (-> this (.getStartOffset))))

(defn set-end-offset
  "Sets the ending offset.

  end-offset - A long which specifies the ending offset. - `long`"
  ([^FileRange this ^Long end-offset]
    (-> this (.setEndOffset end-offset))))

(defn set-start-offset
  "Sets the starting offset.

  start-offset - A long which specifies the starting offset. - `long`"
  ([^FileRange this ^Long start-offset]
    (-> this (.setStartOffset start-offset))))

(defn to-string
  "Returns the content of the file range as a string.

  returns: A String which represents the contents of the file range. - `java.lang.String`"
  (^java.lang.String [^FileRange this]
    (-> this (.toString))))

