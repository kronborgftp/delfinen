package trainersystem;


import clubmanagement.Person;

import java.util.*;
import java.util.stream.Collectors;


public class CompetitionSwimmer {
    private Person competitor;
    private List<SwimDiscipline> swimDisciplines;
    private Map<SwimDiscipline, Result> trainingResults;
    private Map<SwimDiscipline, Result> competitionResults;

    public CompetitionSwimmer(Person competitor, List<SwimDiscipline> swimDisciplines) {
        this.competitor = competitor;
        this.swimDisciplines = swimDisciplines;
        this.trainingResults = new HashMap<>();
        this.competitionResults = new HashMap<>();
    }

    public List<SwimDiscipline> getSwimDisciplines() {
        return swimDisciplines;
    }

    public Map<SwimDiscipline, Result> getTrainingResults() {
        return trainingResults;
    }

    public Map<SwimDiscipline, Result> getCompetitionResults() {
        return competitionResults;
    }

    public void addTrainingResult(SwimDiscipline discipline, Result result) {
        trainingResults.put(discipline, result);
    }

    public void addCompetitionResult(SwimDiscipline discipline, Result result) {
        competitionResults.put(discipline, result);
    }

    public Map<SwimDiscipline, Result> getTop5CompetitorsByDiscipline(SwimDiscipline discipline) {
        // Assuming the Result class has a method to compare results
        // Adjust the sorting logic based on your specific requirements
        Comparator<Map.Entry<SwimDiscipline, Result>> resultComparator =
                Comparator.comparing(entry -> entry.getValue().getTime()); // Adjust this based on your Result class

        Map<SwimDiscipline, Result> top5 = trainingResults.entrySet().stream()
                .sorted(resultComparator.reversed())
                .limit(5)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, // If duplicate keys, keep the first one (adjust as needed)
                        LinkedHashMap::new // Preserve insertion order
                ));

        return top5;
    }

    @Override
    public String toString() {
        return "Konkurrencesvømmer{" +
                "competitor=" + competitor +
                ", swimDisciplines=" + swimDisciplines +
                ", trainingResults=" + trainingResults +
                ", competitionResults=" + competitionResults +
                '}';
    }
}

