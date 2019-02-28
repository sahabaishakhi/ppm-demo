(ns ppm-demo.core)

(def height 400)
(def width 600)
(def grids (* width height))

(def head (str "P3\n" height " " width " 255" "\n" ))
(def image-data
  (str
   head (clojure.string/join
         "\n"
         (map str (repeat "255 ") (map mod
                                       (range grids) (repeat 256)) (repeat " 0")))))

(def ppm-content image-data)

(spit "griddemo.ppm" ppm-content)
