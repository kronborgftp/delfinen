package trainersystem;

import java.util.ArrayList;
import java.util.List;
    public class Trainer {
        private String name;
        private int age;
        private List<CompetitionSwimmer> assignedCompetitors;

        public Trainer(String name, int age) {
            this.name = name;
            this.age = age;
            this.assignedCompetitors = new ArrayList<>();
        }

        // Getter and Setter methods
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public List<CompetitionSwimmer> getAssignedCompetitors() {
            return assignedCompetitors;
        }

        public void setAssignedCompetitors(List<CompetitionSwimmer> assignedCompetitors) {
            this.assignedCompetitors = assignedCompetitors;
        }

        public void assignCompetitor(CompetitionSwimmer competitor) {
            assignedCompetitors.add(competitor);
        }

        @Override
        public String toString() {
            return "Trainer{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", assignedCompetitors=" + assignedCompetitors +
                    '}';
        }
    }


