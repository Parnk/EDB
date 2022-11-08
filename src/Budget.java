
import java.util.Date;


public class Budget {
   
    private int budgetID;
     private Date monthYear;
    private String categoryName;
    private float budget;
    private int userID;
    
    public Budget(int budgetID, Date monthYear, String categoryName, float budget, int userID) {
        this.monthYear = monthYear;
        this.budgetID = budgetID;
        this.categoryName = categoryName;
        this.budget = budget;
        this.userID = userID;
    }
    
    public Date getMonthYear() {
        return monthYear;
    }
    
    public int getBudgetID() {
        return budgetID;
    }
    
    public String getCategoryName() {
        return categoryName;
    }
    
    public float getBudget() {
        return budget;
    }
    
    public int getUserID() {
        return userID;
    }
    
}
