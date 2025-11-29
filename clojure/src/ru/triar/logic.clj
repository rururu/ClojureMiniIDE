;; logic.clj
(ns ru.triar.logic)
(defn perimetr [a b c]
  (+ a b c))
  
(defn calc-area [a b c]
  (let [p (perimetr a b c)
        hp (/ p 2)
        g (* hp (- hp a)(- hp b)(- hp c))]
    (Math/sqrt g)))

