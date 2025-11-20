;; core.clj
(ns ru.triar.core
  (:import
    javax.swing.JFrame
    javax.swing.JLabel
    javax.swing.JTextField
    javax.swing.JButton
    java.awt.event.ActionListener
    java.awt.GridLayout)
  (:require 
    [ru.triar.gui :as gi]))

(defn triar []
  (let [calc #()]
    (doto (JFrame. "Triangle Area")
      (gi/add-label "Triangle sides:")
      (gi/add-text-field "a")
      (gi/add-text-field "b")
      (gi/add-text-field "c")
      (gi/add-label "Triangle area:")
      (gi/add-button "calculate area" calc)
      (gi/add-text-field "area")
      (.setLayout (new GridLayout 7 1 4 4))
      (.setSize 250 300)
      (.setVisible true))))
