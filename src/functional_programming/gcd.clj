(ns functional-programming.gcd)

(let [f (fn [a b]
          (loop [x a
                 y b
                 divisor (if (< a b) a b)]
            (if (and (zero? (rem x divisor))
                     (zero? (rem y divisor)))
              divisor
              (recur x y (dec divisor)))))
      [m n] (map read-string (re-seq #"\d+" (read-line)))]
  (println (f m n)))
