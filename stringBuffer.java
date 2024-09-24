class stringBuffer{
    public static void main(String args[]){

        StringBuffer sb = new StringBuffer("Ravi");

        sb.append(" Pandit");
        //sb.deleteCharAt(2);
        sb.insert(0,"Hello ");

        System.out.println(sb);
    }
}