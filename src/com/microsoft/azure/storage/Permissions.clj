(ns com.microsoft.azure.storage.Permissions
  "Represents the permissions for a shared access policy."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage Permissions]))

(defn ->permissions
  "Constructor.

  Creates an instance of the Permissions class."
  (^Permissions []
    (new Permissions )))

(defn get-shared-access-policies
  "Returns the set of shared access policies.

  returns: A java.util.HashMap object of SharedAccessPolicy objects
           which represent the set of shared access policies. - `java.util.HashMap<java.lang.String,T>`"
  (^java.util.HashMap [^Permissions this]
    (-> this (.getSharedAccessPolicies))))

(defn set-shared-access-policies
  "Sets the shared access policies.

  shared-access-policies - A java.util.HashMap object of SharedAccessPolicy objects which contain the shared access policies to set. - `java.util.HashMap`"
  ([^Permissions this ^java.util.HashMap shared-access-policies]
    (-> this (.setSharedAccessPolicies shared-access-policies))))

