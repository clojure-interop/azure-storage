(ns com.microsoft.azure.storage.blob.DeleteSnapshotsOption
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob DeleteSnapshotsOption]))

(def DELETE_SNAPSHOTS_ONLY
  "Enum Constant.

  Specifies deleting only the blob's snapshots.

  type: com.microsoft.azure.storage.blob.DeleteSnapshotsOption"
  DeleteSnapshotsOption/DELETE_SNAPSHOTS_ONLY)

(def INCLUDE_SNAPSHOTS
  "Enum Constant.

  Specifies deleting the blob and its snapshots.

  type: com.microsoft.azure.storage.blob.DeleteSnapshotsOption"
  DeleteSnapshotsOption/INCLUDE_SNAPSHOTS)

(def NONE
  "Enum Constant.

  Specifies deleting the blob only. If the blob has snapshots, this option will result in an error from the
   service.

  type: com.microsoft.azure.storage.blob.DeleteSnapshotsOption"
  DeleteSnapshotsOption/NONE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (DeleteSnapshotsOption c : DeleteSnapshotsOption.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.blob.DeleteSnapshotsOption[]`"
  ([]
    (DeleteSnapshotsOption/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.blob.DeleteSnapshotsOption`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.blob.DeleteSnapshotsOption [^java.lang.String name]
    (DeleteSnapshotsOption/valueOf name)))

