(ns com.microsoft.azure.storage.table.TableRequestOptions
  "Represents a set of timeout, payload format, and retry policy options that may be specified for a table operation
  request."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.table TableRequestOptions]))

(defn ->table-request-options
  "Constructor.

  Creates an instance of the RequestOptions class by copying values from another
   TableRequestOptions instance.

  other - A TableRequestOptions object that represents the request options to copy. - `com.microsoft.azure.storage.table.TableRequestOptions`"
  (^TableRequestOptions [^com.microsoft.azure.storage.table.TableRequestOptions other]
    (new TableRequestOptions other))
  (^TableRequestOptions []
    (new TableRequestOptions )))

(defn set-encryption-policy
  "Sets the TableEncryptionPolicy object to use for this request.

   The default TableEncryptionPolicy is set in the client and is by default null, indicating no encryption. You can
   change the TableEncryptionPolicy on this request by setting this property. You can also change the value on the
   ServiceClient.getDefaultRequestOptions() object so that all subsequent requests made via the service
   client will use that TableEncryptionPolicy.

  encryption-policy - the TableEncryptionPolicy object to use when making service requests. - `com.microsoft.azure.storage.table.TableEncryptionPolicy`"
  ([^TableRequestOptions this ^com.microsoft.azure.storage.table.TableEncryptionPolicy encryption-policy]
    (-> this (.setEncryptionPolicy encryption-policy))))

(defn set-encryption-resolver
  "Sets the interface that contains a function which is used to get the value indicating whether a property should
   be encrypted or not given the partition key, row key, and the property name. A TableRequestOptions.EncryptionResolver is
   required if a TableEncryptionPolicy is specified.

   You can change the TableRequestOptions.EncryptionResolver on this request by setting this property. You can also change the
   value on the CloudTableClient.getDefaultRequestOptions() object so that all subsequent requests made
   via the service client will use that TableRequestOptions.EncryptionResolver.

  encryption-resolver - Specifies the TableRequestOptions.EncryptionResolver to set. - `com.microsoft.azure.storage.table.TableRequestOptions$EncryptionResolver`"
  ([^TableRequestOptions this ^com.microsoft.azure.storage.table.TableRequestOptions$EncryptionResolver encryption-resolver]
    (-> this (.setEncryptionResolver encryption-resolver))))

(defn get-table-payload-format
  "Gets the TablePayloadFormat to be used. For more information about TablePayloadFormat defaults,
   see setTablePayloadFormat(TablePayloadFormat).

  returns: The TablePayloadFormat used by this TableRequest. - `com.microsoft.azure.storage.table.TablePayloadFormat`"
  (^com.microsoft.azure.storage.table.TablePayloadFormat [^TableRequestOptions this]
    (-> this (.getTablePayloadFormat))))

(defn set-date-backward-compatibility
  "Sets whether the client should look to correct Date values stored on a TableEntity
   that may have been written using versions of this library prior to 2.0.0.

   dateBackwardCompatibility is by default false, indicating a post 2.0.0 version or mixed-
   platform usage. You can change the dateBackwardCompatibility on this request by setting this property.
   You can also change the value on the CloudTableClient.getDefaultRequestOptions() object so that all
   subsequent requests made via the service client will use that dateBackwardCompatibility.

   See here for more details.

  date-backward-compatibility - true to enable dateBackwardCompatibility; otherwise, false - `java.lang.Boolean`"
  ([^TableRequestOptions this ^java.lang.Boolean date-backward-compatibility]
    (-> this (.setDateBackwardCompatibility date-backward-compatibility))))

(defn set-property-resolver
  "Sets the interface that contains a function which is used to get the EdmType for an entity property
   given the partition key, row, key, and the property name.

   The default TableRequestOptions.PropertyResolver is set in the client and is by default null, indicating not to use a
   property resolver. You can change the TableRequestOptions.PropertyResolver on this request by setting this property. You can
   also change the value on the CloudTableClient.getDefaultRequestOptions() object so that all subsequent
   requests made via the service client will use that TableRequestOptions.PropertyResolver.

  property-resolver - Specifies the TableRequestOptions.PropertyResolver to set. - `com.microsoft.azure.storage.table.TableRequestOptions$PropertyResolver`"
  ([^TableRequestOptions this ^com.microsoft.azure.storage.table.TableRequestOptions$PropertyResolver property-resolver]
    (-> this (.setPropertyResolver property-resolver))))

(defn get-property-resolver
  "Gets the interface that contains a function which is used to get the EdmType for an entity property
   given the partition key, row, key, and the property name. For more information about the TableRequestOptions.PropertyResolver
   defaults, see setPropertyResolver(PropertyResolver).

  returns: The current TableRequestOptions.PropertyResolver object. - `com.microsoft.azure.storage.table.TableRequestOptions$PropertyResolver`"
  (^com.microsoft.azure.storage.table.TableRequestOptions$PropertyResolver [^TableRequestOptions this]
    (-> this (.getPropertyResolver))))

(defn get-date-backward-compatibility?
  "Gets whether the client should look to correct Date values stored on a TableEntity
   that may have been written using versions of this library prior to 2.0.0,
   see setDateBackwardCompatibility(Boolean).

   See here for more details.

  returns: true if dateBackwardCompatibility is enabled; otherwise, false - `java.lang.Boolean`"
  (^java.lang.Boolean [^TableRequestOptions this]
    (-> this (.getDateBackwardCompatibility))))

(defn get-encryption-resolver
  "Gets the interface that contains a function which is used to get the value indicating whether a property should
   be encrypted or not given the partition key, row key, and the property name. For more information about the
   TableRequestOptions.EncryptionResolver defaults, see setEncryptionResolver(EncryptionResolver).

  returns: The current TableRequestOptions.PropertyResolver object. - `com.microsoft.azure.storage.table.TableRequestOptions$EncryptionResolver`"
  (^com.microsoft.azure.storage.table.TableRequestOptions$EncryptionResolver [^TableRequestOptions this]
    (-> this (.getEncryptionResolver))))

(defn get-encryption-policy
  "Gets the encryption policy to use for this request. For more information about the encryption policy defaults,
   see setEncryptionPolicy(TableEncryptionPolicy).

  returns: An TableEncryptionPolicy object that represents the current encryption policy. - `com.microsoft.azure.storage.table.TableEncryptionPolicy`"
  (^com.microsoft.azure.storage.table.TableEncryptionPolicy [^TableRequestOptions this]
    (-> this (.getEncryptionPolicy))))

(defn set-table-payload-format
  "Sets the TablePayloadFormat to be used.

   The default TablePayloadFormat is set in the client and is by default TablePayloadFormat.Json.
   You can change the TablePayloadFormat on this request by setting this property. You can also change the
   value on the CloudTableClient.getDefaultRequestOptions() object so that all subsequent requests made
   via the service client will use that TablePayloadFormat.

  payload-format - Specifies the TablePayloadFormat to set. - `com.microsoft.azure.storage.table.TablePayloadFormat`"
  ([^TableRequestOptions this ^com.microsoft.azure.storage.table.TablePayloadFormat payload-format]
    (-> this (.setTablePayloadFormat payload-format))))

