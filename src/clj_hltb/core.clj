;;; Namespace and requires
(ns clj-hltb.core
  (:require [clojure.java.io :as io]
            [net.cgrand.enlive-html :as html]
            [clj-http.client :as client])
  (:gen-class :main true))

;;; Constant definitions
(def ^:dynamic *base-url* "http://www.howlongtobeat.com/search_main.php?t=games&page=1&sorthead=&sortd=Normal&plat=&detail=0")

;;; Functions
;; Print Usage
(defn print-usage "Print usage" []
  (println "Should pass on the game name."))

;; Fetch data and Print
(defn fetch-and-print "Fetch data and Print" [game]
  (format "Searching: %s" game)
  (def document (client/post *base-url*
               {:form-params {:queryString game}}))
  (def result_map (map html/text (html/select (html/html-snippet (:body document)) #{[:h3 :a] [:div.gamelist_tidbit]})))
  (doseq [line (map (fn [[g tm m tme me tc c tcb cb]] (str
                                                      "======================\nGame Name: " g "\n"
                                                      tm ": " m "\n"
                                                      tme ": " me "\n"
                                                      tc ": " c "\n"
                                                      tcb ": " cb "\n"))
                    (partition 9 result_map))]
    (println line)))

;;; \o/!
(defn -main "The application's main function" [& args]
  ;; Check for args
  (if args
    (fetch-and-print (first args))
    (print-usage)))
