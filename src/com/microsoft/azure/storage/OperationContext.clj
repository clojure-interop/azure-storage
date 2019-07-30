(ns com.microsoft.azure.storage.OperationContext
  "Represents the current logical operation. A logical operation may have a one-to-many relationship with
  multiple individual physical requests."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage OperationContext]))

(defn ->operation-context
  "Constructor.

  Creates an instance of the OperationContext class."
  (^OperationContext []
    (new OperationContext )))

(def *-default-logger-name
  "Static Constant.

  Name of the Logger that will be created by default if logging is enabled and a
   Logger has not been specified.

  type: java.lang.String"
  OperationContext/defaultLoggerName)

(defn *set-global-request-completed-event-handler
  "Sets a global event multi-caster that is triggered when a request is completed.

  global-request-completed-event-handler - The StorageEventMultiCaster object to set for the globalRequestCompletedEventHandler. - `com.microsoft.azure.storage.StorageEventMultiCaster`"
  ([^com.microsoft.azure.storage.StorageEventMultiCaster global-request-completed-event-handler]
    (OperationContext/setGlobalRequestCompletedEventHandler global-request-completed-event-handler)))

(defn *get-default-proxy
  "Gets the default proxy used by the client library if enabled. The default can be overridden
   to enable a proxy for an individual operation context instance by using setProxy(java.net.Proxy).

  returns: The default Proxy if set; otherwise null - `java.net.Proxy`"
  (^java.net.Proxy []
    (OperationContext/getDefaultProxy )))

(defn *get-global-response-received-event-handler
  "Gets a global event multi-caster that is triggered when a response is received. It allows event listeners to be
   dynamically added and removed.

  returns: A StorageEventMultiCaster object for the globalResponseReceivedEventHandler. - `com.microsoft.azure.storage.StorageEventMultiCaster<com.microsoft.azure.storage.ResponseReceivedEvent,com.microsoft.azure.storage.StorageEvent<com.microsoft.azure.storage.ResponseReceivedEvent>>`"
  (^com.microsoft.azure.storage.StorageEventMultiCaster []
    (OperationContext/getGlobalResponseReceivedEventHandler )))

(defn *set-global-response-received-event-handler
  "Sets a global event multi-caster that is triggered when a response is received.

  global-response-received-event-handler - The StorageEventMultiCaster object to set for the globalResponseReceivedEventHandler. - `com.microsoft.azure.storage.StorageEventMultiCaster`"
  ([^com.microsoft.azure.storage.StorageEventMultiCaster global-response-received-event-handler]
    (OperationContext/setGlobalResponseReceivedEventHandler global-response-received-event-handler)))

(defn *set-global-error-receiving-response-event-handler
  "Sets a global event multi-caster that is triggered when a network error occurs before the HTTP response status and headers are received.

  global-error-receiving-response-event-handler - The StorageEventMultiCaster object to set for the globalErrorReceivingResponseEventHandler. - `com.microsoft.azure.storage.StorageEventMultiCaster`"
  ([^com.microsoft.azure.storage.StorageEventMultiCaster global-error-receiving-response-event-handler]
    (OperationContext/setGlobalErrorReceivingResponseEventHandler global-error-receiving-response-event-handler)))

(defn *get-global-request-completed-event-handler
  "Gets a global event multi-caster that is triggered when a request is completed. It allows event listeners to be
   dynamically added and removed.

  returns: A StorageEventMultiCaster object for the globalRequestCompletedEventHandler. - `com.microsoft.azure.storage.StorageEventMultiCaster<com.microsoft.azure.storage.RequestCompletedEvent,com.microsoft.azure.storage.StorageEvent<com.microsoft.azure.storage.RequestCompletedEvent>>`"
  (^com.microsoft.azure.storage.StorageEventMultiCaster []
    (OperationContext/getGlobalRequestCompletedEventHandler )))

(defn *set-global-sending-request-event-handler
  "Sets a global event multi-caster that is triggered before sending a request.

  global-sending-request-event-handler - The StorageEventMultiCaster object to set for the globalSendingRequestEventHandler. - `com.microsoft.azure.storage.StorageEventMultiCaster`"
  ([^com.microsoft.azure.storage.StorageEventMultiCaster global-sending-request-event-handler]
    (OperationContext/setGlobalSendingRequestEventHandler global-sending-request-event-handler)))

(defn *set-logging-enabled-by-default
  "Specifies whether the client library should produce log entries by default. The default can be overridden
   to turn on logging for an individual operation context instance by using setLoggingEnabled(boolean).

  enable-logging-by-default - true if logging should be enabled by default; otherwise false if logging should be disabled by default. - `boolean`"
  ([^Boolean enable-logging-by-default]
    (OperationContext/setLoggingEnabledByDefault enable-logging-by-default)))

(defn *set-default-proxy
  "Specifies the proxy the client library should use by default. The default can be overridden
   to turn on a proxy for an individual operation context instance by using setProxy(java.net.Proxy).

  default-proxy - The Proxy to use by default, or null to not use a proxy. - `java.net.Proxy`"
  ([^java.net.Proxy default-proxy]
    (OperationContext/setDefaultProxy default-proxy)))

(defn *get-global-retrying-event-handler
  "Gets a global event multi-caster that is triggered when a request is retried. It allows event listeners to be
   dynamically added and removed.

  returns: A StorageEventMultiCaster object for the globalRetryingEventHandler. - `com.microsoft.azure.storage.StorageEventMultiCaster<com.microsoft.azure.storage.RetryingEvent,com.microsoft.azure.storage.StorageEvent<com.microsoft.azure.storage.RetryingEvent>>`"
  (^com.microsoft.azure.storage.StorageEventMultiCaster []
    (OperationContext/getGlobalRetryingEventHandler )))

(defn *get-global-error-receiving-response-event-handler
  "Gets a global event multi-caster that is triggered when a network error occurs before the HTTP response status and headers are received.
   It allows event listeners to be dynamically added and removed.

  returns: A StorageEventMultiCaster object for the globabErrorReceivingResponseEventHandler. - `com.microsoft.azure.storage.StorageEventMultiCaster<com.microsoft.azure.storage.ErrorReceivingResponseEvent,com.microsoft.azure.storage.StorageEvent<com.microsoft.azure.storage.ErrorReceivingResponseEvent>>`"
  (^com.microsoft.azure.storage.StorageEventMultiCaster []
    (OperationContext/getGlobalErrorReceivingResponseEventHandler )))

(defn *logging-enabled-by-default?
  "Indicates whether the client library should produce log entries by default. The default can be overridden
   to enable logging for an individual operation context instance by using setLoggingEnabled(boolean).

  returns: true if logging is enabled by default; otherwise false. - `boolean`"
  (^Boolean []
    (OperationContext/isLoggingEnabledByDefault )))

(defn *set-global-retrying-event-handler
  "Sets a global event multi-caster that is triggered when a request is retried.

  global-retrying-event-handler - The StorageEventMultiCaster object to set for the globalRetryingEventHandler. - `com.microsoft.azure.storage.StorageEventMultiCaster`"
  ([^com.microsoft.azure.storage.StorageEventMultiCaster global-retrying-event-handler]
    (OperationContext/setGlobalRetryingEventHandler global-retrying-event-handler)))

(defn *get-global-sending-request-event-handler
  "Gets a global event multi-caster that is triggered before sending a request. It allows event listeners to be
   dynamically added and removed.

  returns: A StorageEventMultiCaster object for the globalSendingRequestEventHandler. - `com.microsoft.azure.storage.StorageEventMultiCaster<com.microsoft.azure.storage.SendingRequestEvent,com.microsoft.azure.storage.StorageEvent<com.microsoft.azure.storage.SendingRequestEvent>>`"
  (^com.microsoft.azure.storage.StorageEventMultiCaster []
    (OperationContext/getGlobalSendingRequestEventHandler )))

(defn set-client-request-id
  "Sets the client side request ID.

  client-request-id - A String which contains the client request ID to set. - `java.lang.String`"
  ([^OperationContext this ^java.lang.String client-request-id]
    (-> this (.setClientRequestID client-request-id))))

(defn append-request-result
  "Reserved for internal use. Appends a RequestResult object to the internal collection in a synchronized
   manner.

  request-result - A RequestResult to append. - `com.microsoft.azure.storage.RequestResult`"
  ([^OperationContext this ^com.microsoft.azure.storage.RequestResult request-result]
    (-> this (.appendRequestResult request-result))))

(defn get-request-completed-event-handler
  "Gets an event multi-caster that is triggered when a request is completed. It allows event listeners to be
   dynamically added and removed.

  returns: A StorageEventMultiCaster object for the requestCompletedEventHandler. - `com.microsoft.azure.storage.StorageEventMultiCaster<com.microsoft.azure.storage.RequestCompletedEvent,com.microsoft.azure.storage.StorageEvent<com.microsoft.azure.storage.RequestCompletedEvent>>`"
  (^com.microsoft.azure.storage.StorageEventMultiCaster [^OperationContext this]
    (-> this (.getRequestCompletedEventHandler))))

(defn logging-enabled?
  "Indicates whether log entries will be produced for this request.

  returns: true if logging is enabled; otherwise false. - `boolean`"
  (^Boolean [^OperationContext this]
    (-> this (.isLoggingEnabled))))

(defn get-client-time-in-ms
  "Gets the operation latency, in milliseconds, from the client's perspective. This may include any potential
   retries.

  returns: A long which contains the client latency time in milliseconds. - `long`"
  (^Long [^OperationContext this]
    (-> this (.getClientTimeInMs))))

(defn get-user-headers
  "Gets any additional headers for the request, for example, for proxy or logging information.

  returns: A java.util.HashMap which contains the the user headers for the request. - `java.util.HashMap<java.lang.String,java.lang.String>`"
  (^java.util.HashMap [^OperationContext this]
    (-> this (.getUserHeaders))))

(defn set-proxy
  "Sets a proxy which will be used when making a request. Default is null. To set a proxy to use by
   default, use setDefaultProxy(java.net.Proxy)

  proxy - A Proxy to use when making a request. - `java.net.Proxy`"
  ([^OperationContext this ^java.net.Proxy proxy]
    (-> this (.setProxy proxy))))

(defn set-error-receiving-response-event-handler
  "Sets an event multi-caster that is triggered when a network error occurs before the HTTP response status and headers are received.

  error-receiving-response-event-handler - The StorageEventMultiCaster object to set for the errorReceivingResponseEventHandler. - `com.microsoft.azure.storage.StorageEventMultiCaster`"
  ([^OperationContext this ^com.microsoft.azure.storage.StorageEventMultiCaster error-receiving-response-event-handler]
    (-> this (.setErrorReceivingResponseEventHandler error-receiving-response-event-handler))))

(defn set-client-time-in-ms
  "Reserved for internal use. Represents the operation latency, in milliseconds, from the client's perspective. This
   may include any potential retries.

  client-time-in-ms - A long which contains the client operation latency in milliseconds. - `long`"
  ([^OperationContext this ^Long client-time-in-ms]
    (-> this (.setClientTimeInMs client-time-in-ms))))

(defn set-sending-request-event-handler
  "Sets an event multi-caster that is triggered before sending a request.

  sending-request-event-handler - The StorageEventMultiCaster object to set for the sendingRequestEventHandler. - `com.microsoft.azure.storage.StorageEventMultiCaster`"
  ([^OperationContext this ^com.microsoft.azure.storage.StorageEventMultiCaster sending-request-event-handler]
    (-> this (.setSendingRequestEventHandler sending-request-event-handler))))

(defn get-request-results
  "Returns the set of request results that the current operation has created.

  returns: An ArrayList object that contains RequestResult objects that represent
           the request results created by the current operation. - `java.util.ArrayList<com.microsoft.azure.storage.RequestResult>`"
  (^java.util.ArrayList [^OperationContext this]
    (-> this (.getRequestResults))))

(defn get-error-receiving-response-event-handler
  "Gets an event multi-caster that is triggered when a network error occurs before the HTTP response status and headers are received.
   It allows event listeners to be dynamically added and removed.

  returns: A StorageEventMultiCaster object for the errorReceivingResponseEventHandler. - `com.microsoft.azure.storage.StorageEventMultiCaster<com.microsoft.azure.storage.ErrorReceivingResponseEvent,com.microsoft.azure.storage.StorageEvent<com.microsoft.azure.storage.ErrorReceivingResponseEvent>>`"
  (^com.microsoft.azure.storage.StorageEventMultiCaster [^OperationContext this]
    (-> this (.getErrorReceivingResponseEventHandler))))

(defn set-logging-enabled
  "Specifies whether log entries will be produced for this request.

  logging-enabled - true to enable logging; otherwise false to disable logging. - `boolean`"
  ([^OperationContext this ^Boolean logging-enabled]
    (-> this (.setLoggingEnabled logging-enabled))))

(defn set-retrying-event-handler
  "Sets an event multi-caster that is triggered when a request is retried.

  retrying-event-handler - The StorageEventMultiCaster object to set for the retryingEventHandler. - `com.microsoft.azure.storage.StorageEventMultiCaster`"
  ([^OperationContext this ^com.microsoft.azure.storage.StorageEventMultiCaster retrying-event-handler]
    (-> this (.setRetryingEventHandler retrying-event-handler))))

(defn get-retrying-event-handler
  "Gets an event multi-caster that is triggered when a request is retried. It allows event listeners to be
   dynamically added and removed.

  returns: A StorageEventMultiCaster object for the retryingEventHandler. - `com.microsoft.azure.storage.StorageEventMultiCaster<com.microsoft.azure.storage.RetryingEvent,com.microsoft.azure.storage.StorageEvent<com.microsoft.azure.storage.RetryingEvent>>`"
  (^com.microsoft.azure.storage.StorageEventMultiCaster [^OperationContext this]
    (-> this (.getRetryingEventHandler))))

(defn set-response-received-event-handler
  "Sets an event multi-caster that is triggered when a response is received.

  response-received-event-handler - The StorageEventMultiCaster object to set for the responseReceivedEventHandler. - `com.microsoft.azure.storage.StorageEventMultiCaster`"
  ([^OperationContext this ^com.microsoft.azure.storage.StorageEventMultiCaster response-received-event-handler]
    (-> this (.setResponseReceivedEventHandler response-received-event-handler))))

(defn get-proxy
  "Gets a proxy which will be used when making a request. Default is null. To set a proxy to use by
   default, use setDefaultProxy(java.net.Proxy)

  returns: A Proxy to use when making a request. - `java.net.Proxy`"
  (^java.net.Proxy [^OperationContext this]
    (-> this (.getProxy))))

(defn get-sending-request-event-handler
  "Gets an event multi-caster that is triggered before sending a request. It allows event listeners to be
   dynamically added and removed.

  returns: A StorageEventMultiCaster object for the sendingRequestEventHandler. - `com.microsoft.azure.storage.StorageEventMultiCaster<com.microsoft.azure.storage.SendingRequestEvent,com.microsoft.azure.storage.StorageEvent<com.microsoft.azure.storage.SendingRequestEvent>>`"
  (^com.microsoft.azure.storage.StorageEventMultiCaster [^OperationContext this]
    (-> this (.getSendingRequestEventHandler))))

(defn initialize
  "Reserved for internal use. Initializes the OperationContext in order to begin processing a
   new operation. All operation specific information is erased."
  ([^OperationContext this]
    (-> this (.initialize))))

(defn get-response-received-event-handler
  "Gets an event multi-caster that is triggered when a response is received. It allows event listeners to be
   dynamically added and removed.

  returns: A StorageEventMultiCaster object for the responseReceivedEventHandler. - `com.microsoft.azure.storage.StorageEventMultiCaster<com.microsoft.azure.storage.ResponseReceivedEvent,com.microsoft.azure.storage.StorageEvent<com.microsoft.azure.storage.ResponseReceivedEvent>>`"
  (^com.microsoft.azure.storage.StorageEventMultiCaster [^OperationContext this]
    (-> this (.getResponseReceivedEventHandler))))

(defn get-client-request-id
  "Gets the client side trace ID.

  returns: A String which represents the client request ID. - `java.lang.String`"
  (^java.lang.String [^OperationContext this]
    (-> this (.getClientRequestID))))

(defn get-last-result
  "Gets the last request result encountered for the operation.

  returns: A RequestResult object which represents the last request result. - `com.microsoft.azure.storage.RequestResult`"
  (^com.microsoft.azure.storage.RequestResult [^OperationContext this]
    (-> this (.getLastResult))))

(defn get-logger
  "Gets the Logger associated with this operation. If the Logger object
   associated with this operation is null, this will return the class's default Logger object.

  returns: The Logger object associated with this operation,
           or the class's default Logger if null. - `org.slf4j.Logger`"
  (^org.slf4j.Logger [^OperationContext this]
    (-> this (.getLogger))))

(defn set-logger
  "Sets the Logger for this operation.

  logger - The Logger to use for this operation. - `org.slf4j.Logger`"
  ([^OperationContext this ^org.slf4j.Logger logger]
    (-> this (.setLogger logger))))

(defn set-request-completed-event-handler
  "Sets an event multi-caster that is triggered when a request is completed.

  request-completed-event-handler - The StorageEventMultiCaster object to set for the requestCompletedEventHandler. - `com.microsoft.azure.storage.StorageEventMultiCaster`"
  ([^OperationContext this ^com.microsoft.azure.storage.StorageEventMultiCaster request-completed-event-handler]
    (-> this (.setRequestCompletedEventHandler request-completed-event-handler))))

(defn set-user-headers
  "Sets any additional headers for the request, for example, for proxy or logging information.

  user-headers - A java.util.HashMap which contains any additional headers to set. - `java.util.HashMap`"
  ([^OperationContext this ^java.util.HashMap user-headers]
    (-> this (.setUserHeaders user-headers))))

