(ns com.microsoft.azure.storage.file.FileShareProperties
  "Represents the system properties for a share."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.file FileShareProperties]))

(defn ->file-share-properties
  "Constructor.

  Creates an instance of the FileShareProperties class by copying values from another
   FileShareProperties instance.

  other - A FileShareProperties object which represents the file share properties to copy. - `com.microsoft.azure.storage.file.FileShareProperties`"
  (^FileShareProperties [^com.microsoft.azure.storage.file.FileShareProperties other]
    (new FileShareProperties other))
  (^FileShareProperties []
    (new FileShareProperties )))

(defn get-etag
  "Gets the ETag value of the share.

   The ETag value is a unique identifier that is updated when a write operation is performed against the share. It
   may be used to perform operations conditionally, providing concurrency control and improved efficiency.

   The AccessCondition.generateIfMatchCondition(String) and
   AccessCondition.generateIfNoneMatchCondition(String) methods take an ETag value and return an
   AccessCondition object that may be specified on the request.

  returns: A String which represents the ETag. - `java.lang.String`"
  (^java.lang.String [^FileShareProperties this]
    (-> this (.getEtag))))

(defn get-last-modified
  "Gets the last modified time on the share.

  returns: A java.util.Date object which represents the last modified time. - `java.util.Date`"
  (^java.util.Date [^FileShareProperties this]
    (-> this (.getLastModified))))

(defn get-share-quota
  "Gets the limit on the size of files (in GB) stored on the share.

  returns: A java.lang.Integer object which represents the limit on
              the size of files stored on the share. - `java.lang.Integer`"
  (^java.lang.Integer [^FileShareProperties this]
    (-> this (.getShareQuota))))

(defn set-share-quota
  "Sets the limit on the size of files (in GB) stored on the share.

  share-quota - A java.lang.Integer object which represents the limit on the size of files stored on the share. - `java.lang.Integer`"
  ([^FileShareProperties this ^java.lang.Integer share-quota]
    (-> this (.setShareQuota share-quota))))

