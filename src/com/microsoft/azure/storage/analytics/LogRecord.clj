(ns com.microsoft.azure.storage.analytics.LogRecord
  "Represents a Storage Analytics Log record entry."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.analytics LogRecord]))

(defn get-request-url
  "Gets the complete URL of the request.

  returns: a URI containing the RequestUrl value - `java.net.URI`"
  (^java.net.URI [^LogRecord this]
    (-> this (.getRequestUrl))))

(defn get-requester-account-name
  "Gets the account name making the request, if the request is authenticated. This field will be null for
   anonymous and SAS requests.

  returns: a String containing the RequesterAccountName value - `java.lang.String`"
  (^java.lang.String [^LogRecord this]
    (-> this (.getRequesterAccountName))))

(defn get-http-status-code
  "Gets the HTTP status code for the request. If the request is interrupted, this value may be set to Unknown.

  returns: a String containing the HttpStatusCode value - `java.lang.String`"
  (^java.lang.String [^LogRecord this]
    (-> this (.getHttpStatusCode))))

(defn get-service-type
  "Gets the requested storage service: blob, table, or queue.

  returns: a String containing the ServiceType value - `java.lang.String`"
  (^java.lang.String [^LogRecord this]
    (-> this (.getServiceType))))

(defn get-owner-account-name
  "Gets the account name of the service owner.

  returns: a String containing the OwnerAccountName value - `java.lang.String`"
  (^java.lang.String [^LogRecord this]
    (-> this (.getOwnerAccountName))))

(defn get-request-status
  "Gets the status of the requested operation.

  returns: a String containing the RequestStatus value - `java.lang.String`"
  (^java.lang.String [^LogRecord this]
    (-> this (.getRequestStatus))))

(defn get-referrer-header
  "Gets the Referrer header value as an encoded string.

  returns: an encoded String containing the ReferrerHeader value - `java.lang.String`"
  (^java.lang.String [^LogRecord this]
    (-> this (.getReferrerHeader))))

(defn get-request-packet-size
  "Gets the size of the request packets read by the storage service, in bytes. If a request is unsuccessful, this
   value may be null.

  returns: a Long containing the RequestPacketSize value - `java.lang.Long`"
  (^java.lang.Long [^LogRecord this]
    (-> this (.getRequestPacketSize))))

(defn get-request-start-time
  "Gets the time in UTC when the request was received by Storage Analytics.

  returns: a String containing the RequestStartTime value - `java.util.Date`"
  (^java.util.Date [^LogRecord this]
    (-> this (.getRequestStartTime))))

(defn get-request-id-header
  "Gets the request ID assigned by the storage service. This is equivalent to the value of the x-ms-request-id
   header.

  returns: a UUID containing the RequestIdHeader value - `java.util.UUID`"
  (^java.util.UUID [^LogRecord this]
    (-> this (.getRequestIdHeader))))

(defn get-conditions-used
  "Gets conditions used, as an encoded string semicolon-separated list in the form of ConditionName=value .

  returns: an encoded String containing the ConditionsUsed value - `java.lang.String`"
  (^java.lang.String [^LogRecord this]
    (-> this (.getConditionsUsed))))

(defn get-requester-ip-address
  "Gets the IP address and port of the requester.

  returns: a String containing the RequesterIPAddress value - `java.lang.String`"
  (^java.lang.String [^LogRecord this]
    (-> this (.getRequesterIPAddress))))

(defn get-e-tag-identifier
  "Gets the ETag identifier for the returned object as an encoded string.

  returns: an encoded String containing the ETagIdentifier value - `java.lang.String`"
  (^java.lang.String [^LogRecord this]
    (-> this (.getETagIdentifier))))

(defn get-operation-count
  "Gets the number of each logged operation for a request, using an index of zero. Some requests require more
   than one operation, such as Copy Blob, though most perform just one operation.

  returns: an Integer containing the OperationCount value - `java.lang.Integer`"
  (^java.lang.Integer [^LogRecord this]
    (-> this (.getOperationCount))))

(defn get-authentication-type
  "Gets whether the request was authenticated, anonymous, or used Shared Access Signature (SAS).

  returns: a String containing the AuthenticationType value - `java.lang.String`"
  (^java.lang.String [^LogRecord this]
    (-> this (.getAuthenticationType))))

(defn get-version-number
  "Gets the version of Storage Analytics Logging used to record the entry.

  returns: a String containing the VersionNumber value - `java.lang.String`"
  (^java.lang.String [^LogRecord this]
    (-> this (.getVersionNumber))))

