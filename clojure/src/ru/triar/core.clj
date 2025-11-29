;; core.clj
(ns ru.triar.core
  (:require 
    [ru.triar.gui :as gi]
    [ru.triar.logic :as lg]))

(defn triar []
  (let [r (volatile! nil)
        f (gi/jframe-grid "Triangle Area" 7 1 4 16 200 300)
        _ (gi/add-label f "Triangle sides:")
        a (gi/add-text-field f "1")
        b (gi/add-text-field f "2")
        c (gi/add-text-field f "3")
        _ (gi/add-label f "Triangle area:")
        _ (gi/add-button f "calculate area"
            (fn[_] (.setText @r (str
              (lg/calc-area
                (read-string (.getText a))
                (read-string (.getText b))
                (read-string (.getText c)))))))]
      (vreset! r (gi/add-text-field f "area"))
      (.setVisible f true)))
