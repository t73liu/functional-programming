(ns functional-programming.sum-odd-elements)

(defn sum_odd_elements [lst]
  (->> lst
       (filter odd?)
       (reduce + 0)))
