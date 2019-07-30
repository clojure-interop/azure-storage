(ns com.microsoft.azure.storage.StorageErrorCodeStrings
  "Represents common error code strings for Azure Storage."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage StorageErrorCodeStrings]))

(def *-account-already-exists
  "Static Constant.

  The specified account already exists.

  type: java.lang.String"
  StorageErrorCodeStrings/ACCOUNT_ALREADY_EXISTS)

(def *-account-being-created
  "Static Constant.

  The specified account is in the process of being created.

  type: java.lang.String"
  StorageErrorCodeStrings/ACCOUNT_BEING_CREATED)

(def *-account-is-disabled
  "Static Constant.

  The specified account is disabled.

  type: java.lang.String"
  StorageErrorCodeStrings/ACCOUNT_IS_DISABLED)

(def *-authentication-failed
  "Static Constant.

  Authentication failed.

  type: java.lang.String"
  StorageErrorCodeStrings/AUTHENTICATION_FAILED)

(def *-blob-already-exists
  "Static Constant.

  The specified blob already exists.

  type: java.lang.String"
  StorageErrorCodeStrings/BLOB_ALREADY_EXISTS)

(def *-blob-not-found
  "Static Constant.

  The specified blob does not exist.

  type: java.lang.String"
  StorageErrorCodeStrings/BLOB_NOT_FOUND)

(def *-cannot-verify-copy-source
  "Static Constant.

  Could not verify the copy source within the specified time. Examine the HTTP status code and message for more
   information about the failure.

  type: java.lang.String"
  StorageErrorCodeStrings/CANNOT_VERIFY_COPY_SOURCE)

(def *-cannot-delete-file-or-directory
  "Static Constant.

  The file or directory could not be deleted because it is in use by an SMB client.

  type: java.lang.String"
  StorageErrorCodeStrings/CANNOT_DELETE_FILE_OR_DIRECTORY)

(def *-client-cache-flush-delay
  "Static Constant.

  The specified resource state could not be flushed from an SMB client in the specified time.

  type: java.lang.String"
  StorageErrorCodeStrings/CLIENT_CACHE_FLUSH_DELAY)

(def *-condition-headers-not-supported
  "Static Constant.

  Condition headers are not supported.

  type: java.lang.String"
  StorageErrorCodeStrings/CONDITION_HEADERS_NOT_SUPPORTED)

(def *-condition-not-met
  "Static Constant.

  The specified condition was not met.

  type: java.lang.String"
  StorageErrorCodeStrings/CONDITION_NOT_MET)

(def *-container-already-exists
  "Static Constant.

  The specified container already exists.

  type: java.lang.String"
  StorageErrorCodeStrings/CONTAINER_ALREADY_EXISTS)

(def *-container-being-deleted
  "Static Constant.

  The specified container is being deleted.

  type: java.lang.String"
  StorageErrorCodeStrings/CONTAINER_BEING_DELETED)

(def *-container-disabled
  "Static Constant.

  The specified container is disabled.

  type: java.lang.String"
  StorageErrorCodeStrings/CONTAINER_DISABLED)

(def *-container-not-found
  "Static Constant.

  The specified container was not found.

  type: java.lang.String"
  StorageErrorCodeStrings/CONTAINER_NOT_FOUND)

(def *-copy-across-accounts-not-supported
  "Static Constant.

  The copy source account and destination account must be the same.

  type: java.lang.String"
  StorageErrorCodeStrings/COPY_ACROSS_ACCOUNTS_NOT_SUPPORTED)

(def *-copy-id-mismatch
  "Static Constant.

  The specified copy ID did not match the copy ID for the pending copy operation.

  type: java.lang.String"
  StorageErrorCodeStrings/COPY_ID_MISMATCH)

(def *-delete-pending
  "Static Constant.

  The specified resource is marked for deletion by an SMB client.

  type: java.lang.String"
  StorageErrorCodeStrings/DELETE_PENDING)

(def *-directory-already-exists
  "Static Constant.

  The specified directory already exists.

  type: java.lang.String"
  StorageErrorCodeStrings/DIRECTORY_ALREADY_EXISTS)

(def *-directory-not-empty
  "Static Constant.

  The specified directory is not empty.

  type: java.lang.String"
  StorageErrorCodeStrings/DIRECTORY_NOT_EMPTY)

(def *-duplicate-properties-specified
  "Static Constant.

  A property is specified more than one time.

  type: java.lang.String"
  StorageErrorCodeStrings/DUPLICATE_PROPERTIES_SPECIFIED)

