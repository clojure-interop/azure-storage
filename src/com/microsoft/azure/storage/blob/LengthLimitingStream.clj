(ns com.microsoft.azure.storage.blob.LengthLimitingStream
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob LengthLimitingStream]))

(defn ->length-limiting-stream
  "Constructor.

  wrapped-stream - `java.io.OutputStream`
  start - `long`
  length - `java.lang.Long`"
  (^LengthLimitingStream [^java.io.OutputStream wrapped-stream ^Long start ^java.lang.Long length]
    (new LengthLimitingStream wrapped-stream start length)))

(defn write
  "Description copied from class: BlobOutputStream

  data - A byte array which represents the data to write. - `byte[]`
  offset - An int which represents the start offset in the data. - `int`
  length - An int which represents the number of bytes to write. - `int`

  throws: java.io.IOException - If an I/O error occurs. In particular, an IOException may be thrown if the output stream has been closed."
  ([^LengthLimitingStream this data ^Integer offset ^Integer length]
    (-> this (.write data offset length)))
  ([^LengthLimitingStream this ^java.io.InputStream source-stream ^Long write-length]
    (-> this (.write source-stream write-length))))

(defn flush
  "Description copied from class: BlobOutputStream

  throws: java.io.IOException - If an I/O error occurs."
  ([^LengthLimitingStream this]
    (-> this (.flush))))

(defn close
  "Description copied from class: BlobOutputStream

  throws: java.io.IOException - If an I/O error occurs."
  ([^LengthLimitingStream this]
    (-> this (.close))))

