(ns leiningen.generate.paragraph
  (:require [leiningen.generate.common :as common]))

(defn paragraph
  "Generates a test/paragraph skeletons pair.
  Mandatory: name is the main name of the paragraph, for example 2-1 or 3-2-1.
  Optional: root package name, default 'sicp'.
  Optional: test framework, [coretest|midje]. Default to 'coretest'."
  [project name & [root test]]
  (common/stub project name "paragraph" root test))
