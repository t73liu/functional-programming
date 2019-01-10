(ns functional-programming.area-volume-slope)

; 0.001 is the delta
(let
  [lines (vec (line-seq (java.io.BufferedReader. *in*)))
   coefficients (map #(Integer. %) (clojure.string/split (lines 0) #"\s"))
   exponents (map #(Integer. %) (clojure.string/split (lines 1) #"\s"))
   bounds (map #(Integer. %) (clojure.string/split (lines 2) #"\s"))
   lower-bound (first bounds)
   upper-bound (second bounds)
   eval-poly (fn [x] (reduce + (map #(* %1 (Math/pow x %2)) coefficients exponents)))
   calc-area (fn []
               (loop [x lower-bound area 0]
                 (if (<= x upper-bound)
                   (recur (+ x 0.001) (+ area (eval-poly x)))
                   area)))
   calc-volume (fn []
                 (loop [x lower-bound volume 0]
                   (if (<= x upper-bound)
                     (recur (+ x 0.001) (+ volume (* Math/PI (Math/pow (eval-poly x) 2))))
                     volume)))]
  (do
    (println (* 0.001 (calc-area)))
    (println (* 0.001 (calc-volume)))))
