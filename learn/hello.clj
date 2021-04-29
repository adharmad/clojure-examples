(defn hello-world [username] 
  (println (format "Hello, %s!" username)))

(defn main []
  (hello-world "Joe")
  (hello-world "Bill")
  (hello-world "Steve"))

(main)
