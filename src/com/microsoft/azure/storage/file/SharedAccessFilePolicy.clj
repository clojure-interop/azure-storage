(ns com.microsoft.azure.storage.file.SharedAccessFilePolicy
  "Represents a shared access policy, which specifies the start time, expiry time, and permissions for a shared access
  signature."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.file SharedAccessFilePolicy]))

(defn ->shared-access-file-policy
  "Constructor."
  (^SharedAccessFilePolicy []
    (new SharedAccessFilePolicy )))

(defn get-permissions
  "Gets the permissions for a shared access signature associated with this shared access policy.

  returns: A java.util.EnumSet object that contains SharedAccessFilePermissions values that
           represents the set of shared access permissions. - `java.util.EnumSet<com.microsoft.azure.storage.file.SharedAccessFilePermissions>`"
  (^java.util.EnumSet [^SharedAccessFilePolicy this]
    (-> this (.getPermissions))))

(defn set-permissions
  "Sets the permissions for a shared access signature associated with this shared access policy.

  permissions - The permissions, represented by a java.util.EnumSet object that contains SharedAccessFilePermissions values, to set for the shared access signature. - `java.util.EnumSet`"
  ([^SharedAccessFilePolicy this ^java.util.EnumSet permissions]
    (-> this (.setPermissions permissions))))

(defn permissions-to-string
  "Converts this policy's permissions to a string.

  returns: A String that represents the shared access permissions in the \"rcwdl\" format,
           which is described at setPermissionsFromString(String). - `java.lang.String`"
  (^java.lang.String [^SharedAccessFilePolicy this]
    (-> this (.permissionsToString))))

(defn set-permissions-from-string
  "Sets shared access permissions using the specified permissions string.

  value - A String that represents the shared access permissions. The string must contain one or more of the following values. Note they must all be lowercase. r: Read access. c: Create access. w: Write access. d: Delete access. l: List access. - `java.lang.String`"
  ([^SharedAccessFilePolicy this ^java.lang.String value]
    (-> this (.setPermissionsFromString value))))

