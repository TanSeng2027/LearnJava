public  class Book extends Document implements Borrowable{
    private String author;
    public Book(String id, String title, double basePrice,String author){
        super(id,title, basePrice);
        this.author=author;
    }
    @Override
    public void displayInfor(){
        System.out.println("ID: " + getId() + "Ten sach: " + getTitle() + "Gia: " + getBasePrice() + "Tac gia: " + author );
    }
    @Override
    public double calculateLateFree(int daysOverdue) {
        return daysOverdue * 5000;
    }

}
