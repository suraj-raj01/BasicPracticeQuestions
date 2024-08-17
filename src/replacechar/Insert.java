package replacechar;

public class Insert {
    public String InsertStr(String string,String stringToBeInserted,int index){
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.insert(index+1,stringToBeInserted);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String string = "GeeksGeeks";
        int index = 4;
        String stringToBeInserted = " For ";
        Insert insert = new Insert();
        System.out.println("Original String: "+string);
        System.out.print("After Modify: ");
        System.out.println(insert.InsertStr(string, stringToBeInserted, index));
    }
}

/*
Original String: GeeksGeeks
After Modify: GeeksForGeeks
*/