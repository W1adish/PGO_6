public class StudyProgramme {

    private String name;
        private String description;
        private int numberOfSemesters;
        private int maxGradesBeforePromotion;
        public StudyProgramme(String name, String description, int numberOfSemesters, int maxGradesBeforePromotion) {
            this.name = name;
            this.description = description;
            this.numberOfSemesters = numberOfSemesters;
            this.maxGradesBeforePromotion = maxGradesBeforePromotion;
        }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberOfSemesters() {
        return numberOfSemesters;
    }

    public int getMaxGradesBeforePromotion() {
        return maxGradesBeforePromotion;
    }
}
