(ns com.microsoft.azure.storage.blob.PremiumPageBlobTier
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.blob PremiumPageBlobTier]))

(def UNKNOWN
  "Enum Constant.

  The tier is not recognized by this version of the library.

  type: com.microsoft.azure.storage.blob.PremiumPageBlobTier"
  PremiumPageBlobTier/UNKNOWN)

(def P4
  "Enum Constant.

  P4 Tier

  type: com.microsoft.azure.storage.blob.PremiumPageBlobTier"
  PremiumPageBlobTier/P4)

(def P6
  "Enum Constant.

  P6 Tier

  type: com.microsoft.azure.storage.blob.PremiumPageBlobTier"
  PremiumPageBlobTier/P6)

(def P10
  "Enum Constant.

  P10 Tier

  type: com.microsoft.azure.storage.blob.PremiumPageBlobTier"
  PremiumPageBlobTier/P10)

(def P20
  "Enum Constant.

  P20 Tier

  type: com.microsoft.azure.storage.blob.PremiumPageBlobTier"
  PremiumPageBlobTier/P20)

(def P30
  "Enum Constant.

  P30 Tier

  type: com.microsoft.azure.storage.blob.PremiumPageBlobTier"
  PremiumPageBlobTier/P30)

(def P40
  "Enum Constant.

  P40 Tier

  type: com.microsoft.azure.storage.blob.PremiumPageBlobTier"
  PremiumPageBlobTier/P40)

(def P50
  "Enum Constant.

  P50 Tier

  type: com.microsoft.azure.storage.blob.PremiumPageBlobTier"
  PremiumPageBlobTier/P50)

(def P60
  "Enum Constant.

  P60 Tier

  type: com.microsoft.azure.storage.blob.PremiumPageBlobTier"
  PremiumPageBlobTier/P60)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (PremiumPageBlobTier c : PremiumPageBlobTier.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.blob.PremiumPageBlobTier[]`"
  ([]
    (PremiumPageBlobTier/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.blob.PremiumPageBlobTier`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.blob.PremiumPageBlobTier [^java.lang.String name]
    (PremiumPageBlobTier/valueOf name)))

