# Azure Storage API Bindings for Clojure.

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/azure-storage "1.0.0"]
```

## Class Members Naming Conventions

| Class Member | Java | Clojure |
|:--|:--|:--|
| constructor | new File() | (->file) |
| instance method | getAnyValue() | (get-any-value) |
| instance field | instanceField | (-instance-field) |
| static method | staticMethod() | (*static-method) |
| static field | ANY_STATIC_FIELD | (*-any-static-field) |
| boolean field/method | isExists(), canUse() | (exists?), (can-use?) |

## Classes

- class **com.microsoft.azure.storage.AccessCondition**
- class **com.microsoft.azure.storage.BaseEvent**
- class **com.microsoft.azure.storage.CloudStorageAccount**
- class **com.microsoft.azure.storage.Constants$AnalyticsConstants**
- class **com.microsoft.azure.storage.Constants$EncryptionConstants**
- class **com.microsoft.azure.storage.Constants$HeaderConstants**
- class **com.microsoft.azure.storage.Constants$QueryConstants**
- class **com.microsoft.azure.storage.Constants**
- enum **com.microsoft.azure.storage.CorsHttpMethods**
- class **com.microsoft.azure.storage.CorsProperties**
- class **com.microsoft.azure.storage.CorsRule**
- class **com.microsoft.azure.storage.DeleteRetentionPolicy**
- annotation **com.microsoft.azure.storage.DoesServiceRequest**
- class **com.microsoft.azure.storage.ErrorReceivingResponseEvent**
- class **com.microsoft.azure.storage.GeoReplicationStats**
- enum **com.microsoft.azure.storage.GeoReplicationStatus**
- class **com.microsoft.azure.storage.IPRange**
- enum **com.microsoft.azure.storage.LocationMode**
- enum **com.microsoft.azure.storage.LoggingOperations**
- class **com.microsoft.azure.storage.LoggingProperties**
- enum **com.microsoft.azure.storage.MetricsLevel**
- class **com.microsoft.azure.storage.MetricsProperties**
- class **com.microsoft.azure.storage.NameValidator**
- class **com.microsoft.azure.storage.OperationContext**
- class **com.microsoft.azure.storage.Permissions**
- class **com.microsoft.azure.storage.RequestCompletedEvent**
- class **com.microsoft.azure.storage.RequestOptions**
- class **com.microsoft.azure.storage.RequestResult**
- class **com.microsoft.azure.storage.ResponseReceivedEvent**
- class **com.microsoft.azure.storage.ResultContinuation**
- enum **com.microsoft.azure.storage.ResultContinuationType**
- class **com.microsoft.azure.storage.ResultSegment**
- class **com.microsoft.azure.storage.RetryContext**
- class **com.microsoft.azure.storage.RetryExponentialRetry**
- class **com.microsoft.azure.storage.RetryInfo**
- class **com.microsoft.azure.storage.RetryLinearRetry**
- class **com.microsoft.azure.storage.RetryNoRetry**
- class **com.microsoft.azure.storage.RetryPolicy**
- interface **com.microsoft.azure.storage.RetryPolicyFactory**
- class **com.microsoft.azure.storage.RetryingEvent**
- class **com.microsoft.azure.storage.SendingRequestEvent**
- class **com.microsoft.azure.storage.ServiceClient**
- class **com.microsoft.azure.storage.ServiceProperties**
- class **com.microsoft.azure.storage.ServiceStats**
- enum **com.microsoft.azure.storage.SharedAccessAccountPermissions**
- class **com.microsoft.azure.storage.SharedAccessAccountPolicy**
- enum **com.microsoft.azure.storage.SharedAccessAccountResourceType**
- enum **com.microsoft.azure.storage.SharedAccessAccountService**
- class **com.microsoft.azure.storage.SharedAccessHeaders**
- class **com.microsoft.azure.storage.SharedAccessPolicy**
- class **com.microsoft.azure.storage.SharedAccessPolicyHandler**
- class **com.microsoft.azure.storage.SharedAccessPolicySerializer**
- enum **com.microsoft.azure.storage.SharedAccessProtocols**
- class **com.microsoft.azure.storage.StorageCredentials**
- class **com.microsoft.azure.storage.StorageCredentialsAccountAndKey**
- class **com.microsoft.azure.storage.StorageCredentialsAnonymous**
- class **com.microsoft.azure.storage.StorageCredentialsSharedAccessSignature**
- class **com.microsoft.azure.storage.StorageCredentialsToken**
- enum **com.microsoft.azure.storage.StorageErrorCode**
- class **com.microsoft.azure.storage.StorageErrorCodeStrings**
- class **com.microsoft.azure.storage.StorageEvent**
- class **com.microsoft.azure.storage.StorageEventMultiCaster**
- class **com.microsoft.azure.storage.StorageException**
- class **com.microsoft.azure.storage.StorageExtendedErrorInformation**
- enum **com.microsoft.azure.storage.StorageLocation**
- class **com.microsoft.azure.storage.StorageUri**
- class **com.microsoft.azure.storage.SubStreamGenerator**
- class **com.microsoft.azure.storage.analytics.CloudAnalyticsClient**
- class **com.microsoft.azure.storage.analytics.LogRecord**
- enum **com.microsoft.azure.storage.analytics.StorageService**
- class **com.microsoft.azure.storage.blob.BlobContainerPermissions**
- class **com.microsoft.azure.storage.blob.BlobContainerProperties**
- enum **com.microsoft.azure.storage.blob.BlobContainerPublicAccessType**
- class **com.microsoft.azure.storage.blob.BlobEncryptionPolicy**
- class **com.microsoft.azure.storage.blob.BlobInputStream**
- enum **com.microsoft.azure.storage.blob.BlobListingDetails**
- class **com.microsoft.azure.storage.blob.BlobOutputStream**
- class **com.microsoft.azure.storage.blob.BlobProperties**
- class **com.microsoft.azure.storage.blob.BlobRequestOptions**
- enum **com.microsoft.azure.storage.blob.BlobType**
- class **com.microsoft.azure.storage.blob.BlockEntry**
- enum **com.microsoft.azure.storage.blob.BlockListingFilter**
- enum **com.microsoft.azure.storage.blob.BlockSearchMode**
- class **com.microsoft.azure.storage.blob.CloudAppendBlob**
- class **com.microsoft.azure.storage.blob.CloudBlob**
- class **com.microsoft.azure.storage.blob.CloudBlobClient**
- class **com.microsoft.azure.storage.blob.CloudBlobContainer**
- class **com.microsoft.azure.storage.blob.CloudBlobDirectory**
- class **com.microsoft.azure.storage.blob.CloudBlockBlob**
- class **com.microsoft.azure.storage.blob.CloudPageBlob**
- enum **com.microsoft.azure.storage.blob.ContainerListingDetails**
- class **com.microsoft.azure.storage.blob.CopyState**
- enum **com.microsoft.azure.storage.blob.CopyStatus**
- enum **com.microsoft.azure.storage.blob.DeleteSnapshotsOption**
- enum **com.microsoft.azure.storage.blob.LeaseDuration**
- enum **com.microsoft.azure.storage.blob.LeaseState**
- enum **com.microsoft.azure.storage.blob.LeaseStatus**
- class **com.microsoft.azure.storage.blob.LengthLimitingStream**
- interface **com.microsoft.azure.storage.blob.ListBlobItem**
- class **com.microsoft.azure.storage.blob.PageRange**
- class **com.microsoft.azure.storage.blob.PageRangeDiff**
- enum **com.microsoft.azure.storage.blob.PremiumPageBlobTier**
- enum **com.microsoft.azure.storage.blob.RehydrationStatus**
- class **com.microsoft.azure.storage.blob.SharedAccessBlobHeaders**
- enum **com.microsoft.azure.storage.blob.SharedAccessBlobPermissions**
- class **com.microsoft.azure.storage.blob.SharedAccessBlobPolicy**
- enum **com.microsoft.azure.storage.blob.StandardBlobTier**
- class **com.microsoft.azure.storage.blob.SubStream**
- class **com.microsoft.azure.storage.file.CloudFile**
- class **com.microsoft.azure.storage.file.CloudFileClient**
- class **com.microsoft.azure.storage.file.CloudFileDirectory**
- class **com.microsoft.azure.storage.file.CloudFileShare**
- class **com.microsoft.azure.storage.file.CopyState**
- enum **com.microsoft.azure.storage.file.CopyStatus**
- enum **com.microsoft.azure.storage.file.DeleteShareSnapshotsOption**
- class **com.microsoft.azure.storage.file.FileDirectoryProperties**
- class **com.microsoft.azure.storage.file.FileInputStream**
- class **com.microsoft.azure.storage.file.FileOutputStream**
- class **com.microsoft.azure.storage.file.FileProperties**
- class **com.microsoft.azure.storage.file.FileRange**
- class **com.microsoft.azure.storage.file.FileRequestOptions**
- class **com.microsoft.azure.storage.file.FileServiceProperties**
- class **com.microsoft.azure.storage.file.FileSharePermissions**
- class **com.microsoft.azure.storage.file.FileShareProperties**
- interface **com.microsoft.azure.storage.file.ListFileItem**
- enum **com.microsoft.azure.storage.file.ShareListingDetails**
- class **com.microsoft.azure.storage.file.ShareStats**
- class **com.microsoft.azure.storage.file.SharedAccessFileHeaders**
- enum **com.microsoft.azure.storage.file.SharedAccessFilePermissions**
- class **com.microsoft.azure.storage.file.SharedAccessFilePolicy**
- class **com.microsoft.azure.storage.queue.CloudQueue**
- class **com.microsoft.azure.storage.queue.CloudQueueClient**
- class **com.microsoft.azure.storage.queue.CloudQueueMessage**
- enum **com.microsoft.azure.storage.queue.MessageUpdateFields**
- class **com.microsoft.azure.storage.queue.QueueEncryptionPolicy**
- enum **com.microsoft.azure.storage.queue.QueueListingDetails**
- class **com.microsoft.azure.storage.queue.QueuePermissions**
- class **com.microsoft.azure.storage.queue.QueueRequestOptions**
- enum **com.microsoft.azure.storage.queue.SharedAccessQueuePermissions**
- class **com.microsoft.azure.storage.queue.SharedAccessQueuePolicy**
- class **com.microsoft.azure.storage.table.CloudTable**
- class **com.microsoft.azure.storage.table.CloudTableClient**
- class **com.microsoft.azure.storage.table.DynamicTableEntity**
- enum **com.microsoft.azure.storage.table.EdmType**
- annotation **com.microsoft.azure.storage.table.Encrypt**
- class **com.microsoft.azure.storage.table.EntityProperty**
- interface **com.microsoft.azure.storage.table.EntityResolver**
- annotation **com.microsoft.azure.storage.table.Ignore**
- class **com.microsoft.azure.storage.table.QueryTableOperation**
- enum **com.microsoft.azure.storage.table.SharedAccessTablePermissions**
- class **com.microsoft.azure.storage.table.SharedAccessTablePolicy**
- annotation **com.microsoft.azure.storage.table.StoreAs**
- class **com.microsoft.azure.storage.table.TableBatchOperation**
- class **com.microsoft.azure.storage.table.TableEncryptionPolicy**
- interface **com.microsoft.azure.storage.table.TableEntity**
- class **com.microsoft.azure.storage.table.TableOperation**
- enum **com.microsoft.azure.storage.table.TablePayloadFormat**
- class **com.microsoft.azure.storage.table.TablePermissions**
- class **com.microsoft.azure.storage.table.TableQuery$Operators**
- class **com.microsoft.azure.storage.table.TableQuery$QueryComparisons**
- class **com.microsoft.azure.storage.table.TableQuery**
- interface **com.microsoft.azure.storage.table.TableRequestOptions$EncryptionResolver**
- interface **com.microsoft.azure.storage.table.TableRequestOptions$PropertyResolver**
- class **com.microsoft.azure.storage.table.TableRequestOptions**
- class **com.microsoft.azure.storage.table.TableResult**
- class **com.microsoft.azure.storage.table.TableServiceEntity**
- class **com.microsoft.azure.storage.table.TableServiceException**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