(def *-empty-metadata-key
  "Static Constant.

  The metadata key is empty.

  type: java.lang.String"
  StorageErrorCodeStrings/EMPTY_METADATA_KEY)

(def *-decryption-error
  "Static Constant.

  An error occurred during decryption.

  type: java.lang.String"
  StorageErrorCodeStrings/DECRYPTION_ERROR)

(def *-entity-already-exists
  "Static Constant.

  The entity already exists

  type: java.lang.String"
  StorageErrorCodeStrings/ENTITY_ALREADY_EXISTS)

(def *-entity-too-large
  "Static Constant.

  The entity already exists

  type: java.lang.String"
  StorageErrorCodeStrings/ENTITY_TOO_LARGE)

(def *-file-lock-conflict
  "Static Constant.

  A portion of the specified file is locked by an SMB client.

  type: java.lang.String"
  StorageErrorCodeStrings/FILE_LOCK_CONFLICT)

(def *-host-information-not-present
  "Static Constant.

  The required host information is not present in the request. You must send a non-empty Host header or include the
   absolute URI in the request line.

  type: java.lang.String"
  StorageErrorCodeStrings/HOST_INFORMATION_NOT_PRESENT)

(def *-incorrect-blob-type
  "Static Constant.

  An incorrect blob type was specified.

  type: java.lang.String"
  StorageErrorCodeStrings/INCORRECT_BLOB_TYPE)

(def *-infinite-lease-duration-required
  "Static Constant.

  The lease ID matched, but the specified lease must be an infinite-duration lease.

  type: java.lang.String"
  StorageErrorCodeStrings/INFINITE_LEASE_DURATION_REQUIRED)

(def *-insufficient-account-permissions
  "Static Constant.

  The account being accessed does not have sufficient permissions to execute this operation.

  type: java.lang.String"
  StorageErrorCodeStrings/INSUFFICIENT_ACCOUNT_PERMISSIONS)

(def *-internal-error
  "Static Constant.

  An internal error occurred.

  type: java.lang.String"
  StorageErrorCodeStrings/INTERNAL_ERROR)

(def *-invalid-authentication-info
  "Static Constant.

  The authentication information was not provided in the correct format. Verify the value of Authorization header.

  type: java.lang.String"
  StorageErrorCodeStrings/INVALID_AUTHENTICATION_INFO)

(def *-invalid-append-position
  "Static Constant.

  Error code that may be returned when the specified append offset is invalid.

  type: java.lang.String"
  StorageErrorCodeStrings/INVALID_APPEND_POSITION)

(def *-invalid-blob-type
  "Static Constant.

  An incorrect blob type was specified.

  type: java.lang.String"
  StorageErrorCodeStrings/INVALID_BLOB_TYPE)

(def *-invalid-blob-or-block
  "Static Constant.

  The specified blob or block content is invalid.

  type: java.lang.String"
  StorageErrorCodeStrings/INVALID_BLOB_OR_BLOCK)

(def *-invalid-block-id
  "Static Constant.

  The specified block ID is invalid. The block ID must be Base64-encoded.

  type: java.lang.String"
  StorageErrorCodeStrings/INVALID_BLOCK_ID)

(def *-invalid-block-list
  "Static Constant.

  The specified block list is invalid.

  type: java.lang.String"
  StorageErrorCodeStrings/INVALID_BLOCK_LIST)

(def *-invalid-header-value
  "Static Constant.

  One or more header values are invalid.

  type: java.lang.String"
  StorageErrorCodeStrings/INVALID_HEADER_VALUE)

(def *-invalid-http-verb
  "Static Constant.

  The HTTP verb is invalid.

  type: java.lang.String"
  StorageErrorCodeStrings/INVALID_HTTP_VERB)

(def *-invalid-input
  "Static Constant.

  The input is invalid.

  type: java.lang.String"
  StorageErrorCodeStrings/INVALID_INPUT)

(def *-invalid-marker
  "Static Constant.

  The specified marker is invalid.

  type: java.lang.String"
  StorageErrorCodeStrings/INVALID_MARKER)

(def *-invalid-max-blob-size-condition
  "Static Constant.

  Error code that may be returned when the specified max blob size is exceeded.

  type: java.lang.String"
  StorageErrorCodeStrings/INVALID_MAX_BLOB_SIZE_CONDITION)

(def *-invalid-md-5
  "Static Constant.

  The specified MD5 hash is invalid.

  type: java.lang.String"
  StorageErrorCodeStrings/INVALID_MD5)

