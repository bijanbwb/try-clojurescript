(defproject try-clojure "0.1.0-SNAPSHOT"
  :min-lein-version "2.0.0"
  :description "Try Clojure"
  :url "http://try-clojure.herokuapp.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [ring "1.1.8"]
                 [compojure "1.1.5"]
                 [de.ubercode.clostache/clostache "1.3.1"]]
  :main try-clojure.core)
