(ns functional-programming.jumping-bunnies)

(def size (read-line))
(def nums (->> (clojure.string/split (read-line) #" ")
               (map #(Integer/parseInt %))))

(defn gcd [m n]
  (loop [big (if (< m n) n m)
         small (if (< m n) m n)]
    (if (zero? (rem big small))
      small
      (recur small (rem big small)))))

(defn jumping-bunnies [lst]
  (let [lcm (fn [x y] (* x (/ y (gcd x y))))]
    (reduce lcm lst)))

(println (jumping-bunnies nums))
