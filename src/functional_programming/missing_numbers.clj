(ns functional-programming.missing-numbers)

(def size-one (Integer/parseInt (read-line)))

(def list-one (clojure.string/split (read-line) #" "))

(def size-two (Integer/parseInt (read-line)))

(def list-two (clojure.string/split (read-line) #" "))

(let [freq-one (frequencies list-one)
      freq-two (into (sorted-map) (frequencies list-two))]
  (doseq [x freq-two
          :when (not= (second x) (get freq-one (first x)))]
    (printf "%s " (first x))))
