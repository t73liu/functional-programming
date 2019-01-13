(ns functional-programming.sum-odd-elements)

(defn sum-odd-elements [lst]
  (reduce (fn [acc curr] (+ acc (if (odd? curr) curr 0)))
          0
          lst))
