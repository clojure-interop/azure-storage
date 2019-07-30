(ns com.microsoft.azure.storage.table.TableQuery$QueryComparisons
  "A static class that maps identifiers to filter property comparison operators."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.table TableQuery$QueryComparisons]))

(defn ->table-query.-query-comparisons
  "Constructor."
  (^TableQuery$QueryComparisons []
    (new TableQuery$QueryComparisons )))

(def *-equal
  "Static Constant.

  Equal

  type: java.lang.String"
  TableQuery$QueryComparisons/EQUAL)

(def *-not-equal
  "Static Constant.

  Not Equal

  type: java.lang.String"
  TableQuery$QueryComparisons/NOT_EQUAL)

(def *-greater-than
  "Static Constant.

  Greater Than

  type: java.lang.String"
  TableQuery$QueryComparisons/GREATER_THAN)

(def *-greater-than-or-equal
  "Static Constant.

  Greater Than Or Equal

  type: java.lang.String"
  TableQuery$QueryComparisons/GREATER_THAN_OR_EQUAL)

(def *-less-than
  "Static Constant.

  Less Than

  type: java.lang.String"
  TableQuery$QueryComparisons/LESS_THAN)

(def *-less-than-or-equal
  "Static Constant.

  Less Than Or Equal

  type: java.lang.String"
  TableQuery$QueryComparisons/LESS_THAN_OR_EQUAL)

