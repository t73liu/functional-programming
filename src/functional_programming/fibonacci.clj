(ns functional-programming.fibonacci)

(def input (Integer/parseInt (read-line)))

(defn fibonacci [n]
  (cond (<= n 1) 0
        (= n 2) 1
        :else (loop [n-1 1
                     n-2 0
                     i 3]
                (if (= i n)
                  (+ n-1 n-2)
                  (recur (+ n-1 n-2) n-1 (inc i))))))

(println (fibonacci input))
