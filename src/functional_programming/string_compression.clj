(ns functional-programming.string-compression)

(def input (clojure.string/split (read-line) #""))

(defn compress [string]
  (loop [arr string
         letter ""
         count 1]
    (if (empty? arr)
      (if (= count 1) (print letter)
                      (print (str letter count)))
      (if (= letter (first arr))
        (recur (rest arr) letter (inc count))
        (do (if (= count 1) (print letter)
                            (print (str letter count)))
            (recur (rest arr) (first arr) 1))))))

(compress input)
