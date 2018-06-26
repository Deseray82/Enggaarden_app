package enggaarden.app.models.Entities;

public class Statistic
{
    /*
    Fields
     */
    private String activityType;
    private int sumOfContributions;
    private int countOfContributions;
    private int avgPerActivity;
    private int OfTotal;

    /*
    Constructors
     */
    public Statistic(String activityType, int sumOfContributions, int countOfContributions, int avgPerActivity, int ofTotal)
    {
        this.activityType = activityType;
        this.sumOfContributions = sumOfContributions;
        this.countOfContributions = countOfContributions;
        this.avgPerActivity = avgPerActivity;
        OfTotal = ofTotal;
    }

    /*
    Getteres
    */
    public String getActivityType()
    {
        return activityType;
    }
    public double getSumOfContributions()
    {
        return sumOfContributions;
    }
    public int getCountOfContributions()
    {
        return countOfContributions;
    }
    public double getAvgPerActivity()
    {
        return avgPerActivity;
    }
    public double getOfTotal()
    {
        return OfTotal;
    }

    /*
    Setters
     */
    public void setActivityType(String activityType)
    {
        this.activityType = activityType;
    }
    public void setSumOfContributions(int sumOfContributions)
    {
        this.sumOfContributions = sumOfContributions;
    }
    public void setCountOfContributions(int countOfContributions)
    {
        this.countOfContributions = countOfContributions;
    }
    public void setAvgPerActivity(int avgPerActivity)
    {
        this.avgPerActivity = avgPerActivity;
    }
    public void setOfTotal(int ofTotal)
    {
        OfTotal = ofTotal;
    }
}