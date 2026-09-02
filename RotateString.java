class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder g = new StringBuilder(goal + goal);
        if(g.toString().contains(s)) return true;
        else return false;
    }
}
