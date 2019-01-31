(ns functional-programming.different-ways)

(def times (Integer/parseInt (read-line)))

(def limit 100000007)

(def memo-choose
  (memoize
   (fn [n k]
     (cond (zero? k) 1
       (= n k)       1
       (= k 1)       n
       :else         (mod
                      (+ (memo-choose (dec n) (dec k))
                         (memo-choose (dec n) k))
                      limit)))))

(dotimes [_ times]
  (let [inputs (->> (clojure.string/split (read-line) #" ")
                    (map #(Integer/parseInt %)))
        n      (first inputs)
        k      (second inputs)]
    (println (memo-choose n k))))
