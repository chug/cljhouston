(ns cljhouston.server
  (:require [noir.server :as server]
            [ring.middleware.file :as wrap-file]))

(server/load-views-ns 'cljhouston.views)

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "8080"))]
    (server/start port {:mode mode
                        :ns 'cljhouston})))
