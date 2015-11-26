; Namespace
(ns try-clojure.core
  (:use compojure.core)
  (:require
    [ring.adapter.jetty :as jetty]))

; Routing
(defroutes main-routes
  (GET "/" [] "Hello World"))

; Main
(defn -main []
  (jetty/run-jetty main-routes {:port 5000}))

