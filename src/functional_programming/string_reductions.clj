(ns functional-programming.string-reductions)

(def string (read-line))

(dorun (for [s (distinct string)]
  (print s)))
