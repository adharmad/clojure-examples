Clojure 1.10.3
user=> {:key1 "val1" :key2 "val2"}
{:key1 "val1", :key2 "val2"}
user=> (get {:key1 "val1" :key2 "val2"} :key2)
"val2"
user=> (:key1 {:key1 "val1" :key2 "val2"})
"val1"
user=> (keys {:key1 "val1" :key2 "val2" :key3 "val3"})
(:key1 :key2 :key3)
user=> (vals {:key1 "val1" :key2 "val2" :key3 "val3"})
("val1" "val2" "val3")
user=> (assoc {:key1 "val1" :key2 "val2" :key3 "val3"} :key2 "newval2")
{:key1 "val1", :key2 "newval2", :key3 "val3"}
user=> (dissoc {:key1 "val1" :key2 "val2" :key3 "val3"} :key1)
{:key2 "val2", :key3 "val3"}
user=> (merge {:key1 "val1" :key2 "val2"} {:key3 "val3" :key4 "val4"} {:key5 "val5"})
{:key1 "val1", :key2 "val2", :key3 "val3", :key4 "val4", :key5 "val5"}
user=>
