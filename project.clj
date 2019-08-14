(defproject re-inspector "0.1.0"
  :description "Functional api on ClojureScript for ReInspector extension (re-frame)"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[re-frame "0.10.5"]
                 [garden "1.3.5"]]
  :min-lein-version "2.5.0"

  :plugins [[lein-cljsbuild "1.1.7"]
            [lein-figwheel "0.5.15"]])
