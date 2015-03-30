(ns org.noisesmith.fixing-errors-in-clojure.handler
  (:require [aleph.http :as http]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(def app
  (-> (fn [{uri :uri :as request}]
        {:status 404
         :headers {"content-type" "text/plain"}
         :body (str "route " uri " not found")})
      (wrap-defaults site-defaults)))

(defn -main
  [& args]
  (http/start-server #'app {:port 8080}))
