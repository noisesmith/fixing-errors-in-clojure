(defproject org.noisesmith/fixing-errors-in-clojure "0.1.0-SNAPSHOT"
  :description "FIXME: common clojure errors and messages, and how to fix them."
  :url "http://noisesmith.org/FIXME"
  :min-lein-version "2.0.0"
  :jvm-opts ^:replace ["-server"]
  :dependencies [[org.clojure/clojure "1.7.0-alpha5"]
                 [ring/ring-defaults "0.1.2"]
                 [aleph "0.4.0-beta3"]]
  :main org.noisesmith.fixing-errors-in-clojure.handler
  :profiles
  {:dev {}})
