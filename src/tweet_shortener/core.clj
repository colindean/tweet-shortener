(ns tweet-shortener.core)
(require '[clojure.string :as str])

(defn with-to-wslash
  "with -> w/"
  [t]
  (str/replace t " with " " w/ "))

(defn and-to-amp
  "and -> &"
  [t]
  (str/replace t " and " " & "))

(defn definitely-to-defdot
  "definitely -> def."
  [t]
  (str/replace t " definitely " " def. "))