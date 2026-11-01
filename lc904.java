class Solution {
    public int totalFruit(int[] arr) {
        if(arr.length==1)return 1;
        int first=arr[0];
        int second=arr[1];
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(first,0);
        hm.put(second,1);
        int l=0;
        int max=2;
        for(int i=2;i<arr.length;i++){
            if(arr[i]!=first&&arr[i]!=second){
                if(first==second){            
                    second=arr[i];
                    hm.put(second,i);
                    max=Math.max(i-l+1,max);
                    continue;
                }
                int low=Math.min(hm.get(first),hm.get(second));
                l=low+1;
                max=Math.max(i-l+1,max);
                if(hm.get(first)>hm.get(second)){
                    hm.remove(second);
                    second=arr[i];
                    hm.put(second,i);
                }
                else{
                    hm.remove(first);
                    first=arr[i];
                    hm.put(first,i);
                }
            }
            else{
                hm.put(arr[i],i);
                max=Math.max(i-l+1,max);
            }
        }
        return max;
    }
}
