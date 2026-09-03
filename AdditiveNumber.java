class Solution {
    public boolean isAdditiveNumber(String num) {

        int n = num.length();

        for (int flen = 1; flen <= n / 2; flen++) {

            if (num.charAt(0) == '0' && flen > 1)
                break;

            for (int slen = 1; n - flen - slen >= Math.max(flen, slen); slen++) {

                if (num.charAt(flen) == '0' && slen > 1)
                    break;

                long fnum = Long.parseLong(num.substring(0, flen));
                long snum = Long.parseLong(num.substring(flen, flen + slen));

                String bal = num.substring(flen + slen);

                while (bal.length() > 0) {

                    long tnum = fnum + snum;
                    String tnumstr = Long.toString(tnum);

                    if (bal.startsWith(tnumstr)) {
                        fnum = snum;
                        snum = tnum;
                        bal = bal.substring(tnumstr.length());
                    }
                    else {
                        break;
                    }
                }

                if (bal.length() == 0)
                    return true;
            }
        }

        return false;
    }
}
