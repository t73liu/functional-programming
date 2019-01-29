(ns functional-programming.pentagonal-numbers)

; Timeout on testcase 5 and 6 memoize?

(def times (Integer/parseInt (read-line)))

(dotimes [_ times]
  (let [x     (Integer/parseInt (read-line))
        outer (fn [n] (+ n (* 2 (dec n))))]
    (println
      (loop [n   x
             acc 0]
        (cond (= n 1) (+ acc 1)
          (= n 2)     (+ acc 5)
          :else       (recur (dec n) (+ acc (outer n))))))))
