class StringBulder {
public static void main(String[] args) {
    String[] arr = new String[]{"hello!","hii","How","are","you?"};
    StringBuilder sb = new StringBuilder();
    for(String str: arr){
        sb.append(str).append(" ");
    }
    System.out.println(sb);

}
}
