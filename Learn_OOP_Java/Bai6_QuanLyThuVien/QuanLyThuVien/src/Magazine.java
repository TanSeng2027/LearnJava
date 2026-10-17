public class Magazine extends Document implements Borrowable{
    private int issueNumber;
    public Magazine(String id, String title, double basePrice, int issueNumber) {
        super(id, title, basePrice);
        this.issueNumber = issueNumber;
    }
    public int getIssueNumber() {
        return issueNumber;
    }
}
