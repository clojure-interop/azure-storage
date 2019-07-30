(ns com.microsoft.azure.storage.file.FileSharePermissions
  "Represents the permissions for a share.

  The share's permissions encompass its access policies, represented by the Permissions.getSharedAccessPolicies() method.
  This setting references a collection of shared access policies for the share. A shared access policy may
  be used to control the start time, expiry time, and permissions for one or more shared access signatures.
  A shared access signature provides delegated access to the share's resources.
  For more information on managing share permissions, see
  Managing Access to Shares and Files."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.file FileSharePermissions]))

(defn ->file-share-permissions
  "Constructor."
  (^FileSharePermissions []
    (new FileSharePermissions )))

