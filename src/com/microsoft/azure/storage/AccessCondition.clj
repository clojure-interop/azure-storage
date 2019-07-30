(ns com.microsoft.azure.storage.AccessCondition
  "Represents a set of access conditions to be used for operations against the storage services."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage AccessCondition]))

(defn ->access-condition
  "Constructor.

  Creates an instance of the AccessCondition class."
  (^AccessCondition []
    (new AccessCondition )))

(defn *generate-if-none-match-condition
  "Returns an access condition such that an operation will be performed only if the resource's ETag value does not
   match the specified ETag value.

   Setting this access condition modifies the request to include the HTTP If-None-Match conditional header.
   If this access condition is set, the operation is performed only if the ETag of the resource does not match the
   specified ETag.

   For more information, see Specifying Conditional Headers
   for Blob Service Operations.

  etag - A String that represents the ETag value to check. - `java.lang.String`

  returns: An AccessCondition object that represents the If-None-Match condition. - `com.microsoft.azure.storage.AccessCondition`"
  (^com.microsoft.azure.storage.AccessCondition [^java.lang.String etag]
    (AccessCondition/generateIfNoneMatchCondition etag)))

(defn *generate-if-not-modified-since-condition
  "Returns an access condition such that an operation will be performed only if the resource has not been modified
   since the specified time.

   Setting this access condition modifies the request to include the HTTP If-Unmodified-Since conditional
   header. If this access condition is set, the operation is performed only if the resource has not been modified
   since the specified time.

   For more information, see Specifying Conditional Headers
   for Blob Service Operations.

  last-motified - A java.util.Date object that represents the last-modified time to check for the resource. - `java.util.Date`

  returns: An AccessCondition object that represents the If-Unmodified-Since condition. - `com.microsoft.azure.storage.AccessCondition`"
  (^com.microsoft.azure.storage.AccessCondition [^java.util.Date last-motified]
    (AccessCondition/generateIfNotModifiedSinceCondition last-motified)))

(defn *generate-if-not-exists-condition
  "Returns an access condition such that an operation will be performed only if the resource does not exist on the
   service.

   Setting this access condition modifies the request to include the HTTP If-None-Match conditional header.

   For more information, see Specifying Conditional Headers
   for Blob Service Operations.

  returns: An AccessCondition object that represents the if not exists condition. - `com.microsoft.azure.storage.AccessCondition`"
  (^com.microsoft.azure.storage.AccessCondition []
    (AccessCondition/generateIfNotExistsCondition )))

(defn *generate-if-match-condition
  "Returns an access condition such that an operation will be performed only if the resource's ETag value matches
   the specified ETag value.

   Setting this access condition modifies the request to include the HTTP If-Match conditional header. If
   this access condition is set, the operation is performed only if the ETag of the resource matches the specified
   ETag.

   For more information, see Specifying Conditional Headers
   for Blob Service Operations.

  etag - A String that represents the ETag value to check. - `java.lang.String`

  returns: An AccessCondition object that represents the If-Match condition. - `com.microsoft.azure.storage.AccessCondition`"
  (^com.microsoft.azure.storage.AccessCondition [^java.lang.String etag]
    (AccessCondition/generateIfMatchCondition etag)))

(defn *generate-lease-condition
  "Returns an access condition such that an operation will be performed only if the resource is accessible under the
   specified lease ID.

   For more information, see Specifying Conditional Headers
   for Blob Service Operations.

  lease-id - The lease ID to specify. - `java.lang.String`

  returns: An AccessCondition object that represents the lease condition. - `com.microsoft.azure.storage.AccessCondition`"
  (^com.microsoft.azure.storage.AccessCondition [^java.lang.String lease-id]
    (AccessCondition/generateLeaseCondition lease-id)))

(defn *generate-if-exists-condition
  "Returns an access condition such that an operation will be performed only if the resource exists on the service.

   Setting this access condition modifies the request to include the HTTP If-Match conditional header.

   For more information, see Specifying Conditional Headers
   for Blob Service Operations.

  returns: An AccessCondition object that represents the if exists condition. - `com.microsoft.azure.storage.AccessCondition`"
  (^com.microsoft.azure.storage.AccessCondition []
    (AccessCondition/generateIfExistsCondition )))

