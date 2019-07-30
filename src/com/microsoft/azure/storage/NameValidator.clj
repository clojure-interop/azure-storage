(ns com.microsoft.azure.storage.NameValidator
  "Provides helpers to validate resource names across the Microsoft Azure
  Storage Services."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage NameValidator]))

(defn ->name-validator
  "Constructor."
  (^NameValidator []
    (new NameValidator )))

(defn *validate-container-name
  "Checks if a container name is valid.

  container-name - A String representing the container name to validate. - `java.lang.String`"
  ([^java.lang.String container-name]
    (NameValidator/validateContainerName container-name)))

(defn *validate-queue-name
  "Checks if a queue name is valid.

  queue-name - A String representing the queue name to validate. - `java.lang.String`"
  ([^java.lang.String queue-name]
    (NameValidator/validateQueueName queue-name)))

(defn *validate-share-name
  "Checks if a share name is valid.

  share-name - A String representing the share name to validate. - `java.lang.String`"
  ([^java.lang.String share-name]
    (NameValidator/validateShareName share-name)))

(defn *validate-blob-name
  "Checks if a blob name is valid.

  blob-name - A String representing the blob name to validate. - `java.lang.String`"
  ([^java.lang.String blob-name]
    (NameValidator/validateBlobName blob-name)))

(defn *validate-file-name
  "Checks if a file name is valid.

  file-name - A String representing the file name to validate. - `java.lang.String`"
  ([^java.lang.String file-name]
    (NameValidator/validateFileName file-name)))

(defn *validate-directory-name
  "Checks if a directory name is valid.

  directory-name - A String representing the directory name to validate. - `java.lang.String`"
  ([^java.lang.String directory-name]
    (NameValidator/validateDirectoryName directory-name)))

(defn *validate-table-name
  "Checks if a table name is valid.

  table-name - A String representing the table name to validate. - `java.lang.String`"
  ([^java.lang.String table-name]
    (NameValidator/validateTableName table-name)))

