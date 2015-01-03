(ns leiningen.generate.exercise
  (:require [leiningen.generate.common :as common]))

(defn exercise
  "Generates a test/exercise skeletons pair.
  Mandatory: name is the main name of the exercise, for example 2-1 or 3-2-1.
  Optional: root package name, default 'sicp'.
  Optional: test framework, [coretest|midje]. Default to 'coretest'."
  [project name & [root test]]
  (common/stub project name "exercise" root test))
