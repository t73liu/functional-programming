(ns functional-programming.list-length)

; Count the number of elements in an array without using count, size
; or length operators (or their equivalents).
(defn list-length [lst]
  (reduce (fn [acc _] (+ acc 1)) 0 lst))
