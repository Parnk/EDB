
import java.util.Date;


public class Spending {
    private int spendingID;
    private float budget;
    private Date monthYear;
    private String categoryName;
    private float spendingAmount;
    private Date modificationDate;
    
    
    public Spending(int spendingID, float budget, Date monthYear, String categoryName, float spendingAmount, Date modificationDate) {
        this.spendingID = spendingID;
        this.budget = budget;
        this.monthYear = monthYear;
        this.categoryName = categoryName;
        this.spendingAmount = spendingAmount;
        this.modificationDate = modificationDate;
    }
    
    
    public int getSpendingID() {
        return spendingID;
    }
    
    public float getBudget() {
        return budget;
    }
    
    public Date getMonthYear() {
        return monthYear;
    }
    
    public String getCategoryName() {
        return categoryName;
    }
    
    public float getSpendingAmount() {
        return spendingAmount;
    }
    
    public Date getModificationDate() {
        return modificationDate;
    }
    
}
