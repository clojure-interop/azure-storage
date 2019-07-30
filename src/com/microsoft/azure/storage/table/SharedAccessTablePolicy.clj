(ns com.microsoft.azure.storage.table.SharedAccessTablePolicy
  "Represents a shared access policy, which specifies the start time, expiry time, and permissions for a shared access
  signature."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.table SharedAccessTablePolicy]))

(defn ->shared-access-table-policy
  "Constructor."
  (^SharedAccessTablePolicy []
    (new SharedAccessTablePolicy )))

(defn get-permissions
  "Gets the permissions for a shared access signature associated with this shared access policy.

  returns: A java.util.EnumSet object that contains SharedAccessTablePermissions values that
           represents the set of shared access permissions. - `java.util.EnumSet<com.microsoft.azure.storage.table.SharedAccessTablePermissions>`"
  (^java.util.EnumSet [^SharedAccessTablePolicy this]
    (-> this (.getPermissions))))

(defn set-permissions
  "Sets the permissions for a shared access signature associated with this shared access policy.

  permissions - The permissions, represented by a java.util.EnumSet object that contains SharedAccessTablePermissions values, to set for the shared access signature. - `java.util.EnumSet`"
  ([^SharedAccessTablePolicy this ^java.util.EnumSet permissions]
    (-> this (.setPermissions permissions))))

(defn permissions-to-string
  "Converts this policy's permissions to a string.

  returns: A String that represents the shared access permissions in the \"raud\" format, which is
           described at setPermissionsFromString(String). - `java.lang.String`"
  (^java.lang.String [^SharedAccessTablePolicy this]
    (-> this (.permissionsToString))))

(defn set-permissions-from-string
  "Sets shared access permissions using the specified permissions string.

  value - A String that represents the shared access permissions. The string must contain one or more of the following values. Note that they must be lower case, and the order that they are specified must be in the order of \"raud\". r: Query access. a: Add access. u: Update access. d: Delete access. - `java.lang.String`"
  ([^SharedAccessTablePolicy this ^java.lang.String value]
    (-> this (.setPermissionsFromString value))))

