(ns re-inspector.core
  (:require
   [re-frame.core :as rf]))

(defn port-connect-extension [obj]
  ((.. js/chrome -runtime -connect) idx (clj->js obj)))

(def Port
  ((.. js/chrome -runtime -connect) idx (clj->js obj)))

(defn app-db [idx]
  (let [db (rf/subscribe [:re-inspector.core/app-db])
        connect (re-ins/port-connect-extension "hlnclcmchflhfmogikmhblmjcffkggia" {:name "Alkona"})]
    (fn []
      (let [db @db
            post (.postMessage connect {:data "Gfsdfsddf"})]
        [:div "lok"]))))

(rf/reg-sub
 ::app-db
 (fn [db _]
   db))
