public class ArrayResizer{

public static boolean isNonZeroRow(int[][] array2D, int r){
 int temp=0;
for (int i=0;i<array2D.length-1;i++){
    temp+=array2D[r][i];
}
if (temp==0) return false;
return true;
}
public static int numNonZeroRows(int[][] array2D){
int ret=0;
for (int i=0;i<array2D[0].length-1;i++){
    if (isNonZeroRow(array2D,i)) ret++;
}
return ret;
}

public static int[][] resize(int[][] array2D){
int numNonZero=0;
for (int i=0;i<array2D.length;i++){
    if (isNonZeroRow(array2D,i)) numNonZero++;
}
System.out.println(numNonZero);
int[][] returning=new int[numNonZero][array2D.length-1];
int returnvalue=0;
for (int i=0;i<array2D.length;i++){
    if (isNonZeroRow(array2D,i)) {
        returning[returnvalue]=array2D[i];
        returnvalue++;
    }
}
return returning;
}

public static String ret(int[][] array2D){
String returning="";
for (int[] rows:array2D){
    for (int cols:rows){
        returning+=cols+" ";
    }
    returning+="\n";
}
return returning;
}
}