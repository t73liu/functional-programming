(ns functional-programming.list-replication)

(defn list-replication [num lst]
  (for [i lst]
    (dotimes [_ num] (println i))))
