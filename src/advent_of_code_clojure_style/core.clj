(ns advent-of-code-clojure-style.core
  (:gen-class))
(use 'clojure.java.io)

; (defn parse-int [v] 
;    (try 
;      (Integer/parseInt (re-find #"^\d+" (.toString v))) 
;      (catch NumberFormatException e 0)))

;; This program displays Hello World
; (defn read-file []
;    (with-open [rdr (clojure.java.io/reader "src/input.txt")]
;    (reduce conj [] (line-seq rdr))))

(defn solution-one [x]
  (reduce + 0 x))

(defn -main
  "I don't do a whole lot ... yet."
  []
  (println "Hello World"))






