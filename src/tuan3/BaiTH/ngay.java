package tuan3.BaiTH;
import java.time.LocalDateTime; // import the LocalDate class
import java.time.format.DateTimeFormatter; // import the DateTimeFormatter class


class ngay{
    public static  void main (String args[]){
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);

    }

}

