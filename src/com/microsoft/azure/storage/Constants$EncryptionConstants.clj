(ns com.microsoft.azure.storage.Constants$EncryptionConstants
  "Defines constants for client encryption."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage Constants$EncryptionConstants]))

(defn ->constants.-encryption-constants
  "Constructor."
  (^Constants$EncryptionConstants []
    (new Constants$EncryptionConstants )))

(def *-blob-encryption-data
  "Static Constant.

  Metadata header to store encryption materials.

  type: java.lang.String"
  Constants$EncryptionConstants/BLOB_ENCRYPTION_DATA)

(def *-encryption-protocol-v-1
  "Static Constant.

  Constant for the encryption protocol.

  type: java.lang.String"
  Constants$EncryptionConstants/ENCRYPTION_PROTOCOL_V1)

(def *-key-wrapping-iv
  "Static Constant.

  Encryption metadata key for key wrapping IV.

  type: java.lang.String"
  Constants$EncryptionConstants/KEY_WRAPPING_IV)

(def *-table-encryption-key-details
  "Static Constant.

  Property name to store the encryption metadata.

  type: java.lang.String"
  Constants$EncryptionConstants/TABLE_ENCRYPTION_KEY_DETAILS)

(def *-table-encryption-property-details
  "Static Constant.

  Additional property name to store the encryption metadata.

  type: java.lang.String"
  Constants$EncryptionConstants/TABLE_ENCRYPTION_PROPERTY_DETAILS)

(def *-encryption-mode
  "Static Constant.

  Constant for the key for the encryption mode.

  type: java.lang.String"
  Constants$EncryptionConstants/ENCRYPTION_MODE)

(def *-full-blob
  "Static Constant.

  FullBlob string constant for the encryption mode.

  type: java.lang.String"
  Constants$EncryptionConstants/FULL_BLOB)

(def *-wrapped-content-key
  "Static Constant.

  Constant for the key for the wrapped CEK.

  type: java.lang.String"
  Constants$EncryptionConstants/WRAPPED_CONTENT_KEY)

(def *-encryption-agent
  "Static Constant.

  Constant for the key for the encryption agent.

  type: java.lang.String"
  Constants$EncryptionConstants/ENCRYPTION_AGENT)

(def *-content-encryption-iv
  "Static Constant.

  Constant for the key for the IV.

  type: java.lang.String"
  Constants$EncryptionConstants/CONTENT_ENCRYPTION_IV)

(def *-key-wrapping-metadata
  "Static Constant.

  Constant for the key wrapping metadata.

  type: java.lang.String"
  Constants$EncryptionConstants/KEY_WRAPPING_METADATA)

(def *-encryption-library
  "Static Constant.

  Constant for the key for the encryption library in the key wrapping metadata.

  type: java.lang.String"
  Constants$EncryptionConstants/ENCRYPTION_LIBRARY)

