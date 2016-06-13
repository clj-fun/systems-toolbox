(ns matthiasn.systems-toolbox.test-spec
  (:require
    #?(:clj  [clojure.spec :as s]
       :cljs [cljs.spec :as s])
    #?(:clj  [clojure.tools.logging :as l]
       :cljs [matthiasn.systems-toolbox.log :as l])))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Test Specs
(s/def :some/type number?)
(s/def :cmd/ping nil?)
(s/def :cmd/pong nil?)
(s/def :int/div-by-10 #(and (number? %) (zero? (mod % 10))))
(s/def :int/div-by-100 #(and (number? %) (zero? (mod % 100))))
