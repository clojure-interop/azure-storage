(ns com.microsoft.azure.storage.Constants$HeaderConstants
  "Defines constants for use with HTTP headers."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage Constants$HeaderConstants]))

(defn ->constants.-header-constants
  "Constructor."
  (^Constants$HeaderConstants []
    (new Constants$HeaderConstants )))

(def *-accept
  "Static Constant.

  The Accept header.

  type: java.lang.String"
  Constants$HeaderConstants/ACCEPT)

(def *-accept-charset
  "Static Constant.

  The Accept header.

  type: java.lang.String"
  Constants$HeaderConstants/ACCEPT_CHARSET)

(def *-account-kind
  "Static Constant.

  The header that represents the kind of storage account.

  type: java.lang.String"
  Constants$HeaderConstants/ACCOUNT_KIND)

(def *-authorization
  "Static Constant.

  The Authorization header.

  type: java.lang.String"
  Constants$HeaderConstants/AUTHORIZATION)

(def *-bearer
  "Static Constant.

  The keyword used for bearer token authorization.

  type: java.lang.String"
  Constants$HeaderConstants/BEARER)

(def *-begin-range-header-format
  "Static Constant.

  The format string for specifying ranges with only begin offset.

  type: java.lang.String"
  Constants$HeaderConstants/BEGIN_RANGE_HEADER_FORMAT)

(def *-blob-append-offset
  "Static Constant.

  The format string for specifying the blob append offset.

  type: java.lang.String"
  Constants$HeaderConstants/BLOB_APPEND_OFFSET)

(def *-blob-committed-block-count
  "Static Constant.

  The header that specifies committed block count.

  type: java.lang.String"
  Constants$HeaderConstants/BLOB_COMMITTED_BLOCK_COUNT)

(def *-blob-sequence-number
  "Static Constant.

  The header that specifies blob sequence number.

  type: java.lang.String"
  Constants$HeaderConstants/BLOB_SEQUENCE_NUMBER)

(def *-cache-control
  "Static Constant.

  The CacheControl header.

  type: java.lang.String"
  Constants$HeaderConstants/CACHE_CONTROL)

(def *-cache-control-header
  "Static Constant.

  The header that specifies blob caching control.

  type: java.lang.String"
  Constants$HeaderConstants/CACHE_CONTROL_HEADER)

(def *-client-request-id-header
  "Static Constant.

  The header that indicates the client request ID.

  type: java.lang.String"
  Constants$HeaderConstants/CLIENT_REQUEST_ID_HEADER)

(def *-content-disposition
  "Static Constant.

  The ContentDisposition header.

  type: java.lang.String"
  Constants$HeaderConstants/CONTENT_DISPOSITION)

(def *-content-encoding
  "Static Constant.

  The ContentEncoding header.

  type: java.lang.String"
  Constants$HeaderConstants/CONTENT_ENCODING)

(def *-content-language
  "Static Constant.

  The ContentLangauge header.

  type: java.lang.String"
  Constants$HeaderConstants/CONTENT_LANGUAGE)

(def *-content-length
  "Static Constant.

  The ContentLength header.

  type: java.lang.String"
  Constants$HeaderConstants/CONTENT_LENGTH)

(def *-content-md-5
  "Static Constant.

  The ContentMD5 header.

  type: java.lang.String"
  Constants$HeaderConstants/CONTENT_MD5)

(def *-content-range
  "Static Constant.

  The ContentRange header.

  type: java.lang.String"
  Constants$HeaderConstants/CONTENT_RANGE)

(def *-content-type
  "Static Constant.

  The ContentType header.

  type: java.lang.String"
  Constants$HeaderConstants/CONTENT_TYPE)

(def *-copy-action-abort
  "Static Constant.

  The value of the copy action header that signifies an abort operation.

  type: java.lang.String"
  Constants$HeaderConstants/COPY_ACTION_ABORT)

