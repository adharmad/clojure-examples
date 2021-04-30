(defn ackermann 
  "Calculates the ackermann function"
  [m n]
  (if (= m 0)
    (+ n 1)
    (if (and (> m 0) (= n 0))
      (ackermann (- m 1) 1)
      (ackermann (- m 1) (ackermann m (- n 1))))))


(defn main []
  (println (ackermann 3 5)))

(main)
