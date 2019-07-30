(ns com.microsoft.azure.storage.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[com.microsoft.azure.storage.AccessCondition])
(require '[com.microsoft.azure.storage.BaseEvent])
(require '[com.microsoft.azure.storage.CloudStorageAccount])
(require '[com.microsoft.azure.storage.Constants$AnalyticsConstants])
(require '[com.microsoft.azure.storage.Constants$EncryptionConstants])
(require '[com.microsoft.azure.storage.Constants$HeaderConstants])
(require '[com.microsoft.azure.storage.Constants$QueryConstants])
(require '[com.microsoft.azure.storage.Constants])
(require '[com.microsoft.azure.storage.CorsHttpMethods])
(require '[com.microsoft.azure.storage.CorsProperties])
(require '[com.microsoft.azure.storage.CorsRule])
(require '[com.microsoft.azure.storage.DeleteRetentionPolicy])
(require '[com.microsoft.azure.storage.DoesServiceRequest])
(require '[com.microsoft.azure.storage.ErrorReceivingResponseEvent])
(require '[com.microsoft.azure.storage.GeoReplicationStats])
(require '[com.microsoft.azure.storage.GeoReplicationStatus])
(require '[com.microsoft.azure.storage.IPRange])
(require '[com.microsoft.azure.storage.LocationMode])
(require '[com.microsoft.azure.storage.LoggingOperations])
(require '[com.microsoft.azure.storage.LoggingProperties])
(require '[com.microsoft.azure.storage.MetricsLevel])
(require '[com.microsoft.azure.storage.MetricsProperties])
(require '[com.microsoft.azure.storage.NameValidator])
(require '[com.microsoft.azure.storage.OperationContext])
(require '[com.microsoft.azure.storage.Permissions])
(require '[com.microsoft.azure.storage.RequestCompletedEvent])
(require '[com.microsoft.azure.storage.RequestOptions])
(require '[com.microsoft.azure.storage.RequestResult])
(require '[com.microsoft.azure.storage.ResponseReceivedEvent])
(require '[com.microsoft.azure.storage.ResultContinuation])
(require '[com.microsoft.azure.storage.ResultContinuationType])
(require '[com.microsoft.azure.storage.ResultSegment])
(require '[com.microsoft.azure.storage.RetryContext])
(require '[com.microsoft.azure.storage.RetryExponentialRetry])
(require '[com.microsoft.azure.storage.RetryInfo])
(require '[com.microsoft.azure.storage.RetryLinearRetry])
(require '[com.microsoft.azure.storage.RetryNoRetry])
(require '[com.microsoft.azure.storage.RetryPolicy])
(require '[com.microsoft.azure.storage.RetryPolicyFactory])
(require '[com.microsoft.azure.storage.RetryingEvent])
(require '[com.microsoft.azure.storage.SendingRequestEvent])
(require '[com.microsoft.azure.storage.ServiceClient])
(require '[com.microsoft.azure.storage.ServiceProperties])
(require '[com.microsoft.azure.storage.ServiceStats])
(require '[com.microsoft.azure.storage.SharedAccessAccountPermissions])
(require '[com.microsoft.azure.storage.SharedAccessAccountPolicy])
(require '[com.microsoft.azure.storage.SharedAccessAccountResourceType])
(require '[com.microsoft.azure.storage.SharedAccessAccountService])
(require '[com.microsoft.azure.storage.SharedAccessHeaders])
(require '[com.microsoft.azure.storage.SharedAccessPolicy])
(require '[com.microsoft.azure.storage.SharedAccessPolicyHandler])
(require '[com.microsoft.azure.storage.SharedAccessPolicySerializer])
(require '[com.microsoft.azure.storage.SharedAccessProtocols])
(require '[com.microsoft.azure.storage.StorageCredentials])
(require '[com.microsoft.azure.storage.StorageCredentialsAccountAndKey])
(require '[com.microsoft.azure.storage.StorageCredentialsAnonymous])
(require '[com.microsoft.azure.storage.StorageCredentialsSharedAccessSignature])
(require '[com.microsoft.azure.storage.StorageCredentialsToken])
(require '[com.microsoft.azure.storage.StorageErrorCode])
(require '[com.microsoft.azure.storage.StorageErrorCodeStrings])
(require '[com.microsoft.azure.storage.StorageEvent])
(require '[com.microsoft.azure.storage.StorageEventMultiCaster])
(require '[com.microsoft.azure.storage.StorageException])
(require '[com.microsoft.azure.storage.StorageExtendedErrorInformation])
(require '[com.microsoft.azure.storage.StorageLocation])
(require '[com.microsoft.azure.storage.StorageUri])
(require '[com.microsoft.azure.storage.SubStreamGenerator])