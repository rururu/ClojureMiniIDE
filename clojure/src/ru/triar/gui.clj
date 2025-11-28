;; gui.clj
(ns ru.triar.gui
(:import
  javax.swing.JFrame
  javax.swing.JPanel
  javax.swing.JLabel
  javax.swing.JTextField
  javax.swing.JButton
  java.awt.Dimension
  java.awt.event.ActionListener
  javax.swing.border.EmptyBorder
  java.awt.GridLayout))
  
(defn jframe-grid [tit rr cc g p w h]
  (let [bd (EmptyBorder. p p p p)
        cp (JPanel.)
        gl (GridLayout. rr cc g g)]
    (.setBorder cp bd)
    (doto (JFrame. tit)
      (.setContentPane cp)
      (.setLayout gl)
      (.setPreferredSize (Dimension. w h))
      (.pack))))
    

(defn action-listener [obj func]
  (.addActionListener obj
    (proxy [ActionListener] []
          (actionPerformed [evt] (func evt)))))

(defn add-button [obj symb func]
  (.add obj (doto (JButton. symb) (action-listener func))))

(defn add-label [obj symb]
  (.add obj (doto (JLabel. symb))))

(defn add-text-field [obj txt]
  (.add obj (doto (JTextField.) (.setText txt))))