(defn get-request-md-5
  "Gets the value of either the Content-MD5 header or the x-ms-content-md5 header in the request as an encoded
   string. The MD5 hash value specified in this field represents the content in the request. This field can
   be null.

  returns: an encoded String containing the RequestMD5 value - `java.lang.String`"
  (^java.lang.String [^LogRecord this]
    (-> this (.getRequestMD5))))

(defn get-response-packet-size
  "Gets the size of the response packets written by the storage service, in bytes. If a request is unsuccessful,
   this value may be null.

  returns: a Long containing the ResponsePacketSize value - `java.lang.Long`"
  (^java.lang.Long [^LogRecord this]
    (-> this (.getResponsePacketSize))))

(defn get-last-modified-time
  "Gets the Last Modified Time (LMT) for the returned object as an encoded string. This field is null for
   operations that can return multiple objects.

  returns: a Date containing the LastModifiedTime value - `java.util.Date`"
  (^java.util.Date [^LogRecord this]
    (-> this (.getLastModifiedTime))))

(defn get-request-version-header
  "Gets the storage service version specified when the request was made. This is equivalent to the value of the
   x-ms-version header.

  returns: a String containing the RequestVersionHeader value - `java.lang.String`"
  (^java.lang.String [^LogRecord this]
    (-> this (.getRequestVersionHeader))))

(defn get-request-header-size
  "Gets the size of the request header, in bytes. If a request is unsuccessful, this value may be null.

  returns: a Long containing the RequestHeaderSize value - `java.lang.Long`"
  (^java.lang.Long [^LogRecord this]
    (-> this (.getRequestHeaderSize))))

(defn get-server-latency-in-ms
  "Gets the total time in milliseconds to perform the requested operation. This value does not include network
   latency (the time to read the incoming request and send the response to the requester).

  returns: an Integer containing the ServerLatencyInMS value - `java.lang.Integer`"
  (^java.lang.Integer [^LogRecord this]
    (-> this (.getServerLatencyInMS))))

(defn get-end-to-end-latency-in-ms
  "Gets the total time in milliseconds to perform the requested operation, including the time to read the
   incoming request and send the response to the requester.

  returns: an Integer containing the EndToEndLatencyInMS value - `java.lang.Integer`"
  (^java.lang.Integer [^LogRecord this]
    (-> this (.getEndToEndLatencyInMS))))

(defn get-server-md-5
  "Gets the value of the MD5 hash calculated by the storage service as an encoded string.

  returns: an encoded String containing the ServerMD5 value - `java.lang.String`"
  (^java.lang.String [^LogRecord this]
    (-> this (.getServerMD5))))

(defn get-client-request-id
  "Gets the x-ms-client-request-id header value included in the request.

  returns: an encoded String containing the ClientRequestId value - `java.lang.String`"
  (^java.lang.String [^LogRecord this]
    (-> this (.getClientRequestId))))

(defn get-requested-object-key
  "Gets the key of the requested object as an encoded string. This field will always use the account name, even
   if a custom domain name has been configured.

  returns: a String containing the RequestedObjectKey value - `java.lang.String`"
  (^java.lang.String [^LogRecord this]
    (-> this (.getRequestedObjectKey))))

(defn get-request-content-length
  "Gets the value of the Content-Length header for the request sent to the storage service. If the request was
   successful, this value is equal to request-packet-size. If a request is unsuccessful, this value may not
   be equal to request-packet-size, or it may be null.

  returns: a Long containing the RequestContentLength value - `java.lang.Long`"
  (^java.lang.Long [^LogRecord this]
    (-> this (.getRequestContentLength))))

(defn get-user-agent-header
  "Gets the User-Agent header value as an encoded string.

  returns: an encoded String containing the UserAgentHeader value - `java.lang.String`"
  (^java.lang.String [^LogRecord this]
    (-> this (.getUserAgentHeader))))

(defn get-response-header-size
  "Gets the size of the response header, in bytes. If a request is unsuccessful, this value may be null.

  returns: a Long containing the ResponseHeaderSize value - `java.lang.Long`"
  (^java.lang.Long [^LogRecord this]
    (-> this (.getResponseHeaderSize))))

(defn get-operation-type
  "Gets the type of REST operation performed.

  returns: a String containing the OperationType value - `java.lang.String`"
  (^java.lang.String [^LogRecord this]
    (-> this (.getOperationType))))

