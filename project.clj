(defproject smart-gorilla "0.1.0-SNAPSHOT"
  :main ^:skip-aot gorilla-test.core
  :target-path "target/%s"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/data.json "0.2.5"]
                 [org.clojure/data.csv "0.1.2"]
                 [org.clojure/data.xml "0.0.8"]
                 [ring/ring-codec "1.0.0"]
                 [clj-http "1.0.1"]
                 [com.lemondronor.leaflet-gorilla "0.1.1"]]
  :plugins [[lein-gorilla "0.3.4"]]
  :jvm-opts ["-Xmx4g" "-server"])
