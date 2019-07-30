(ns com.microsoft.azure.storage.file.FileDirectoryProperties
  "Represents the system properties for a directory."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.file FileDirectoryProperties]))

(defn ->file-directory-properties
  "Constructor."
  (^FileDirectoryProperties []
    (new FileDirectoryProperties )))

(defn get-etag
  "Gets the ETag value of the directory.

   The ETag value is a unique identifier that is updated when a write operation is performed against the directory.
   It may be used to perform operations conditionally, providing concurrency control and improved efficiency.

   The AccessCondition.generateIfMatchCondition(String) and
   AccessCondition.generateIfNoneMatchCondition(String) methods take an ETag value and return an
   AccessCondition object that may be specified on the request.

  returns: A String which represents the ETag. - `java.lang.String`"
  (^java.lang.String [^FileDirectoryProperties this]
    (-> this (.getEtag))))

(defn get-last-modified
  "Gets the last modified time on the directory.

  returns: A java.util.Date object which represents the last modified time. - `java.util.Date`"
  (^java.util.Date [^FileDirectoryProperties this]
    (-> this (.getLastModified))))

(defn server-encrypted?
  "Gets the directory's server-side encryption status.

  returns: A boolean which specifies the directory's encryption status. - `boolean`"
  (^Boolean [^FileDirectoryProperties this]
    (-> this (.isServerEncrypted))))

