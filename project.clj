(defproject clo-mini-ide "0.1.0-SNAPSHOT"
      :description "ClojureMiniIde project"
      :dependencies [[org.clojure/clojure "1.12.3"]
                     [com.formdev/flatlaf "3.6.2"]]
      :main ^:skip-aot cmi.core
      :target-path "target/%s"
      :source-paths ["clojure/src"]
      :profiles {:uberjar {:aot :all}})
