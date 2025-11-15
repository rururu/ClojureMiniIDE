(ns cmi.core
  (:gen-class))

(defn -main [& args]
  (ru.clojure.minide.ClojureMiniIDE/main (into-array String [args])))
