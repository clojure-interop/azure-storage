(ns com.microsoft.azure.storage.blob.SharedAccessBlobPolicy
  "Represents a shared access policy, which specifies the start time, expiry time, and permissions for a shared access
  signature."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob SharedAccessBlobPolicy]))

(defn ->shared-access-blob-policy
  "Constructor."
  (^SharedAccessBlobPolicy []
    (new SharedAccessBlobPolicy )))

(defn get-permissions
  "Gets the permissions for a shared access signature associated with this shared access policy.

  returns: A java.util.EnumSet object that contains SharedAccessBlobPermissions values that
           represents the set of shared access permissions. - `java.util.EnumSet<com.microsoft.azure.storage.blob.SharedAccessBlobPermissions>`"
  (^java.util.EnumSet [^SharedAccessBlobPolicy this]
    (-> this (.getPermissions))))

(defn set-permissions
  "Sets the permissions for a shared access signature associated with this shared access policy.

  permissions - The permissions, represented by a java.util.EnumSet object that contains SharedAccessBlobPermissions values, to set for the shared access signature. - `java.util.EnumSet`"
  ([^SharedAccessBlobPolicy this ^java.util.EnumSet permissions]
    (-> this (.setPermissions permissions))))

(defn permissions-to-string
  "Converts this policy's permissions to a string.

  returns: A String that represents the shared access permissions in the \"racwdl\" format,
           which is described at setPermissionsFromString(String). - `java.lang.String`"
  (^java.lang.String [^SharedAccessBlobPolicy this]
    (-> this (.permissionsToString))))

(defn set-permissions-from-string
  "Sets shared access permissions using the specified permissions string.

  value - A String that represents the shared access permissions. The string must contain one or more of the following values. Note they must all be lowercase. r: Read access. a: Add access. c: Create access. w: Write access. d: Delete access. l: List access. - `java.lang.String`"
  ([^SharedAccessBlobPolicy this ^java.lang.String value]
    (-> this (.setPermissionsFromString value))))

