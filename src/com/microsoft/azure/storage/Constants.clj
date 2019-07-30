(ns com.microsoft.azure.storage.Constants
  "RESERVED FOR INTERNAL USE. Contains storage constants."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage Constants]))

(def *-prefix-for-storage-header
  "Static Constant.

  The master Microsoft Azure Storage header prefix.

  type: java.lang.String"
  Constants/PREFIX_FOR_STORAGE_HEADER)

(def *-kb
  "Static Constant.

  Constant representing a kilobyte (Non-SI version).

  type: int"
  Constants/KB)

(def *-mb
  "Static Constant.

  Constant representing a megabyte (Non-SI version).

  type: int"
  Constants/MB)

(def *-gb
  "Static Constant.

  Constant representing a gigabyte (Non-SI version).

  type: int"
  Constants/GB)

(def *-access-policy
  "Static Constant.

  XML element for an access policy.

  type: java.lang.String"
  Constants/ACCESS_POLICY)

(def *-access-tier
  "Static Constant.

  XML element for access tier.

  type: java.lang.String"
  Constants/ACCESS_TIER)

(def *-access-tier-change-time
  "Static Constant.

  XML element for the access tier change time.

  type: java.lang.String"
  Constants/ACCESS_TIER_CHANGE_TIME)

(def *-access-tier-inferred
  "Static Constant.

  XML element for access if the access tier is inferred.

  type: java.lang.String"
  Constants/ACCESS_TIER_INFERRED)

(def *-archive-status
  "Static Constant.

  XML element for the archive status.

  type: java.lang.String"
  Constants/ARCHIVE_STATUS)

(def *-buffer-copy-length
  "Static Constant.

  Buffer width used to copy data to output streams.

  type: int"
  Constants/BUFFER_COPY_LENGTH)

(def *-copy-completion-time-element
  "Static Constant.

  XML element for the copy completion time.

  type: java.lang.String"
  Constants/COPY_COMPLETION_TIME_ELEMENT)

(def *-copy-id-element
  "Static Constant.

  XML element for the copy id.

  type: java.lang.String"
  Constants/COPY_ID_ELEMENT)

(def *-copy-progress-element
  "Static Constant.

  XML element for the copy progress.

  type: java.lang.String"
  Constants/COPY_PROGRESS_ELEMENT)

(def *-copy-source-element
  "Static Constant.

  XML element for the copy source .

  type: java.lang.String"
  Constants/COPY_SOURCE_ELEMENT)

(def *-copy-status-description-element
  "Static Constant.

  XML element for the copy status description.

  type: java.lang.String"
  Constants/COPY_STATUS_DESCRIPTION_ELEMENT)

(def *-copy-status-element
  "Static Constant.

  XML element for the copy status.

  type: java.lang.String"
  Constants/COPY_STATUS_ELEMENT)

(def *-incremental-copy-element
  "Static Constant.

  XML element for the copy type.

  type: java.lang.String"
  Constants/INCREMENTAL_COPY_ELEMENT)

(def *-copy-destination-snapshot-id-element
  "Static Constant.

  XML element for the snapshot ID for the last successful incremental copy.

  type: java.lang.String"
  Constants/COPY_DESTINATION_SNAPSHOT_ID_ELEMENT)

(def *-default-read-timeout
  "Static Constant.

  Default read timeout. 5 min * 60 seconds * 1000 ms

  type: int"
  Constants/DEFAULT_READ_TIMEOUT)

(def *-delimiter-element
  "Static Constant.

  XML element for delimiters.

  type: java.lang.String"
  Constants/DELIMITER_ELEMENT)

(def *-http-get
  "Static Constant.

  Http GET method.

  type: java.lang.String"
  Constants/HTTP_GET)

(def *-http-put
  "Static Constant.

  Http PUT method.

  type: java.lang.String"
  Constants/HTTP_PUT)

(def *-http-delete
  "Static Constant.

  Http DELETE method.

  type: java.lang.String"
  Constants/HTTP_DELETE)

(def *-http-head
  "Static Constant.

  Http HEAD method.

  type: java.lang.String"
  Constants/HTTP_HEAD)

(def *-http-post
  "Static Constant.

  Http POST method.

  type: java.lang.String"
  Constants/HTTP_POST)

(def *-empty-string
  "Static Constant.

  An empty String to use for comparison.

  type: java.lang.String"
  Constants/EMPTY_STRING)

(def *-end-element
  "Static Constant.

  XML element for page range end elements.

  type: java.lang.String"
  Constants/END_ELEMENT)

(def *-error-code
  "Static Constant.

  XML element for error codes.

  type: java.lang.String"
  Constants/ERROR_CODE)

(def *-error-exception
  "Static Constant.

  XML element for exception details.

  type: java.lang.String"
  Constants/ERROR_EXCEPTION)