(defn *generate-if-sequence-number-equal-condition
  "Returns an access condition such that an operation will be performed only if resource's current sequence
   number is equal to the specified value. This condition only applies to page blobs.

  sequence-number - The value to compare to the current sequence number. - `long`

  returns: An AccessCondition object that represents the If-Sequence-Number-EQ condition. - `com.microsoft.azure.storage.AccessCondition`"
  (^com.microsoft.azure.storage.AccessCondition [^Long sequence-number]
    (AccessCondition/generateIfSequenceNumberEqualCondition sequence-number)))

(defn *generate-if-sequence-number-less-than-or-equal-condition
  "Returns an access condition such that an operation will be performed only if resource's current sequence
   number is less than or equal to the specified value. This condition only applies to page blobs.

  sequence-number - The value to compare to the current sequence number. - `long`

  returns: An AccessCondition object that represents the If-Sequence-Number-LE condition. - `com.microsoft.azure.storage.AccessCondition`"
  (^com.microsoft.azure.storage.AccessCondition [^Long sequence-number]
    (AccessCondition/generateIfSequenceNumberLessThanOrEqualCondition sequence-number)))

(defn *generate-empty-condition
  "Generates a new empty AccessCondition.

   For more information, see Specifying Conditional Headers
   for Blob Service Operations.

  returns: An AccessCondition object that has no conditions set. - `com.microsoft.azure.storage.AccessCondition`"
  (^com.microsoft.azure.storage.AccessCondition []
    (AccessCondition/generateEmptyCondition )))

(defn *generate-if-sequence-number-less-than-condition
  "Returns an access condition such that an operation will be performed only if resource's current sequence
   number is less than the specified value. This condition only applies to page blobs.

  sequence-number - The value to compare to the current sequence number. - `long`

  returns: An AccessCondition object that represents the If-Sequence-Number-LT condition. - `com.microsoft.azure.storage.AccessCondition`"
  (^com.microsoft.azure.storage.AccessCondition [^Long sequence-number]
    (AccessCondition/generateIfSequenceNumberLessThanCondition sequence-number)))

(defn *generate-if-modified-since-condition
  "Returns an access condition such that an operation will be performed only if the resource has been modified since
   the specified time.

   Setting this access condition modifies the request to include the HTTP If-Modified-Since conditional
   header. If this access condition is set, the operation is performed only if the resource has been modified since
   the specified time.

   For more information, see Specifying Conditional Headers
   for Blob Service Operations.

  last-motified - A java.util.Date object that represents the last-modified time to check for the resource. - `java.util.Date`

  returns: An AccessCondition object that represents the If-Modified-Since condition. - `com.microsoft.azure.storage.AccessCondition`"
  (^com.microsoft.azure.storage.AccessCondition [^java.util.Date last-motified]
    (AccessCondition/generateIfModifiedSinceCondition last-motified)))

(defn set-if-max-size-less-than-or-equal
  "Sets the value for a conditional header used only for append operations. A number that indicates the maximum length in
   bytes to restrict the blob to when committing the block.

  if-max-size-less-than-or-equal - The maximum size, or null if no condition exists. - `java.lang.Long`"
  ([^AccessCondition this ^java.lang.Long if-max-size-less-than-or-equal]
    (-> this (.setIfMaxSizeLessThanOrEqual if-max-size-less-than-or-equal))))

(defn verify-conditional
  "RESERVED FOR INTERNAL USE. Verifies the condition is satisfied.

  etag - A String that represents the ETag to check. - `java.lang.String`
  last-modified - A java.util.Date object that represents the last modified date/time. - `java.util.Date`

  returns: true if the condition is satisfied; otherwise, false. - `boolean`"
  (^Boolean [^AccessCondition this ^java.lang.String etag ^java.util.Date last-modified]
    (-> this (.verifyConditional etag last-modified))))

