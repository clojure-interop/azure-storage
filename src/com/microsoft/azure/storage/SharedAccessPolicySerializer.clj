(ns com.microsoft.azure.storage.SharedAccessPolicySerializer
  "RESERVED FOR INTERNAL USE. A class used to serialize SharedAccessPolicies to a byte array."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage SharedAccessPolicySerializer]))

(defn ->shared-access-policy-serializer
  "Constructor."
  (^SharedAccessPolicySerializer []
    (new SharedAccessPolicySerializer )))

(defn *write-shared-access-identifiers-to-stream
  "RESERVED FOR INTERNAL USE. Writes a collection of shared access policies to the specified stream in XML format.

  shared-access-policies - A collection of shared access policies - `java.util.HashMap`
  out-writer - an sink to write the output to. - `java.io.StringWriter`

  returns: `<T extends com.microsoft.azure.storage.SharedAccessPolicy> void`

  throws: javax.xml.stream.XMLStreamException"
  ([^java.util.HashMap shared-access-policies ^java.io.StringWriter out-writer]
    (SharedAccessPolicySerializer/writeSharedAccessIdentifiersToStream shared-access-policies out-writer)))