(def *-invalid-metadata
  "Static Constant.

  The specified metadata is invalid.

  type: java.lang.String"
  StorageErrorCodeStrings/INVALID_METADATA)

(def *-invalid-page-range
  "Static Constant.

  The page range specified is invalid.

  type: java.lang.String"
  StorageErrorCodeStrings/INVALID_PAGE_RANGE)

(def *-invalid-query-parameter-value
  "Static Constant.

  One or more query parameters are invalid.

  type: java.lang.String"
  StorageErrorCodeStrings/INVALID_QUERY_PARAMETER_VALUE)

(def *-invalid-range
  "Static Constant.

  The specified range is invalid.

  type: java.lang.String"
  StorageErrorCodeStrings/INVALID_RANGE)

(def *-invalid-resource-name
  "Static Constant.

  The specified resource name contains invalid characters.

  type: java.lang.String"
  StorageErrorCodeStrings/INVALID_RESOURCE_NAME)

(def *-invalid-uri
  "Static Constant.

  The URI is invalid.

  type: java.lang.String"
  StorageErrorCodeStrings/INVALID_URI)

(def *-invalid-value-type
  "Static Constant.

  The value specified is invalid.

  type: java.lang.String"
  StorageErrorCodeStrings/INVALID_VALUE_TYPE)

(def *-invalid-version-for-page-blob-operation
  "Static Constant.

  All operations on page blobs require at least version 2009-09-19.

  type: java.lang.String"
  StorageErrorCodeStrings/INVALID_VERSION_FOR_PAGE_BLOB_OPERATION)

(def *-invalid-xml-document
  "Static Constant.

  The specified XML document is invalid.

  type: java.lang.String"
  StorageErrorCodeStrings/INVALID_XML_DOCUMENT)

(def *-invalid-xml-node-value
  "Static Constant.

  The value provided for one of the XML nodes in the request body was not in the correct format.

  type: java.lang.String"
  StorageErrorCodeStrings/INVALID_XML_NODE_VALUE)

(def *-invalid-document
  "Static Constant.

  The specified XML or Json document is invalid. Used for tables only.

  type: java.lang.String"
  StorageErrorCodeStrings/INVALID_DOCUMENT)

(def *-invalid-file-or-directory-path-name
  "Static Constant.

  File or directory path is too long or file or directory path has too many subdirectories.

  type: java.lang.String"
  StorageErrorCodeStrings/INVALID_FILE_OR_DIRECTORY_PATH_NAME)

(def *-invalid-type
  "Static Constant.

  The incorrect type was given. Used for tables only.

  type: java.lang.String"
  StorageErrorCodeStrings/INVALID_TYPE)

(def *-json-format-not-supported
  "Static Constant.

  JSON format is not supported.

  type: java.lang.String"
  StorageErrorCodeStrings/JSON_FORMAT_NOT_SUPPORTED)

(def *-lease-already-broken
  "Static Constant.

  The lease is already broken.

  type: java.lang.String"
  StorageErrorCodeStrings/LEASE_ALREADY_BROKEN)

(def *-lease-already-present
  "Static Constant.

  The lease is already present.

  type: java.lang.String"
  StorageErrorCodeStrings/LEASE_ALREADY_PRESENT)

(def *-lease-id-mismatch-with-blob-operation
  "Static Constant.

  The lease ID is incorrect with a blob operation.

  type: java.lang.String"
  StorageErrorCodeStrings/LEASE_ID_MISMATCH_WITH_BLOB_OPERATION)

(def *-lease-id-mismatch-with-container-operation
  "Static Constant.

  The lease ID is incorrect with a container operation.

  type: java.lang.String"
  StorageErrorCodeStrings/LEASE_ID_MISMATCH_WITH_CONTAINER_OPERATION)

(def *-lease-id-mismatch-with-lease-operation
  "Static Constant.

  The lease ID is incorrect with a lease operation.

  type: java.lang.String"
  StorageErrorCodeStrings/LEASE_ID_MISMATCH_WITH_LEASE_OPERATION)

(def *-lease-id-missing
  "Static Constant.

  The lease ID is missing.

  type: java.lang.String"
  StorageErrorCodeStrings/LEASE_ID_MISSING)

(def *-lease-is-broken-and-cannot-be-renewed
  "Static Constant.

  The lease ID matched, but the lease has been broken explicitly and cannot be renewed.

  type: java.lang.String"
  StorageErrorCodeStrings/LEASE_IS_BROKEN_AND_CANNOT_BE_RENEWED)

