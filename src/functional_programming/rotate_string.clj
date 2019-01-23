(ns functional-programming.fibonacci)

(def times (Integer/parseInt (read-line)))

(dotimes [_ times]
  (let [input (read-line)
        times (count input)]
    (loop [index 1]
      (when (<= index times)
        (printf "%s%s " (subs input index) (subs input 0 index))
        (recur (inc index))))
    (println)))
