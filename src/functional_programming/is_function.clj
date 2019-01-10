(ns functional-programming.is-function)

; Function is valid if each x has only one y
(def num-test (Integer/parseInt (read-line)))

(dotimes [_ num-test]
  (let [num-points (Integer/parseInt (read-line))
        get-points (fn [_] (clojure.string/split (read-line) #" "))
        check-unique (fn [curr _ val] (and curr (= 1 (count (distinct val)))))
        print-answer (fn [result] (if result (println "YES")
                                             (println "NO")))]
    (->> (range num-points)
         (map get-points)
         (group-by first)
         (reduce-kv check-unique true)
         (print-answer))))
