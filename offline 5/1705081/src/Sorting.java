public class Sorting {
    public int[] Sort(int[] a){
        int i,j,tem;
        int len=a.length;
        for(i=0;i<len;i++){
            for(j=i+1;j<len;j++){
                if(a[i]>a[j]) {
                   tem=a[i];
                   a[i]=a[j];
                   a[j]=tem;
                }
            }
        }
        return a;
    }
}
