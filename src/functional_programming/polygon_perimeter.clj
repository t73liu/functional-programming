(ns functional-programming.polygon-perimeter
  (:require [clojure.string :as str]))

(def number (Integer/parseInt (read-line)))

(defn calc-perimeter [num]
  (let [points (for [_ (range num)]
                 (->> (str/split (read-line) #" ")
                      (map #(Integer/parseInt %))))
        points_plus_start (conj points (last points))
        basic-distance (fn [x y]
                         (Math/sqrt (+ (* x x) (* y y))))
        distance-points (fn [x y]
                          (basic-distance (- (first x) (first y))
                                          (- (second x) (second y))))]
    (->> (range num)
         (map #(distance-points (nth points_plus_start %)
                                (nth points_plus_start (inc %))))
         (reduce + 0))))

(println (format "%.1f" (calc-perimeter number)))
