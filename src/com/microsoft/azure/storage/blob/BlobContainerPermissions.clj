(ns com.microsoft.azure.storage.blob.BlobContainerPermissions
  "Represents the permissions for a container.

  The container's permissions encompass two types of access settings for the container:

  The container's public access setting, represented by the publicAccess property. The public access
  setting indicates whether the container and its blobs can be read via an anonymous request.
  The container's access policies, represented by the Permissions.getSharedAccessPolicies() method. This setting
  references a collection of shared access policies for the container. A shared access policy may be used to control
  the start time, expiry time, and permissions for one or more shared access signatures. A shared access signature
  provides delegated access to the container's resources.

  For more information on managing container permissions, see Managing Access to Containers and Blobs."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob BlobContainerPermissions]))

(defn ->blob-container-permissions
  "Constructor.

  Creates an instance of the BlobContainerPermissions class."
  (^BlobContainerPermissions []
    (new BlobContainerPermissions )))

(defn get-public-access
  "Gets the public access setting for the container.

   The public access setting indicates whether the container and its blobs can be read via an anonymous request.

   The BlobContainerPublicAccessType enumeration provides three levels of anonymous read access:

   BlobContainerPublicAccessType.OFF, which prevents anonymous access.
   BlobContainerPublicAccessType.BLOB, which permits anonymous read access to blob resources, but not to
   container metadata or to the list of blobs in the container.
   BlobContainerPublicAccessType.CONTAINER, which permits anonymous read access to blob resources,
   container metadata, and the list of blobs in the container.

   For more information on managing anonymous access to Blob service resources, see Setting Access Control for Containers.

  returns: `com.microsoft.azure.storage.blob.BlobContainerPublicAccessType`"
  (^com.microsoft.azure.storage.blob.BlobContainerPublicAccessType [^BlobContainerPermissions this]
    (-> this (.getPublicAccess))))

(defn set-public-access
  "Sets the public access setting for the container.

   The public access setting indicates whether the container and its blobs can be read via an anonymous request.

   The BlobContainerPublicAccessType enumeration provides three levels of anonymous read access:

   BlobContainerPublicAccessType.OFF, which prevents anonymous access.
   BlobContainerPublicAccessType.BLOB, which permits anonymous read access to blob resources, but not to
   container metadata or to the list of blobs in the container.
   BlobContainerPublicAccessType.CONTAINER, which permits anonymous read access to blob resources,
   container metadata, and the list of blobs in the container.

   For more information on managing anonymous access to Blob service resources, see Setting Access Control for Containers.

  public-access - `com.microsoft.azure.storage.blob.BlobContainerPublicAccessType`"
  ([^BlobContainerPermissions this ^com.microsoft.azure.storage.blob.BlobContainerPublicAccessType public-access]
    (-> this (.setPublicAccess public-access))))

