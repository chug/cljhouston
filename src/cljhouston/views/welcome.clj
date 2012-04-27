(ns cljhouston.views.welcome
  (:use 
    [hiccup core page]
    noir.core))

(defpage "/"
  []
  (html
    (html5
      [:head
       (include-css "/css/bootstrap.css")
       (include-js "/js/bootstrap.min.js")]
      [:body 
       [:div.container
        [:div.row
         [:div.span12
          "Hello, world!"
          ]]]])))
