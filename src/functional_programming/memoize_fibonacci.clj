(ns functional-programming.memoize-fibonacci)

(def times (Integer/parseInt (read-line)))

(def limit 100000007)

(def mem-fibonacci
  (memoize
   (fn [n]
     (cond (<= n 0) 0
       (= n 1)      1
       :else        (mod
                     (+ (mem-fibonacci (- n 2))
                        (mem-fibonacci (dec n)))
                     limit)))))

(dotimes [_ times]
  (println (mem-fibonacci (Integer/parseInt (read-line)))))