(def *-copy-action-header
  "Static Constant.

  Header that specifies the copy action.

  type: java.lang.String"
  Constants$HeaderConstants/COPY_ACTION_HEADER)

(def *-copy-completion-time
  "Static Constant.

  The header that specifies copy completion time.

  type: java.lang.String"
  Constants$HeaderConstants/COPY_COMPLETION_TIME)

(def *-copy-id
  "Static Constant.

  The header that specifies copy id.

  type: java.lang.String"
  Constants$HeaderConstants/COPY_ID)

(def *-copy-progress
  "Static Constant.

  The header that specifies copy progress.

  type: java.lang.String"
  Constants$HeaderConstants/COPY_PROGRESS)

(def *-copy-source
  "Static Constant.

  The header that specifies copy source.

  type: java.lang.String"
  Constants$HeaderConstants/COPY_SOURCE)

(def *-copy-source-header
  "Static Constant.

  The header for copy source.

  type: java.lang.String"
  Constants$HeaderConstants/COPY_SOURCE_HEADER)

(def *-copy-status
  "Static Constant.

  The header that specifies copy status.

  type: java.lang.String"
  Constants$HeaderConstants/COPY_STATUS)

(def *-copy-status-description
  "Static Constant.

  The header that specifies copy status description.

  type: java.lang.String"
  Constants$HeaderConstants/COPY_STATUS_DESCRIPTION)

(def *-incremental-copy
  "Static Constant.

  The header that specifies copy type.

  type: java.lang.String"
  Constants$HeaderConstants/INCREMENTAL_COPY)

(def *-copy-destination-snapshot-id
  "Static Constant.

  The header that specifies the snapshot ID of the last successful incremental snapshot.

  type: java.lang.String"
  Constants$HeaderConstants/COPY_DESTINATION_SNAPSHOT_ID)

(def *-date
  "Static Constant.

  The header that specifies the date.

  type: java.lang.String"
  Constants$HeaderConstants/DATE)

(def *-delete-snapshot-header
  "Static Constant.

  The header to delete snapshots.

  type: java.lang.String"
  Constants$HeaderConstants/DELETE_SNAPSHOT_HEADER)

(def *-etag
  "Static Constant.

  The ETag header.

  type: java.lang.String"
  Constants$HeaderConstants/ETAG)

(def *-error-code
  "Static Constant.

  The ErrorCode header.

  type: java.lang.String"
  Constants$HeaderConstants/ERROR_CODE)

(def *-http-unused-306
  "Static Constant.

  An unused HTTP code used internally to indicate a non-http related failure when constructing
   StorageException objects

  type: int"
  Constants$HeaderConstants/HTTP_UNUSED_306)

(def *-if-append-position-equal-header
  "Static Constant.

  The blob append position equal header.

  type: java.lang.String"
  Constants$HeaderConstants/IF_APPEND_POSITION_EQUAL_HEADER)

(def *-if-match
  "Static Constant.

  The IfMatch header.

  type: java.lang.String"
  Constants$HeaderConstants/IF_MATCH)

(def *-if-max-size-less-than-or-equal
  "Static Constant.

  The blob maxsize condition header.

  type: java.lang.String"
  Constants$HeaderConstants/IF_MAX_SIZE_LESS_THAN_OR_EQUAL)

(def *-if-modified-since
  "Static Constant.

  The IfModifiedSince header.

  type: java.lang.String"
  Constants$HeaderConstants/IF_MODIFIED_SINCE)

(def *-if-none-match
  "Static Constant.

  The IfNoneMatch header.

  type: java.lang.String"
  Constants$HeaderConstants/IF_NONE_MATCH)

(def *-if-unmodified-since
  "Static Constant.

  The IfUnmodifiedSince header.

  type: java.lang.String"
  Constants$HeaderConstants/IF_UNMODIFIED_SINCE)

