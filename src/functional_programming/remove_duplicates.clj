(ns functional-programming.remove-duplicates)

(doseq [x (distinct (read-line))]
  (print x))
