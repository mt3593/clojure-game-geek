(defproject clojure-game-geek "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.walmartlabs/lacinia-pedestal "0.5.0"]
                 [com.stuartsierra/component "0.3.2"]
                 [io.aviso/logging "0.2.0"]]

  :profiles {:dev {:resource-paths ["dev-resources"]}})