(def *-if-sequence-number-less-than-or-equal
  "Static Constant.

  The blob sequence number less than or equal condition header.

  type: java.lang.String"
  Constants$HeaderConstants/IF_SEQUENCE_NUMBER_LESS_THAN_OR_EQUAL)

(def *-if-sequence-number-less-than
  "Static Constant.

  The blob sequence number less than condition header.

  type: java.lang.String"
  Constants$HeaderConstants/IF_SEQUENCE_NUMBER_LESS_THAN)

(def *-if-sequence-number-equal
  "Static Constant.

  The blob sequence number equal condition header.

  type: java.lang.String"
  Constants$HeaderConstants/IF_SEQUENCE_NUMBER_EQUAL)

(def *-include-snapshots-value
  "Static Constant.

  Specifies snapshots are to be included.

  type: java.lang.String"
  Constants$HeaderConstants/INCLUDE_SNAPSHOTS_VALUE)

(def *-lease-action-header
  "Static Constant.

  The header that specifies the lease action to perform

  type: java.lang.String"
  Constants$HeaderConstants/LEASE_ACTION_HEADER)

(def *-lease-break-period-header
  "Static Constant.

  The header that specifies the break period of a lease

  type: java.lang.String"
  Constants$HeaderConstants/LEASE_BREAK_PERIOD_HEADER)

(def *-lease-duration
  "Static Constant.

  The header that specifies lease duration.

  type: java.lang.String"
  Constants$HeaderConstants/LEASE_DURATION)

(def *-lease-id-header
  "Static Constant.

  The header that specifies lease ID.

  type: java.lang.String"
  Constants$HeaderConstants/LEASE_ID_HEADER)

(def *-lease-state
  "Static Constant.

  The header that specifies lease state.

  type: java.lang.String"
  Constants$HeaderConstants/LEASE_STATE)

(def *-lease-status
  "Static Constant.

  The header that specifies lease status.

  type: java.lang.String"
  Constants$HeaderConstants/LEASE_STATUS)

(def *-lease-time-header
  "Static Constant.

  The header that specifies the remaining lease time

  type: java.lang.String"
  Constants$HeaderConstants/LEASE_TIME_HEADER)

(def *-pop-receipt-header
  "Static Constant.

  The header that specifies the pop receipt.

  type: java.lang.String"
  Constants$HeaderConstants/POP_RECEIPT_HEADER)

(def *-prefix-for-storage-metadata
  "Static Constant.

  The header prefix for metadata.

  type: java.lang.String"
  Constants$HeaderConstants/PREFIX_FOR_STORAGE_METADATA)

(def *-prefix-for-storage-properties
  "Static Constant.

  The header prefix for properties.

  type: java.lang.String"
  Constants$HeaderConstants/PREFIX_FOR_STORAGE_PROPERTIES)

(def *-proposed-lease-id-header
  "Static Constant.

  The header that specifies the proposed lease ID for a leasing operation

  type: java.lang.String"
  Constants$HeaderConstants/PROPOSED_LEASE_ID_HEADER)

(def *-range
  "Static Constant.

  The Range header.

  type: java.lang.String"
  Constants$HeaderConstants/RANGE)

(def *-range-get-content-md-5
  "Static Constant.

  The header that specifies if the request will populate the ContentMD5 header for range gets.

  type: java.lang.String"
  Constants$HeaderConstants/RANGE_GET_CONTENT_MD5)

(def *-range-header-format
  "Static Constant.

  The format string for specifying ranges.

  type: java.lang.String"
  Constants$HeaderConstants/RANGE_HEADER_FORMAT)

(def *-request-id-header
  "Static Constant.

  The header that indicates the request ID.

  type: java.lang.String"
  Constants$HeaderConstants/REQUEST_ID_HEADER)

(def *-requires-sync-header
  "Static Constant.

  The header for copy sync.

  type: java.lang.String"
  Constants$HeaderConstants/REQUIRES_SYNC_HEADER)