(def *-error-exception-message
  "Static Constant.

  XML element for exception messages.

  type: java.lang.String"
  Constants/ERROR_EXCEPTION_MESSAGE)

(def *-error-exception-stack-trace
  "Static Constant.

  XML element for stack traces.

  type: java.lang.String"
  Constants/ERROR_EXCEPTION_STACK_TRACE)

(def *-error-message
  "Static Constant.

  XML element for error messages.

  type: java.lang.String"
  Constants/ERROR_MESSAGE)

(def *-error-root-element
  "Static Constant.

  XML root element for errors.

  type: java.lang.String"
  Constants/ERROR_ROOT_ELEMENT)

(def *-etag-element
  "Static Constant.

  XML element for the ETag.

  type: java.lang.String"
  Constants/ETAG_ELEMENT)

(def *-expiry
  "Static Constant.

  XML element for the end time of an access policy.

  type: java.lang.String"
  Constants/EXPIRY)

(def *-false
  "Static Constant.

  Constant for False.

  type: java.lang.String"
  Constants/FALSE)

(def *-geo-bootstrap-value
  "Static Constant.

  Constant for bootstrap geo-replication status.

  type: java.lang.String"
  Constants/GEO_BOOTSTRAP_VALUE)

(def *-geo-live-value
  "Static Constant.

  Constant for live geo-replication status.

  type: java.lang.String"
  Constants/GEO_LIVE_VALUE)

(def *-geo-unavailable-value
  "Static Constant.

  Constant for unavailable geo-replication status.

  type: java.lang.String"
  Constants/GEO_UNAVAILABLE_VALUE)

(def *-http
  "Static Constant.

  Specifies HTTP.

  type: java.lang.String"
  Constants/HTTP)

(def *-https
  "Static Constant.

  Specifies HTTPS.

  type: java.lang.String"
  Constants/HTTPS)

(def *-https-http
  "Static Constant.

  Specifies both HTTPS and HTTP.

  type: java.lang.String"
  Constants/HTTPS_HTTP)

(def *-id
  "Static Constant.

  XML attribute for IDs.

  type: java.lang.String"
  Constants/ID)

(def *-invalid-metadata-name
  "Static Constant.

  XML element for an invalid metadata name.

  type: java.lang.String"
  Constants/INVALID_METADATA_NAME)

(def *-last-modified-element
  "Static Constant.

  XML element for the last modified date.

  type: java.lang.String"
  Constants/LAST_MODIFIED_ELEMENT)

(def *-lease-break-period-max
  "Static Constant.

  Lease break period max in seconds.

  type: int"
  Constants/LEASE_BREAK_PERIOD_MAX)

(def *-lease-break-period-min
  "Static Constant.

  Lease break period min in seconds.

  type: int"
  Constants/LEASE_BREAK_PERIOD_MIN)

(def *-lease-duration-element
  "Static Constant.

  XML element for the lease duration.

  type: java.lang.String"
  Constants/LEASE_DURATION_ELEMENT)

(def *-lease-duration-max
  "Static Constant.

  Lease duration max in seconds.

  type: int"
  Constants/LEASE_DURATION_MAX)

(def *-lease-duration-min
  "Static Constant.

  Lease duration min in seconds.

  type: int"
  Constants/LEASE_DURATION_MIN)

(def *-lease-state-element
  "Static Constant.

  XML element for the lease state.

  type: java.lang.String"
  Constants/LEASE_STATE_ELEMENT)

(def *-lease-status-element
  "Static Constant.

  XML element for the lease status.

  type: java.lang.String"
  Constants/LEASE_STATUS_ELEMENT)

(def *-locked-value
  "Static Constant.

  Constant signaling the resource is locked.

  type: java.lang.String"
  Constants/LOCKED_VALUE)

(def *-marker-element
  "Static Constant.

  XML element for a marker.

  type: java.lang.String"
  Constants/MARKER_ELEMENT)

(defn *-max-range-content-md-5
  "Static Field.

  The maximum size for Range ContentMD5.

  type: int"
  []
  Constants/MAX_RANGE_CONTENT_MD5)

(defn *-max-block-size
  "Static Field.

  The maximum size of a BlockBlob block.

  type: int"
  []
  Constants/MAX_BLOCK_SIZE)

(defn *-max-append-block-size
  "Static Field.

  The maximum size of an AppendBlob block.

  type: int"
  []
  Constants/MAX_APPEND_BLOCK_SIZE)

(defn *-max-page-write-size
  "Static Field.

  The maximum write size that can uploaded to a PageBlob at once.

  type: int"
  []
  Constants/MAX_PAGE_WRITE_SIZE)

(defn *-max-file-write-size
  "Static Field.

  The maximum write size for Files

  type: int"
  []
  Constants/MAX_FILE_WRITE_SIZE)

