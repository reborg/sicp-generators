(ns leiningen.generate.common
  (:require [leiningen.generate.templates :as tmpl]
            [leiningen.new.templates :refer [name-to-path]]
            [leiningen.core.main :as main]))

(defn stub
  "Generates a test/exercise/paragraph skeletons pair. See public
  subtasks for info. type can be [exercise|paragraph]."
  [project name type & [root test]]
  (let [root (if root root "sicp")
        data {:name name
              :sanitized (name-to-path name)
              :type type
              :root root
              :sanitized-root (name-to-path root)
              :test (if-not (or (= test "coretest") (= test "midje")) "coretest" test)}]
    (doto (tmpl/renderer "stub")
      (tmpl/create-file "stub.clj" (format "src/{{sanitized-root}}/%ss/{{sanitized}}.clj" type) data)
      (tmpl/create-file (format "stub_%s.clj" (:test data)) (format "test/{{sanitized-root}}/%ss/{{sanitized}}_test.clj" type) data))))