(def *-server
  "Static Constant.

  The header field value received that indicates which server was accessed

  type: java.lang.String"
  Constants$HeaderConstants/SERVER)

(def *-server-encrypted
  "Static Constant.

  The header that specifies whether a resource is fully encrypted server-side

  type: java.lang.String"
  Constants$HeaderConstants/SERVER_ENCRYPTED)

(def *-server-request-encrypted
  "Static Constant.

  The header that acknowledges data used for a write operation is encrypted server-side

  type: java.lang.String"
  Constants$HeaderConstants/SERVER_REQUEST_ENCRYPTED)

(def *-sku-name
  "Static Constant.

  The header that specifies the sku name for an account.

  type: java.lang.String"
  Constants$HeaderConstants/SKU_NAME)

(def *-snapshot-id-header
  "Static Constant.

  The header that specifies the snapshot ID.

  type: java.lang.String"
  Constants$HeaderConstants/SNAPSHOT_ID_HEADER)

(def *-source-content-md-5-header
  "Static Constant.

  The header that specifies source content MD5.

  type: java.lang.String"
  Constants$HeaderConstants/SOURCE_CONTENT_MD5_HEADER)

(def *-source-if-match-header
  "Static Constant.

  The header for the If-Match condition.

  type: java.lang.String"
  Constants$HeaderConstants/SOURCE_IF_MATCH_HEADER)

(def *-source-if-modified-since-header
  "Static Constant.

  The header for the If-Modified-Since condition.

  type: java.lang.String"
  Constants$HeaderConstants/SOURCE_IF_MODIFIED_SINCE_HEADER)

(def *-source-if-none-match-header
  "Static Constant.

  The header for the If-None-Match condition.

  type: java.lang.String"
  Constants$HeaderConstants/SOURCE_IF_NONE_MATCH_HEADER)

(def *-source-if-unmodified-since-header
  "Static Constant.

  The header for the If-Unmodified-Since condition.

  type: java.lang.String"
  Constants$HeaderConstants/SOURCE_IF_UNMODIFIED_SINCE_HEADER)

(def *-source-lease-id-header
  "Static Constant.

  The header for the source lease id.

  type: java.lang.String"
  Constants$HeaderConstants/SOURCE_LEASE_ID_HEADER)

(def *-storage-range-header
  "Static Constant.

  The header for data ranges.

  type: java.lang.String"
  Constants$HeaderConstants/STORAGE_RANGE_HEADER)

(def *-storage-source-range-header
  "Static Constant.

  The header for data ranges.

  type: java.lang.String"
  Constants$HeaderConstants/STORAGE_SOURCE_RANGE_HEADER)

(def *-storage-version-header
  "Static Constant.

  The header for storage version.

  type: java.lang.String"
  Constants$HeaderConstants/STORAGE_VERSION_HEADER)

(def *-target-storage-version
  "Static Constant.

  The current storage version header value.

  type: java.lang.String"
  Constants$HeaderConstants/TARGET_STORAGE_VERSION)

(def *-time-next-visible-header
  "Static Constant.

  The header that specifies the next visible time for a queue message.

  type: java.lang.String"
  Constants$HeaderConstants/TIME_NEXT_VISIBLE_HEADER)

(def *-user-agent
  "Static Constant.

  The UserAgent header.

  type: java.lang.String"
  Constants$HeaderConstants/USER_AGENT)

(def *-user-agent-prefix
  "Static Constant.

  Specifies the value to use for UserAgent header.

  type: java.lang.String"
  Constants$HeaderConstants/USER_AGENT_PREFIX)

(def *-user-agent-version
  "Static Constant.

  Specifies the value to use for UserAgent header.

  type: java.lang.String"
  Constants$HeaderConstants/USER_AGENT_VERSION)

(def *-xml-type
  "Static Constant.

  The default type for content-type and accept

  type: java.lang.String"
  Constants$HeaderConstants/XML_TYPE)

