package Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class keyAndRooms {

    boolean canVisitAllRooms(int[][] rooms) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        int n=rooms.length;
        for(int i=0;i<n;i++){
            map.put(i, false);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int k=q.size();
            while(k-- != 0){
                int a=q.peek();
                q.poll();
                map.put(a, true);
                for(int j=0;j<rooms[a].length && rooms[a].length !=0;j++){
                    if(!map.getOrDefault(rooms[a][j], false)){
                        q.add(rooms[a][j]);
                    }
                }
            }
        }

        for(Map.Entry<Integer, Boolean> i:map.entrySet()){
            if(!i.getValue()){
                return false;
            }
        }
        return true;
    }
}
