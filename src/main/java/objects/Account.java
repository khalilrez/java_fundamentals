package objects;

public record Account(
        int id,
        int customerId,
        String type) {
    public void addedMethodHere(){
        // RECORDS ARE FINAL , YOU CANNOT CHANGE THE FIELDS LATER , THERE IS NO SETTERS
    }
    public static void main(String[] args) {
        Account account = new Account(12345,54321,"CHECKING");
        var type = account.type; // or account.type()
        //account.type = "SAVINGS"  -> gives compilation error
        System.out.println(account.type());
    }
}
