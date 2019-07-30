(ns com.microsoft.azure.storage.queue.MessageUpdateFields
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.queue MessageUpdateFields]))

(def VISIBILITY
  "Enum Constant.

  Set to update the message visibility timeout.

  type: com.microsoft.azure.storage.queue.MessageUpdateFields"
  MessageUpdateFields/VISIBILITY)

(def CONTENT
  "Enum Constant.

  Set to update the message content.

  type: com.microsoft.azure.storage.queue.MessageUpdateFields"
  MessageUpdateFields/CONTENT)

(defn value
  "Instance Field.

  Returns the value of this enum.

  type: int"
  (^Integer [^MessageUpdateFields this]
    (-> this .-value)))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (MessageUpdateFields c : MessageUpdateFields.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.microsoft.azure.storage.queue.MessageUpdateFields[]`"
  ([]
    (MessageUpdateFields/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.microsoft.azure.storage.queue.MessageUpdateFields`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.microsoft.azure.storage.queue.MessageUpdateFields [^java.lang.String name]
    (MessageUpdateFields/valueOf name)))

