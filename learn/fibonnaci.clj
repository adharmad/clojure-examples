(defn fibonnaci
  "Calculate nth fibonnaci number"
  [n]
  (if (or (= n 0) (= n 1))
      1
      (+ (fibonnaci (- n 1)) (fibonnaci (- n 2)))))

(defn main []
  (println (fibonnaci 20)))

(main)
