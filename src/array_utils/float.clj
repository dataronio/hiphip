(ns ^{:doc "Utilities for float[]"
      :author "EHF"}
  array-utils.float
  (:use array-utils.core)
  (:refer-clojure :exclude [amap areduce]))

(set! *warn-on-reflection* true)

;; # Float implementations

(def type-info
  {:sg `float
   :atype "[F"
   :constructor `float-array
   :min-value Float/MIN_VALUE
   :max-value Float/MAX_VALUE})

(load "type_impl")