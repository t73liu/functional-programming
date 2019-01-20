(ns functional-programming.lists-gcd)

(def size (Integer/parseInt (read-line)))

(def list-maps
  (for [_ (range size)]
    (->> (clojure.string/split (read-line) #" ")
         (map #(Integer/parseInt %))
         (partition 2)
         (reduce #(assoc %1 (first %2) (second %2)) {}))))

(defn reducer [acc curr]
  (->> (keys curr)
       (select-keys acc)
       (reduce-kv #(assoc %1 %2 (min %3 (get curr %2))) (sorted-map))))

(dorun
  (for [entry (reduce reducer list-maps)]
    (print (first entry) (second entry) "")))
