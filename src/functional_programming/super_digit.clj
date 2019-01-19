(ns functional-programming.hello-world-n-times)

(def input (clojure.string/split (read-line) #" "))

(defn super-digit [arr]
  (let [num-str        (first arr)
        times          (Integer/parseInt (second arr))
        char-to-int    (fn [c] (- (int c) 48))
        sum-digits     (fn [digits]
                         (reduce #(+ %1 (char-to-int %2)) 0 digits))
        combined       (->> num-str
                            sum-digits
                            (repeat times)
                            (reduce + 0)
                            str)]
    (loop [curr combined]
      (if (<= (count curr) 1)
        curr
        (recur (str (sum-digits curr)))))))

(println (super-digit input))
