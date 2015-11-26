(ns try-clojure.core
  (:require
    [ring.adapter.jetty :as jetty]))

(defn -main []
  (jetty/run-jetty
    (fn [req] {:status 200 :body "Hello World"})
    {:port 5000}))
