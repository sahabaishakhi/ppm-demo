(ns ppm-demo.core)

(def height 400)
(def width 600)
(def grids (* width height))

(def head (str "P3\n" height " " width "\n"))
(def image-data (str head
                     (clojure.string/join "\n" (repeat grids "255,0,0"))))
(def ppm-content image-data)

(spit "griddemo.ppm" ppm-content)
