(ns com.microsoft.azure.storage.blob.BlockEntry
  "A class which is used to list and commit blocks of a CloudBlockBlob."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob BlockEntry]))

(defn ->block-entry
  "Constructor.

  Creates an instance of the BlockEntry class with the specified id and search mode.

  id - A String which represents the ID of the block. - `java.lang.String`
  search-mode - A BlockSearchMode value which represents the block search mode. - `com.microsoft.azure.storage.blob.BlockSearchMode`"
  (^BlockEntry [^java.lang.String id ^com.microsoft.azure.storage.blob.BlockSearchMode search-mode]
    (new BlockEntry id search-mode))
  (^BlockEntry [^java.lang.String id]
    (new BlockEntry id)))

(defn get-id
  "Gets the id of the block. The block id is a valid Base64 string value that identifies the block. Prior to
   encoding, the string must be less than or equal to 64 bytes in size. For a given blob, the length of the block id
   must be the same size for each block.

  returns: A String which represents the ID of the block. - `java.lang.String`"
  (^java.lang.String [^BlockEntry this]
    (-> this (.getId))))

(defn get-size
  "Gets the size, in bytes, of the block.

  returns: A long which represents the the size, in bytes, of the block. - `long`"
  (^Long [^BlockEntry this]
    (-> this (.getSize))))

(defn get-search-mode
  "Gets the BlockSearchMode.

  returns: A BlockSearchMode value which represents the block search mode. - `com.microsoft.azure.storage.blob.BlockSearchMode`"
  (^com.microsoft.azure.storage.blob.BlockSearchMode [^BlockEntry this]
    (-> this (.getSearchMode))))

(defn set-id
  "Sets the id of the block. The block id is a valid Base64 string value that identifies the block. Prior to
   encoding, the string must be less than or equal to 64 bytes in size. For a given blob, the length of the block id
   must be the same size for each block.

  id - A String which represents the ID of the block to set. - `java.lang.String`"
  ([^BlockEntry this ^java.lang.String id]
    (-> this (.setId id))))

(defn set-size
  "Sets the size, in bytes, of the block.

  size - A long which represents the the size, in bytes, of the block to set. - `long`"
  ([^BlockEntry this ^Long size]
    (-> this (.setSize size))))

(defn set-search-mode
  "Sets the BlockSearchMode.

  search-mode - A BlockSearchMode value which represents the block search mode to set. - `com.microsoft.azure.storage.blob.BlockSearchMode`"
  ([^BlockEntry this ^com.microsoft.azure.storage.blob.BlockSearchMode search-mode]
    (-> this (.setSearchMode search-mode))))

