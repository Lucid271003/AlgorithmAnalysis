package RoomArrange_GreedyAlgorithm;

public class ActivitySelection {
    public static void selectActivities(Activity[] activities){
        sort(activities);
        System.out.println(activities[0]);

        int j = 0;
        for(int i = 1; i < activities.length; i++){
            if(activities[i].start >= activities[j].finish){
                System.out.println(activities[i]);
                j = i;
            }
        }
    }
    private static void sort(Activity[] activities){
        for(int i = 0; i < activities.length - 1; i++){
            for (int j = 0; j < activities.length - i - 1; j++) {
                if(activities[j].finish > activities[j + 1].finish){
                    // swap
                    Activity temp = activities[j];
                    activities[j] = activities[j + 1];
                    activities[j + 1] = temp;
                }
            }
        }
    }
}
class Activity{
    int start, finish;

    public Activity(int start, int finish){
        this.start = start;
        this.finish = finish;
    }
    @Override
    public String toString(){
        return "[ " + start + ", " + finish + " ]";
    }
}
class ActivityTest{
    public static void main(String[] args) {
        Activity[] activities = new Activity[6];
        activities[0] = new Activity(1, 4);
        activities[1] = new Activity(3, 5);
        activities[2] = new Activity(0, 6);
        activities[3] = new Activity(5, 7);
        activities[4] = new Activity(8, 9);
        activities[5] = new Activity(5, 9);

        ActivitySelection.selectActivities(activities);
    }
}
