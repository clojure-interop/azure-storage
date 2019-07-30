(ns com.microsoft.azure.storage.SharedAccessPolicy
  "Represents a shared access policy, which specifies the start time, expiry time, and permissions for a shared access
  signature."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage SharedAccessPolicy]))

(defn ->shared-access-policy
  "Constructor.

  Creates an instance of the SharedAccessPolicy class."
  (^SharedAccessPolicy []
    (new SharedAccessPolicy )))

(defn get-shared-access-expiry-time
  "Gets the expiry time for a shared access signature associated with this shared access policy.

  returns: A java.util.Date object which contains the shared access signature expiry time. - `java.util.Date`"
  (^java.util.Date [^SharedAccessPolicy this]
    (-> this (.getSharedAccessExpiryTime))))

(defn get-shared-access-start-time
  "Gets the start time for a shared access signature associated with this shared access policy.

  returns: A java.util.Date object which contains the shared access signature start time. - `java.util.Date`"
  (^java.util.Date [^SharedAccessPolicy this]
    (-> this (.getSharedAccessStartTime))))

(defn set-shared-access-expiry-time
  "Sets the expiry time for a shared access signature associated with this shared access policy.

  shared-access-expiry-time - A java.util.Date object which represents the expiry time to set for the shared access signature. - `java.util.Date`"
  ([^SharedAccessPolicy this ^java.util.Date shared-access-expiry-time]
    (-> this (.setSharedAccessExpiryTime shared-access-expiry-time))))

(defn set-shared-access-start-time
  "Sets the start time for a shared access signature associated with this shared access policy.

  shared-access-start-time - A java.util.Date object which represents the start time to set for the shared access signature. - `java.util.Date`"
  ([^SharedAccessPolicy this ^java.util.Date shared-access-start-time]
    (-> this (.setSharedAccessStartTime shared-access-start-time))))

(defn permissions-to-string
  "Converts this shared access policy's permissions to a string.

  returns: A String which represents the shared access permissions. - `java.lang.String`"
  (^java.lang.String [^SharedAccessPolicy this]
    (-> this (.permissionsToString))))

(defn set-permissions-from-string
  "Sets shared access permissions using the specified permissions string.

  value - A String which represents the shared access permissions. - `java.lang.String`"
  ([^SharedAccessPolicy this ^java.lang.String value]
    (-> this (.setPermissionsFromString value))))

