public class LaunchString2 {
    public static void main(String[] args) {
        String s1 = "Raja ram mohan roy";
        

        //charAt
        System.out.println(s1.charAt(1));//value

        //contains
        System.out.println(s1.contains("ram"));//true

        //startWith
        System.out.println(s1.startsWith("Ra"));//true

        //indexOf
        System.out.println(s1.indexOf("a"));//returns first index

        //lastindexOf
        System.out.println(s1.lastIndexOf("a"));//returns last index

        //compareTo
        System.out.println("saurabh".compareTo("Saurabh"));//returns the ascii code difference and if returns 0 then both are same

        String [] str = s1.split(" ");

        for(String s:str){
            System.out.println(s);
        }

        StringBuffer sb1 = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();

        System.out.println(sb1.capacity()+"  "+sb2.capacity());

        sb1.append("Saurabh");
        sb2.append("Saurabh");

        sb1.append("Dwivedi mca 1st year");//oldcapacity *2 +2
        sb2.append("Dwivedi mca 1st year");//oldcapacity *2 +2

        sb1.trimToSize();//trims the unused size
        sb2.trimToSize();

        System.out.println(sb1.capacity()+"  "+sb2.capacity());
        System.out.println(sb1+"  "+sb2);

        StringBuilder st = new StringBuilder("Sa");
        StringBuilder st2 = new StringBuilder("Sa");

        System.out.println(st.equals(st2));//din't override in stringbuilder and buffer class 

    }
}
