(ns com.microsoft.azure.storage.SharedAccessPolicyHandler
  "RESERVED FOR INTERNAL USE. A class used to deserialize SharedAccessPolicies."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage SharedAccessPolicyHandler]))

(defn *get-access-identifiers
  "RESERVED FOR INTERNAL USE. Gets the HashMap of SharedAccessPolicies from the response.

  stream - the stream to read from - `java.io.InputStream`
  cls - the SharedAccessPolicy class type - `java.lang.Class`

  returns: the HashMap of SharedAccessPolicies from the response - `<T extends com.microsoft.azure.storage.SharedAccessPolicy> java.util.HashMap<java.lang.String,T>`

  throws: org.xml.sax.SAXException"
  ([^java.io.InputStream stream ^java.lang.Class cls]
    (SharedAccessPolicyHandler/getAccessIdentifiers stream cls)))

(defn start-element
  "uri - `java.lang.String`
  local-name - `java.lang.String`
  q-name - `java.lang.String`
  attributes - `org.xml.sax.Attributes`

  throws: org.xml.sax.SAXException"
  ([^SharedAccessPolicyHandler this ^java.lang.String uri ^java.lang.String local-name ^java.lang.String q-name ^org.xml.sax.Attributes attributes]
    (-> this (.startElement uri local-name q-name attributes))))

(defn end-element
  "uri - `java.lang.String`
  local-name - `java.lang.String`
  q-name - `java.lang.String`

  throws: org.xml.sax.SAXException"
  ([^SharedAccessPolicyHandler this ^java.lang.String uri ^java.lang.String local-name ^java.lang.String q-name]
    (-> this (.endElement uri local-name q-name))))

(defn characters
  "ch - `char[]`
  start - `int`
  length - `int`

  throws: org.xml.sax.SAXException"
  ([^SharedAccessPolicyHandler this ch ^Integer start ^Integer length]
    (-> this (.characters ch start length))))

