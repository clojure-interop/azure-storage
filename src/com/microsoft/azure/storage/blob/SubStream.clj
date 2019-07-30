(ns com.microsoft.azure.storage.blob.SubStream
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob SubStream]))

(defn ->sub-stream
  "Constructor.

  Creates a new substream instance that partitions the wrapped stream source from
   startIndex up to streamLength. Each substream instance that wraps the same
   underlying InputStream must share the same mutual exclusion  lock to avoid race
   conditions from concurrent operations.

  source - The markable InputStream to be wrapped. - `java.io.InputStream`
  start-index - A valid index in the wrapped stream where the substream should logically begin. - `long`
  stream-length - The length of the substream. - `long`
  lock - An intrinsic lock to ensure thread-safe, concurrent operations on substream instances wrapping the same InputStream. - `java.lang.Object`"
  (^SubStream [^java.io.InputStream source ^Long start-index ^Long stream-length ^java.lang.Object lock]
    (new SubStream source start-index stream-length lock)))

(defn get-input-stream
  "returns: `java.io.InputStream`"
  (^java.io.InputStream [^SubStream this]
    (-> this (.getInputStream))))

(defn get-length
  "returns: `long`"
  (^Long [^SubStream this]
    (-> this (.getLength))))

(defn read
  "Reads up to len bytes of data from the substream.  Buffers data from the wrapped stream
   in order to minimize skip and read overhead. The wrappedstream will only be invoked if the readBuffer
   cannot fulfil the the read request.
   In order to ensure valid results, the wrapped stream must be marked prior to reading from the substream.
   This allows us to reset to the relative substream position in the wrapped stream.
   The number of bytes actually read is returned as an integer. All these operations are done
   synchronously within an intrinsic lock to ensure other concurrent requests by substream instances
   do not result in race conditions.

    The underlying call to the read of the wrapped stream will blocks until input data
   is available, end of file is detected, or an exception is thrown.

    If len is zero, then no bytes are read and
   0 is returned; otherwise, there is an attempt to read at
   least one byte. If no byte is available because the substream is at end of
   file, the value -1 is returned; otherwise, at least one
   byte is read and stored into b.

  b - the buffer into which the data is read. - `byte[]`
  off - the start offset in array b at which the data is written. - `int`
  len - the maximum number of bytes to read. - `int`

  returns: the total number of bytes read into the buffer, or
   -1 if there is no more data because the end of
   the stream has been reached. - `int`

  throws: java.io.IOException - If the first byte cannot be read for any reason other than end of file, or if the wrapped stream has been closed, or if some other I/O error occurs."
  (^Integer [^SubStream this b ^Integer off ^Integer len]
    (-> this (.read b off len)))
  (^Integer [^SubStream this b]
    (-> this (.read b)))
  (^Integer [^SubStream this]
    (-> this (.read))))

(defn skip
  "Advances the current position of the substream by n.
   The skip method does not invoke the underlying  skip method
   of the wrapped stream class. The actual skipping of bytes will be accounted for
   during subsequent substream read operations.

  n - the number of bytes to be effectively skipped. - `long`

  returns: the actual number of bytes skipped. - `long`"
  (^Long [^SubStream this ^Long n]
    (-> this (.skip n))))

(defn mark
  "Marks the current position in the substream. A subsequent call to
   the reset method will reposition the stream to this stored position.

  readlimit - the maximum limit of bytes that can be read before the mark position becomes invalid. - `int`"
  ([^SubStream this ^Integer readlimit]
    (-> this (.mark readlimit))))

(defn reset
  "Repositions the substream position to the index where the mark method
   was last called.

   The new reset position on substream does not take effect until subsequent reads."
  ([^SubStream this]
    (-> this (.reset))))

(defn mark-supported
  "The substream wrapper class is only compatible with markable input streams and hence
   will always return true. This requirement is enforced in the class constructor.

  returns: true - `boolean`"
  (^Boolean [^SubStream this]
    (-> this (.markSupported))))

(defn close
  "Closes the substream.

  throws: java.io.IOException"
  ([^SubStream this]
    (-> this (.close))))

