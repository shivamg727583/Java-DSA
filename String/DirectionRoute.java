// Question:
// Given a route containing 4 directions (E,W,N,S) ,find the shortest path to react destination "WNEENESENNN". 

public class DirectionRoute {
    public static void main(String[] args) {
        String str ="WNEENESENNN";
        System.out.println(getShortestPath(str));
    }

    public static float getShortestPath(String path){
        int x=0;
        int y=0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // south
            if(dir=='S'){
                y--;
            }
            // north
            else if(dir=='N'){
                y++;
            }
            // east
            else if(dir=='E'){
                x++;
            }
            // west
            else{
                x--;
            }
            }

            int X2 = x*x;
            int Y2 = y*y;
            int distance = X2 + Y2;
            return (float)Math.sqrt(distance);
            
           

        }}
    




// N ^ = y+1
// S v = y-1
// E > = x+1
// W < = x-1

// shorted path = √ (x*x)+(y*y)
