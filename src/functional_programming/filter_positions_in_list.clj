(ns functional-programming.filter-positions-in-list)

(defn filter_positions_lst [lst]
  (keep-indexed #(if (odd? %1) %2) lst))
