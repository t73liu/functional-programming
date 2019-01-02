(ns functional-programming.list-replication)

(defn list_replication [num lst]
  (for [i lst]
    (dotimes [_ num] (println i))))
