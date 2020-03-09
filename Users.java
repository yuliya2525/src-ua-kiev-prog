package ua.kiev.prog;

public class Users {
    private String name;
    private String surname;
    private int years;
    private boolean education;
    private String language;

    public Users() {
    }

    public Users(String name, String surname, int years, boolean education,
                String language) {
        super();
        this.name = name;
        this.surname = surname;
        this.years = years;
        this.education = education;
        this.language = language;
    }

    public boolean isEducation() {
        return education;
    }

    public void setEducation(boolean education) {
        this.education = education;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

}
