(ns com.microsoft.azure.storage.blob.BlobInputStream
  "Provides an input stream to read a given blob resource."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob BlobInputStream]))

(defn available
  "Returns an estimate of the number of bytes that can be read (or skipped over) from this input stream without
   blocking by the next invocation of a method for this input stream. The next invocation might be the same thread
   or another thread. A single read or skip of this many bytes will not block, but may read or skip fewer bytes.

  returns: An int which represents an estimate of the number of bytes that can be read (or skipped
           over)
           from this input stream without blocking, or 0 when it reaches the end of the input stream. - `int`

  throws: java.io.IOException - If an I/O error occurs."
  (^Integer [^BlobInputStream this]
    (-> this (.available))))

(defn close
  "Closes this input stream and releases any system resources associated with the stream.

  throws: java.io.IOException - If an I/O error occurs."
  ([^BlobInputStream this]
    (-> this (.close))))

(defn mark
  "Marks the current position in this input stream. A subsequent call to the reset method repositions this stream at
   the last marked position so that subsequent reads re-read the same bytes.

  readlimit - An int which represents the maximum limit of bytes that can be read before the mark position becomes invalid. - `int`"
  ([^BlobInputStream this ^Integer readlimit]
    (-> this (.mark readlimit))))

(defn mark-supported
  "Tests if this input stream supports the mark and reset methods. Whether or not mark and reset are supported is an
   invariant property of a particular input stream instance. The markSupported method of InputStream returns
   false.

  returns: True if this stream instance supports the mark and reset methods; False
           otherwise. - `boolean`"
  (^Boolean [^BlobInputStream this]
    (-> this (.markSupported))))

(defn read
  "Reads up to len bytes of data from the input stream into an array of bytes. An attempt is made to
   read as many as len bytes, but a smaller number may be read. The number of bytes actually read is
   returned as an integer. This
   method blocks until input data is available, end of file is detected, or an exception is thrown.

   If len is zero, then no bytes are read and 0 is returned; otherwise, there is an attempt to read at
   least one
   byte. If no byte is available because the stream is at end of file, the value -1 is returned; otherwise, at least
   one byte is read and stored into b.

   The first byte read is stored into element b[off], the next one into b[off+1], and so
   on. The number of bytes
   read is, at most, equal to len. Let k be the number of bytes actually read; these bytes
   will be stored in
   elements b[off] through b[off+k-1], leaving elements b[off+k] through
   b[off+len-1] unaffected.

   In every case, elements b[0] through b[off] and elements b[off+len]
   through b[b.length-1] are unaffected.

   The read(b, off, len) method for class InputStream simply calls the method
   read() repeatedly. If the first such
   call results in an IOException, that exception is returned from the call to the
   read(b, off, len) method. If any
   subsequent call to read() results in a IOException, the exception is caught and treated
   as if it were end of
   file; the bytes read up to that point are stored into b and the number of bytes read before the
   exception
   occurred is returned. The default implementation of this method blocks until the requested amount of input data
   len has been read, end of file is detected, or an exception is thrown. Subclasses are encouraged to
   provide a
   more efficient implementation of this method.

  b - A byte array which represents the buffer into which the data is read. - `byte[]`
  off - An int which represents the start offset in the byte array at which the data is written. - `int`
  len - An int which represents the maximum number of bytes to read. - `int`

  returns: An int which represents the total number of bytes read into the buffer, or -1 if
           there is no more data because the end of the stream has been reached. - `int`

  throws: java.io.IOException - If the first byte cannot be read for any reason other than end of file, or if the input stream has been closed, or if some other I/O error occurs."
  (^Integer [^BlobInputStream this b ^Integer off ^Integer len]
    (-> this (.read b off len)))
  (^Integer [^BlobInputStream this b]
    (-> this (.read b)))
  (^Integer [^BlobInputStream this]
    (-> this (.read))))

(defn reset
  "Repositions this stream to the position at the time the mark method was last called on this input stream. Note
   repositioning the blob read stream will disable blob MD5 checking.

  throws: java.io.IOException - If this stream has not been marked or if the mark has been invalidated."
  ([^BlobInputStream this]
    (-> this (.reset))))

(defn skip
  "Skips over and discards n bytes of data from this input stream. The skip method may, for a variety of reasons,
   end up skipping over some smaller number of bytes, possibly 0. This may result from any of a number of
   conditions; reaching end of file before n bytes have been skipped is only one possibility. The actual number of
   bytes skipped is returned. If n is negative, no bytes are skipped.

   Note repositioning the blob read stream will disable blob MD5 checking.

  n - A long which represents the number of bytes to skip. - `long`

  returns: `long`

  throws: java.io.IOException"
  (^Long [^BlobInputStream this ^Long n]
    (-> this (.skip n))))

