class LargestNumber {
    public String largestNumber(int[] nums) {
        // 111524202055 Surendhar L
        List<String> numlst = new ArrayList<>();

        for(Integer n : nums) {
            numlst.add(n.toString());
        }

        Collections.sort(numlst, (a,b) -> {
            return -((a+b).compareTo(b+a));
        });

        StringBuilder sb = new StringBuilder();

        for(String s : numlst) {
            sb.append(s);
        }

        if("".equals(sb.toString().replaceAll("0",""))) {
            return "0";
        }

        return sb.toString();
    }
}
