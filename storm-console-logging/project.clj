(def ROOT-DIR (subs *file* 0 (- (count *file*) (count "project.clj"))))
(def VERSION (-> ROOT-DIR (str "/../VERSION") slurp (.trim)))

(defproject storm/storm-console-logging VERSION
  :resource-paths ["logback"]

  :dependencies [[org.clojure/clojure "1.4.0"]]

  :profiles {:release {:target-path "target"}}

  :aot :all)
