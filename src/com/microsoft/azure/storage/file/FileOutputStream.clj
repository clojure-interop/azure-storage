(ns com.microsoft.azure.storage.file.FileOutputStream
  "The class is an append-only stream for writing into storage."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.file FileOutputStream]))

(defn close
  "Closes this output stream and releases any system resources associated with this stream. If any data remains in
   the buffer it is committed to the service.

  throws: java.io.IOException - If an I/O error occurs."
  ([^FileOutputStream this]
    (-> this (.close))))

(defn flush
  "Flushes this output stream and forces any buffered output bytes to be written out. If any data remains in the
   buffer it is committed to the service.

  throws: java.io.IOException - If an I/O error occurs."
  ([^FileOutputStream this]
    (-> this (.flush))))

(defn write
  "Writes length bytes from the specified byte array starting at offset to this output stream.

  data - A byte array which represents the data to write. - `byte[]`
  offset - An int which represents the start offset in the data. - `int`
  length - An int which represents the number of bytes to write. - `int`

  throws: java.io.IOException - If an I/O error occurs. In particular, an IOException may be thrown if the output stream has been closed."
  ([^FileOutputStream this data ^Integer offset ^Integer length]
    (-> this (.write data offset length)))
  ([^FileOutputStream this ^java.io.InputStream source-stream ^Long write-length]
    (-> this (.write source-stream write-length)))
  ([^FileOutputStream this data]
    (-> this (.write data))))