(defn apply-sequence-condition-to-request
  "RESERVED FOR INTERNAL USE. Applies the sequence number access conditions to the request.

  request - A java.net.HttpURLConnection object that represents the request to which the condition is being applied. - `java.net.HttpURLConnection`"
  ([^AccessCondition this ^java.net.HttpURLConnection request]
    (-> this (.applySequenceConditionToRequest request))))

(defn apply-lease-condition-to-request
  "RESERVED FOR INTERNAL USE. Applies the lease access condition to the request.

  request - A java.net.HttpURLConnection object that represents the request to which the condition is being applied. - `java.net.HttpURLConnection`"
  ([^AccessCondition this ^java.net.HttpURLConnection request]
    (-> this (.applyLeaseConditionToRequest request))))

(defn get-if-sequence-number-equal
  "Gets the sequence number when the sequence number equal condition is set. This condition
   is only applicable to page blobs.

  returns: The sequence number when the ifSequenceNumberEqual condition is set; otherwise, null - `java.lang.Long`"
  (^java.lang.Long [^AccessCondition this]
    (-> this (.getIfSequenceNumberEqual))))

(defn get-if-sequence-number-less-than-or-equal
  "Gets the sequence number when the sequence number less than or equal condition is set. This condition
   is only applicable to page blobs.

  returns: The sequence number when the ifSequenceNumberLessThanOrEqual condition is set; otherwise, null - `java.lang.Long`"
  (^java.lang.Long [^AccessCondition this]
    (-> this (.getIfSequenceNumberLessThanOrEqual))))

(defn get-if-max-size-less-than-or-equal
  "Gets the value for a conditional header used only for append operations. A number that indicates the maximum length in
   bytes to restrict the blob to when committing the block.

  returns: The maximum size, or null if no condition exists. - `java.lang.Long`"
  (^java.lang.Long [^AccessCondition this]
    (-> this (.getIfMaxSizeLessThanOrEqual))))

(defn apply-condition-to-request
  "RESERVED FOR INTERNAL USE. Applies the access conditions to the request.

  request - A java.net.HttpURLConnection object that represents the request to which the condition is being applied. - `java.net.HttpURLConnection`"
  ([^AccessCondition this ^java.net.HttpURLConnection request]
    (-> this (.applyConditionToRequest request))))

(defn set-if-sequence-number-less-than
  "Sets the sequence number for the sequence number less than condition. This condition
   is only applicable to page blobs.

  sequence-number - The sequence number to set the if sequence number less than condition to. - `java.lang.Long`"
  ([^AccessCondition this ^java.lang.Long sequence-number]
    (-> this (.setIfSequenceNumberLessThan sequence-number))))

(defn get-if-modified-since-date
  "Gets the If-Modified-Since date.

  returns: A java.util.Date object that represents the If-Modified-Since date. - `java.util.Date`"
  (^java.util.Date [^AccessCondition this]
    (-> this (.getIfModifiedSinceDate))))

(defn set-if-sequence-number-equal
  "Sets the sequence number for the sequence number equal to condition. This condition
   is only applicable to page blobs.

  sequence-number - The sequence number to set the if sequence number equal condition to. - `java.lang.Long`"
  ([^AccessCondition this ^java.lang.Long sequence-number]
    (-> this (.setIfSequenceNumberEqual sequence-number))))

(defn get-if-sequence-number-less-than
  "Gets the sequence number when the sequence number less than condition is set. This condition
   is only applicable to page blobs.

  returns: The sequence number when the ifSequenceNumberLessThan condition is set; otherwise, null - `java.lang.Long`"
  (^java.lang.Long [^AccessCondition this]
    (-> this (.getIfSequenceNumberLessThan))))

(defn get-if-none-match
  "Gets the ETag when the If-None-Match condition is set.

  returns: The ETag when the If-None-Match condition is set; otherwise, null. - `java.lang.String`"
  (^java.lang.String [^AccessCondition this]
    (-> this (.getIfNoneMatch))))

