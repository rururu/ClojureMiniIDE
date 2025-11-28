;; core.clj
(ns ru.triar.core
  (:require 
    [ru.triar.gui :as gi]
    [ru.triar.logic :as lg]))

(defn triar []
  (let [f (gi/jframe-grid "Triangle Area" 7 1 4 16 200 300)
        _ (gi/add-label f "Triangle sides:")
        a (gi/add-text-field f "a")
        b (gi/add-text-field f "b")
        c (gi/add-text-field f "c")
        _ (gi/add-label f "Triangle area:")
        _ (gi/add-button f "calculate area"
            (fn[_](lg/calc-area 
                    (.getText a)
                    (.getText b)
                    (.getText c))))
        r (gi/add-text-field f "area")]
      (.setVisible f true)))
