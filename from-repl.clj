(ns user
  (:require (eu.cassiel [reveal-js-render-clj :as renderer])
            [clojure.edn :as edn]
            [me.raynes.conch :refer [with-programs]])
  (:import (java.io File)))

;; This function works for the Codezoners presentations in a standard location. Edit to taste for other presentations.

(defn render-site [topic]
  (let [dir (File. (format "/Users/nick/CASSIEL/codezoners-2-prep/%s/presentation" topic))
        reveal-js (File. "/Users/nick/GITHUB/cassiel/reveal.js")]
    (renderer/render-main (File. dir "presentation.clj")
                          (File. dir "presentation.html")
                          reveal-js)))

(render-site "HTML/05_building_sites_with_Bootstrap")