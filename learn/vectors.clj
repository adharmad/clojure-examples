Clojure 1.10.3
user=> [:test1 1 2 3 :test2]
[:test1 1 2 3 :test2]
user=> (first [:test1 1 2 3 :test2])
:test1
user=> (rest [:test1 1 2 3 :test2])
(1 2 3 :test2)
user=> (nth [:test1 1 2 3 :test2] 3)
3
user=> (last [:test1 1 2 3 :test2])
:test2
user=> (count [:test1 1 2 3 :test2])
5
user=> (conj [:apple :mango :banana] [:guava :kiwi :pineapple])
[:apple :mango :banana [:guava :kiwi :pineapple]]
user=> (conj [:apple :mango :banana] :persimmon :tangerine)
[:apple :mango :banana :persimmon :tangerine]
