(ns functional-programming.evaluating-exp-x)

; Calculate e^x = 1 + x + x^2 / 2! + x^3 / 3! ...... + x^9 / 9!
(def n (Integer/parseInt (clojure.string/trim (read-line))))

(doseq [n-itr (range n)]
  (def x (Double/parseDouble (clojure.string/trim (read-line))))
  (->> (range 1 10)
       (map #(/ (Math/pow x (double %))
                (reduce * 1 (range 2 (+ % 1)))))
       (reduce + 1)
       (println)))
