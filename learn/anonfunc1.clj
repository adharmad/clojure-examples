Clojure 1.10.3
user=> (fn [x y] (+ x y))
#object[user$eval136$fn__137 0x3fa76c61 "user$eval136$fn__137@3fa76c61"]
user=> (def add (fn [x y] (+ x y)))
#'user/add
user=> (add 1 2)
3
user=> #(+ %1 %2)
#object[user$eval147$fn__148 0x545e57d7 "user$eval147$fn__148@545e57d7"]
user=> (def addx #(+ %1 %2))
#'user/addx
user=> (addx 3 4)
7
