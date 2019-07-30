(ns com.microsoft.azure.storage.blob.BlockListingFilter
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob BlockListingFilter]))

(def COMMITTED
  "Enum Constant.

  List only committed blocks.

  type: com.microsoft.azure.storage.blob.BlockListingFilter"
  BlockListingFilter/COMMITTED)

(def UNCOMMITTED
  "Enum Constant.

  List only uncommitted blocks.

  type: com.microsoft.azure.storage.blob.BlockListingFilter"
  BlockListingFilter/UNCOMMITTED)

(def ALL
  "Enum Constant.

  List both committed and uncommitted blocks.

  type: com.microsoft.azure.storage.blob.BlockListingFilter"
  BlockListingFilter/ALL)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockListingFilter c : BlockListingFilter.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.blob.BlockListingFilter[]`"
  ([]
    (BlockListingFilter/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.blob.BlockListingFilter`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.blob.BlockListingFilter [^java.lang.String name]
    (BlockListingFilter/valueOf name)))

