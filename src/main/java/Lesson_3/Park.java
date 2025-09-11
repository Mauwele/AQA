package Lesson_3;

// 3. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.

import java.util.ArrayList;
import java.util.List;

public class Park {

    static class Attraction {
        private String nameOfAttraction;
        private String workingTime;
        private double price;

        private Attraction(String nameOfAttraction, String workingTime, double price) {
            this.nameOfAttraction = nameOfAttraction;
            this.workingTime = workingTime;
            this.price = price;
        }

        public String getNameOfAttraction() {
            return nameOfAttraction;
        }

        public void setNameOfAttraction(String nameOfAttraction) {
            this.nameOfAttraction = nameOfAttraction;
        }

        public String getWorkingTime() {
            return workingTime;
        }

        public void setWorkingTime(String workingTime) {
            this.workingTime = workingTime;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void showInfo() {
            System.out.println("\nАттракцион: " + nameOfAttraction
                    + "\nВремя работы: " + workingTime
                    + "\nСтоимость: " + price + " руб.");
        }
    }

    private List<Attraction> attractions;

    public Park() {
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(String name, String workingTime, double price) {
        Attraction newAttraction = new Attraction(name, workingTime, price);
        attractions.add(newAttraction);
    }

    public void showAllAttractions() {
        int i = 0;
        while (i < attractions.size()) {
            Attraction attraction = attractions.get(i);
            attraction.showInfo();
            i++;
        }
    }

    public Attraction findAttraction(String name) {
        for (int i = 0; i < attractions.size(); i++) {
            Attraction attraction = attractions.get(i);
            if (attraction.nameOfAttraction.equals(name)) {
                return attraction;
            }
        }
        System.out.println("\nАттракцион не найден!");
        return null;
    }
}