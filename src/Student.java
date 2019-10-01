public class Student
{
    private String name;
    private String birthMonth;
    private String favoriteColor;

    public Student(String n, String bm, String fc)
    {
        this.name = n;
        this.birthMonth = bm;
        this.favoriteColor = fc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthMonth='" + birthMonth + '\'' +
                ", favoriteColor='" + favoriteColor + '\'' +
                '}';
    }
}
