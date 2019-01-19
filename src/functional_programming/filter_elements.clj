(ns functional-programming.filter-elements)

(def number-of-tests (Integer/parseInt (read-line)))

(dorun
 (dotimes [_ number-of-tests]
   (let [get-int-arr            (fn []
                                  (->> (clojure.string/split (read-line) #" ")
                                       (map #(Integer/parseInt %))))
         [number-elements reps] (get-int-arr)
         arr                    (get-int-arr)
         freq                   (->> (frequencies arr)
                                     (filter #(>= (second %) reps))
                                     (reduce
                                      (fn [acc curr]
                                        (conj acc (first curr)))
                                      (hash-set)))]
     (if (empty? freq)
       (println -1)
       (loop [lst  arr
              seen (hash-set)]
         (if (empty? lst)
           (println)
           (if (and (contains? freq (first lst))
                    (not (contains? seen (first lst))))
             (do (printf "%d " (first lst))
               (recur (rest lst) (conj seen (first lst))))
             (recur (rest lst) seen))))))))
