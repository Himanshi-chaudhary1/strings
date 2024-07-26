package strings;
public class stringsBasics {

    public static void main(String[] args) {
    //  StringBuilder str = new StringBuilder("Physics");
    // str.append("himanshi");
    // str.setCharAt(0, 'H');
    // str.append("Hash");
    // str.insert(2,'y');
    // str.deleteCharAt(0);
    // str.delete(2, 4);
    // str.reverse();
    // System.out.println(str);
    String str = "abbccccddeee";
   String ans = ""+str.charAt(0);
   int count =1;
   for(int i=1;i<str.length();i++){
   char curr = str.charAt(i);
   char prev = str.charAt(i-1);
   if(curr==prev){
    count++;
   }
   else{
    if(count>1)ans+=count;
    count = 1;
    ans += curr;
   }
    }
    ans += count;
    System.out.println(ans);
}

}
