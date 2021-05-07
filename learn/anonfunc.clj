(defn make-greeter [greeting-prefix]
  (fn [username] (str greeting-prefix ", " username)))

(def indian-greeting (make-greeter "Namaste"))

(defn main [] 
  (println (indian-greeting "Amol")))

(main)
