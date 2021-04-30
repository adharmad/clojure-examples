(defn sum-numbers
  "Sum natural numbers up to n"
  [n]
  (if (= n 0)
    0
    (+ n (sum-numbers (- n 1)))))

(defn sum-numbers-formula
  "Sum natural numbers up to n using formula"
  [n]
  (/ (* n (+ n 1)) 2))

(defn main []
  (println (sum-numbers 10))
  (println (sum-numbers-formula 10))
  )

(main)
