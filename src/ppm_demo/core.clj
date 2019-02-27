(ns ppm-demo.core)

(def ppm_header (str "P6\n" "2 " "2\n" "255\n"
                     "255, 0, 0\n"
                     "0, 255, 255\n"
                     "0, 0, 255\n"
                     "255, 0, 0"))

(spit "demoimg.ppm" ppm_header)
