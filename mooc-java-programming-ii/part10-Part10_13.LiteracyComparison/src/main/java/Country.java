/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theo.higgins
 */
public class Country implements Comparable<Country> {
    private String name;
    private String gender;
    private Integer year;
    private Double rate;

    public Country(String name, String gender, String year, String rate) {
        this.name = name;
        this.gender = trimGender(gender);
        this.year = Integer.parseInt(year);
        this.rate = Double.parseDouble(rate);
    }

    @Override
    public String toString() {
        return  name + " (" + year + "), " + gender + ", " + rate;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getYear() {
        return year;
    }

    public Double getRate() {
        return rate;
    }
    
   private String trimGender(String gender) {
       String[] genderSplit = gender.split(" ");
       return genderSplit[1];
   } 

    @Override
    public int compareTo(Country o) {
        if(this.rate == o.getRate()){
            return 0;
        }
        
        if(this.rate > o.getRate()) {
            return 1;
        }
        
        return -1;
    }
    
}
