(ns ppm-demo.core)

(def ppm_header (str "P3\n" "2 " "2\n" "255\n"
                     "255,0,0\n"
                     "0,255,255\n"
                     "0,0,255\n"
                     "255,0,255"))

(def height 4)
(def width 6)
(def grids (* width height))

(def head (str "P3\n" height " " width "\n"))
(def image-data (str head
                     (clojure.string/join "\n" (repeat grids "255,0,0"))))
(def ppm-content (str head image-data))

(spit "demoimg.ppm" ppm_header)
(spit "griddemo.ppm" ppm-content)
