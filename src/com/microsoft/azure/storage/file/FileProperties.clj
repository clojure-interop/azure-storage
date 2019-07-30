(ns com.microsoft.azure.storage.file.FileProperties
  "Represents the system properties for a file."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.file FileProperties]))

(defn ->file-properties
  "Constructor.

  Creates an instance of the FileProperties class by copying values from another instance of the
   FileProperties class.

  other - A FileProperties object which represents the file properties to copy. - `com.microsoft.azure.storage.file.FileProperties`"
  (^FileProperties [^com.microsoft.azure.storage.file.FileProperties other]
    (new FileProperties other))
  (^FileProperties []
    (new FileProperties )))

(defn set-content-encoding
  "Sets the content encoding value for the file.

  content-encoding - A String which specifies the content encoding value to set. - `java.lang.String`"
  ([^FileProperties this ^java.lang.String content-encoding]
    (-> this (.setContentEncoding content-encoding))))

(defn set-cache-control
  "Sets the cache control value for the file.

  cache-control - A String which specifies the cache control value to set. - `java.lang.String`"
  ([^FileProperties this ^java.lang.String cache-control]
    (-> this (.setCacheControl cache-control))))

(defn set-content-type
  "Sets the content type value for the file.

  content-type - A String which specifies the content type value to set. - `java.lang.String`"
  ([^FileProperties this ^java.lang.String content-type]
    (-> this (.setContentType content-type))))

(defn get-copy-state
  "Gets the file's copy state.

  returns: A CopyState object which represents the copy state of the file. - `com.microsoft.azure.storage.file.CopyState`"
  (^com.microsoft.azure.storage.file.CopyState [^FileProperties this]
    (-> this (.getCopyState))))

(defn get-content-encoding
  "Gets the content encoding value for the file.

  returns: A String which represents the content encoding, or null if content encoding has
           not been set on the file. - `java.lang.String`"
  (^java.lang.String [^FileProperties this]
    (-> this (.getContentEncoding))))

(defn get-content-type
  "Gets the content type value for the file.

  returns: A String which represents the content type, or null if the content type has not
           be set for the file. - `java.lang.String`"
  (^java.lang.String [^FileProperties this]
    (-> this (.getContentType))))

(defn get-last-modified
  "Gets the last modified time for the file.

  returns: A Date object which represents the last modified time. - `java.util.Date`"
  (^java.util.Date [^FileProperties this]
    (-> this (.getLastModified))))

(defn get-content-language
  "Gets the content language value for the file.

  returns: A String which represents the content language, or null if content language
           has not been set on the file. - `java.lang.String`"
  (^java.lang.String [^FileProperties this]
    (-> this (.getContentLanguage))))

(defn get-cache-control
  "Gets the cache control value for the file.

  returns: A String which represents the content cache control value for the file. - `java.lang.String`"
  (^java.lang.String [^FileProperties this]
    (-> this (.getCacheControl))))

(defn get-etag
  "Gets the ETag value for the file.

   The ETag value is a unique identifier that is updated when a write operation is performed against the file. It
   may be used to perform operations conditionally, providing concurrency control and improved efficiency.

   The AccessCondition.generateIfMatchCondition(String) and
   AccessCondition.generateIfNoneMatchCondition(String) methods take an ETag value and return an
   AccessCondition object that may be specified on the request.

  returns: A String which represents the ETag value. - `java.lang.String`"
  (^java.lang.String [^FileProperties this]
    (-> this (.getEtag))))

(defn set-content-language
  "Sets the content language for the file.

  content-language - A String which specifies the content language value to set. - `java.lang.String`"
  ([^FileProperties this ^java.lang.String content-language]
    (-> this (.setContentLanguage content-language))))

(defn get-length
  "Gets the size, in bytes, of the file.

  returns: A long which represents the length of the file. - `long`"
  (^Long [^FileProperties this]
    (-> this (.getLength))))

(defn set-content-md-5
  "Sets the content MD5 value for the file.

  content-md-5 - A String which specifies the content MD5 value to set. - `java.lang.String`"
  ([^FileProperties this ^java.lang.String content-md-5]
    (-> this (.setContentMD5 content-md-5))))

(defn set-content-disposition
  "Sets the content disposition value for the file.

  content-disposition - A String which specifies the content disposition value to set. - `java.lang.String`"
  ([^FileProperties this ^java.lang.String content-disposition]
    (-> this (.setContentDisposition content-disposition))))

(defn server-encrypted?
  "Gets the file's server-side encryption status.

  returns: A boolean which specifies the file's encryption status. - `boolean`"
  (^Boolean [^FileProperties this]
    (-> this (.isServerEncrypted))))

(defn get-content-md-5
  "Gets the content MD5 value for the file.

  returns: A String which represents the content MD5 value. - `java.lang.String`"
  (^java.lang.String [^FileProperties this]
    (-> this (.getContentMD5))))

(defn get-content-disposition
  "Gets the content disposition value for the file.

  returns: A String which represents the content disposition, or null if content
           disposition has not been set on the file. - `java.lang.String`"
  (^java.lang.String [^FileProperties this]
    (-> this (.getContentDisposition))))

