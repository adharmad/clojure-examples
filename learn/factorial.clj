(defn factorial
  "Calculates factorial of number"
  [n]
  (if (= n 0)
    1
    (* n (factorial (- n 1)))))

(defn main []
  (println (factorial 10)))

(main)
