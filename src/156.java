/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

public class Solution {
    /**
     * @param intervals: interval list.
     * @return: A new interval list.
     */
    public List<Interval> merge(List<Interval> intervals) {
        // write your code here
        Collections.sort(intervals, new IntervalComparator()); 
        List<Interval> result = new ArrayList<>();
        Interval lastInterval = null;
        for (Interval interval : intervals){
            if (lastInterval == null || interval.start > lastInterval.end){
                lastInterval = interval;
                result.add(interval);
            } else {
                lastInterval.end = Math.max(lastInterval.end,interval.end);
            }
        } 
        return result;
    }

    private class IntervalComparator implements Comparator<Interval> {
        public int compare(Interval a, Interval b) {
            return a.start - b.start;
        }
    }
}