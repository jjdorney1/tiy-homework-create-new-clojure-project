(ns tiy-homework-create-new-clojure-project.core)

(defn -main []
  (let [
        first-number (+ 400 40)
        second-number (- 400 50)
        third-number (* 40 10)
        fourth-number (/ 440 10)
        fifth-number (mod 443 11)
        sixth-number (+ first-number second-number third-number)
        seventh-number (* fourth-number fifth-number)
        eighth-number (- seventh-number sixth-number)
        ninth-number (mod seventh-number sixth-number)
        tenth-number (* first-number fourth-number)]

    ;; print all the values
      (println "The first number is " first-number ".")         ;
      (println "The second number is " second-number ".")       ;
      (println "The third number is " third-number ".")         ;
      (println "The fourth number is " fourth-number ".")       ;
      (println "The fifth number is " fifth-number ".")         ;
      (println "The first through third numbers sum is " sixth-number ".") ;
      (println "The forth times the fifth number is " seventh-number ".") ;
      (println "The difference between the last two numbers is " eighth-number ".") ;
      (println "The remainder of dividing those same two numbers is " ninth-number ".") ;
      (println "The first times the fourth number is " tenth-number ".") ;

    )

  )

(-main)