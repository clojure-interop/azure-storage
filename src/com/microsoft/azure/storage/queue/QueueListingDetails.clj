(ns com.microsoft.azure.storage.queue.QueueListingDetails
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.queue QueueListingDetails]))

(def ALL
  "Enum Constant.

  Specifies including all available details.

  type: com.microsoft.azure.storage.queue.QueueListingDetails"
  QueueListingDetails/ALL)

(def METADATA
  "Enum Constant.

  Specifies including queue metadata.

  type: com.microsoft.azure.storage.queue.QueueListingDetails"
  QueueListingDetails/METADATA)

(def NONE
  "Enum Constant.

  Specifies including no additional details.

  type: com.microsoft.azure.storage.queue.QueueListingDetails"
  QueueListingDetails/NONE)

(defn value
  "Instance Field.

  Returns the value of this enum.

  type: int"
  (^Integer [^QueueListingDetails this]
    (-> this .-value)))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (QueueListingDetails c : QueueListingDetails.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.queue.QueueListingDetails[]`"
  ([]
    (QueueListingDetails/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.queue.QueueListingDetails`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.queue.QueueListingDetails [^java.lang.String name]
    (QueueListingDetails/valueOf name)))

