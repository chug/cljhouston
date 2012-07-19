(ns cljhouston.views.welcome
  (:use [hiccup core page element]
        noir.core))

(def members
  ["Daniel Solano Gómez"
   "Nelson Morris"
   "Steven Byrnes"
   "Steven Reynolds"
   "Jim Theriot"
   "Robert Boone"
   "Jeremey Barrett"])

(def meetings
  [["5/24/2012" "Work on the website."]
   ["7/26/2012" "Clojure Macros through the Lens of Generative programming"]])

(defpage "/"
  []
  (html
   (html5
    [:head
     [:title "CHUG: Clojure/Houston Users Group"]
     (include-css "/bootstrap/css/bootstrap.min.css")
     (include-js "/bootstrap/js/bootstrap.min.js")]
    [:body
     [:div.container
      [:div.row
       [:div.span12
        [:h1 "CHUG: Clojure/Houston Users Group"]]]
      [:div.row
       [:div.span12
        [:h2 "Meeting Details"]
        [:ul
         [:li [:b "Time:"] " 7:00 pm on the fourth Thursday of the month"]
         [:li [:b "Location:"] " INT, 2901 Wilcrest, Suite 300"]
         [:li (link-to "http://groups.google.com/group/clj-houston"
                       "Mailing List")]]]]
      [:div.row
       [:div.span12
        [:h2 "Members"]
        [:ul
         (map #(vector :li %) members)]]]
      [:div.row
       (let [[date topic] (last meetings)]
         [:div.span12
          [:h2 (str "Next Meeting (" date ")")]
          [:p topic]])]
      [:div.row
       [:div.span12
        [:h2 "Projects"]
        [:p [:em "... you're looking at it ..."]]]]]])))

