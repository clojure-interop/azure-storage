(ns com.microsoft.azure.storage.blob.SharedAccessBlobHeaders
  "Represents the optional headers that can be returned with blobs accessed using SAS."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob SharedAccessBlobHeaders]))

(defn ->shared-access-blob-headers
  "Constructor.

  Initializes a new instance of the SharedAccessBlobHeaders class based on an existing instance.

  other - A SharedAccessHeaders object which specifies the set of properties to clone. - `com.microsoft.azure.storage.SharedAccessHeaders`"
  (^SharedAccessBlobHeaders [^com.microsoft.azure.storage.SharedAccessHeaders other]
    (new SharedAccessBlobHeaders other))
  (^SharedAccessBlobHeaders []
    (new SharedAccessBlobHeaders )))

