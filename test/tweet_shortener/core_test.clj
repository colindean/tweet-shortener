(ns tweet-shortener.core-test
  (:require [clojure.test :refer :all]
            [tweet-shortener.core :refer :all]))

(deftest test-with
  (testing "with -> w/"
    (is (= "Text w/ it." (with-to-wslash "Text with it."))))

  (testing "and -> &"
    (is (= "Text & stuff." (and-to-amp "Text and stuff."))))

  (testing "definitely -> def."
    (is (= "This test def. rocks." (definitely-to-defdot "This test definitely rocks."))))

  (testing "triple transform composure"
    (is (= "This & that def. w/ whatever."
          (-> "This and that definitely with whatever."
            with-to-wslash and-to-amp definitely-to-defdot))))

  )
