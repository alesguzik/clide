(ns clide.server
  )

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hi there"})
