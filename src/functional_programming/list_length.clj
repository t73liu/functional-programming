(ns functional-programming.list-length)

; Count the number of elements in an array without using count, size
; or length operators (or their equivalents).
(defn list_length [lst]
  (reduce (fn [acc curr] (+ acc 1)) 0 lst))
