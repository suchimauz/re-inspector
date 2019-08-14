(ns re-inspector.core
  (:require
   [re-frame.core :as rf]))

(defn port-connect-extension [idx obj]
  ((.. js/chrome -runtime -connect) idx (clj->js obj)))

(rf/reg-sub
 ::app-db
 (fn [db _]
   db))
