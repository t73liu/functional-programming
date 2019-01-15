(ns functional-programming.string-mingling)

(def first-str (clojure.string/split (read-line) #""))
(def second-str (clojure.string/split (read-line) #""))

(doall (for [p (map str first-str second-str)]
         (print p)))
