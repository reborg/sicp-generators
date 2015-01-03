(defproject sicp-generators "0.1.0"
  :description "Test-exercise-paragraph lein plugin generator for diehard SICP folks"
  :url "https://github.com/reborg/sicp-generators"
  :license {:name "Eclipse Public License" :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :dependencies [[lein-gen "0.2.1"]]
  :profiles {:dev {:plugins [[lein-gen "0.2.1"]]}})
