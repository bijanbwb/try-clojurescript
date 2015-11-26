; Namespace
(ns try-clojure.core
  (:use compojure.core)
  (:require
    [ring.adapter.jetty :as jetty]
    [clostache.parser :as clostache]
    [compojure.route :as route]))

; Templates
(defn read-template [template-name]
  (slurp (clojure.java.io/resource
    (str "templates/" template-name ".mustache"))))

(defn render-template [template-file params]
  (clostache/render (read-template template-file) params))

; Views
(defn index []
  (render-template "index" {:greeting "Greetings"}))

; Routing
(defroutes main-routes
  (GET "/" [] (index))
  (route/resources "/")
  (route/not-found "404 Not Found"))

; Main
(defn -main []
  (let [port (Integer/parseInt (get (System/getenv) "PORT" "5000"))]
    (jetty/run-jetty main-routes {:port port})))