(def *-lease-is-breaking-and-cannot-be-acquired
  "Static Constant.

  The lease ID matched, but the lease is currently in breaking state and cannot be acquired until it is broken.

  type: java.lang.String"
  StorageErrorCodeStrings/LEASE_IS_BREAKING_AND_CANNOT_BE_ACQUIRED)

(def *-lease-is-breaking-and-cannot-be-changed
  "Static Constant.

  The lease ID matched, but the lease is currently in breaking state and cannot be changed.

  type: java.lang.String"
  StorageErrorCodeStrings/LEASE_IS_BREAKING_AND_CANNOT_BE_CHANGED)

(def *-lease-lost
  "Static Constant.

  A lease ID was specified, but the lease for the blob/container has expired.

  type: java.lang.String"
  StorageErrorCodeStrings/LEASE_LOST)

(def *-lease-not-present-with-blob-operation
  "Static Constant.

  There is currently no lease on the blob.

  type: java.lang.String"
  StorageErrorCodeStrings/LEASE_NOT_PRESENT_WITH_BLOB_OPERATION)

(def *-lease-not-present-with-container-operation
  "Static Constant.

  There is currently no lease on the container.

  type: java.lang.String"
  StorageErrorCodeStrings/LEASE_NOT_PRESENT_WITH_CONTAINER_OPERATION)

(def *-lease-not-present-with-lease-operation
  "Static Constant.

  There is currently no lease on the blob/container.

  type: java.lang.String"
  StorageErrorCodeStrings/LEASE_NOT_PRESENT_WITH_LEASE_OPERATION)

(def *-md-5-mismatch
  "Static Constant.

  The specified MD5 hash does not match the server value.

  type: java.lang.String"
  StorageErrorCodeStrings/MD5_MISMATCH)

(def *-message-too-large
  "Static Constant.

  The message exceeds the maximum allowed size.

  type: java.lang.String"
  StorageErrorCodeStrings/MESSAGE_TOO_LARGE)

(def *-message-not-found
  "Static Constant.

  The specified message does not exist.

  type: java.lang.String"
  StorageErrorCodeStrings/MESSAGE_NOT_FOUND)

(def *-metadata-too-large
  "Static Constant.

  The specified metadata is too large.

  type: java.lang.String"
  StorageErrorCodeStrings/METADATA_TOO_LARGE)

(def *-method-not-allowed
  "Static Constant.

  The requested method is not allowed on the specified resource.

  type: java.lang.String"
  StorageErrorCodeStrings/METHOD_NOT_ALLOWED)

(def *-missing-content-length-header
  "Static Constant.

  The Content-Length header is required for this request.

  type: java.lang.String"
  StorageErrorCodeStrings/MISSING_CONTENT_LENGTH_HEADER)

(def *-missing-required-header
  "Static Constant.

  A required header was missing.

  type: java.lang.String"
  StorageErrorCodeStrings/MISSING_REQUIRED_HEADER)

(def *-missing-required-query-parameter
  "Static Constant.

  A required query parameter is missing.

  type: java.lang.String"
  StorageErrorCodeStrings/MISSING_REQUIRED_QUERY_PARAMETER)

(def *-missing-required-xml-node
  "Static Constant.

  A required XML node was missing.

  type: java.lang.String"
  StorageErrorCodeStrings/MISSING_REQUIRED_XML_NODE)

(def *-missing-md-5-header
  "Static Constant.

  The MD5 hash is missing.

  type: java.lang.String"
  StorageErrorCodeStrings/MISSING_MD5_HEADER)

(def *-multiple-condition-headers-not-supported
  "Static Constant.

  Multiple condition headers are not supported.

  type: java.lang.String"
  StorageErrorCodeStrings/MULTIPLE_CONDITION_HEADERS_NOT_SUPPORTED)

(def *-no-pending-copy-operation
  "Static Constant.

  There is currently no pending copy operation.

  type: java.lang.String"
  StorageErrorCodeStrings/NO_PENDING_COPY_OPERATION)

(def *-not-implemented
  "Static Constant.

  The requested operation is not implemented on the specified resource.

  type: java.lang.String"
  StorageErrorCodeStrings/NOT_IMPLEMENTED)

(def *-operation-timed-out
  "Static Constant.

  The operation timed out.

  type: java.lang.String"
  StorageErrorCodeStrings/OPERATION_TIMED_OUT)

