(ns functional_programming.filter-array)

(defn filter-array [upper lst]
  (for [i lst]
    (when (< i upper) (println i))))
