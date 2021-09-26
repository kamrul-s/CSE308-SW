import org.junit.jupiter.api.Test;

import java.util.*;

import static java.lang.Math.*;
import static org.junit.Assert.*;

public class SortingTest {
    public boolean isNotChanged(int[] a, int[] b){
        boolean ret=true;
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int len=a.length;
        int i,j;
        if(len!=b.length) return false;
        for(i=0;i<len;i++){
            if(mp.get(a[i])==null){
                mp.put(a[i],1);
            }
            else {
                j=mp.get(a[i]);
                j++;
                mp.put(a[i],j);
            }
        }
        for(i=0;i<len;i++){
            if(mp.get(b[i])==null){
                ret=false;
                break;
            }
            else {
                j=mp.get(b[i]);
                j--;
                if(j<0) {
                    ret=false;
                    break;
                }
                mp.put(b[i],j);
            }
        }
        return ret;
    }
    public boolean isOrderOk(int[] a){
        int i;
        int len=a.length;
        boolean ret=true;
        for(i=1;i<len;i++) {
            if(a[i]<a[i-1]){
                ret =false;
                break;
            }
        }
        return ret;
    }
    @Test
    public void sort() {
        Sorting st=new Sorting();
        int a[]=new int[0];
        int[] b=st.Sort(a);
        assertEquals("List altered while checking with empty",isNotChanged(a,b),true);
        assertEquals("Not sorted while checking with empty",isOrderOk(b),true);
        int a2[]=new int[1];
        Random rd=new Random();
        a2[0]=rd.nextInt();
        int[] b2=st.Sort(a2);
        assertEquals("List altered while checking with 1 element",isNotChanged(a2,b2),true);
        assertEquals("Not sorted while checking with 1 element",isOrderOk(b2),true);
        int a3[]=new int[2];
        a3[0]=rd.nextInt();
        a3[1]=rd.nextInt();
        int[] b3=st.Sort(a3);
        assertEquals("List altered while checking with 2 element",isNotChanged(a3,b3),true);
        assertEquals("Not sorted while checking with 2 element",isOrderOk(b3),true);
        int x=abs(rd.nextInt())%10000;
        int[] a4=new int[x];
        int i;
        for(i=0;i<x;i++){
            a4[i]=rd.nextInt();
        }
        int[] b4=st.Sort(a4);
        assertEquals("List altered while checking with rendom init size",isNotChanged(a4,b4),true);
        assertEquals("Not sorted while checking with rendom init size",isOrderOk(b4),true);


        int[] a5=new int[1000];
        for(i=0;i<1000;i++){
            a5[i]=rd.nextInt();
        }
        int[] b5=st.Sort(a5);
        assertEquals("List altered while checking with rendom init ",isNotChanged(a5,b5),true);
        assertEquals("Not sorted while checking with rendom init ",isOrderOk(b5),true);

        x=abs(rd.nextInt())%10000;
        int[] a6=new int[x];
        a6[0]=rd.nextInt()%100000;
        int temp;
        for(i=1;i<x;i++){
            temp=abs(rd.nextInt())%100000;
            a6[i]=a6[i-1]+temp;
        }
        int[] b6=st.Sort(a6);
        assertEquals("List altered while checking with ascending order",isNotChanged(a6,b6),true);
        assertEquals("Not sorted while checking with ascending order",isOrderOk(b6),true);
        x=abs(rd.nextInt())%10000;
        int[] a7=new int[x];
        a7[0]=rd.nextInt()%100000;
        for(i=1;i<x;i++){
            temp=abs(rd.nextInt())%100000;
            a7[i]=a7[i-1]-temp;
        }
        int[] b7=st.Sort(a7);
        assertEquals("List altered while checking with descending order",isNotChanged(a7,b7),true);
        assertEquals("Not sorted while checking with descending order",isOrderOk(b7),true);
        x=abs(rd.nextInt())%10000;
        int[] a8=new int[x];
        a8[0]=rd.nextInt()%100000;
        for(i=1;i<x;i++){
            a8[i]=a8[i-1];
        }
        int[] b8=st.Sort(a8);
        assertEquals("List altered while checking with  equal number",isNotChanged(a8,b8),true);
        assertEquals("Not sorted while checking with equal number",isOrderOk(b8),true);
    }
}