(defn set-if-modified-since-date
  "Sets the If-Modified-Since date.

  if-modified-since-date - A java.util.Date object that represents the If-Modified-Since to set. - `java.util.Date`"
  ([^AccessCondition this ^java.util.Date if-modified-since-date]
    (-> this (.setIfModifiedSinceDate if-modified-since-date))))

(defn get-if-append-position-equal
  "Gets the value for a conditional header used only for append operations. A number indicating the byte offset to check for.
   The append will succeed only if the end position is equal to this number.

  returns: The append position number, or null if no condition exists. - `java.lang.Long`"
  (^java.lang.Long [^AccessCondition this]
    (-> this (.getIfAppendPositionEqual))))

(defn apply-source-condition-to-request
  "RESERVED FOR INTERNAL USE. Applies the source access conditions to the request.

  request - A java.net.HttpURLConnection object that represents the request to which the condition is being applied. - `java.net.HttpURLConnection`"
  ([^AccessCondition this ^java.net.HttpURLConnection request]
    (-> this (.applySourceConditionToRequest request))))

(defn get-if-unmodified-since-date
  "Gets the If-Unmodified-Since date.

  returns: A java.util.Date object that represents the If-Unmodified-Since date. - `java.util.Date`"
  (^java.util.Date [^AccessCondition this]
    (-> this (.getIfUnmodifiedSinceDate))))

(defn set-if-match
  "Sets the ETag for the If-Match condition.

  etag - The ETag to set for the If-Match condition. - `java.lang.String`"
  ([^AccessCondition this ^java.lang.String etag]
    (-> this (.setIfMatch etag))))

(defn set-if-append-position-equal
  "Sets the value for a conditional header used only for append operations. A number indicating the byte offset to check for.
   The append will succeed only if the end position is equal to this number.

  if-append-position-equal - The append position number, or null if no condition exists. - `java.lang.Long`"
  ([^AccessCondition this ^java.lang.Long if-append-position-equal]
    (-> this (.setIfAppendPositionEqual if-append-position-equal))))

(defn set-lease-id
  "Gets the lease ID.

  lease-id - The lease ID to set. - `java.lang.String`"
  ([^AccessCondition this ^java.lang.String lease-id]
    (-> this (.setLeaseID lease-id))))

(defn get-if-match
  "Gets the ETag when the If-Match condition is set.

  returns: The ETag when the If-Match condition is set; otherwise, null. - `java.lang.String`"
  (^java.lang.String [^AccessCondition this]
    (-> this (.getIfMatch))))

(defn set-if-none-match
  "Sets the ETag for the If-None-Match condition.

  etag - The ETag to set for the If-None-Match condition. - `java.lang.String`"
  ([^AccessCondition this ^java.lang.String etag]
    (-> this (.setIfNoneMatch etag))))

(defn apply-append-condition-to-request
  "RESERVED FOR INTERNAL USE. Applies the access condition to the request.

  request - A java.net.HttpURLConnection object that represents the request to which the condition is being applied. - `java.net.HttpURLConnection`"
  ([^AccessCondition this ^java.net.HttpURLConnection request]
    (-> this (.applyAppendConditionToRequest request))))

(defn set-if-unmodified-since-date
  "Sets the If-Unmodified-Since date.

  if-unmodified-since-date - A java.util.Date object that represents the If-Unmodified-Since to set. - `java.util.Date`"
  ([^AccessCondition this ^java.util.Date if-unmodified-since-date]
    (-> this (.setIfUnmodifiedSinceDate if-unmodified-since-date))))

(defn set-if-sequence-number-less-than-or-equal
  "Sets the sequence number for the sequence number less than or equal to condition. This condition
   is only applicable to page blobs.

  sequence-number - The sequence number to set the if sequence number less than or equal condition to. - `java.lang.Long`"
  ([^AccessCondition this ^java.lang.Long sequence-number]
    (-> this (.setIfSequenceNumberLessThanOrEqual sequence-number))))

(defn get-lease-id
  "Gets the lease ID.

  returns: The lease ID. - `java.lang.String`"
  (^java.lang.String [^AccessCondition this]
    (-> this (.getLeaseID))))

