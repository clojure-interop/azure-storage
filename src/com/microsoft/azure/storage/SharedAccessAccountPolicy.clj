(ns com.microsoft.azure.storage.SharedAccessAccountPolicy
  "Represents a shared access policy, which specifies the start time, expiry time,
  and permissions for a shared access signature."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage SharedAccessAccountPolicy]))

(defn ->shared-access-account-policy
  "Constructor."
  (^SharedAccessAccountPolicy []
    (new SharedAccessAccountPolicy )))

(defn set-service-from-string
  "Sets shared access services using the specified services String.

  value - A String which represents the shared access services. - `java.lang.String`"
  ([^SharedAccessAccountPolicy this ^java.lang.String value]
    (-> this (.setServiceFromString value))))

(defn permissions-to-string
  "Converts this shared access policy's permissions to a String.

  returns: A String which represents the shared access permissions. - `java.lang.String`"
  (^java.lang.String [^SharedAccessAccountPolicy this]
    (-> this (.permissionsToString))))

(defn set-permissions
  "Sets the permissions for a shared access signature associated with this shared access policy.

  permissions - the permissions to set - `java.util.EnumSet`"
  ([^SharedAccessAccountPolicy this ^java.util.EnumSet permissions]
    (-> this (.setPermissions permissions))))

(defn get-services
  "Gets the services (blob, file, queue, table) for a shared access signature associated with
   this shared access policy.

  returns: the services - `java.util.EnumSet<com.microsoft.azure.storage.SharedAccessAccountService>`"
  (^java.util.EnumSet [^SharedAccessAccountPolicy this]
    (-> this (.getServices))))

(defn get-resource-types
  "Gets the resource type for a shared access signature associated with this shared access policy.

  returns: the resourceTypes - `java.util.EnumSet<com.microsoft.azure.storage.SharedAccessAccountResourceType>`"
  (^java.util.EnumSet [^SharedAccessAccountPolicy this]
    (-> this (.getResourceTypes))))

(defn set-range
  "Sets the allowed IP addresses for a shared access signature associated with this shared access policy.

  range - A IPRange object containing the range of IP addresses. - `com.microsoft.azure.storage.IPRange`"
  ([^SharedAccessAccountPolicy this ^com.microsoft.azure.storage.IPRange range]
    (-> this (.setRange range))))

(defn resource-types-to-string
  "Converts this shared access policy's resource types to a String.

  returns: A String which represents the shared access permissions. - `java.lang.String`"
  (^java.lang.String [^SharedAccessAccountPolicy this]
    (-> this (.resourceTypesToString))))

(defn set-permissions-from-string
  "Sets shared access permissions using the specified permissions String.

  value - A String which represents the shared access permissions. - `java.lang.String`"
  ([^SharedAccessAccountPolicy this ^java.lang.String value]
    (-> this (.setPermissionsFromString value))))

(defn get-range
  "Gets the allowed IP addresses for a shared access signature associated with this shared access policy.

  returns: A IPRange object containing the range of IP addresses. - `com.microsoft.azure.storage.IPRange`"
  (^com.microsoft.azure.storage.IPRange [^SharedAccessAccountPolicy this]
    (-> this (.getRange))))

(defn get-permissions
  "Gets the permissions for a shared access signature associated with this shared access policy.

  returns: the permissions - `java.util.EnumSet<com.microsoft.azure.storage.SharedAccessAccountPermissions>`"
  (^java.util.EnumSet [^SharedAccessAccountPolicy this]
    (-> this (.getPermissions))))

(defn set-resource-type-from-string
  "Sets shared access resource types using the specified resource types String.

  value - A String which represents the shared access resource types. - `java.lang.String`"
  ([^SharedAccessAccountPolicy this ^java.lang.String value]
    (-> this (.setResourceTypeFromString value))))

(defn services-to-string
  "Converts this shared access policy's services to a String.

  returns: A String which represents the shared access permissions. - `java.lang.String`"
  (^java.lang.String [^SharedAccessAccountPolicy this]
    (-> this (.servicesToString))))

(defn set-resource-types
  "Sets the resource type for a shared access signature associated with this shared access policy.

  resource-types - the resourceTypes to set - `java.util.EnumSet`"
  ([^SharedAccessAccountPolicy this ^java.util.EnumSet resource-types]
    (-> this (.setResourceTypes resource-types))))

(defn get-protocols
  "Gets the allowed protocols for a shared access signature associated with this shared access policy.

  returns: A SharedAccessProtocols representing the chosen Internet protocols. - `com.microsoft.azure.storage.SharedAccessProtocols`"
  (^com.microsoft.azure.storage.SharedAccessProtocols [^SharedAccessAccountPolicy this]
    (-> this (.getProtocols))))

(defn set-services
  "Sets the services (blob, file, queue, table) for a shared access signature associated with
   this shared access policy.

  services - the services to set - `java.util.EnumSet`"
  ([^SharedAccessAccountPolicy this ^java.util.EnumSet services]
    (-> this (.setServices services))))

(defn set-protocols
  "Sets the allowed protocols for a shared access signature associated with this shared access policy.

  protocols - A SharedAccessProtocols representing the chosen Internet protocols. - `com.microsoft.azure.storage.SharedAccessProtocols`"
  ([^SharedAccessAccountPolicy this ^com.microsoft.azure.storage.SharedAccessProtocols protocols]
    (-> this (.setProtocols protocols))))

