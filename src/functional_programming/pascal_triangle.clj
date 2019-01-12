(ns functional-programming.pascal-triangle)

(def number (Integer/parseInt (read-line)))

(defn pascal [n]
  (println 1)
  (when (> n 1)
    (loop [i 2
           arr [1 1]]
      (println (clojure.string/join " " arr))
      (when (< i n) (recur (inc i)
                           (vec (concat [1]
                                        (reduce-kv (fn [curr idx val]
                                                     (if (< idx (dec i))
                                                       (conj curr (+ val (nth arr (inc idx))))
                                                       curr))
                                                   []
                                                   arr)
                                        [1])))))))

(pascal number)
