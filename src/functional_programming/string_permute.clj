(ns functional-programming.string-permute)

(def number (Integer/parseInt (read-line)))

(dotimes [_ number]
  (let [arr (clojure.string/split (read-line) #"")
        swaps (range 0 (count arr) 2)]
    (->> swaps
         (map #(str (nth arr (inc %)) (nth arr %)))
         clojure.string/join
         println)))
