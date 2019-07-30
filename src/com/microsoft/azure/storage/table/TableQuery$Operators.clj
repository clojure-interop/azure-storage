(ns com.microsoft.azure.storage.table.TableQuery$Operators
  "A static class that maps identifiers to filter expression operators."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.microsoft.azure.storage.table TableQuery$Operators]))

(defn ->table-query.-operators
  "Constructor."
  (^TableQuery$Operators []
    (new TableQuery$Operators )))

(def *-and
  "Static Constant.

  And

  type: java.lang.String"
  TableQuery$Operators/AND)

(def *-not
  "Static Constant.

  Not

  type: java.lang.String"
  TableQuery$Operators/NOT)

(def *-or
  "Static Constant.

  Or

  type: java.lang.String"
  TableQuery$Operators/OR)

