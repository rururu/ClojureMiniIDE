;; gui.clj
(ns ru.triar.gui
(:import
  javax.swing.JFrame
  javax.swing.JLabel
  javax.swing.JTextField
  javax.swing.JButton
  java.awt.event.ActionListener
  java.awt.GridLayout))

(defn action-listener [obj func]
  (.addActionListener
  obj (proxy [ActionListener] []
          (actionPerformed [evt] (func evt)))))

(defn add-button [obj symb func]
  (.add obj (doto (JButton. symb) (action-listener func))))

(defn add-label [obj symb]
  (.add obj (doto (JLabel. symb))))

(defn add-text-field [obj txt]
  (.add obj (doto (JTextField.) (.setText txt))))
