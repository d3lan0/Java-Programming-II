

public class Checker {
    public boolean isDayOfWeek(String string) {
         return string.matches("sun|mon|tue|wed|thu|fri|sat");
    }
    
    public boolean allVowels(String string) {
        return string.matches("[aeiou]*");
    }
    
    public boolean timeOfDay(String string) {
        return string.matches("([01][0-9]|2[0-3])(:[0-5][0-9]){2}");
        
    }

}
