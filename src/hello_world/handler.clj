(ns hello-world.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
	(GET "/" [name] (str "name=" name))
	(POST "/sayhi" [name] (str "name=" name))
	(route/resources "/")
	(route/not-found "Not Found"))

(def app
	(handler/site app-routes))
