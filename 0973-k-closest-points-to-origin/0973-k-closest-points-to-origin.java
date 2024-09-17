class Element{
    double distance;
    int []cell;
    public Element(double distance,int[] cell){
        this.distance = distance;
        this.cell = cell;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Element> pq = new PriorityQueue<>(new Comparator<Element>(){
            public int compare(Element a, Element b){
                return Double.compare(a.distance,b.distance);
            }
        });
        
        for(int current[]:points){
            double distance = Math.sqrt(Math.pow(current[0],2)+Math.pow(current[1],2));
            pq.add(new Element(distance,current));
        }
        int result[][] = new int[k][2];
        for(int i =0;i<k;i++){
            Element current = pq.remove();
            result[i] = current.cell;
        }
        return result;
            
    }
}