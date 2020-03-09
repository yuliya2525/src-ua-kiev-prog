package ua.kiev.prog;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Answers {
        private static final Answers singleton = new Answers();

        private String lang;
        private String educ = "";
        private int edTrue = 0, edFalse = 0; // amount of answers: true and false

        private Map<String, Integer> langMap = new HashMap<String, Integer>();

        private List<Users> list = new ArrayList<Users>();

        private Answers() {

        }

        public static Answers getInstance() {
            return singleton;
        }

        public void add(Users u) {
            list.add(u);
            String s = u.getLanguage();
            if (langMap.containsKey(s)) {
                langMap.put(s, langMap.get(s) + 1);
            } else {
                langMap.put(s, 1);
            }
            boolean education = u.isEducation();
            if (education) {
                edTrue++;
            } else {
                edFalse++;
            }

        }

        public String getLang() {
            return lang;
        }

        public void createStatistic() {

            educ = "Have: " + Integer.toString(edTrue) + "<br> Do not have: "
                    + Integer.toString(edFalse);
            lang = "";
            for (Map.Entry<String, Integer> entry : langMap.entrySet()) {
                lang = lang.concat(entry.getKey() + ": "
                        + Integer.toString(entry.getValue()) + "\n");
            }
        }

        public String getEduc() {
            return educ;
        }

    }
