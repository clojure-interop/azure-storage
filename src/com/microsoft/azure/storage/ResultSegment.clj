(ns com.microsoft.azure.storage.ResultSegment
  "Represents a segment of results and contains continuation and pagination information."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage ResultSegment]))

(defn ->result-segment
  "Constructor.

  Reserved for internal use. Creates an instance of the ResultSegment class.

  results - An ArrayList object that represents the results for the segment. - `java.util.ArrayList`
  page-size - The number of elements in a page of results. - `java.lang.Integer`
  token - A ResultContinuation object that represents the continuation token. - `com.microsoft.azure.storage.ResultContinuation`"
  (^ResultSegment [^java.util.ArrayList results ^java.lang.Integer page-size ^com.microsoft.azure.storage.ResultContinuation token]
    (new ResultSegment results page-size token)))

(defn get-continuation-token
  "Returns the continuation token for the result segment.

  returns: A ResultContinuation object that represents the continuation token. - `com.microsoft.azure.storage.ResultContinuation`"
  (^com.microsoft.azure.storage.ResultContinuation [^ResultSegment this]
    (-> this (.getContinuationToken))))

(defn get-has-more-results?
  "Returns a value that indicates whether there are more results available from the server.

  returns: true if there are more results available from the server; otherwise, false. - `boolean`"
  (^Boolean [^ResultSegment this]
    (-> this (.getHasMoreResults))))

(defn get-is-page-complete?
  "Returns a value that indicates whether the page has more results.

  returns: true if the page has more results; otherwise, false. - `boolean`"
  (^Boolean [^ResultSegment this]
    (-> this (.getIsPageComplete))))

(defn get-length
  "Returns the number of results in the segment.

  returns: The actual number of the results in the segment. - `int`"
  (^Integer [^ResultSegment this]
    (-> this (.getLength))))

(defn get-page-size
  "Returns the size of the requested page.

  returns: The size of the requested page. - `java.lang.Integer`"
  (^java.lang.Integer [^ResultSegment this]
    (-> this (.getPageSize))))

(defn get-remaining-page-results
  "Returns the count of remaining results needed to fulfill the requested page size.

  returns: The count of remaining results needed to fulfill the requested page size. - `int`"
  (^Integer [^ResultSegment this]
    (-> this (.getRemainingPageResults))))

(defn get-results
  "Returns an enumerable set of results from the service.

  returns: The results retrieved from the service. - `java.util.ArrayList<T>`"
  (^java.util.ArrayList [^ResultSegment this]
    (-> this (.getResults))))

