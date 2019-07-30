(ns com.microsoft.azure.storage.file.SharedAccessFileHeaders
  "Represents the optional headers that can be returned with files accessed using SAS."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.file SharedAccessFileHeaders]))

(defn ->shared-access-file-headers
  "Constructor.

  Initializes a new instance of the SharedAccessFileHeaders class based on an existing instance.

  other - A SharedAccessHeaders object which specifies the set of properties to clone. - `com.microsoft.azure.storage.SharedAccessHeaders`"
  (^SharedAccessFileHeaders [^com.microsoft.azure.storage.SharedAccessHeaders other]
    (new SharedAccessFileHeaders other))
  (^SharedAccessFileHeaders []
    (new SharedAccessFileHeaders )))

