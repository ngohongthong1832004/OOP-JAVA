package tuan2.BaiTH;

public class TestCD {
    public static void main(String[] args) {
        // Declare and create an array to store CD objects
        CD[] cdArray = new CD[3]; // You can change the size as needed

        // Create CD objects and add them to the array
        cdArray[0] = new CD(8888, "Album 1", 9, 86.86);
        cdArray[1] = new CD(7777, "Album 2", 12, 105.50);
        cdArray[2] = new CD(6666, "Album 3", 10, 92.75);

        // Print the information about each CD in the array
        for (CD cd : cdArray) {
            System.out.println(cd);
        }
    }
}