(def *-out-of-range-input
  "Static Constant.

  The input is out of range.

  type: java.lang.String"
  StorageErrorCodeStrings/OUT_OF_RANGE_INPUT)

(def *-out-of-range-query-parameter-value
  "Static Constant.

  One or more query parameters are out of range.

  type: java.lang.String"
  StorageErrorCodeStrings/OUT_OF_RANGE_QUERY_PARAMETER_VALUE)

(def *-parent-not-found
  "Static Constant.

  The specified parent path does not exist.

  type: java.lang.String"
  StorageErrorCodeStrings/PARENT_NOT_FOUND)

(def *-pending-copy-operation
  "Static Constant.

  There is currently a pending copy operation.

  type: java.lang.String"
  StorageErrorCodeStrings/PENDING_COPY_OPERATION)

(def *-pop-receipt-mismatch
  "Static Constant.

  The specified pop receipt did not match the pop receipt for a dequeued message.

  type: java.lang.String"
  StorageErrorCodeStrings/POP_RECEIPT_MISMATCH)

(def *-properties-need-value
  "Static Constant.

  Values have not been specified for all properties in the entity.

  type: java.lang.String"
  StorageErrorCodeStrings/PROPERTIES_NEED_VALUE)

(def *-property-name-invalid
  "Static Constant.

  The property name is invalid.

  type: java.lang.String"
  StorageErrorCodeStrings/PROPERTY_NAME_INVALID)

(def *-property-name-too-long
  "Static Constant.

  The property name exceeds the maximum allowed length.

  type: java.lang.String"
  StorageErrorCodeStrings/PROPERTY_NAME_TOO_LONG)

(def *-property-value-too-large
  "Static Constant.

  The property value is larger than the maximum size permitted.

  type: java.lang.String"
  StorageErrorCodeStrings/PROPERTY_VALUE_TOO_LARGE)

(def *-queue-already-exists
  "Static Constant.

  The specified queue already exists.

  type: java.lang.String"
  StorageErrorCodeStrings/QUEUE_ALREADY_EXISTS)

(def *-queue-being-deleted
  "Static Constant.

  The specified queue is being deleted.

  type: java.lang.String"
  StorageErrorCodeStrings/QUEUE_BEING_DELETED)

(def *-queue-disabled
  "Static Constant.

  The specified queue has been disabled by the administrator.

  type: java.lang.String"
  StorageErrorCodeStrings/QUEUE_DISABLED)

(def *-queue-not-empty
  "Static Constant.

  The specified queue is not empty.

  type: java.lang.String"
  StorageErrorCodeStrings/QUEUE_NOT_EMPTY)

(def *-queue-not-found
  "Static Constant.

  The specified queue does not exist.

  type: java.lang.String"
  StorageErrorCodeStrings/QUEUE_NOT_FOUND)

(def *-read-only-attribute
  "Static Constant.

  The specified resource is read-only and cannot be modified at this time.

  type: java.lang.String"
  StorageErrorCodeStrings/READ_ONLY_ATTRIBUTE)

(def *-request-body-too-large
  "Static Constant.

  The request body is too large.

  type: java.lang.String"
  StorageErrorCodeStrings/REQUEST_BODY_TOO_LARGE)

(def *-request-url-failed-to-parse
  "Static Constant.

  The url in the request could not be parsed.

  type: java.lang.String"
  StorageErrorCodeStrings/REQUEST_URL_FAILED_TO_PARSE)

(def *-resource-not-found
  "Static Constant.

  The specified resource was not found.

  type: java.lang.String"
  StorageErrorCodeStrings/RESOURCE_NOT_FOUND)

(def *-resource-already-exists
  "Static Constant.

  The specified resource already exists.

  type: java.lang.String"
  StorageErrorCodeStrings/RESOURCE_ALREADY_EXISTS)

(def *-resource-type-mismatch
  "Static Constant.

  The specified resource type does not match the type of the existing resource.

  type: java.lang.String"
  StorageErrorCodeStrings/RESOURCE_TYPE_MISMATCH)

(def *-sequence-number-condition-not-met
  "Static Constant.

  The sequence number condition specified was not met.

  type: java.lang.String"
  StorageErrorCodeStrings/SEQUENCE_NUMBER_CONDITION_NOT_MET)

(def *-sequence-number-increment-too-large
  "Static Constant.

  The sequence number increment cannot be performed because it would result in overflow of the sequence number.

  type: java.lang.String"
  StorageErrorCodeStrings/SEQUENCE_NUMBER_INCREMENT_TOO_LARGE)

