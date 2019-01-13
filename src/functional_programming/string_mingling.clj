(ns functional-programming.string-mingling)

(def first-str (clojure.string/split (read-line) #""))
(def second-str (clojure.string/split (read-line) #""))

(defn string-mingling [p q]
  (->>  (map str p q)
        (reduce str)))

(println (string-mingling first-str second-str))
