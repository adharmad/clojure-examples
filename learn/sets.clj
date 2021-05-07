Clojure 1.10.3
user=> #{:red :blue :white :green}
#{:white :green :red :blue}
user=> (require `[clojure.set])
nil
user=> (clojure.set/union #{:red :white :blue} #{:red :green :blue})
#{:white :green :red :blue}
user=> (clojure.set/difference #{1 2 3} #{3 4 5})
#{1 2}
user=> (clojure.set/intersection #{1 2 3} #{3 4 5})
#{3}
user=> (set [1 2 3 4])
#{1 4 3 2}
user=> (set [1 2 3 4 1])
#{1 4 3 2}
user=> (contains? #{1 2 3 4} 1)
true
user=> (contains? #{1 2 3 4} 6)
false
user=> (conj #{:mango :apple} :orange)
#{:orange :mango :apple}
user=> (disj #{:mango :apple} :apple)
#{:mango}
