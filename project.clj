(defproject marginalia "0.9.0"
  :description "lightweight literate programming for clojure -- inspired by [docco](http://jashkenas.github.com/docco/)"
  :main marginalia.main
  :dependencies
  [[org.clojure/clojure "1.7.0"]
   [org.clojure/clojurescript "1.7.228"]
   [org.clojure/tools.namespace "0.2.10"]
   [org.clojure/tools.cli "0.3.3"]
   [org.markdownj/markdownj "0.3.0-1.0.2b4"]
   [de.ubercode.clostache/clostache "1.4.0"]
   [pjstadig/humane-test-output "0.8.1"]
   [spyscope "0.1.5"]
   [prismatic/schema "1.1.3"]
   ]

  :resource-paths ["vendor"]

  ;;Needed for testing Latex equation formatting. You must download
  ;;and install MathJax in you doc directory.
  :marginalia {:javascript ["mathjax/MathJax.js"]})