(def *-server-busy
  "Static Constant.

  The server is busy.

  type: java.lang.String"
  StorageErrorCodeStrings/SERVER_BUSY)

(def *-share-already-exists
  "Static Constant.

  The specified share already exists.

  type: java.lang.String"
  StorageErrorCodeStrings/SHARE_ALREADY_EXISTS)

(def *-share-being-deleted
  "Static Constant.

  The specified share is being deleted. Try operation later.

  type: java.lang.String"
  StorageErrorCodeStrings/SHARE_BEING_DELETED)

(def *-share-disabled
  "Static Constant.

  The specified share is disabled by the administrator.

  type: java.lang.String"
  StorageErrorCodeStrings/SHARE_DISABLED)

(def *-share-has-snapshots
  "Static Constant.

  The specified share contains snapshots.

  type: java.lang.String"
  StorageErrorCodeStrings/SHARE_HAS_SNAPSHOTS)

(def *-share-not-found
  "Static Constant.

  The specified share was not found.

  type: java.lang.String"
  StorageErrorCodeStrings/SHARE_NOT_FOUND)

(def *-sharing-violation
  "Static Constant.

  The specified resource may be in use by an SMB client.

  type: java.lang.String"
  StorageErrorCodeStrings/SHARING_VIOLATION)

(def *-snapshots-present
  "Static Constant.

  This operation is not permitted because the blob has snapshots.

  type: java.lang.String"
  StorageErrorCodeStrings/SNAPSHOTS_PRESENT)

(def *-source-condition-not-met
  "Static Constant.

  The source condition specified using HTTP conditional header(s) is not met.

  type: java.lang.String"
  StorageErrorCodeStrings/SOURCE_CONDITION_NOT_MET)

(def *-target-condition-not-met
  "Static Constant.

  The target condition specified using HTTP conditional header(s) is not met.

  type: java.lang.String"
  StorageErrorCodeStrings/TARGET_CONDITION_NOT_MET)

(def *-table-already-exists
  "Static Constant.

  The table specified already exists.

  type: java.lang.String"
  StorageErrorCodeStrings/TABLE_ALREADY_EXISTS)

(def *-table-being-deleted
  "Static Constant.

  The specified table is being deleted.

  type: java.lang.String"
  StorageErrorCodeStrings/TABLE_BEING_DELETED)

(def *-table-not-found
  "Static Constant.

  The table specified does not exist.

  type: java.lang.String"
  StorageErrorCodeStrings/TABLE_NOT_FOUND)

(def *-too-many-properties
  "Static Constant.

  The entity contains more properties than allowed.

  type: java.lang.String"
  StorageErrorCodeStrings/TOO_MANY_PROPERTIES)

(def *-update-condition-not-satisfied
  "Static Constant.

  The update condition was not satisfied

  type: java.lang.String"
  StorageErrorCodeStrings/UPDATE_CONDITION_NOT_SATISFIED)

(def *-unsupported-header
  "Static Constant.

  One or more header values are not supported.

  type: java.lang.String"
  StorageErrorCodeStrings/UNSUPPORTED_HEADER)

(def *-unsupported-xml-node
  "Static Constant.

  One of the XML nodes specified in the request body is not supported.

  type: java.lang.String"
  StorageErrorCodeStrings/UNSUPPORTED_XML_NODE)

(def *-unsupported-http-verb
  "Static Constant.

  The specified HTTP verb is not supported.

  type: java.lang.String"
  StorageErrorCodeStrings/UNSUPPORTED_HTTP_VERB)

(def *-unsupported-query-parameter
  "Static Constant.

  One or more query parameters is not supported.

  type: java.lang.String"
  StorageErrorCodeStrings/UNSUPPORTED_QUERY_PARAMETER)

(def *-x-method-incorrect-count
  "Static Constant.

  More than one X-HTTP-Method is specified.

  type: java.lang.String"
  StorageErrorCodeStrings/X_METHOD_INCORRECT_COUNT)

(def *-x-method-incorrect-value
  "Static Constant.

  The specified X-HTTP-Method is invalid.

  type: java.lang.String"
  StorageErrorCodeStrings/X_METHOD_INCORRECT_VALUE)

(def *-x-method-not-using-post
  "Static Constant.

  The request uses X-HTTP-Method with an HTTP verb other than POST.

  type: java.lang.String"
  StorageErrorCodeStrings/X_METHOD_NOT_USING_POST)

