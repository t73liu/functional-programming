(ns functional-programming.prefix-compression)

(def first-str (read-line))
(def second-str (read-line))

(loop [p ""
       x first-str
       y second-str]
  (if (or (empty? x) (empty? y))
    (do (println (count p) p)
        (printf "%d " (count x))
        (dorun (for [l x]
                 (print l)))
        (print "\n")
        (printf "%d " (count y))
        (dorun (for [l y]
                 (print l)))
        (print "\n"))
    (if (= (first x) (first y))
      (recur (str p (first x)) (rest x) (rest y))
      (do (println (count p) p)
          (printf "%d " (count x))
          (dorun (for [l x]
                   (print l)))
          (print "\n")
          (printf "%d " (count y))
          (dorun (for [l y]
                   (print l)))
          (print "\n")))))
