(ns com.microsoft.azure.storage.blob.LeaseState
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob LeaseState]))

(def UNSPECIFIED
  "Enum Constant.

  The lease state is not specified.

  type: com.microsoft.azure.storage.blob.LeaseState"
  LeaseState/UNSPECIFIED)

(def AVAILABLE
  "Enum Constant.

  The lease is in the Available state.

  type: com.microsoft.azure.storage.blob.LeaseState"
  LeaseState/AVAILABLE)

(def LEASED
  "Enum Constant.

  The lease is in the Leased state.

  type: com.microsoft.azure.storage.blob.LeaseState"
  LeaseState/LEASED)

(def EXPIRED
  "Enum Constant.

  The lease is in the Expired state.

  type: com.microsoft.azure.storage.blob.LeaseState"
  LeaseState/EXPIRED)

(def BREAKING
  "Enum Constant.

  The lease is in the Breaking state.

  type: com.microsoft.azure.storage.blob.LeaseState"
  LeaseState/BREAKING)

(def BROKEN
  "Enum Constant.

  The lease is in the Broken state.

  type: com.microsoft.azure.storage.blob.LeaseState"
  LeaseState/BROKEN)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (LeaseState c : LeaseState.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.blob.LeaseState[]`"
  ([]
    (LeaseState/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.blob.LeaseState`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.blob.LeaseState [^java.lang.String name]
    (LeaseState/valueOf name)))

