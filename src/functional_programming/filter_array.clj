(ns functional_programming.filter-array)

(defn filter_array [upper lst]
  (for [i lst]
    (when (< i upper) (println i))))