(defn *-min-permitted-file-write-size
  "Static Field.

  The minimum suggested write size for Files.

  type: int"
  []
  Constants/MIN_PERMITTED_FILE_WRITE_SIZE)

(def *-max-block-number
  "Static Constant.

  The maximum number of blocks.

  type: long"
  Constants/MAX_BLOCK_NUMBER)

(def *-max-blob-size
  "Static Constant.

  The maximum size of a Block Blob.

  type: long"
  Constants/MAX_BLOB_SIZE)

(def *-min-permitted-block-size
  "Static Constant.

  The minimum suggested size of a block.

  type: int"
  Constants/MIN_PERMITTED_BLOCK_SIZE)

(defn *-min-large-block-size
  "Static Field.

  The minimum size of a block for the large block upload strategy to be employed.

  type: int"
  []
  Constants/MIN_LARGE_BLOCK_SIZE)

(def *-substream-buffer-size
  "Static Constant.

  The default read buffer size used by the SubStream class.

  type: int"
  Constants/SUBSTREAM_BUFFER_SIZE)

(def *-default-stream-write-in-bytes
  "Static Constant.

  The default write size, in bytes, used by BlobOutputStream or FileOutputStream.

  type: int"
  Constants/DEFAULT_STREAM_WRITE_IN_BYTES)

(def *-default-minimum-read-size-in-bytes
  "Static Constant.

  The default minimum read size, in bytes, for a BlobInputStream or FileInputStream.

  type: int"
  Constants/DEFAULT_MINIMUM_READ_SIZE_IN_BYTES)

(def *-max-mark-length
  "Static Constant.

  The maximum size, in bytes, of a given stream mark operation.

  type: int"
  Constants/MAX_MARK_LENGTH)

(def *-max-results-element
  "Static Constant.

  XML element for maximum results.

  type: java.lang.String"
  Constants/MAX_RESULTS_ELEMENT)

(def *-max-shared-access-policy-identifiers
  "Static Constant.

  Maximum number of shared access policy identifiers supported by server.

  type: int"
  Constants/MAX_SHARED_ACCESS_POLICY_IDENTIFIERS)

(def *-maximum-segmented-results
  "Static Constant.

  Number of default concurrent requests for parallel operation.

  type: int"
  Constants/MAXIMUM_SEGMENTED_RESULTS)

(def *-metadata-element
  "Static Constant.

  XML element for the metadata.

  type: java.lang.String"
  Constants/METADATA_ELEMENT)

(def *-name-element
  "Static Constant.

  XML element for names.

  type: java.lang.String"
  Constants/NAME_ELEMENT)

(def *-next-marker-element
  "Static Constant.

  XML element for the next marker.

  type: java.lang.String"
  Constants/NEXT_MARKER_ELEMENT)

(def *-page-size
  "Static Constant.

  The size of a page, in bytes, in a page blob.

  type: int"
  Constants/PAGE_SIZE)

(def *-permission
  "Static Constant.

  XML element for the permission of an access policy.

  type: java.lang.String"
  Constants/PERMISSION)

(def *-prefix-element
  "Static Constant.

  XML element for a prefix.

  type: java.lang.String"
  Constants/PREFIX_ELEMENT)

(def *-properties
  "Static Constant.

  XML element for properties.

  type: java.lang.String"
  Constants/PROPERTIES)

(def *-public-access-element
  "Static Constant.

  XML element for  public access

  type: java.lang.String"
  Constants/PUBLIC_ACCESS_ELEMENT)

(def *-server-encryption-status-element
  "Static Constant.

  XML element for the server encryption status.

  type: java.lang.String"
  Constants/SERVER_ENCRYPTION_STATUS_ELEMENT)

(def *-signed-identifier-element
  "Static Constant.

  XML element for a signed identifier.

  type: java.lang.String"
  Constants/SIGNED_IDENTIFIER_ELEMENT)

(def *-signed-identifiers-element
  "Static Constant.

  XML element for signed identifiers.

  type: java.lang.String"
  Constants/SIGNED_IDENTIFIERS_ELEMENT)

(def *-start
  "Static Constant.

  XML element for the start time of an access policy.

  type: java.lang.String"
  Constants/START)

(def *-true
  "Static Constant.

  Constant for True.

  type: java.lang.String"
  Constants/TRUE)

(def *-unlocked-value
  "Static Constant.

  Constant signaling the resource is unlocked.

  type: java.lang.String"
  Constants/UNLOCKED_VALUE)

(def *-unspecified-value
  "Static Constant.

  Constant signaling the resource lease duration, state or status is unspecified.

  type: java.lang.String"
  Constants/UNSPECIFIED_VALUE)

(def *-url-element
  "Static Constant.

  XML element for the URL.

  type: java.lang.String"
  Constants/URL_ELEMENT)

(def *-utf-8-charset
  "Static Constant.

  The default type for content-type and accept

  type: java.lang.String"
  Constants/UTF8_CHARSET)

