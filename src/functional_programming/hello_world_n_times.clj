(ns functional-programming.hello-world-n-times)

(defn hello-word-n-times [input]
  (dotimes [_ input] (println "Hello World")))

(def n (Integer/parseInt (read-line)))
(hello-word-n-times n)
