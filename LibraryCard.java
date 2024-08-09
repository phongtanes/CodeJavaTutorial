public class LibraryCard {
    private Student owner;
    private int borrowcnt;
    public LibraryCard(){
        owner = null;
        borrowcnt = 0;
    }
    public void checkOut(int numOfBooks){
        borrowcnt = borrowcnt + numOfBooks;
    }
    public void setOwnerName(Student student){
        owner = student;
    }
    public int getNuberOfBooks(){
        return borrowcnt;
    }
    public String getOwnerName(){
        return owner.getName();
    }
    public String toString(){
        return "Owner Name : " +owner.getName() +"\n"+"Email : " +owner.getEmail() +"\n"+"Books Borrownd : " +borrowcnt;
    }
}