(ns functional-programming.common-divisors)

(def times (Integer/parseInt (read-line)))

(dotimes [_ times]
  (let [inputs (->> (clojure.string/split (read-line) #" ")
                    (map #(Integer/parseInt %)))
        x      (first inputs)
        y      (second inputs)
        small  (if (< x y) x y)
        big    (if (< x y) y x)]
    (println
     (loop [div   1
            other small
            acc   0]
       (if (<= (* div div) small)
         (recur (inc div)
           (quot small (inc div))
           (cond-> acc
             (and (zero? (rem big div))
                  (zero? (rem small div)))
              (inc)
             (and (zero? (rem small div))
                  (zero? (rem big other))
                  (not= other div))
              (inc)))
         acc)))))
