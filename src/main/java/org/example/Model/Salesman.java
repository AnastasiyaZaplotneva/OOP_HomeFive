package org.example.Model;

public class Salesman extends Employee {
    private Integer workHours;
    private Double hourlyRate;

    public Salesman() {
    }

    public Salesman(String name, Integer age, Integer serviceLength, Integer id, Integer workHours) {
        super(name, age, serviceLength, id);
        this.workHours = workHours;
        if(serviceLength<5){
            this.hourlyRate = 185.0;
        }
        else {
            this.hourlyRate = 237.0;
        }

    }

    @Override
    public String toString() {
        return "Salesman{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", serviceLength=" + serviceLength +
                "workHours=" + workHours +
                ", hourlyRate=" + hourlyRate +
                ", salary=" + salary +
                ", fine=" + fine +
                '}';
    }



    public Integer getWorkHours() {
        return workHours;
    }

    public void setWorkHours(Integer workHours) {
        this.workHours = workHours;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public Double calculateSalary() {
        salary = this.workHours*this.hourlyRate - fine;
        return salary;
    }
}
