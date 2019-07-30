(ns com.microsoft.azure.storage.IPRange
  "A continuous range of IP addresses."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage IPRange]))

(defn ->ip-range
  "Constructor.

  Creates an IP Range using the specified minimum and maximum IP addresses. The IP addresses must be IPv4.

  mininimum-ip - the minimum IP address of the range - `java.lang.String`
  maximum-ip - the maximum IP address of the range - `java.lang.String`"
  (^IPRange [^java.lang.String mininimum-ip ^java.lang.String maximum-ip]
    (new IPRange mininimum-ip maximum-ip))
  (^IPRange [^java.lang.String ip]
    (new IPRange ip)))

(defn get-ip-min
  "The minimum IP address for the range, inclusive.
   Will match getIpMax() if this IPRange represents a single IP address.

  returns: The minimum IP address - `java.lang.String`"
  (^java.lang.String [^IPRange this]
    (-> this (.getIpMin))))

(defn get-ip-max
  "The maximum IP address for the range, inclusive.
   Will match getIpMin() if this IPRange represents a single IP address.

  returns: The maximum IP address - `java.lang.String`"
  (^java.lang.String [^IPRange this]
    (-> this (.getIpMax))))

(defn to-string
  "Output the single IP address or range of IP addresses.

  returns: the single IP address or range of IP addresses formated as a String - `java.lang.String`"
  (^java.lang.String [^IPRange this]
    (-> this (.toString))))

