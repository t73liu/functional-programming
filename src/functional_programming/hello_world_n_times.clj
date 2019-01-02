(ns functional-programming.hello-world-n-times)

(defn hello_word_n_times [input]
  (dotimes [_ input] (println "Hello World")))

(def n (Integer/parseInt (read-line)))
(hello_word_n_times n)
