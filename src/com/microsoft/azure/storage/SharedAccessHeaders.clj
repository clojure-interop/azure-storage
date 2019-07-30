(ns com.microsoft.azure.storage.SharedAccessHeaders
  "RESERVED FOR INTERNAL USE. Represents the optional headers that can be returned using SAS."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage SharedAccessHeaders]))

(defn ->shared-access-headers
  "Constructor.

  Initializes a new instance of the SharedAccessHeaders class based on an existing instance.

  other - A SharedAccessHeaders object which specifies the set of properties to clone. - `com.microsoft.azure.storage.SharedAccessHeaders`"
  (^SharedAccessHeaders [^com.microsoft.azure.storage.SharedAccessHeaders other]
    (new SharedAccessHeaders other))
  (^SharedAccessHeaders []
    (new SharedAccessHeaders )))

(defn set-content-encoding
  "Sets the content encoding header.

  content-encoding - A String which specifies the content encoding header. - `java.lang.String`"
  ([^SharedAccessHeaders this ^java.lang.String content-encoding]
    (-> this (.setContentEncoding content-encoding))))

(defn set-cache-control
  "Sets the cache control header.

  cache-control - A String which specifies the cache control header. - `java.lang.String`"
  ([^SharedAccessHeaders this ^java.lang.String cache-control]
    (-> this (.setCacheControl cache-control))))

(defn set-content-type
  "Sets the content type header.

  content-type - A String which specifies the content type header. - `java.lang.String`"
  ([^SharedAccessHeaders this ^java.lang.String content-type]
    (-> this (.setContentType content-type))))

(defn get-content-encoding
  "Gets the content encoding header.

  returns: A String which represents the content encoding header. - `java.lang.String`"
  (^java.lang.String [^SharedAccessHeaders this]
    (-> this (.getContentEncoding))))

(defn get-content-type
  "Gets the content type header.

  returns: A String which represents the content type header. - `java.lang.String`"
  (^java.lang.String [^SharedAccessHeaders this]
    (-> this (.getContentType))))

(defn get-content-language
  "Gets the content language header.

  returns: A String which represents the content language header. - `java.lang.String`"
  (^java.lang.String [^SharedAccessHeaders this]
    (-> this (.getContentLanguage))))

(defn get-cache-control
  "Gets the cache control header.

  returns: A String which represents the cache control header. - `java.lang.String`"
  (^java.lang.String [^SharedAccessHeaders this]
    (-> this (.getCacheControl))))

(defn set-content-language
  "Sets the content language header.

  content-language - A String which specifies the content language header. - `java.lang.String`"
  ([^SharedAccessHeaders this ^java.lang.String content-language]
    (-> this (.setContentLanguage content-language))))

(defn set-content-disposition
  "Sets the content disposition header.

  content-disposition - A String which specifies the content disposition header. - `java.lang.String`"
  ([^SharedAccessHeaders this ^java.lang.String content-disposition]
    (-> this (.setContentDisposition content-disposition))))

(defn get-content-disposition
  "Gets the content disposition header.

  returns: A String which represents the content disposition header. - `java.lang.String`"
  (^java.lang.String [^SharedAccessHeaders this]
    (-> this (.getContentDisposition))))

