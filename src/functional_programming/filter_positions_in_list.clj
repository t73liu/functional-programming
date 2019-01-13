(ns functional-programming.filter-positions-in-list)

(defn filter-positions-lst [lst]
  (keep-indexed #(if (odd? %1) %2) lst))
