package org.campus02;

public class GenderAnalyzer extends PersonAnalyzer {

    private double avgM = 0;
    private double avgW = 0;

    public double getAvgM() {
        return avgM;
    }

    public double getAvgW() {
        return avgW;
    }

    @Override
    public void analyze() {
        int countM = 0;
        int countW = 0;
        int heightM = 0;
        int heightW = 0;

        for (Person person : super.getPersons()) {
            if (person.getGender() == 'M') {
                countM ++;
                heightM += person.getSize();
            }

            if (person.getGender() == 'F') {
                countW ++;
                heightW = heightW + person.getSize();
            }
        }

        avgM = (double) heightM / countM;
        avgW = (double) heightW / countW;
    }
}
