(ns ppm-demo.core)

(def height 4)
(def width 6)
(def grids (* width height))

(def head (str "P3\n" height " " width " 255" "\n" ))
(def image-data (str head
                     (clojure.string/join "\n" (repeat grids "255 0 0"))))
(def ppm-content image-data)

(spit "griddemo.ppm" ppm-content)
