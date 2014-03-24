;;;
;;; HLTB Port to Lisp
;;; From https://github.com/fenak/hltb
;;; Autor: Leon Waldman - le.waldman <at> gmail.com
;;;


;;; Project definitions
(defproject clj-hltb "1.0.0-SNAPSHOT"
  :description "clj-hltb is a simple tool written in Clojure for fetching data from http://howlongtobeat.com."
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [enlive "1.1.5"]
                 [clj-http "0.9.1"]]
  :main clj-hltb.core)
